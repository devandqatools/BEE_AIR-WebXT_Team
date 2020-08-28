package com.hcl.reviewtool.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringReader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hcl.reviewtool.beans.BugDetailsBean;
import com.hcl.reviewtool.beans.ReviewDetailsBean;
import com.hcl.reviewtool.constants.Constants;
import com.hcl.reviewtool.service.ReviewToolService;
import com.itextpdf.html2pdf.HtmlConverter;


@Controller
public class ReviewToolController {

	@Autowired
	private ReviewToolService reviewToolService;
	
	@Autowired
	ServletContext servletContext;
	
	static final Logger logger = Logger.getLogger(ReviewToolController.class);

	@RequestMapping(Constants.SLASH_URL)
	public String bugReviewHomePage(Map<String, Object> model) {
		return Constants.BUG_REVIEW_PAGE_NAME;
	}
	@RequestMapping(Constants.HOME_PAGE_URL)
	public String homePage(Map<String, Object> model) {
		return Constants.BUG_REVIEW_PAGE_NAME;
	}
	
	@RequestMapping(Constants.DOWNLOAD_REVIEW_REPORT_PDF_URL)
	public void downloadReviewReportPdfDataDetails(Model model, HttpSession session, HttpServletResponse response) {
		try {
			ReviewDetailsBean reviewBean = (ReviewDetailsBean) session.getAttribute(Constants.REVIEW_DATA_BEAN);
			String appName = (String) session.getAttribute(Constants.APP_NAME_STRING);
			SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMATE_TYPE);
			String currentDate = sdf.format(new Date());
			response.setContentType(Constants.CONTENT_TYPE);
			response.setHeader(Constants.CONTENT_HEADER,
					Constants.ATTACHMENT_TYPE + appName+Constants.UNDERSCORE+Constants.REVIEW_FILE+Constants.UNDERSCORE+currentDate+Constants.PDF_FORMAT_TYPE + Constants.BACK_SLASH);
			ServletOutputStream outputStream = response.getOutputStream();
			HtmlConverter.convertToPdf(reviewToolService.generatePdfHtmlContentData(reviewBean), outputStream);
		}catch (Exception ex) {
			logger.error(Constants.EXCEPTION_MSG, ex);
		}

	}
	
	
	@RequestMapping(Constants.DEMO_FILE_URL)
	public void downloadSampleFormateExcelDetails(Model model, HttpSession session, HttpServletResponse response) {
		try {
			String appName = Constants.DEMO_EXCEL_STRING_TAG;
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet(Constants.BUG_REVIEW_SHEET_PAGE_NAME);
			int rowCount = 0;
			Row row = sheet.createRow(rowCount);
			int columnCounts = 0;
			Cell cells = row.createCell(columnCounts);
			cells.setCellValue(Constants.ID_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.TITLE_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.DESCRIPTION_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.TAGS_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.SEVERITY_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.AREA_PATH_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.ITERATION_PATH_HEADER);
			response.setContentType(Constants.CONTENT_TYPE);
			response.setHeader(Constants.CONTENT_HEADER,
					Constants.ATTACHMENT_TYPE + appName + Constants.FORMAT_TYPE + Constants.BACK_SLASH);
			ServletOutputStream outputStream = response.getOutputStream();
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception ex) {
			logger.error(Constants.EXCEPTION_MSG, ex);
		}

	}

	@RequestMapping(Constants.DOWNLOAD_REVIEW_REPORT_URL)
	public void downloadReviewReportDetails(Model model, HttpSession session, HttpServletResponse response) {
		try {
			List<BugDetailsBean> bugDetailsBeanList = (List<BugDetailsBean>) session.getAttribute(Constants.REVIEW_DATA_LIST);
			String appName = (String) session.getAttribute(Constants.APP_NAME_STRING);
			SimpleDateFormat sdf = new SimpleDateFormat(Constants.DATE_FORMATE_TYPE);
			String currentDate = sdf.format(new Date());
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet(Constants.BUG_REVIEW_SHEET_PAGE_NAME);
			int rowCount = 0;
			Row row = sheet.createRow(rowCount);
			int columnCounts = 0;
			CellStyle cs = workbook.createCellStyle();
			cs.setWrapText(true);
			Cell cells = row.createCell(columnCounts);
			cells.setCellValue(Constants.APP_NAME_STRING);
			row.createCell(++columnCounts).setCellValue(Constants.ID_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.TITLE_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.TAGS_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.SEVERITY_HEADER);
			row.createCell(++columnCounts).setCellValue(Constants.REVIEW_STATUS_STRING);
			//row.createCell(++columnCounts).setCellValue(Constants.SPELL_MISTAKES_STRING);
			for (BugDetailsBean bugDetailsBean : bugDetailsBeanList) {
				if(bugDetailsBean.getBudId()!= null &&  bugDetailsBean.getReviewStatus() != null && !Constants.EMPTY_STRING.equals(bugDetailsBean.getReviewStatus())) {
					row = sheet.createRow(++rowCount);
					int columnCount = 0;
					Cell cell = row.createCell(columnCount);
					cell.setCellValue(appName);
					row.createCell(++columnCount)
							.setCellValue(String.valueOf((int) Double.parseDouble(bugDetailsBean.getBudId())));
					row.createCell(++columnCount).setCellValue(bugDetailsBean.getBugTitle());
					row.createCell(++columnCount).setCellValue(bugDetailsBean.getBugTags());
					row.createCell(++columnCount).setCellValue(bugDetailsBean.getBugSeverity());
					Cell cellNew = row.createCell(++columnCount);
					cellNew.setCellValue(bugDetailsBean.getReviewStatus());
					cellNew.setCellStyle(cs);
					/*
					 * if(bugDetailsBean.getSpellMistakes() != null &&
					 * !bugDetailsBean.getSpellMistakes().equalsIgnoreCase(Constants.EMPTY_STRING))
					 * row.createCell(++columnCount).setCellValue(Constants.GRAMMATICAL_MISTAKES);
					 */
				}
			}

			response.setContentType(Constants.CONTENT_TYPE);
			response.setHeader(Constants.CONTENT_HEADER,
					Constants.ATTACHMENT_TYPE + appName+Constants.UNDERSCORE+Constants.REVIEW_FILE+Constants.UNDERSCORE+currentDate+Constants.FORMAT_TYPE + Constants.BACK_SLASH);
			ServletOutputStream outputStream = response.getOutputStream();
			workbook.write(outputStream);
			workbook.close();
		} catch (Exception ex) {
			logger.error(Constants.EXCEPTION_MSG, ex);
		}
	}

	@RequestMapping(value = Constants.REVIEW_UPLOADED_BUGS_URL, method = RequestMethod.POST)
	public String reviewUploadedBugs(@ModelAttribute ReviewDetailsBean reviewForm,
			@RequestParam MultipartFile reviewUploadBugFile, HttpServletRequest request, HttpServletResponse response,
			Model model) {
		if (!reviewUploadBugFile.isEmpty()) {
			try {
				Workbook workbook = null;
		        String lowerCaseFileName = reviewUploadBugFile.getOriginalFilename().toLowerCase();
		        if (lowerCaseFileName.endsWith(".xlsx")) {
		        	workbook = new XSSFWorkbook(reviewUploadBugFile.getInputStream());
		        } else {
		        	workbook = new HSSFWorkbook(reviewUploadBugFile.getInputStream());
		        }
				ReviewDetailsBean reviewDetailsBean = reviewToolService.reviewProcessForUploadedBugs(reviewForm,
						workbook, response);
				//file.close();
				if(reviewDetailsBean.isValidExcel()) {
					model.addAttribute(Constants.TOTALCOUNT_STRING,
							reviewDetailsBean.getBugCountWithReview() + reviewDetailsBean.getBugCountWithOutReview());
					model.addAttribute(Constants.REVIEW_AVAIALABLE_COUNT, reviewDetailsBean.getBugCountWithReview());
					model.addAttribute(Constants.REVIEW_NOT_AVAIALABLE_COUNT, reviewDetailsBean.getBugCountWithOutReview());
					HttpSession session = request.getSession();
					session.setAttribute(Constants.REVIEW_DATA_BEAN, reviewDetailsBean);
					session.setAttribute(Constants.REVIEW_DATA_LIST, reviewDetailsBean.getBugDetailsBeanList());
					session.setAttribute(Constants.APP_NAME_STRING, reviewForm.getApplicationName());
					model.addAttribute(Constants.APP_NAME_MODEL_STRING, reviewForm.getApplicationName());
					model.addAttribute(Constants.RESPONSE_TYPE, 0);
				} else 
					model.addAttribute(Constants.RESPONSE_TYPE, 1);
				workbook.close();
			} catch (Exception ex) {
				logger.error(Constants.EXCEPTION_MSG, ex);
			}
		}
		return Constants.RESPONSE_VIEW_PAGE_NAME;
	}

}
