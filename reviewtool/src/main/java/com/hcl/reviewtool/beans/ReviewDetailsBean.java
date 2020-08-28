package com.hcl.reviewtool.beans;

import java.util.List;

public class ReviewDetailsBean {
	
	private String applicationName;
	
	private String applicationTags;
	
	private String applicationURL;
	
	private String applicationEnvironment;
	
    private String appAreaPath;
	
	private String appIterationPath;
	
	private String appScreenReaderDetails;
	
	private boolean appValidateMasReference;
	
	private int BugCountWithReview;
	
	private int BugCountWithOutReview;
	
	private boolean validExcel;
	
	
	public boolean getAppValidateMasReference() {
		return appValidateMasReference;
	}

	public void setAppValidateMasReference(boolean appValidateMasReference) {
		this.appValidateMasReference = appValidateMasReference;
	}

	public boolean isValidExcel() {
		return validExcel;
	}

	public void setValidExcel(boolean validExcel) {
		this.validExcel = validExcel;
	}

	private List<BugDetailsBean> BugDetailsBeanList; 
	
	
	public String getAppAreaPath() {
		return appAreaPath;
	}

	public void setAppAreaPath(String appAreaPath) {
		this.appAreaPath = appAreaPath;
	}

	public String getAppIterationPath() {
		return appIterationPath;
	}

	public void setAppIterationPath(String appIterationPath) {
		this.appIterationPath = appIterationPath;
	}

	public String getAppScreenReaderDetails() {
		return appScreenReaderDetails;
	}

	public void setAppScreenReaderDetails(String appScreenReaderDetails) {
		this.appScreenReaderDetails = appScreenReaderDetails;
	}

	public int getBugCountWithReview() {
		return BugCountWithReview;
	}

	public void setBugCountWithReview(int bugCountWithReview) {
		BugCountWithReview = bugCountWithReview;
	}

	public int getBugCountWithOutReview() {
		return BugCountWithOutReview;
	}

	public void setBugCountWithOutReview(int bugCountWithOutReview) {
		BugCountWithOutReview = bugCountWithOutReview;
	}

	public List<BugDetailsBean> getBugDetailsBeanList() {
		return BugDetailsBeanList;
	}

	public void setBugDetailsBeanList(List<BugDetailsBean> bugDetailsBeanList) {
		BugDetailsBeanList = bugDetailsBeanList;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationTags() {
		return applicationTags;
	}

	public void setApplicationTags(String applicationTags) {
		this.applicationTags = applicationTags;
	}

	public String getApplicationURL() {
		return applicationURL;
	}

	public void setApplicationURL(String applicationURL) {
		this.applicationURL = applicationURL;
	}

	public String getApplicationEnvironment() {
		return applicationEnvironment;
	}

	public void setApplicationEnvironment(String applicationEnvironment) {
		this.applicationEnvironment = applicationEnvironment;
	}

	public ReviewDetailsBean(String applicationName, String applicationTags, String appAreaPath,
			String appIterationPath) {
		super();
		this.applicationName = applicationName;
		this.applicationTags = applicationTags;
		this.appAreaPath = appAreaPath;
		this.appIterationPath = appIterationPath;
	}
	
	

}
