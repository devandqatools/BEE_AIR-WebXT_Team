package com.hcl.reviewtool.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.hcl.reviewtool.beans.BugDetailsBean;
import com.hcl.reviewtool.beans.ReviewDetailsBean;

public interface ReviewToolService {
	
	public ReviewDetailsBean reviewProcessForUploadedBugs(ReviewDetailsBean reviewDataBean,Workbook workbook,HttpServletResponse response);
	
	public String generatePdfHtmlContentData(ReviewDetailsBean reviewBean);
	
	

}
