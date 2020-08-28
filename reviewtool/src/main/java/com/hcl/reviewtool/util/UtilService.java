package com.hcl.reviewtool.util;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;

import com.hcl.reviewtool.constants.Constants;
import com.hcl.reviewtool.service.ReviewToolServiceImpl;

public class UtilService {
	
	static final Logger logger = Logger.getLogger(UtilService.class);
	
	public static int impactsCount(String tagsString) {
		int count = 0;
		if (tagsString.contains(Constants.A11Y_CRITICAL_TAG))
			count++;
		if (tagsString.contains(Constants.A11Y_HIGH_TAG))
			count++;
		if (tagsString.contains(Constants.A11Y_MEDIUM_TAG))
			count++;
		if (tagsString.contains(Constants.A11Y_LOW_TAG))
			count++;
		return count;
	}

	public static String spellCheck(String spellWord) {
		JLanguageTool langTool = new JLanguageTool(new AmericanEnglish());
		StringBuffer spellMistakes = new StringBuffer();
		try {
				List<RuleMatch> matches = langTool.check(spellWord);
				for (RuleMatch match : matches) {
					spellMistakes.append(match.getFromPos() + Constants.HYPHEN + match.getToPos() +Constants.HYPHEN + match.getMessage());
				}
		} catch(Exception ex) {
			logger.error(Constants.EXCEPTION_MSG, ex);
		}
		return spellMistakes.toString();
	}

	public static boolean impactCheckWithSeverity(Map<String, String> tagsMap, String severityString) {
		boolean severityCheck = false;
		if (severityString.contains(Constants.CRITICAL_STRING)
				&& (Constants.A11Y_CRITICAL_TAG.equalsIgnoreCase(tagsMap.get(Constants.A11Y_CRITICAL_TAG))))
			return severityCheck = true;
		else if (severityString.contains(Constants.HIGH_STRING)
				&& (Constants.A11Y_HIGH_TAG.equalsIgnoreCase(tagsMap.get(Constants.A11Y_HIGH_TAG))))
			return severityCheck = true;
		else if (severityString.contains(Constants.MEDIUM_STRING)
				&& (Constants.A11Y_MEDIUM_TAG.equalsIgnoreCase(tagsMap.get(Constants.A11Y_MEDIUM_TAG))))
			return severityCheck = true;
		else if (severityString.contains(Constants.LOW_STRING)
				&& (Constants.A11Y_LOW_TAG.equalsIgnoreCase(tagsMap.get(Constants.A11Y_LOW_TAG))))
			return severityCheck = true;
		else	
			return severityCheck;
	}

	public static boolean validationForAllHeaders(Row row) {
		boolean isValidFile = true;
		if (row.getCell(0) == null || row.getCell(0).toString().equalsIgnoreCase(Constants.EMPTY_STRING)
				|| !row.getCell(0).toString().equalsIgnoreCase(Constants.ID_HEADER))
			isValidFile = false;
		else if (row.getCell(1) == null || row.getCell(1).toString().equalsIgnoreCase(Constants.EMPTY_STRING)
				|| !row.getCell(1).toString().equalsIgnoreCase(Constants.TITLE_HEADER))
			isValidFile = false;
		else if (row.getCell(2) == null || row.getCell(2).toString().equalsIgnoreCase(Constants.EMPTY_STRING)
				|| !row.getCell(2).toString().equalsIgnoreCase(Constants.DESCRIPTION_HEADER))
			isValidFile = false;
		else if (row.getCell(3) == null || row.getCell(3).toString().equalsIgnoreCase(Constants.EMPTY_STRING)
				|| !row.getCell(3).toString().equalsIgnoreCase(Constants.TAGS_HEADER))
			isValidFile = false;
		else if (row.getCell(4) == null || row.getCell(4).toString().equalsIgnoreCase(Constants.EMPTY_STRING)
				|| !row.getCell(4).toString().equalsIgnoreCase(Constants.SEVERITY_HEADER))
			isValidFile = false;
		else if (row.getCell(5) == null || row.getCell(5).toString().equalsIgnoreCase(Constants.EMPTY_STRING)
				|| !row.getCell(5).toString().equalsIgnoreCase(Constants.AREA_PATH_HEADER))
			isValidFile = false;
		else if (row.getCell(6) == null || row.getCell(6).toString().equalsIgnoreCase(Constants.EMPTY_STRING)
				|| !row.getCell(6).toString().equalsIgnoreCase(Constants.ITERATION_PATH_HEADER))
			isValidFile = false;
		return isValidFile;
	}
}
