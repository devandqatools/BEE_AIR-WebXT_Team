package com.hcl.reviewtool.constants;
/**
 * This is the class used for the constants
 * 
 * @author Ganesh Gara
 */
public final class Constants {
	
	
	// constants String variables
		public static final String EXCEPTION_MSG = "Exception Message : ";
		
		public static final String EMPTY_STRING = "";
		
		public static final String NULL_STRING = "null";
		
		public static final String EMPTY_STRING_WITH_SPACE = " ";
		
		public static final String HYPHEN = "-";
		
		public static final String COLON_SYMBOL = ": ";
		
		public static final String SEMI_COLUMN_STRING = ";";
		
		public static final String SUGGESTED_CORRECTIONS = "Suggested correction(s): ";
		
		public static final String DOT_STRING = ".";
		
		public static final String HASH_SEPARATOR = "#";
		
		public static final String SLASH_URL = "/";
		
		public static final String BACK_SLASH = "\"";
		
		public static final String UNDERSCORE = "_";
		
		public static final String REVIEW_FILE = "Review_Report";
		
		public static final String FORMAT_TYPE = ".xlsx";

		public static final String PDF_FORMAT_TYPE = ".pdf";
		
		public static final String CONTENT_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
		
		public static final String CONTENT_HEADER = "Content-Disposition";
		
		public static final String ATTACHMENT_TYPE = "attachment; filename=\"";
		
		
		public static final String SUCCESS = "success";
		
		
		//Others

		public static final String MESSAGE = "message";
		
		public static final String CATALINA_PATH = "catalina.base";
		
		public static final String FILE_PATH = "filePath";
		
		public static final String TMP_FILES = "tmpFiles";
		
		public static final String FILE_PATHS = "filePath";
		
		public static final String JPG_IMAGE = ".jpg";
	 	
		public static final String JPG = "jpg";
		
		public static final String XLS = ".xlsx";
		
		public static final String REC_ID_STRING = "RecID_";
		
		public static final String HCL_UNDERSCORE_STRING = "HCL_";
		
		public static final String MAS_STRING = "MAS";
		
		public static final String A11Y_STRING = "A11y_";
		
		public static final String A11Y_COREDEV_STRING = "A11y-COREDEV";
		
		public static final String A11Y_1STPARTY__STRING = "A11y-1STPARTY";
		
		public static final String A11Y_3RDPARTY_STRING = "A11y-3RDPARTY";
		
		public static final String CORE_DEVELOPMENT_STRING = "Core Development";
		
		public static final String CORE_DEV_STRING = "CORE DEV";
		
		public static final String CSEO_STRING = "CSEO";

		public static final String UNTAGGED = "Un-tagged";
		
		public static final String UNTAGGED_STRING = "Untagged";
		
		public static final String FIRSTPARTY_UNTAGGED = "First_Party_Untagged";
		
		public static final String THIRDPARTY_UNTAGGED = "Third_Party_Untaggged";

		public static final String FIRST_PARTY_DEVELOPMENT_STRING = "1st Party";
		
		public static final String THIRD_PARTY_DEVELOPMENT_STRING = "3rd Party";
		
		public static final String A11YMAS_STRING = "A11yMAS";
		
		public static final String A11YUSABLE_STRING = "A11yUsable";
		
		public static final String FUNCTIONAL = "Functional";
		
		public static final String USABILITY_BUGS = "Usability Bugs";
		
		public static final String MAS_BUGS = "MAS Bugs";
		
		public static final String FUNCTIONAL_BUGS = "Functional Bugs";
		
		public static final String OTHER_BUGS = "Other Bugs";
		
		public static final String A11YAUTO_STRING = "A11yAuto";
		
		public static final String KEROS_IDENTIFIED = "Keros Identified";
		
		public static final String MANUALLY_IDENTIFIED = "Manually Identified";
		
		public static final String K4D = "K4D";
		
		public static final String K4W = "K4W";
		
		public static final String KEROS_FOR_DESKTOP = "Keros For Desktop";
		
		public static final String KEROS_FOR_WEB = "Keros For Web";
		
		public static final String THIRD_PARTY_UNDER_SCORE = "ThirdParty_";
		
		public static final String FIRST_PARTY_UNDER_SCORE = "FirstParty_";
		
		public static final String ACTIVE_STRING = "Active";
		
		public static final String NEW_STRING = "New";
		
		public static final String RESLOVED_STRING = "Resolved";
		
		public static final String CLOSED_STRING = "Closed";
		
		
		// WebXT Requirements 
	
		public static final String NOT_A_SECURITY_BUG = "Not a Security Bug";
		
		public static final String IMPORTANT = "Important";
		
		public static final String MODERATE = "Moderate";
		
		public static final String LOW = "Low";
		
		
		
		
		
		/*********************************************************
		 *  Review Messages
		 *********************************************************/
		
		public static final String NO_TAG_FOR_BUG_TYPE_STRING = "# Bug type not defined in the Tags, Add A11yMAS/A11yUsable/Functional ; ";
		
		public static final String INVALID_SECURITY_SEVERITY=" # Security Severity field value NULL either Not a security bug, Verify the Security Severity field value again ; ";
	       
        public static final String NO_TAG_FOR_IMPACT_STRING = " # No Bug Impact tag defined ; ";
       
        public static final String MORE_THAN_ONE_IMPACT_TAGS_STRING = "# More Than one impact tags are defined; ";
       
        public static final String VSO_SEV_AND_TAG_IMPACT_TAGS_DIFFERENCT_STRING = " # VSO Severity and imapct are not in Sync ; ";
        
        public static final String A11YAUTO_SHOULD_NOT_HIGH_OR_CRITICAL_IMPACT_STRING = " # It's A11yAuto bug , should not define High/Critical impact tags ; ";
        
        public static final String A11YAUTO_SHOULD_NOT_HIGH_OR_CRITICAL_SEVERITY_STRING = " # It's A11yAuto bug , should not define High/Critical Severity tags ; ";
        
        public static final String ROLE_EQAULS_APPALICATION_SEVERITY_STRING = " # For role = 'Applciation' bug Severity should be High ; ";
        
        public static final String ROLE_EQAULS_APPALICATION_IMPACT_STRING = " # For role = 'Applciation' bug Impact should be A11yHighImpact ; ";
       
        public static final String NO_MAS_TAG = "# No Mas tag defined; ";
       
        public static final String NO_A11Y_MAS_TAG = "# It's a Mas bug . Mas id defined but A11yMas tag not defined; ";
       
        //public static final String MAS_ID_PLACED_IN_PROPERLY = "# MAS ID in the tag is not defined as per the specfied format; ";

        public static final String MAS_ID_PLACED_IN_PROPERLY = "# Invalid MasId or not defined as per the specfied format;";
        
        public static final String MULTIPLE_MAS_IDS = "# Multiple MAS ID`s defined; ";
       
        public static final String NO_A11Y_AUTO_TAG = "# It`s a keros Bug, Please add A11yAuto tag; ";
       
        public static final String NO_K4D_OR_K4W_TAG = "#Please add K4D/K4W along with A11yAuto tag; ";
        
        public static final String BOTH_K4D_K4W_TAG = "# Both K4D and K4W tags defined . Please define either K4D or K4W , not both ; ";
        
        public static final String BROWSER_CHECKING = "# It's A11yAuto and k4W bug. So By defualt bug description should contains Browser type Chrome not other browsers ; ";
       
        public static final String WCAG_TAG_NOT_DEFINED = "# It's a WCAG2.1 mas rule but,WCAG tag not defined; ";
        
        public static final String TEST_PASS_NOT_DEFINED = "# TestPass not defined in the tags, Add A11yCT, A11yRT, A11yFeature or A11yPWD-AT; ";

        public static final String APP_SPECIFIED_TAGS_NOT_DEFINED = "# Applciation Specified tags not defined ;";
        
        public static final String APPNAME_SPECIFIED_TAGS_NOT_DEFINED = " tag not defined ;";

        public static final String APP_SPECIFIED_URL_NOT_DEFINED = "# Application URL is not defined/Invalid ref is provided in the description ;";
        
        public static final String APP_SPECIFIED_TEST_ENVIRONMENT_NOT_DEFINED = "# Applciation Specified Test Environment not defined in the description ;";

       // public static final String MAS_ID_NOT_SPECIFIED_IN_BUG_DESCRIPTION = "# Mas Id not defined in the bug description ;";

        public static final String MAS_ID_NOT_SPECIFIED_IN_BUG_DESCRIPTION = "# Invalid MAS/No MAS mapping in the Bug Description;";
        
        public static final String VALID_MAS_ID = "# It's A11yAuto bug, Defined mas number not in the scope. please specify valid mas Id  ;";     
                
        public static final String SCREEEN_READER_NOT_SPECIFIED_IN_BUG_DESCRIPTION = "# Screen Reader Version not defined in the bug description ;";
        
        public static final String MAS_LINK_NOT_SPECIFIED_IN_BUG_DESCRIPTION = "# Mas reference link not defined/Invalid ref is provided in the description ;";

       // public static final String MAS_CATEGORY_DEFINE_IN_TITLE = "# Mas Category should define in the bug title ;";
        
        public static final String MAS_CATEGORY_DEFINE_IN_TITLE = "# Invalid MAS Category / No MAS Category defined in the Bug title ;";
        
        public static final String USABLE_TEXT_NOT_MENTIONED_IN_TITLE = "# It's a Usable bug , So should define Usable text in Title ;";

        public static final String FUNCTIONAL_TEXT_NOT_MENTIONED_IN_TITLE = "# It's a Functional bug , So should define Functional text in Title ;";
        
        public static final String USABLE_BUG_SHOULD_NOT_TAGGED_WITH_OTHER_BUG_TYPE = "# It's a Usable bug , Should not tagged with A11yMas or Functional ;";

        public static final String FUNCATIONAL_BUG_SHOULD_NOT_TAGGED_WITH_OTHER_BUG_TYPE = "# It's a Functional bug , Should not tagged with A11yMas or A11yUsable ;";
        
        public static final String IMPACT_TAG_SHOULD_NOT_DEFINE = "# It's a Usable/Funcational bug , So it should not define any impact tag;";

        public static final String MAS_TAG_SHOULD_NOT_DEFINE = "# It's a Usable/Funcational bug , So it should not define any A11yMas tag or MAS number ;";

        public static final String IMPACT_TAG_SHOULD_DEFINE_IN_SEVERITY = "# It's a Usable/Funcational bug , So Impact should be low. Defined other impacts ;";
        
        public static final String SHOULD_NOT_DEFINE_THESE_TAGS= "# No Bugs should contain A11yExceptionRequested, A11yExceptionNoDoc, A11yExceptionApproved & A11yExceptionApprovedUrgent ;";
        
        public static final String MAS_TAG_SHOULD_NOT_DEFINE_IN_DESCRIPTION = "# It's a Usable/Funcational bug , So it should not define any MAS number in the bug descritption ;";
        
        public static final String A11Y_AUTO_A11yWCAG_K4D_K4W_TAG_SHOULD_NOT_DEFINE = "# It's a Usable/Funcational bug , So it should not define A11yAUTO, A11yWCAG2.1,K4D and K4W tags ;";
        
        public static final String AREA_PATH_DIFFERENT = "# Area Paths are different ;";
        
        public static final String ITERATION_PATH_DIFFERENT = "# Iteration Paths are different ;";
        
        public static final String GRAMMATICAL_MISTAKES = " Please check grammatical mistakes in Title/Description.";      
        
        
        
        
        public static final String A11Y_CRITICAL_TAG = "A11yCriticalImpact";
        
        public static final String A11Y_HIGH_TAG = "A11yHighImpact";
   
        public static final String A11Y_MEDIUM_TAG = "A11yMediumImpact";
       
        public static final String A11Y_LOW_TAG = "A11yLowImpact";
       
       
        public static final String CRITICAL_TAG_STRING = "1 - Critical";
   
        public static final String HIGH_TAG_STRING = "2 - High";
       
        public static final String MEDIUM_TAG_STRING = "3 - Medium";
       
        public static final String LOW_TAG_STRING = "4 - Low";
        
        public static final String CRITICAL_STRING = "Critical";
        
        public static final String HIGH_STRING = "High";
       
        public static final String MEDIUM_STRING = "Medium";
       
        public static final String LOW_STRING = "Low";
       
       
        public static final String REVIEW_STATUS = "Review Status";
        
        public static final String SPELL_MISTAKES_STRING = "Spell Mistakes(Warnings)";
       
        public static final String MESSAGE_PROPERTIES = "messages_en.properties";
       
        public static final String WCAG_MAS_IDS = "wcag.masids";
       
        public static final String COMMA = ",";
       
       
        public static final String WCAG_ID = "A11yWCAG2.1";
        
        public static final String A11YCT_TAG_STRING = "A11yCT";
        
        public static final String A11YRT_TAG_STRING = "A11yRT";
        
        public static final String A11YFEATURE_TAG_STRING = "A11yFeature";
        
        public static final String A11YPWD_TAG_STRING = "A11yPWD-AT";

        public static final String USABLE_STRING = "Usable";
        
        public static final String A11YEXCEPTIONAL_REQUESTED = "A11yExceptionRequested";
        
        public static final String A11YEXCEPTIONAL_NODOC = "A11yExceptionNoDoc";
        
        public static final String A11YEXCEPTIONAL_APPROVED = "A11yExceptionApproved";
        
        public static final String A11YEXCEPTIONAL_APPROVED_URGENT = "A11yExceptionApprovedUrgent";
        
        public static final String NO_CATEGORY_STRING = "No Category";
        
        
        
        
        // Download
        
        public static final String DEMO_EXCEL_STRING_TAG = "BEE_Bug_Review_Template";
        
        
        
        // Page URLS
        
        public static final String HOME_PAGE_URL = "/homePage";

        public static final String DEMO_FILE_URL = "/downloadSampleFormateExcelDetails";
        
        public static final String DOWNLOAD_REVIEW_REPORT_URL = "/downloadReviewReportDetails";
        
        public static final String DOWNLOAD_REVIEW_REPORT_PDF_URL = "/downloadReviewReportPDFDetails";
        
        public static final String REVIEW_UPLOADED_BUGS_URL = "/reviewUploadedBugs";
        
        
        
        
        
        // Page Names
        public static final String BUG_REVIEW_PAGE_NAME = "bugreview";
        
        public static final String RESPONSE_VIEW_PAGE_NAME = "responseview";
        
        
        
       
        
        // Demo File Header Tags
        
        public static final String BUG_REVIEW_SHEET_PAGE_NAME = "BugReviewDetails";
        
        public static final String ID_HEADER = "ID";
        
        public static final String TITLE_HEADER = "Title";
        
        public static final String DESCRIPTION_HEADER = "Description";
        
        public static final String TAGS_HEADER = "Tags";
        
        public static final String SEVERITY_HEADER = "Severity";
        
        public static final String AREA_PATH_HEADER = "Area Path";
        
        public static final String ITERATION_PATH_HEADER = "Iteration Path";
        
        public static final String REVIEW_DATA_LIST = "reviewDataList";

        public static final String REVIEW_DATA_BEAN = "reviewDataBean";
        
        public static final String APP_NAME_STRING = "AppName";
        
        public static final String DATE_FORMATE_TYPE = "MM-dd-yyyy hh:mm:ss";
        
        public static final String REVIEW_STATUS_STRING = "ReviewStatus";
        
        public static final String REVIEW_UPLOAD_DATA_STRING = "ReviewUploadData";
        
        public static final String WEB_APPS_STRING = "webapps";
        
        public static final String APP_NAME_MODEL_STRING = "appNameModel";
        
        public static final String REVIEW_NOT_AVAIALABLE_COUNT = "reviewNotAvailableCount";
        
        public static final String REVIEW_AVAIALABLE_COUNT = "reviewAvailableCount";
        
        public static final String TOTALCOUNT_STRING = "TotalCount";
        
        public static final String RESPONSE_TYPE = "responseType";
        
        public static final String SCREEN_READER = "ScreenReaders";
        
        
        
        public static final String CHROME_STRING = "Chrome";
        
        public static final String EDGE_STRING = "Edge";
        
        public static final String IE_STRING = "Internet Explorer";
        
        public static final String FIRE_FOX_STRING = "Firefox";
        
        public static final String SAFARI_STRING = "Safari";

        
        public static final String SUMMARY_REPORT_TITLE = "First Level Bug Evaluation Report  ";
        
        public static final String SAMPLE_HTML = "<!DOCTYPE html> <html lang='en'> <head> <meta charset='utf-8'> <meta http-equiv='X-UA-Compatible' content='IE=edge'> <meta name='viewport' content='width=device-width, initial-scale=1'> <title>Tables</title> <style type='text/css'> * { -webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box; } *, ::after, ::before { box-sizing: border-box; } body { margin: 0; font-family: -apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,'Helvetica Neue',Arial,'Noto Sans',sans-serif,'Apple Color Emoji','Segoe UI Emoji','Segoe UI Symbol','Noto Color Emoji'; font-size: 1rem; font-weight: 400; line-height: 1.5; color: #212529; text-align: left; background-color: #fff; } .container { width: 100%; padding-right: 15px; padding-left: 50px; margin-right: auto; margin-left: auto; } .register { /* background: -webkit-linear-gradient(left, #007bff, #007bff); */ margin-top: 1%; border: 1px solid #3931af; border-radius: 10px; box-shadow: 0 0 10px #0066AE; -moz-box-shadow: 0 0 10px #0066AE; -webkit-box-shadow: 0 0 10px #0066AE; -o-box-shadow: 0 0 10px #0066AE; } .navbar-brand { display: inline-block; padding-top: .3125rem; padding-bottom: .3125rem; margin-right: 1rem; font-size: 1.25rem; line-height: inherit; white-space: nowrap; display: block; /* border-bottom: 2px solid blue; */ margin: 0px 0px 28px 4px; } } /* ---- Some Resets ---- */ p, table, caption, td, tr, th { margin:0; padding:0; font-weight:normal; } /* ---- Paragraphs ---- */ p { margin-bottom:15px; } /* ---- Table ---- */ table { border-collapse:collapse; margin-bottom:15px; } caption { text-align:left; font-size:15px; padding-bottom:10px; } table td, table th { padding: 7px 46px 7px 10px; border:1px solid #000000; border-width:0 1px 1px 0; } thead th { } thead th[colspan], thead th[rowspan] { background:#66a9bd; } tbody th, tfoot th { border:1px solid #000000; text-align: center; font-size: 12px; } tbody td, tfoot td { border:1px solid #000000; text-align:center; background:#d5eaf0; } tfoot th { background:#b0cc7f; } tfoot td { background:#d7e1c5; font-weight:bold; } tbody tr.odd td { background:#bcd9e1; } .container { max-width: 835px; } img.bee { height: 90px; width: 240px; margin-bottom: 11px; } img { vertical-align: middle; border-style: none; height: 14px; } .header-up{ display: inline-block; border-bottom: 2px solid #0066AE; } .left-logo { float:left; width:40%; } .right-logo { float:left; width:50%; border-left: 1px solid #0066AE; padding: 0px 0px 0px 20px; } .eve-header{ font-size: 25px; padding: 0px; margin: 0px; } h2{ font-size: 16px; } .foot{ height:50px; } .foot-content { position: relative; right: 4px; font-size: 20px; font-style: italic; float: right; } </style> </head> <body> <div class='container register'> <a class='navbar-brand main-logo no-float-logo' > <!-- <img src='https://www.hcl.com/sites/default/files/main-logo.png' alt='Home'> --> </a> <div class='row'> <div class='header-up'> <div class='left-logo'> <span class='bee-logo'><img class='bee' src='https://www.hcl.com/sites/default/files/main-logo.png' alt='logo'></span> </div> <div class='right-logo'> <h1 class='eve-header'>First Level Bug Evaluation Report </h1> </div> </div> <br><br> <p>Bug Evaluation Engine has analysed all the bugs and here is the Detailed report on the same.</p> <h2>Review Summary:</h2> <table> <tr> <th>Total Number of Bugs Considered for Review</th> <td>66</td> </tr> <tr> <th>Bugs with out Review comments</th> <td>66</td> </tr> <tr> <th>Bugs with Review Comments</th> <td>66</td> </tr> </table> <h2>Bugs with & with Out Review Comments Summary:</h2> <table > <tr> <th style='background-color: #0066AE;color:#fff;'>With Comments</th> <th style='background-color: #0066AE;color:#fff;'>Without Comments</th> </tr> <tr> <td>6262662</td> <td>6262662</td> </tr> <tr> <td>6262662</td> <td>6262662</td> </tr> <tr> <td>6262662</td> <td>6262662</td> </tr> <tr> <td>6262662</td> <td>6262662</td> </tr> <tr> <td>6262662</td> <td>6262662</td> </tr> <tr> <td>6262662</td> <td>6262662</td> </tr> </table> <h2>Detailed Review Comments:</h2> <table> <tr> <th>Application Name</th> <th colspan='2'>M365 S& C C</th> </tr> <tr> <th>Area Path</th> <th colspan='2'>Stream\\Mobile</th> </tr> <tr> <th>Iteration Path</th> <th colspan='2'>Stream\\</th> </tr> <tr> <th style='background-color: #0066AE;color:#fff;'>ID</th> <th style='background-color: #0066AE;color:#fff;'>Title</th> <th style='background-color: #0066AE;color:#fff;'>Review Comments</th> </tr> <tr> <td>34555</td> <td></td> <td></td> </tr> <tr> <td>747448</td> <td></td> <td></td> </tr> <tr> <td>r7848</td> <td></td> <td></td> </tr> </table> <div class='foot'><span class='foot-content'>innovation from <b style='font-size:30px;color:#0066AE;'>E+D</b></span></div> </div> </div> </body> </html>";
        
       // public static final String SAMPLE_HTML = "<!DOCTYPE html> <html lang='en'> <body style='margin: 0; font-family: -apple-system,BlinkMacSystemFont,Segoe UI,Roboto,Helvetica Neue,Arial,Noto Sans,sans-serif,Apple Color Emoji,Segoe UI Emoji,Segoe UI Symbol,Noto Color Emoji; font-size: 1rem; font-weight: 400; line-height: 1.5; color: #212529; text-align: left; background-color: #fff;'> <div style = 'width: 100%; padding-right: 15px; padding-left: 50px;  margin-right: auto; margin-left: auto;  max-width: 835px; margin-top: 1%; border: 1px solid #3931af; border-radius: 10px; box-shadow: 0 0 10px #0066AE; -moz-box-shadow: 0 0 10px #0066AE;  -webkit-box-shadow: 0 0 10px #0066AE; -o-box-shadow: 0 0 10px #0066AE;'> <a style='display: inline-block; padding-top: .3125rem; padding-bottom: .3125rem; margin-right: 1rem; font-size: 1.25rem; line-height: inherit; white-space: nowrap; display: block; margin: 0px 0px 28px 4px; ' > </a> <div> <div style='display: inline-block; border-bottom: 2px solid #0066AE;'> <div style='float:left; width:40%;'> <span ><img style='height: 90px; width: 240px; margin-bottom: 11px;'src='https://www.hcl.com/sites/default/files/main-logo.png' alt='logo'></span> </div> <div style='float:left;width:50%; border-left: 1px solid #0066AE; padding: 0px 0px 0px 20px;'> <h1 style='font-size: 25px;padding: 0px; margin: 0px;'>First Level Bug Evaluation Report </h1> </div> </div> <br><br> <p style='margin:0;padding:0;font-weight:normal; margin-bottom:15px;'>Bug Evaluation Engine has analysed all the bugs and here is the Detailed report on the same.</p> <h2 style='font-size: 16px;'>Review Summary:</h2> <table style='margin:0;padding:0;	font-weight:normal; border-collapse:collapse;margin-bottom:15px;'> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <th style='border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px;'>Total Number of Bugs Considered for Review</th> <td style='border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;'>66</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <th style='border:1px solid #000000; padding: 10px;text-align: center;font-size: 12px;'>Bugs with out Review comments</th> <td style='border:1px solid #000000; padding: 10px;text-align:center;	background:#d5eaf0;'>66</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <th style='border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px;' >Bugs with Review Comments</th> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;'>66</td> </tr> </table> <h2 style='font-size: 16px;'>Detailed Review Comments:</h2> <table style='margin:0;padding:0;	font-weight:normal; border-collapse:collapse;margin-bottom:15px; table-layout:fixed;width:800px;'> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <th style='border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px; word-wrap:break-word;'>Application Name</th> <th style='border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px; word-wrap:break-word;' colspan='2'>M365 S& C C</th> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <th style='border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px;word-wrap:break-word;'>Area Path</th> <th style='border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px;word-wrap:break-word;' colspan='2'>Stream\\Mobile</th> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <th style='border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px;word-wrap:break-word;'>Iteration Path</th> <th style='border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px;word-wrap:break-word;' colspan='2'>Stream\\</th> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <th style=' border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px; background-color: #0066AE;color:#fff; word-wrap:break-word;'>ID</th> <th style=' border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px;background-color: #0066AE;color:#fff;word-wrap:break-word;'>Title</th> <th style=' border:1px solid #000000; padding: 10px; text-align: center;font-size: 12px;background-color: #0066AE;color:#fff;word-wrap:break-word;'>Review Comments</th> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> <tr style='padding: 7px 46px 7px 10px;	border:1px solid #000000;border-width:0 1px 1px 0;'> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1332062</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>[Screen reader-Secure Score (Va)-Overview - Metrics & trends - Edit score zones dialog]: Narrator is not announcing descriptively when focus is on edit fields available in Edit score zones dialog.</td> <td style=' border:1px solid #000000; padding: 10px; text-align:center;	background:#d5eaf0;word-wrap:break-word;'>1# Mas reference link not defined/Invalid ref is provided in the description ;2#UXWork tag not defined ;3# Iteration Paths are different ;</td> </tr> </table> <div style='height:50px;'><span style='position: relative; right: 4px; font-size: 20px;  font-style: italic;  float: right;'>innovation from <b style='font-size:30px;color:#0066AE;'>E+D</b></span></div> </div> </div> </body> </html>";
        
        public static final String TOTAL_NUMBER_OF_BUGS_REVIEW = "Total Number of Bugs Considered for Review";

        public static final String BUGS_WITH_OUT_REVIEW = "Bugs with out Review comments";
        
        public static final String BUGS_WITH_REVIEW = "Bugs with Review Comments";
        
        public static final String IMAGE_URL = "https://www.hcl.com/sites/default/files/main-logo.png";
        
        public static final String ROLE_STRING = "role";
        
        public static final String APPLICATION_STRING = "Application";
        
        public static final String EQAULS_SYMBOL_STRING = "=";
        
        public static final String YES= "yes"; 
        
        
        
        // HTML Content Data Strings
        
        
        public static final String BASE_HTML_STRING = "<!DOCTYPE html> <html lang='en'> <head> <meta charset='utf-8'> <meta http-equiv='X-UA-Compatible' content='IE=edge'> <meta name='viewport' content='width=device-width, initial-scale=1'> <style type='text/css'> * { -webkit-box-sizing: border-box; -moz-box-sizing: border-box; box-sizing: border-box; } *, ::after, ::before { box-sizing: border-box; } body { margin: 0; font-family: -apple-system,BlinkMacSystemFont,'Segoe UI',Roboto,'Helvetica Neue',Arial,'Noto Sans',sans-serif,'Apple Color Emoji','Segoe UI Emoji','Segoe UI Symbol','Noto Color Emoji'; font-size: 1rem; font-weight: 400; line-height: 1.5; color: #212529; text-align: left; background-color: #fff; } .container { width: 100%; padding-right: 15px; padding-left: 50px; margin-right: auto; margin-left: auto; } .register { /* background: -webkit-linear-gradient(left, #007bff, #007bff); */ margin-top: 1%; border: 1px solid #3931af; border-radius: 10px; box-shadow: 0 0 10px #0066AE; -moz-box-shadow: 0 0 10px #0066AE; -webkit-box-shadow: 0 0 10px #0066AE; -o-box-shadow: 0 0 10px #0066AE; } .navbar-brand { display: inline-block; padding-top: .3125rem; padding-bottom: .3125rem; margin-right: 1rem; font-size: 1.25rem; line-height: inherit; white-space: nowrap; display: block; /* border-bottom: 2px solid blue; */ margin: 0px 0px 28px 4px; } } /* ---- Some Resets ---- */ p, table, caption, td, tr, th { margin:0; padding:0; font-weight:normal; } /* ---- Paragraphs ---- */ p { margin-bottom:15px; } /* ---- Table ---- */ table { border-collapse:collapse; margin-bottom:15px; } caption { text-align:left; font-size:15px; padding-bottom:10px; } table td, table th { padding:6px 10px 7px 10px; border:1px solid #000000; border-width:0 1px 1px 0; } thead th { } thead th[colspan], thead th[rowspan] { background:#66a9bd; } tbody th, tfoot th { border:1px solid #000000; text-align: center; font-size: 12px; } tbody td, tfoot td { border:1px solid #000000; text-align:center; background:#d5eaf0; } tfoot th { background:#b0cc7f; } tfoot td { background:#d7e1c5; font-weight:bold; } tbody tr.odd td { background:#bcd9e1; } .container { max-width: 835px; } img.bee { height: 90px; width: 240px; margin-bottom: 11px; } img { vertical-align: middle; border-style: none; height: 14px; } .header-up{ display: inline-block; border-bottom: 2px solid #0066AE; width:100%; height:100px; } .left-logo { float:left; width:40%; } .right-logo { float:left; width:50%; border-left: 1px solid #0066AE; padding: 0px 0px 0px 20px; } .eve-header{ font-size: 25px; padding: 0px; margin: 0px; } h2{ font-size: 16px; } .foot{ height:50px; } .foot-content { position: relative; right: 4px; font-size: 20px; font-style: italic; float: right; } </style> </head> <body> <div class='container register'> <a class='navbar-brand main-logo no-float-logo' href='/'> <!-- <img src='https://www.hcl.com/sites/default/files/main-logo.png' alt='Home'> --></a> <div class='row'> <div class='header-up'> <div class='left-logo'> <span class='bee-logo'><img class='bee' src='https://www.hcl.com/sites/default/files/main-logo.png' alt='logo'></span> </div> <div class='right-logo'> <h1 class='eve-header'>First Level Bug Evaluation Report </h1> </div> </div> <br><br> <p>Bug Evaluation Engine has analysed all the bugs and here is the Detailed report on the same.</p> <h2>Review Summary:</h2> <table> <tr> <th>Total Number of Bugs Considered for Review</th> <td>" ;
        
        public static final String TD_CLOSE_STRING = "</td>";
        
        public static final String TR_CLOSE_STRING = "</tr>";
        
        public static final String BUGS_WITH_OUT_REVIEW_STRING = "</tr> <tr> <th>Bugs with out Review comments</th> <td>";
        
        public static final String BUGS_WITH_REVIEW_STRING = "</tr> <tr> <th>Bugs with Review Comments</th> <td>";
        
        public static final String TABLE_CLOSE_WITH_TR ="</tr></table>";
        
        public static final String DETAILED_REVIEW_COMMENTS = "<h2>Detailed Review Comments:</h2> <table> <tr> <th>Application Name</th> <th colspan='2'>";
        
        public static final String TH_CLOSE_STRING = "</th>";
        
        public static final String AREAPATH_STRING = "</tr> <tr> <th>Area Path</th> <th colspan='2'>";
        
        public static final String ITERATION_PATH_STRING = "</tr> <tr> <th>Iteration Path</th> <th colspan='2'>";
        
        public static final String MAIN_TABLE_HEADER_START = "</tr> <tr> <th style='background-color: #0066AE;color:#fff;'>ID</th> <th style='background-color: #0066AE;color:#fff;'>Title</th> <th style='background-color: #0066AE;color:#fff;'>Review Comments</th> </tr>";
        
        public static final String BUG_ID_TR_AND_TD_START = "<tr> <td style='width:15%'>";
        
        public static final String TITLE_START	= "<td style='width:35%'>";
        
        public static final String TABLE_REVIEW_STATUS_STRING = "<td style='width:50%;text-align:left;'>";
        
        public static final String BREAK_LINE = "</br>";
        
        public static final String VERY_GOOD = "Very Good . No Review Comments";
        
        public static final String FOOTER_CLOSE  = "</table> <div class='foot'><span class='foot-content'>innovation from <b style='font-size:30px;color:#0066AE;'>E+D</b></span></div> </div> </div> </body> </html>";
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
		
		
		
		

	// Api urls
		public Constants() {
	}
	
	// Asset Owner Module
	
	
		

}
