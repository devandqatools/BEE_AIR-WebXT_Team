package com.hcl.reviewtool.beans;

public class MasDetailsBean {

	private String masId;

	private String masCategory;
	
	private String masLink;

	public String getMasId() {
		return masId;
	}

	public void setMasId(String masId) {
		this.masId = masId;
	}

	public String getMasCategory() {
		return masCategory;
	}

	public void setMasCategory(String masCategory) {
		this.masCategory = masCategory;
	}

	public String getMasLink() {
		return masLink;
	}

	public void setMasLink(String masLink) {
		this.masLink = masLink;
	}

	public MasDetailsBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MasDetailsBean(String masId, String masCategory, String masLink) {
		super();
		this.masId = masId;
		this.masCategory = masCategory;
		this.masLink = masLink;
	}
	
	
	
	
}
