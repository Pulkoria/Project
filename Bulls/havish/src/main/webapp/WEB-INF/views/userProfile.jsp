<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<meta http-equiv="Content-Type"
	content="text/javascript; charset=ISO-8859-1">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/prettyPhoto.css" rel="stylesheet">
<link href="resources/css/price-range.css" rel="stylesheet">
<link href="resources/css/animate.css" rel="stylesheet">
<link href="resources/css/main.css" rel="stylesheet">
<link href="resources/css/responsive.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
<link rel="shortcut icon" href="resources/images/ico/favicon.ico">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://fonts.googleapis.com/css?family=Roboto'
	rel='stylesheet'>
</head>
<!--/head-->

<body>

	<%@ include file="header.jsp"%>
	<section id="advertisement">
		<div class="container">
			<br>
			<p>Home / My Account</p>
	</section>


	<section>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<form id="msform">
						<div class="back_color">
							<h4>Personal Information</h4>
							<p>
								<img src="resources/images/user/images.jpg">
							</p>
							<div id="tab2" class="tab-pane fade in active">
							
									<form:form class="form_new" modelAttribute = "userVo" action="editProfile" method="POST">
									<div class="row" id="form_new">
										<div class="col-md-4">
											<label>Name</label>
											<form:input type="text" path="userName" placeholder="Name"/>
										</div>
										<div class="col-md-4">
											<label>Last Name</label>
											<form:input type="text" path="lastName" placeholder="Last Name"/>
										</div> 
									</div>
									<div class="row" id="form_new">
										<div class="col-md-4">
											<label>Email ID</label>
											<form:input type="text" path="emailId" placeholder="Email ID"/>
										</div>
										<div class="col-md-4">
											<label>Mobile Number</label>
											<form:input type="text" path = "phoneNo" placeholder="Mobile Number"/>
										</div>
									</div>
									<!-- <div class="row" id="form_new">
										<p>&nbsp;&nbsp;&nbsp;&nbsp;Your Gender</p>
										<input type="radio" id="option1" name="fooBar" value="foo"
											checked> <label for="option1" style="opacity: 1;"><span><span></span></span>Male</label>

										<input type="radio" id="option2" name="fooBar" value="bar">
										<label for="option2" style="opacity: 1;"><span><span></span></span>Female</label>

									</div> -->
									<div class="row" id="form_new">
										<br>
										<div class="col-md-3">
											<form:button type="submit"  value="Save"/>
										</div>
										<div class="col-md-3">
											<p class="color" style="margin-top: 14px;">
												<b>Cancel</b>
											</p>

										</div>

									</div>

							<a href="#"><p class="color">Deactive Account</p></a>
					</form:form>
							</div>
						</div>
					</form>
				</div>


			</div>
		</div>
	</section>

	<%@ include file="footer.jsp"%>
</footer>

	<a id="scrollUp" href="#top"><span><img
			src="images/cards/up.png"></span></a>
	<!-- 		<a id="scrollUp" href="#top"><img src="images/cards/up.png"></a> -->
	<script type="text/javascript">
		$(document).ready(function() {
			$(window).scroll(function() {
				if ($(this).scrollTop() > 100) {
					$('#scroll').fadeIn();
				} else {
					$('#scroll').fadeOut();
				}
			});
			$('#scroll').click(function() {
				$("html, body").animate({
					scrollTop : 0
				}, 600);
				return false;
			});
		});
	</script>
	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

	<script src="resources/js/price-range.js"></script>
	<script src="resources/js/jquery.prettyPhoto.js"></script>
	<script src="resources/js/main.js"></script>
	<script src="resources/js/main_p.js"></script>
	<script src="resources/js/jquery.easing.min.js"></script>
	<script type="text/javascript">
		// Popup Open
		function popupOpen() {
			document.getElementById("popup").style.display = "block";
			document.getElementById("overlay").style.display = "block";
		}
		// Popup Close
		function popupClose() {
			document.getElementById("popup").style.display = "none";
			document.getElementById("overlay").style.display = "none";
		}
	</script>
</body>
</html>