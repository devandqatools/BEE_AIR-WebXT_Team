<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
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
		<a class="navbar-brand main-logo no-float-logo" href="/"> <img
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
							<div class="col-md-10">
							 <div class="wrapper render">
								<c:choose>  
	    							<c:when test="${responseType == 0}">
										<div>
											<p>
												<b>Congratulations!Review completed successfully, for
													the bugs reported in ${appNameModel}. Here is the summary
													about the review</b>
											</p>
										</div>
										<div>
											<p>
												<b>Please <a style="text-decoration: underline;"
													href="downloadReviewReportDetails" >click here</a> to
													download Report.
												</b>
											</p>

											<p>
												<b>Please <a style="text-decoration: underline;"
													href="downloadReviewReportPDFDetails" >click here</a> to
													download PDF Report .
												</b>
											</p>
										</div>
										<table class="table" style="width: 100%;background: #007bff;color: white;">
											<tr>
												<th>Total Number of Bugs Considered for Review</th>
												<td>${TotalCount}</td>
											</tr>
											<tr>
												<th>Bugs with out Review comments</th>
												<td>${reviewNotAvailableCount}</td>
											</tr>
											<tr>
												<th>Bugs with Review Comments</th>
												<td>${reviewAvailableCount}</td>
											</tr>
										</table>
									</c:when>  
	    							 <c:otherwise>  
	    							  <p>
												<b>Sorry ! uploaded file contains some errors .<a role="link"
													 href="downloadSampleFormateExcelDetails">Click here</a> to
												download the formated file.</b>
											</p>
	   								 </c:otherwise>  
								</c:choose>
								<div class="form-group" id="contactBtn">
      								  <button class="btn btn-primary" ><a href="homePage" style="color:#ffffff;">Home</a></button>
    							</div>
    							</div>
							</div>


						</div>
					</div>

				</div>

				<span class="foot-content">innovation from <b
					style="font-size: 30px; color: #007bff;">E+D</b></span>
			</div>


		</div>

	</div>
</body>
</html>