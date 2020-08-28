<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bug Evaluation Engine</title>
<style type="text/css">
* {
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.register {
	/*background: -webkit-linear-gradient(left, #3931af, #00c6ff);
    margin-top: 1%;
    padding: 3%;*/
	/*  background: -webkit-linear-gradient(left, #007bff, #007bff);*/
	margin-top: 1%;
	border: 1px solid #3931af;
	border-radius: 10px;
	box-shadow: 0 0 10px #007bff;
	-moz-box-shadow: 0 0 10px #007bff;
	-webkit-box-shadow: 0 0 10px #007bff;
	-o-box-shadow: 0 0 10px #007bff;
}

.register-left {
	text-align: center;
	color: #fff;
	margin-top: -2%;
}

.register-left input {
	border: none;
	border-radius: 1.5rem;
	padding: 2%;
	width: 60%;
	background: #f8f9fa;
	font-weight: bold;
	color: #383d41;
	margin-top: 30%;
	margin-bottom: 3%;
	cursor: pointer;
}

.register-right {
	border-top-left-radius: 10% 50%;
	border-bottom-left-radius: 10% 50%;
}

.register-left span.logo {
	margin-top: 15%;
	margin-bottom: 5%;
	width: 25%;
	-webkit-animation: mover 2s infinite alternate;
	animation: mover 1s infinite alternate;
}

.register-left img {
	margin-bottom: 5%;
	width: 115%;
	height: 420px;
	position: absolute;
	left: 0px;
	top: 92px;
}

@
-webkit-keyframes mover { 0% {
	transform: translateY(0);
}

100%
{
transform
:
 
translateY
(-20px);
 
}
}
@
keyframes mover { 0% {
	transform: translateY(0);
}

100%
{
transform
:
 
translateY
(-20px);
 
}
}
.register-left p {
	font-weight: lighter;
	padding: 12%;
	margin-top: -9%;
}

.register .register-form {
	margin-top: 13%;
	margin-left: 35px;
}

.btnRegister {
	float: right;
	border: none;
	border-radius: 1.5rem;
	padding: 2%;
	background: #0062cc;
	color: #fff;
	font-weight: 600;
	width: 50%;
	cursor: pointer;
	margin-top: -12px;
}

.register .nav-tabs {
	margin-top: 3%;
	border: none;
	background: #0062cc;
	border-radius: 1.5rem;
	width: 28%;
	float: right;
}

.register .nav-tabs .nav-link {
	padding: 2%;
	height: 34px;
	font-weight: 600;
	color: #fff;
	border-top-right-radius: 1.5rem;
	border-bottom-right-radius: 1.5rem;
}

.register .nav-tabs .nav-link:hover {
	border: none;
}

.register .nav-tabs .nav-link.active {
	width: 100px;
	color: #0062cc;
	border: 2px solid #0062cc;
	border-top-left-radius: 1.5rem;
	border-bottom-left-radius: 1.5rem;
}

.register-heading {
	text-align: center;
	margin-top: 3%;
	margin-bottom: -20%;
	color: #0062cc;
}

label {
	margin-bottom: 4px !important;
	font-weight: bold;
}

.row {
	height: 500px;
}

.form-group {
	margin-bottom: 2px !important;
}

input[disabled] {
	background-color: #6c757d !important;
}

.logo {
	color: #000000;
	font-size: 32px;
	font-style: oblique;
}

.error {
	color: red;
	line-height: 15px;
}

.red-star {
	color: red;
	position: relative;
	top: 0px;
	font-size: 15px;
}

.bee {
	height: 100px;
	width: 250px;
	position: absolute;
	top: -32px;
	right: 0px;
}

.form-control {
	height: 28px !important;
	border-color: #383d41 !important;
}

.foot-content {
	position: absolute;
	bottom: 65px;
	right: 4px;
	font-size: 20px;
	font-style: italic;
}

.form-adject {
	position: relative;
	top: -81px;
	padding-left: 15px;
}

#browsethefile {
	margin-top: 40px;
}

.comp_logo {
	display: block;
	font-size: 32px;
}

.selectcheckbox{
    margin-top: 33px !important;   
}



</style>



<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.js"></script>
</head>
<body>

	<div class="container register">
		<a class="navbar-brand main-logo no-float-logo" > <img
			src="https://www.hcl.com/sites/default/files/main-logo.png"
			alt="Home"></a>
		<div class="row">
			<div class="col-md-3 register-left">
				<h1 class="logo">
					<img src="assets/images/circle.png" alt="">
				</h1>

			</div>
			<div class="col-md-9 register-right">
				<div class="tab-content" id="myTabContent">
					<div class="tab-pane fade show active" id="home" role="tabpanel"
						aria-labelledby="home-tab">
						<h2 class="logo ">
							<img class="bee" src="assets/images/bee-new.png" alt="logo">
						</h2>
						<div class="row register-form">
							<div class="col-md-12">

								<form name="reviewForm"  id="reviewForm" onchange="checkFormValidation()" onclick="checkFormValidation()"
									action="reviewUploadedBugs" enctype="multipart/form-data"
									method="post">
									<div class="row">
										<div class="col-md-6">
											<div class="form-group">
												<label for="applicationnameId">Application Name <span
													class="red-star">*</span></label> <input type="text"
													name="applicationName" class="form-control"
													id="applicationnameId">
												<div class="error" id="nameErr" role="alert"
													aria-live="assertive"></div>
											</div>

											<div class="form-group">
												<label for="apptag">Application Specific TAG <span
													class="red-star">*</span></label> <input type="text"
													name="applicationTags" class="form-control" id="apptag">
												<div class="error" id="tagErr" role="alert"
													aria-live="assertive"></div>
											</div>

											<div class="form-group">
												<label for="url">Application URL</label> <input type="text"
													name="applicationURL" class="form-control" id="url">
												<div class="error" id="urlqErr" role="alert"
													aria-live="assertive"></div>
											</div>

											<div class="form-group">
												<label for="testenvironment">Test Environment</label> <input
													type="text" name="applicationEnvironment"
													class="form-control" id="testenvironment">
												<div class="error" id="envErr" role="alert"
													aria-live="assertive"></div>
											</div>

										</div>
										<div class="col-md-6">

											<div class="form-group">
												<label for="areapath">Area Path <span
													class="red-star">*</span></label> <input type="text"
													name="appAreaPath" class="form-control" id="areapath">
												<div class="error" id="areaErr" role="alert"
													aria-live="assertive"></div>
											</div>

											<div class="form-group">
												<label for="iterationpath">Iteration Path <span
													class="red-star">*</span></label> <input type="text"
													name="appIterationPath" class="form-control"
													id="iterationpath">
												<div class="error" id="iteErr" role="alert"
													aria-live="assertive"></div>
											</div>

											<div class="form-group">
												<label for="screenreader">Screen Reader Details</label> <input
													type="text" name="appScreenReaderDetails"
													class="form-control" id="screenreader">
												<div class="error" id="screenErr" role="alert"
													aria-live="assertive"></div>
											</div>
											
											<div class="form-group selectcheckbox" > 
                                                <input
													type="checkbox" name="appValidateMasReference"
                                                     id="enableMasRef">
                                                <span>MAS reference validation in Description</span>
											</div>

										</div>

										<div class="form-group form-adject">
											<p id="browsethefile">
												Upload the Bugs in excel to review and <a role="link"
													 href="downloadSampleFormateExcelDetails">Click here</a> to
												download the format.<span class="red-star">*</span>
											</p>
											<input type="file" role="button" multiple="multiple"
												class="btn btn-secondary" name="reviewUploadBugFile"
												id="reviewUploadFileId"
												accept="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/vnd.ms-excel"
												class="form-control" required
												aria-describedby="browsethefile" onchange="checkfile(this);" />
											<div class="error" id="fileErr" role="alert"
												aria-live="assertive"></div>
										</div>


										<div class="form-group">
											<input type="button" role="button" id="submit-clear"
												class="btn btn-primary" value="Clear" /> <input
												type="submit" role="button" id="submit-analyze" disabled="true"
												class="btn btn-primary" value="Analyze" />
										</div>

									</div>
								</form>


							</div>


						</div>
					</div>

				</div>

				<span class="foot-content">innovation from <b
					style="font-size: 30px; color: #007bff;">E+D</b></span>
			</div>


		</div>

	</div>
	<script type="text/javascript">
var reviewForm;
$(document).ready(function(){

     $("#submit-clear").bind("click", function() {
                $(this).closest('form').find("input[type=text], textarea").val("");
        });

     
    jQuery.validator.addMethod("extenstion", function(value, element) {
        const e = value.split('.')
        const ex = e[e.length - 1]
        return ['xls','xlsx'].indexOf(ex) > -1;
    }, "Invalid file selected, valid files are of .xlsx, .xls types.");
   reviewForm = $("#reviewForm").validate({
        onkeyup: function(element) {$(element).valid()},
        rules: {
        	applicationName: {
                required: true
            },
            appAreaPath: {
                required: true
            },
            applicationTags: {
                required: true
            },
            appIterationPath: {
                required: true
            },
            reviewUploadBugFile: {
                required: true,
                extenstion: "xlsx"
            },
        },
        messages: {
        	applicationName: {
                required: "Please enter Application Name."
            },
            appAreaPath: {
                required: "Please enter area path."
            },
            applicationTags: {
                required: "Please enter Tag address."
            },
            appIterationPath: {
                required: "Please enter Iteration path."
            },
            reviewUploadBugFile: {
                required: "Please select file to upload.",
                extenstion: "Invalid file selected, valid files are of .xlsx, .xls types"
            },
        },
        errorPlacement: function(error, element) {
            $(element).next('div').text(error.text());
        },
        success: function(error, element) {
            $(element).next('div').text('');
        },

    });
}); 

  function checkFormValidation() {
    var name = $("#applicationnameId").val();
    var areapath = $("#areapath").val();
    var apptag = $("#apptag").val();
    var iterationpath = $("#iterationpath").val();
    var file1 = $("#reviewUploadFileId").val();
   
    if(!name || !areapath || !apptag || !iterationpath || !file1) {
        $("#submit-analyze").attr("disabled", true);
    } else {
        $("#submit-analyze").attr("disabled", false);
    }
    
  }
  </script>
</body>
</html>