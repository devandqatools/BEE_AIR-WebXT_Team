package com.hcl.reviewtool.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.hcl.reviewtool.beans.BugDetailsBean;
import com.hcl.reviewtool.beans.MasDetailsBean;
import com.hcl.reviewtool.beans.ReviewDetailsBean;
import com.hcl.reviewtool.beans.ValidationBean;
import com.hcl.reviewtool.constants.Constants;
import com.hcl.reviewtool.util.UtilService;

@Service
public class ReviewToolServiceImpl implements ReviewToolService {

	@Value("${WCAGRules}")
	private String wCagRules;

	@Value("${MasRules}")
	private String masRules;

	@Value("${KerosMasRules}")
	private String kerosMasRules;
	
	@Autowired
	private ValidationBean validationBean;

	static final Logger logger = Logger.getLogger(ReviewToolServiceImpl.class);

	@Override
	public String generatePdfHtmlContentData(ReviewDetailsBean reviewBean) {
		String htmlContentString = Constants.BASE_HTML_STRING;
		htmlContentString += (reviewBean.getBugCountWithOutReview() + reviewBean.getBugCountWithReview())
				+ Constants.TD_CLOSE_STRING + Constants.BUGS_WITH_OUT_REVIEW_STRING
				+ reviewBean.getBugCountWithOutReview() + Constants.TD_CLOSE_STRING + Constants.BUGS_WITH_REVIEW_STRING
				+ reviewBean.getBugCountWithReview() + Constants.TD_CLOSE_STRING + Constants.TABLE_CLOSE_WITH_TR;
		htmlContentString += Constants.DETAILED_REVIEW_COMMENTS + reviewBean.getApplicationName()
				+ Constants.TH_CLOSE_STRING + Constants.AREAPATH_STRING + reviewBean.getAppAreaPath()
				+ Constants.TH_CLOSE_STRING + Constants.ITERATION_PATH_STRING + reviewBean.getAppIterationPath();
		htmlContentString += Constants.MAIN_TABLE_HEADER_START;
		for (BugDetailsBean bugDetailsBean : reviewBean.getBugDetailsBeanList()) {
			if (bugDetailsBean.getBudId() != null && bugDetailsBean.getReviewStatus() != null
					&& !bugDetailsBean.getReviewStatus().equalsIgnoreCase(Constants.EMPTY_STRING)) {
				String mainData = Constants.EMPTY_STRING;
				mainData += Constants.BUG_ID_TR_AND_TD_START
						+ String.valueOf((int) Double.parseDouble(bugDetailsBean.getBudId()))
						+ Constants.TD_CLOSE_STRING;
				mainData += Constants.TITLE_START + bugDetailsBean.getBugTitle() + Constants.TD_CLOSE_STRING
						+ Constants.TABLE_REVIEW_STATUS_STRING;
				if (bugDetailsBean.getReviewStatus() != null
						&& !bugDetailsBean.getReviewStatus().equalsIgnoreCase(Constants.EMPTY_STRING)) {
					String[] reviewArray = bugDetailsBean.getReviewStatus().split(Constants.SEMI_COLUMN_STRING);
					for (String review : reviewArray) {
						mainData += review + Constants.BREAK_LINE;
					}
				} else {
					mainData += Constants.VERY_GOOD;
				}
				mainData += Constants.TD_CLOSE_STRING + Constants.TR_CLOSE_STRING;
				htmlContentString += mainData;
			}
		}
		htmlContentString += Constants.FOOTER_CLOSE;
		return htmlContentString;
	}

	@Override
	public ReviewDetailsBean reviewProcessForUploadedBugs(ReviewDetailsBean reviewDataBean, Workbook workbook,
			HttpServletResponse response) {
		ReviewDetailsBean reviewDetailsBean = new ReviewDetailsBean(reviewDataBean.getApplicationName(),reviewDataBean.getApplicationTags()
				,reviewDataBean.getAppAreaPath(),reviewDataBean.getAppIterationPath());
		int reviewNotFound = 0;
		int reviewFound = 0;
		List<BugDetailsBean> bugDetailsBeanList = new ArrayList<BugDetailsBean>();
		Map<String, MasDetailsBean> masDetailsmap = new ConcurrentHashMap<String, MasDetailsBean>();
		String[] masDetailsArray = masRules.split(Constants.SEMI_COLUMN_STRING);
		for (String masRuleData : masDetailsArray) {
			String[] eachRuleId = masRuleData.split(Constants.HASH_SEPARATOR);
			masDetailsmap.put(eachRuleId[0].trim(),
					new MasDetailsBean(eachRuleId[0].trim(), eachRuleId[1], eachRuleId[2]));
		}

		Map<String, String> kerosMasRulesMap = new ConcurrentHashMap<String, String>();
		String[] kerosMasArray = kerosMasRules.split(Constants.SEMI_COLUMN_STRING);
		for (String kerosMasData : kerosMasArray)
			kerosMasRulesMap.put(kerosMasData, kerosMasData);

		Map<String, MasDetailsBean> wcagMap = new ConcurrentHashMap<String, MasDetailsBean>();
		String[] wCagMasArray = wCagRules.split(Constants.SEMI_COLUMN_STRING);
		for (String wCagMasData : wCagMasArray) {
			String[] wCagDataArray = wCagMasData.split(Constants.HASH_SEPARATOR);
			String masLink = Constants.EMPTY_STRING;
			if (wCagDataArray.length > 2)
				if (wCagDataArray[2] != null && !wCagDataArray[2].equalsIgnoreCase(Constants.EMPTY_STRING))
					masLink = wCagDataArray[2];
			wcagMap.put(wCagDataArray[0].trim(),
					new MasDetailsBean(wCagDataArray[0].trim(), wCagDataArray[1], masLink));
		}
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.rowIterator();
		while (rowIterator.hasNext()) {
			Row row = null;
			StringBuffer reviewContent = new StringBuffer();
			int reviewCount = 0;
			try {
				row = rowIterator.next();
				if (row.getRowNum() == 0) {
					boolean fileCheck = UtilService.validationForAllHeaders(row);
					if (fileCheck) {
						// row.createCell(7).setCellValue(Constants.REVIEW_STATUS);
						// row.createCell(8).setCellValue(Constants.SPELL_MISTAKES_STRING);
						reviewDetailsBean.setValidExcel(true);
						continue;
					} else {
						reviewDetailsBean.setValidExcel(false);
						break;
					}
				}

				String tagsString = Constants.EMPTY_STRING;
				String severityString = Constants.EMPTY_STRING;
				String bugDescription = Constants.EMPTY_STRING;
				String bugTitle = Constants.EMPTY_STRING;
				String bugId = Constants.EMPTY_STRING;
				String bugAreaPath = Constants.EMPTY_STRING;
				String iterationPath = Constants.EMPTY_STRING;
				String securitySeverity = Constants.EMPTY_STRING;

				boolean isMasTagAvailable = false;
				Map<String, String> tagsMap = new ConcurrentHashMap<String, String>();
				BugDetailsBean bugDetailBean = new BugDetailsBean();

				if (null != row.getCell(0) && !row.getCell(0).toString().trim().equals(Constants.EMPTY_STRING)) {
					bugId = (String) row.getCell(0).toString();
					bugDetailBean.setBudId(bugId);
				}

				if (null != row.getCell(1) && !row.getCell(1).toString().trim().equals(Constants.EMPTY_STRING)) {
					bugTitle = (String) row.getCell(1).toString();
					bugDetailBean.setBugTitle(bugTitle);
				}

				if (null != row.getCell(2) && !row.getCell(2).toString().trim().equals(Constants.EMPTY_STRING)) {
					bugDescription = (String) row.getCell(2).toString();
					bugDetailBean.setBugDescription(bugDescription);
				}

				if (null != row.getCell(3) && !row.getCell(3).toString().trim().equals(Constants.EMPTY_STRING)) {
					tagsString = (String) row.getCell(3).toString();
					bugDetailBean.setBugTags(tagsString);
				}

				if (null != row.getCell(4) && !row.getCell(4).toString().trim().equals(Constants.EMPTY_STRING)) {
					if(row.getCell(4).getCellType() == Cell.CELL_TYPE_NUMERIC) {
						severityString = String.valueOf((int) Double.parseDouble(row.getCell(4).toString().trim()));
					} else {
						severityString = (String) row.getCell(4).toString().trim();
					}
					
					bugDetailBean.setBugSeverity(severityString);
				}

				if (null != row.getCell(5) && !row.getCell(5).toString().trim().equals(Constants.EMPTY_STRING)) {
					bugAreaPath = (String) row.getCell(5).toString().trim();
					bugDetailBean.setBugAreaPath(bugAreaPath);
				}

				if (null != row.getCell(6) && !row.getCell(6).toString().trim().equals(Constants.EMPTY_STRING)) {
					iterationPath = (String) row.getCell(6).toString().trim();
					bugDetailBean.setBugIteraionPath(iterationPath);
				}
				
				if (null != row.getCell(7) && !row.getCell(7).toString().trim().equals(Constants.EMPTY_STRING)) {
					securitySeverity = (String) row.getCell(7).toString().trim();
					bugDetailBean.setSecuritySeverity(securitySeverity);
				}

				String[] tagsArray = tagsString.split(Constants.SEMI_COLUMN_STRING);
				int tagCount = 0;
				if (tagsArray.length > 0) {
					for (String tag : tagsArray) {
						if (tagCount == 0) {
							tagsMap.put(tag.substring(0), tag.substring(0));
						} else {
							tagsMap.put(tag.substring(1), tag.substring(1));
						}
						tagCount++;
					}
				}

				// BugType Checking
				if (!tagsString.contains(Constants.A11YMAS_STRING) && !tagsString.contains(Constants.A11YUSABLE_STRING)
						&& !tagsString.contains(Constants.FUNCTIONAL) && Constants.YES.equalsIgnoreCase(validationBean.getBug_type_not_defined())) {
					reviewContent.append(++reviewCount + Constants.NO_TAG_FOR_BUG_TYPE_STRING);
				}
				
				// WebXT Requirement 
				
				if(!securitySeverity.equalsIgnoreCase(Constants.NOT_A_SECURITY_BUG) && !securitySeverity.equals(Constants.EMPTY_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getSecurity_severity_field())) {
					reviewContent.append(++reviewCount + Constants.INVALID_SECURITY_SEVERITY);
				}

				int masCount = 0;
				String masTag = Constants.EMPTY_STRING;
				String masNumber = Constants.EMPTY_STRING;

				// Severity Checking
				if (!tagsString.contains(Constants.A11YUSABLE_STRING) && !tagsString.contains(Constants.FUNCTIONAL)
						&& !bugTitle.contains(Constants.USABLE_STRING) && !bugTitle.contains(Constants.FUNCTIONAL)) {
					if (tagsMap.get(Constants.A11Y_CRITICAL_TAG) == null && tagsMap.get(Constants.A11Y_HIGH_TAG) == null
							&& tagsMap.get(Constants.A11Y_MEDIUM_TAG) == null
							&& tagsMap.get(Constants.A11Y_LOW_TAG) == null && Constants.YES.equalsIgnoreCase(validationBean.getNo_bug_impact_tag_defined()))
						reviewContent.append(++reviewCount + Constants.NO_TAG_FOR_IMPACT_STRING);
					else {
						if (!UtilService.impactCheckWithSeverity(tagsMap, severityString) && Constants.YES.equalsIgnoreCase(validationBean.getVso_severity_and_imapct_are_not_in_sync()))
							reviewContent
									.append(++reviewCount + Constants.VSO_SEV_AND_TAG_IMPACT_TAGS_DIFFERENCT_STRING);
						if (tagsString.contains(Constants.A11YAUTO_STRING))
							if ((tagsString.contains(Constants.A11Y_CRITICAL_TAG)
									|| tagsString.contains(Constants.A11Y_HIGH_TAG)) && Constants.YES.equalsIgnoreCase(validationBean.getA11yauto_bug_should_not_define_high_critical_impact_tags()))
								reviewContent.append(
										++reviewCount + Constants.A11YAUTO_SHOULD_NOT_HIGH_OR_CRITICAL_IMPACT_STRING);
						if (StringUtils.containsIgnoreCase(bugTitle, Constants.ROLE_STRING)
								&& StringUtils.containsIgnoreCase(bugTitle, Constants.APPLICATION_STRING)
								&& StringUtils.containsIgnoreCase(bugTitle, Constants.EQAULS_SYMBOL_STRING))
							if (!tagsString.contains(Constants.HIGH_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getApplciation_bug_impact_should_be_a11yhighimpact()))
								reviewContent.append(++reviewCount + Constants.ROLE_EQAULS_APPALICATION_IMPACT_STRING);

					}
					if (tagsString.contains(Constants.A11YAUTO_STRING))
						if ((severityString.contains(Constants.CRITICAL_STRING)
								|| severityString.contains(Constants.HIGH_STRING)) && Constants.YES.equalsIgnoreCase(validationBean.getA11yauto_bug_should_not_define_high_critical_severity_tags()))
							reviewContent.append(
									++reviewCount + Constants.A11YAUTO_SHOULD_NOT_HIGH_OR_CRITICAL_SEVERITY_STRING);

					if (UtilService.impactsCount(tagsString) > 1 && Constants.YES.equalsIgnoreCase(validationBean.getMore_than_one_impact_tags_are_defined()))
						reviewContent.append(++reviewCount + Constants.MORE_THAN_ONE_IMPACT_TAGS_STRING);
					if (StringUtils.containsIgnoreCase(bugTitle, Constants.ROLE_STRING)
							&& StringUtils.containsIgnoreCase(bugTitle, Constants.APPLICATION_STRING)
							&& StringUtils.containsIgnoreCase(bugTitle, Constants.EQAULS_SYMBOL_STRING))
						if (!severityString.contains(Constants.HIGH_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getApplciation_bug_severity_should_be_high()))
							reviewContent.append(++reviewCount + Constants.ROLE_EQAULS_APPALICATION_SEVERITY_STRING);

					// Mas Tag Check
					if (tagsString.contains(Constants.A11YMAS_STRING)) {
						String innerTag = tagsString.replace(Constants.A11YMAS_STRING, Constants.EMPTY_STRING);
						if (!innerTag.contains(Constants.MAS_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getNo_mas_tag_defined()))
							reviewContent.append(++reviewCount + Constants.NO_MAS_TAG);
					} else {
						if (tagsString.contains(Constants.MAS_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getMas_id_defined_but_a11ymas_tag_not_defined()))
							reviewContent.append(++reviewCount + Constants.NO_A11Y_MAS_TAG);
					}

					for (String masId : tagsMap.keySet()) {
						if (masId.contains(Constants.MAS_STRING) && !masId.contains(Constants.A11YMAS_STRING)) {
							if (masDetailsmap.get(masId) == null && wcagMap.get(masId) == null && Constants.YES.equalsIgnoreCase(validationBean.getInvalid_masid_or_not_defined_as_per_the_specfied_format())) {
								reviewContent.append(++reviewCount + Constants.MAS_ID_PLACED_IN_PROPERLY);
							} else {
								isMasTagAvailable = true;
								masTag = masId;
							}
							if (wcagMap.get(masId) != null && !tagsString.contains(Constants.WCAG_ID) && Constants.YES.equalsIgnoreCase(validationBean.getWcag_tag_not_defined())) {
								reviewContent.append(++reviewCount + Constants.WCAG_TAG_NOT_DEFINED);
								isMasTagAvailable = true;
								masTag = masId;
							}
							masNumber = masId.trim().replace(Constants.MAS_STRING, Constants.EMPTY_STRING);
							String masType = masId.trim().substring(0, 3);
							if (masType.contains(Constants.MAS_STRING))
								masCount++;
						}
					}
					if (masCount > 1 && Constants.YES.equalsIgnoreCase(validationBean.getMultiple_mas_id_defined()))
						reviewContent.append(++reviewCount + Constants.MULTIPLE_MAS_IDS);

					if ((tagsString.contains(Constants.K4D) || tagsString.contains(Constants.K4W))
							&& !tagsString.contains(Constants.A11YAUTO_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getKeros_bug_please_add_a11yAuto_tag()))
						reviewContent.append(++reviewCount + Constants.NO_A11Y_AUTO_TAG);

					if (tagsString.contains(Constants.A11YAUTO_STRING)
							&& (!tagsString.contains(Constants.K4D) && !tagsString.contains(Constants.K4W)) && Constants.YES.equalsIgnoreCase(validationBean.getAdd_K4D_K4W_along_with_a11yAuto_tag()))
						reviewContent.append(++reviewCount + Constants.NO_K4D_OR_K4W_TAG);

					if (tagsString.contains(Constants.A11YAUTO_STRING) && tagsString.contains(Constants.K4W)) {
						if ((!bugDescription.contains(Constants.CHROME_STRING)
								|| bugDescription.contains(Constants.EDGE_STRING)
								|| bugDescription.contains(Constants.IE_STRING)
								|| bugDescription.contains(Constants.FIRE_FOX_STRING)
								|| bugDescription.contains(Constants.SAFARI_STRING)) && Constants.YES.equalsIgnoreCase(validationBean.getBug_description_should_contains_browser_type_Chrome())) {
							reviewContent.append(++reviewCount + Constants.BROWSER_CHECKING);
						}
					}

					if (tagsString.contains(Constants.K4D) && tagsString.contains(Constants.K4W) && Constants.YES.equalsIgnoreCase(validationBean.getPlease_define_either_K4D_or_K4W()))
						reviewContent.append(++reviewCount + Constants.BOTH_K4D_K4W_TAG);

					if (isMasTagAvailable) {
						if (masDetailsmap.get(masTag) != null) {
							String bugCategory = masDetailsmap.get(masTag).getMasCategory();
							if (bugCategory != null && !bugCategory.equalsIgnoreCase(Constants.NO_CATEGORY_STRING)) {
								String categorySubStringText = bugCategory
										.replace(Constants.EMPTY_STRING_WITH_SPACE, Constants.EMPTY_STRING)
										.substring(0, 10).toUpperCase();
								String bugTitleInnerString = bugTitle
										.replace(Constants.EMPTY_STRING_WITH_SPACE, Constants.EMPTY_STRING)
										.toUpperCase();
								if (!bugTitleInnerString.contains(categorySubStringText) && Constants.YES.equalsIgnoreCase(validationBean.getInvalid_mas_category_defined_in_bug_title()))
									reviewContent.append(++reviewCount + Constants.MAS_CATEGORY_DEFINE_IN_TITLE);
							}
							bugCategory = bugCategory.replace(Constants.EMPTY_STRING_WITH_SPACE,
									Constants.EMPTY_STRING);
							if (bugCategory.equalsIgnoreCase(Constants.SCREEN_READER))
								if (reviewDataBean.getAppScreenReaderDetails() != null && !reviewDataBean
										.getAppScreenReaderDetails().equalsIgnoreCase(Constants.EMPTY_STRING))
									if (!bugDescription.contains(reviewDataBean.getAppScreenReaderDetails()) && Constants.YES.equalsIgnoreCase(validationBean.getScreen_reader_version_not_defined_in_the_bug_description()))
										reviewContent.append(++reviewCount
												+ Constants.SCREEEN_READER_NOT_SPECIFIED_IN_BUG_DESCRIPTION);

							String masLink = masDetailsmap.get(masTag).getMasLink();
							boolean isMASApplicable =  reviewDataBean.getAppValidateMasReference();
							if (!masNumber.equalsIgnoreCase(Constants.EMPTY_STRING)) {
								if (masLink != null && !masLink.equalsIgnoreCase(Constants.EMPTY_STRING) && isMASApplicable && Constants.YES.equalsIgnoreCase(validationBean.getMas_reference_link_not_defined_invalid_ref_is_provided_in_the_description())) {
									reviewContent.append(
											++reviewCount + Constants.MAS_LINK_NOT_SPECIFIED_IN_BUG_DESCRIPTION);
									if (!bugDescription.contains(masNumber) && Constants.YES.equalsIgnoreCase(validationBean.getInvalid_mas_mapping_in_the_bug_description()))
										reviewContent.append(
												++reviewCount + Constants.MAS_ID_NOT_SPECIFIED_IN_BUG_DESCRIPTION);
								}
							}

						}
						if (tagsString.contains(Constants.A11YAUTO_STRING))
							if (kerosMasRulesMap.get(masTag) == null && Constants.YES.equalsIgnoreCase(validationBean.getSpecify_valid_mas_id()))
								reviewContent.append(++reviewCount + Constants.VALID_MAS_ID);
					}

				}

				// Extra Check lists

				if (!tagsString.contains(Constants.A11YCT_TAG_STRING)
						&& !tagsString.contains(Constants.A11YRT_TAG_STRING)
						&& !tagsString.contains(Constants.A11YFEATURE_TAG_STRING)
						&& !tagsString.contains(Constants.A11YPWD_TAG_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getTestPass_not_defined_in_the_tags()))
					reviewContent.append(++reviewCount + Constants.TEST_PASS_NOT_DEFINED);

				// Application Specified Tags

				if (!reviewDataBean.getApplicationTags().equalsIgnoreCase(Constants.EMPTY_STRING)
						&& reviewDataBean.getApplicationTags() != null) {
					String[] appSpecifiedTags = reviewDataBean.getApplicationTags().split(Constants.SEMI_COLUMN_STRING);
					for (String appTag : appSpecifiedTags) {
						if (!tagsString.contains(appTag) && Constants.YES.equalsIgnoreCase(validationBean.getAppname_tag_not_defined())) {
							reviewContent.append(++reviewCount + Constants.HASH_SEPARATOR + appTag
									+ Constants.APPNAME_SPECIFIED_TAGS_NOT_DEFINED);
						}
					}
				}

				// Appliation Specified URL

				if (!reviewDataBean.getApplicationURL().equalsIgnoreCase(Constants.EMPTY_STRING)
						&& reviewDataBean.getApplicationURL() != null) {
					if (!bugDescription.contains(reviewDataBean.getApplicationURL()) && Constants.YES.equalsIgnoreCase(validationBean.getApplication_url_is_not_defined_in_description()))
						reviewContent.append(++reviewCount + Constants.APP_SPECIFIED_URL_NOT_DEFINED);
				}

				// Applcaition Specified Test Enviornment
				if (!reviewDataBean.getApplicationEnvironment().equalsIgnoreCase(Constants.EMPTY_STRING)
						&& reviewDataBean.getApplicationEnvironment() != null) {
					if (!bugDescription.contains(reviewDataBean.getApplicationEnvironment()) && Constants.YES.equalsIgnoreCase(validationBean.getApplciation_specified_test_environment_not_defined_in_the_description()))
						reviewContent.append(++reviewCount + Constants.APP_SPECIFIED_TEST_ENVIRONMENT_NOT_DEFINED);
				}

				// Area Path Checking
				if (reviewDataBean.getAppAreaPath() != null
						&& !reviewDataBean.getAppAreaPath().equalsIgnoreCase(Constants.EMPTY_STRING)) {
					if (!bugAreaPath.equalsIgnoreCase(reviewDataBean.getAppAreaPath()) && Constants.YES.equalsIgnoreCase(validationBean.getArea_paths_are_different()))
						reviewContent.append(++reviewCount + Constants.AREA_PATH_DIFFERENT);
				}

				// Iteration Path Checking
				if (reviewDataBean.getAppIterationPath() != null
						&& !reviewDataBean.getAppIterationPath().equalsIgnoreCase(Constants.EMPTY_STRING)) {
					if (!iterationPath.equalsIgnoreCase(reviewDataBean.getAppIterationPath()) && Constants.YES.equalsIgnoreCase(validationBean.getIteration_paths_are_different()))
						reviewContent.append(++reviewCount + Constants.ITERATION_PATH_DIFFERENT);
				}

				// A11yUsable and Funcational
				if (tagsString.contains(Constants.A11YUSABLE_STRING) || tagsString.contains(Constants.FUNCTIONAL)) {
					if (tagsString.contains(Constants.A11YUSABLE_STRING)) {
						if (!bugTitle.contains(Constants.USABLE_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getUsable_bug_should_define_usable_text_in_title()))
							reviewContent.append(++reviewCount + Constants.USABLE_TEXT_NOT_MENTIONED_IN_TITLE);
						if ((tagsString.contains(Constants.A11YMAS_STRING) || tagsString.contains(Constants.FUNCTIONAL)) && Constants.YES.equalsIgnoreCase(validationBean.getUsable_bug_should_not_tagged_with_a11ymas_or_functional()))
							reviewContent
									.append(++reviewCount + Constants.USABLE_BUG_SHOULD_NOT_TAGGED_WITH_OTHER_BUG_TYPE);
					}

					if (tagsString.contains(Constants.FUNCTIONAL)) {
						if (!bugTitle.contains(Constants.FUNCTIONAL) && Constants.YES.equalsIgnoreCase(validationBean.getFunctional_bug_should_define_functional_text_in_title()))
							reviewContent.append(++reviewCount + Constants.FUNCTIONAL_TEXT_NOT_MENTIONED_IN_TITLE);
						if ((tagsString.contains(Constants.A11YMAS_STRING)
								|| tagsString.contains(Constants.A11YUSABLE_STRING)) && Constants.YES.equalsIgnoreCase(validationBean.getFunctional_bug_should_not_tagged_with_a11ymas_or_a11yusable()))
							reviewContent.append(
									++reviewCount + Constants.FUNCATIONAL_BUG_SHOULD_NOT_TAGGED_WITH_OTHER_BUG_TYPE);
					}

					if (Constants.YES.equalsIgnoreCase(validationBean.getUsable_funcational_bug_should_not_define_any_impact_tag()) && (tagsString.contains(Constants.A11Y_CRITICAL_TAG) || tagsString.contains(Constants.A11Y_HIGH_TAG)
							|| tagsString.contains(Constants.A11Y_MEDIUM_TAG)
							|| tagsString.contains(Constants.A11Y_LOW_TAG))) {
						reviewContent.append(++reviewCount + Constants.IMPACT_TAG_SHOULD_NOT_DEFINE);
					}
					if (tagsString.contains(Constants.MAS_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getUsable_funcational_bug_should_not_define_any_a11ymas_tag_or_mas_number()))
						reviewContent.append(++reviewCount + Constants.MAS_TAG_SHOULD_NOT_DEFINE);

					if (Constants.YES.equalsIgnoreCase(validationBean.getUsable_funcational_bug_should_not_define_a11yauto_a11yWCAG2_K4D_and_K4W_tags()) && (tagsString.contains(Constants.A11YAUTO_STRING) || tagsString.contains(Constants.WCAG_ID)
							|| tagsString.contains(Constants.K4D) || tagsString.contains(Constants.K4W))) {
						reviewContent
								.append(++reviewCount + Constants.A11Y_AUTO_A11yWCAG_K4D_K4W_TAG_SHOULD_NOT_DEFINE);
					}
					if (bugDescription.contains(Constants.MAS_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getUsable_funcational_bug_should_not_define_any_mas_number_in_the_bug_descritption()))
						reviewContent.append(++reviewCount + Constants.MAS_TAG_SHOULD_NOT_DEFINE_IN_DESCRIPTION);

					if (!severityString.contains(Constants.LOW_STRING) && Constants.YES.equalsIgnoreCase(validationBean.getUsable_funcational_bug_impact_should_be_low_defined_other_impacts()))
						reviewContent.append(++reviewCount + Constants.IMPACT_TAG_SHOULD_DEFINE_IN_SEVERITY);

				}
				if (Constants.YES.equalsIgnoreCase(validationBean.getNo_bugs_should_contain_a11yexceptionrequested_a11yexceptionnodoc()) && (tagsString.contains(Constants.A11YEXCEPTIONAL_REQUESTED)
						|| tagsString.contains(Constants.A11YEXCEPTIONAL_NODOC)
						|| tagsString.contains(Constants.A11YEXCEPTIONAL_APPROVED)
						|| tagsString.contains(Constants.A11YEXCEPTIONAL_APPROVED_URGENT)))
					reviewContent.append(++reviewCount + Constants.SHOULD_NOT_DEFINE_THESE_TAGS);

				if (reviewContent.toString().equalsIgnoreCase(Constants.EMPTY_STRING))
					reviewNotFound++;
				else
					reviewFound++;
				/*
				 * String spellMistakes = Constants.EMPTY_STRING; spellMistakes +=
				 * Constants.TITLE_HEADER + Constants.COLON_SYMBOL +
				 * UtilService.spellCheck(bugTitle); spellMistakes +=
				 * Constants.DESCRIPTION_HEADER + Constants.COLON_SYMBOL +
				 * UtilService.spellCheck(bugDescription);
				 * bugDetailBean.setSpellMistakes(spellMistakes);
				 */
				bugDetailBean.setReviewStatus(reviewContent.toString());
				bugDetailsBeanList.add(bugDetailBean);
			} catch (Exception ex) {
				logger.error(Constants.EXCEPTION_MSG, ex);
			}
		}
		reviewDetailsBean.setBugDetailsBeanList(bugDetailsBeanList);
		reviewDetailsBean.setBugCountWithReview(reviewFound);
		reviewDetailsBean.setBugCountWithOutReview(reviewNotFound);
		return reviewDetailsBean;
	}

}
