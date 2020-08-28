package com.hcl.reviewtool.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("validate")
public class ValidationBean {
	
	private String bug_type_not_defined;
	private String security_severity_field; 
	private String no_bug_impact_tag_defined; 
	private String vso_severity_and_imapct_are_not_in_sync; 
	private String a11yauto_bug_should_not_define_high_critical_impact_tags; 
	private String applciation_bug_impact_should_be_a11yhighimpact; 
	private String a11yauto_bug_should_not_define_high_critical_severity_tags; 
	private String more_than_one_impact_tags_are_defined;
	private String applciation_bug_severity_should_be_high; 
	private String no_mas_tag_defined;
	private String mas_id_defined_but_a11ymas_tag_not_defined;
	private String invalid_masid_or_not_defined_as_per_the_specfied_format;
	private String wcag_tag_not_defined;
	private String multiple_mas_id_defined;
	private String keros_bug_please_add_a11yAuto_tag;
	private String add_K4D_K4W_along_with_a11yAuto_tag;
	private String bug_description_should_contains_browser_type_Chrome;
	private String please_define_either_K4D_or_K4W; 
	private String invalid_mas_category_defined_in_bug_title; 
	private String screen_reader_version_not_defined_in_the_bug_description;
	private String mas_reference_link_not_defined_invalid_ref_is_provided_in_the_description;
	private String invalid_mas_mapping_in_the_bug_description;
	private String specify_valid_mas_id;  
	private String testPass_not_defined_in_the_tags;
	private String appname_tag_not_defined; 
	private String application_url_is_not_defined_in_description;
	private String applciation_specified_test_environment_not_defined_in_the_description; 
	private String area_paths_are_different; 
	private String iteration_paths_are_different; 
	private String usable_bug_should_define_usable_text_in_title; 
	private String usable_bug_should_not_tagged_with_a11ymas_or_functional; 
	private String functional_bug_should_define_functional_text_in_title; 
	private String functional_bug_should_not_tagged_with_a11ymas_or_a11yusable; 
	private String usable_funcational_bug_should_not_define_any_impact_tag;
	private String usable_funcational_bug_should_not_define_any_a11ymas_tag_or_mas_number;
	private String usable_funcational_bug_should_not_define_a11yauto_a11yWCAG2_K4D_and_K4W_tags;
	private String usable_funcational_bug_should_not_define_any_mas_number_in_the_bug_descritption; 
	private String usable_funcational_bug_impact_should_be_low_defined_other_impacts;
	private String no_bugs_should_contain_a11yexceptionrequested_a11yexceptionnodoc;
	
	
	public String getBug_type_not_defined() {
		return bug_type_not_defined;
	}
	public void setBug_type_not_defined(String bug_type_not_defined) {
		this.bug_type_not_defined = bug_type_not_defined;
	}
	public String getSecurity_severity_field() {
		return security_severity_field;
	}
	public void setSecurity_severity_field(String security_severity_field) {
		this.security_severity_field = security_severity_field;
	}
	public String getNo_bug_impact_tag_defined() {
		return no_bug_impact_tag_defined;
	}
	public void setNo_bug_impact_tag_defined(String no_bug_impact_tag_defined) {
		this.no_bug_impact_tag_defined = no_bug_impact_tag_defined;
	}
	public String getVso_severity_and_imapct_are_not_in_sync() {
		return vso_severity_and_imapct_are_not_in_sync;
	}
	public void setVso_severity_and_imapct_are_not_in_sync(String vso_severity_and_imapct_are_not_in_sync) {
		this.vso_severity_and_imapct_are_not_in_sync = vso_severity_and_imapct_are_not_in_sync;
	}
	public String getA11yauto_bug_should_not_define_high_critical_impact_tags() {
		return a11yauto_bug_should_not_define_high_critical_impact_tags;
	}
	public void setA11yauto_bug_should_not_define_high_critical_impact_tags(
			String a11yauto_bug_should_not_define_high_critical_impact_tags) {
		this.a11yauto_bug_should_not_define_high_critical_impact_tags = a11yauto_bug_should_not_define_high_critical_impact_tags;
	}
	public String getApplciation_bug_impact_should_be_a11yhighimpact() {
		return applciation_bug_impact_should_be_a11yhighimpact;
	}
	public void setApplciation_bug_impact_should_be_a11yhighimpact(String applciation_bug_impact_should_be_a11yhighimpact) {
		this.applciation_bug_impact_should_be_a11yhighimpact = applciation_bug_impact_should_be_a11yhighimpact;
	}
	public String getA11yauto_bug_should_not_define_high_critical_severity_tags() {
		return a11yauto_bug_should_not_define_high_critical_severity_tags;
	}
	public void setA11yauto_bug_should_not_define_high_critical_severity_tags(
			String a11yauto_bug_should_not_define_high_critical_severity_tags) {
		this.a11yauto_bug_should_not_define_high_critical_severity_tags = a11yauto_bug_should_not_define_high_critical_severity_tags;
	}
	public String getMore_than_one_impact_tags_are_defined() {
		return more_than_one_impact_tags_are_defined;
	}
	public void setMore_than_one_impact_tags_are_defined(String more_than_one_impact_tags_are_defined) {
		this.more_than_one_impact_tags_are_defined = more_than_one_impact_tags_are_defined;
	}
	public String getApplciation_bug_severity_should_be_high() {
		return applciation_bug_severity_should_be_high;
	}
	public void setApplciation_bug_severity_should_be_high(String applciation_bug_severity_should_be_high) {
		this.applciation_bug_severity_should_be_high = applciation_bug_severity_should_be_high;
	}
	public String getNo_mas_tag_defined() {
		return no_mas_tag_defined;
	}
	public void setNo_mas_tag_defined(String no_mas_tag_defined) {
		this.no_mas_tag_defined = no_mas_tag_defined;
	}
	public String getMas_id_defined_but_a11ymas_tag_not_defined() {
		return mas_id_defined_but_a11ymas_tag_not_defined;
	}
	public void setMas_id_defined_but_a11ymas_tag_not_defined(String mas_id_defined_but_a11ymas_tag_not_defined) {
		this.mas_id_defined_but_a11ymas_tag_not_defined = mas_id_defined_but_a11ymas_tag_not_defined;
	}
	public String getInvalid_masid_or_not_defined_as_per_the_specfied_format() {
		return invalid_masid_or_not_defined_as_per_the_specfied_format;
	}
	public void setInvalid_masid_or_not_defined_as_per_the_specfied_format(
			String invalid_masid_or_not_defined_as_per_the_specfied_format) {
		this.invalid_masid_or_not_defined_as_per_the_specfied_format = invalid_masid_or_not_defined_as_per_the_specfied_format;
	}
	public String getWcag_tag_not_defined() {
		return wcag_tag_not_defined;
	}
	public void setWcag_tag_not_defined(String wcag_tag_not_defined) {
		this.wcag_tag_not_defined = wcag_tag_not_defined;
	}
	public String getMultiple_mas_id_defined() {
		return multiple_mas_id_defined;
	}
	public void setMultiple_mas_id_defined(String multiple_mas_id_defined) {
		this.multiple_mas_id_defined = multiple_mas_id_defined;
	}
	public String getKeros_bug_please_add_a11yAuto_tag() {
		return keros_bug_please_add_a11yAuto_tag;
	}
	public void setKeros_bug_please_add_a11yAuto_tag(String keros_bug_please_add_a11yAuto_tag) {
		this.keros_bug_please_add_a11yAuto_tag = keros_bug_please_add_a11yAuto_tag;
	}
	public String getAdd_K4D_K4W_along_with_a11yAuto_tag() {
		return add_K4D_K4W_along_with_a11yAuto_tag;
	}
	public void setAdd_K4D_K4W_along_with_a11yAuto_tag(String add_K4D_K4W_along_with_a11yAuto_tag) {
		this.add_K4D_K4W_along_with_a11yAuto_tag = add_K4D_K4W_along_with_a11yAuto_tag;
	}
	public String getBug_description_should_contains_browser_type_Chrome() {
		return bug_description_should_contains_browser_type_Chrome;
	}
	public void setBug_description_should_contains_browser_type_Chrome(
			String bug_description_should_contains_browser_type_Chrome) {
		this.bug_description_should_contains_browser_type_Chrome = bug_description_should_contains_browser_type_Chrome;
	}
	public String getPlease_define_either_K4D_or_K4W() {
		return please_define_either_K4D_or_K4W;
	}
	public void setPlease_define_either_K4D_or_K4W(String please_define_either_K4D_or_K4W) {
		this.please_define_either_K4D_or_K4W = please_define_either_K4D_or_K4W;
	}
	public String getInvalid_mas_category_defined_in_bug_title() {
		return invalid_mas_category_defined_in_bug_title;
	}
	public void setInvalid_mas_category_defined_in_bug_title(String invalid_mas_category_defined_in_bug_title) {
		this.invalid_mas_category_defined_in_bug_title = invalid_mas_category_defined_in_bug_title;
	}
	public String getScreen_reader_version_not_defined_in_the_bug_description() {
		return screen_reader_version_not_defined_in_the_bug_description;
	}
	public void setScreen_reader_version_not_defined_in_the_bug_description(
			String screen_reader_version_not_defined_in_the_bug_description) {
		this.screen_reader_version_not_defined_in_the_bug_description = screen_reader_version_not_defined_in_the_bug_description;
	}
	public String getMas_reference_link_not_defined_invalid_ref_is_provided_in_the_description() {
		return mas_reference_link_not_defined_invalid_ref_is_provided_in_the_description;
	}
	public void setMas_reference_link_not_defined_invalid_ref_is_provided_in_the_description(
			String mas_reference_link_not_defined_invalid_ref_is_provided_in_the_description) {
		this.mas_reference_link_not_defined_invalid_ref_is_provided_in_the_description = mas_reference_link_not_defined_invalid_ref_is_provided_in_the_description;
	}
	public String getInvalid_mas_mapping_in_the_bug_description() {
		return invalid_mas_mapping_in_the_bug_description;
	}
	public void setInvalid_mas_mapping_in_the_bug_description(String invalid_mas_mapping_in_the_bug_description) {
		this.invalid_mas_mapping_in_the_bug_description = invalid_mas_mapping_in_the_bug_description;
	}
	public String getSpecify_valid_mas_id() {
		return specify_valid_mas_id;
	}
	public void setSpecify_valid_mas_id(String specify_valid_mas_id) {
		this.specify_valid_mas_id = specify_valid_mas_id;
	}
	public String getTestPass_not_defined_in_the_tags() {
		return testPass_not_defined_in_the_tags;
	}
	public void setTestPass_not_defined_in_the_tags(String testPass_not_defined_in_the_tags) {
		this.testPass_not_defined_in_the_tags = testPass_not_defined_in_the_tags;
	}
	public String getAppname_tag_not_defined() {
		return appname_tag_not_defined;
	}
	public void setAppname_tag_not_defined(String appname_tag_not_defined) {
		this.appname_tag_not_defined = appname_tag_not_defined;
	}
	public String getApplication_url_is_not_defined_in_description() {
		return application_url_is_not_defined_in_description;
	}
	public void setApplication_url_is_not_defined_in_description(String application_url_is_not_defined_in_description) {
		this.application_url_is_not_defined_in_description = application_url_is_not_defined_in_description;
	}
	public String getApplciation_specified_test_environment_not_defined_in_the_description() {
		return applciation_specified_test_environment_not_defined_in_the_description;
	}
	public void setApplciation_specified_test_environment_not_defined_in_the_description(
			String applciation_specified_test_environment_not_defined_in_the_description) {
		this.applciation_specified_test_environment_not_defined_in_the_description = applciation_specified_test_environment_not_defined_in_the_description;
	}
	public String getArea_paths_are_different() {
		return area_paths_are_different;
	}
	public void setArea_paths_are_different(String area_paths_are_different) {
		this.area_paths_are_different = area_paths_are_different;
	}
	public String getIteration_paths_are_different() {
		return iteration_paths_are_different;
	}
	public void setIteration_paths_are_different(String iteration_paths_are_different) {
		this.iteration_paths_are_different = iteration_paths_are_different;
	}
	public String getUsable_bug_should_define_usable_text_in_title() {
		return usable_bug_should_define_usable_text_in_title;
	}
	public void setUsable_bug_should_define_usable_text_in_title(String usable_bug_should_define_usable_text_in_title) {
		this.usable_bug_should_define_usable_text_in_title = usable_bug_should_define_usable_text_in_title;
	}
	public String getUsable_bug_should_not_tagged_with_a11ymas_or_functional() {
		return usable_bug_should_not_tagged_with_a11ymas_or_functional;
	}
	public void setUsable_bug_should_not_tagged_with_a11ymas_or_functional(
			String usable_bug_should_not_tagged_with_a11ymas_or_functional) {
		this.usable_bug_should_not_tagged_with_a11ymas_or_functional = usable_bug_should_not_tagged_with_a11ymas_or_functional;
	}
	public String getFunctional_bug_should_define_functional_text_in_title() {
		return functional_bug_should_define_functional_text_in_title;
	}
	public void setFunctional_bug_should_define_functional_text_in_title(
			String functional_bug_should_define_functional_text_in_title) {
		this.functional_bug_should_define_functional_text_in_title = functional_bug_should_define_functional_text_in_title;
	}
	public String getFunctional_bug_should_not_tagged_with_a11ymas_or_a11yusable() {
		return functional_bug_should_not_tagged_with_a11ymas_or_a11yusable;
	}
	public void setFunctional_bug_should_not_tagged_with_a11ymas_or_a11yusable(
			String functional_bug_should_not_tagged_with_a11ymas_or_a11yusable) {
		this.functional_bug_should_not_tagged_with_a11ymas_or_a11yusable = functional_bug_should_not_tagged_with_a11ymas_or_a11yusable;
	}
	public String getUsable_funcational_bug_should_not_define_any_impact_tag() {
		return usable_funcational_bug_should_not_define_any_impact_tag;
	}
	public void setUsable_funcational_bug_should_not_define_any_impact_tag(
			String usable_funcational_bug_should_not_define_any_impact_tag) {
		this.usable_funcational_bug_should_not_define_any_impact_tag = usable_funcational_bug_should_not_define_any_impact_tag;
	}
	public String getUsable_funcational_bug_should_not_define_any_a11ymas_tag_or_mas_number() {
		return usable_funcational_bug_should_not_define_any_a11ymas_tag_or_mas_number;
	}
	public void setUsable_funcational_bug_should_not_define_any_a11ymas_tag_or_mas_number(
			String usable_funcational_bug_should_not_define_any_a11ymas_tag_or_mas_number) {
		this.usable_funcational_bug_should_not_define_any_a11ymas_tag_or_mas_number = usable_funcational_bug_should_not_define_any_a11ymas_tag_or_mas_number;
	}
	public String getUsable_funcational_bug_should_not_define_a11yauto_a11yWCAG2_K4D_and_K4W_tags() {
		return usable_funcational_bug_should_not_define_a11yauto_a11yWCAG2_K4D_and_K4W_tags;
	}
	public void setUsable_funcational_bug_should_not_define_a11yauto_a11yWCAG2_K4D_and_K4W_tags(
			String usable_funcational_bug_should_not_define_a11yauto_a11yWCAG2_K4D_and_K4W_tags) {
		this.usable_funcational_bug_should_not_define_a11yauto_a11yWCAG2_K4D_and_K4W_tags = usable_funcational_bug_should_not_define_a11yauto_a11yWCAG2_K4D_and_K4W_tags;
	}
	public String getUsable_funcational_bug_should_not_define_any_mas_number_in_the_bug_descritption() {
		return usable_funcational_bug_should_not_define_any_mas_number_in_the_bug_descritption;
	}
	public void setUsable_funcational_bug_should_not_define_any_mas_number_in_the_bug_descritption(
			String usable_funcational_bug_should_not_define_any_mas_number_in_the_bug_descritption) {
		this.usable_funcational_bug_should_not_define_any_mas_number_in_the_bug_descritption = usable_funcational_bug_should_not_define_any_mas_number_in_the_bug_descritption;
	}
	public String getUsable_funcational_bug_impact_should_be_low_defined_other_impacts() {
		return usable_funcational_bug_impact_should_be_low_defined_other_impacts;
	}
	public void setUsable_funcational_bug_impact_should_be_low_defined_other_impacts(
			String usable_funcational_bug_impact_should_be_low_defined_other_impacts) {
		this.usable_funcational_bug_impact_should_be_low_defined_other_impacts = usable_funcational_bug_impact_should_be_low_defined_other_impacts;
	}
	public String getNo_bugs_should_contain_a11yexceptionrequested_a11yexceptionnodoc() {
		return no_bugs_should_contain_a11yexceptionrequested_a11yexceptionnodoc;
	}
	public void setNo_bugs_should_contain_a11yexceptionrequested_a11yexceptionnodoc(
			String no_bugs_should_contain_a11yexceptionrequested_a11yexceptionnodoc) {
		this.no_bugs_should_contain_a11yexceptionrequested_a11yexceptionnodoc = no_bugs_should_contain_a11yexceptionrequested_a11yexceptionnodoc;
	}
	
	

}
