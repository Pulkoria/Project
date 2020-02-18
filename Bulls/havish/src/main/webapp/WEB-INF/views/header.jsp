<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<meta http-equiv="Content-Type"
	content="text/javascript; charset=ISO-8859-1">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="resources/js/home/home.js"></script>
<script src="resources/js/productCategory.js"></script> 
<script
	src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/font-awesome.min.css" rel="stylesheet">
<link href="resources/css/prettyPhoto.css" rel="stylesheet">
<link href="resources/css/price-range.css" rel="stylesheet">
<link href="resources/css/animate.css" rel="stylesheet">
<link href="resources/css/main.css" rel="stylesheet">
<link href="resources/css/responsive.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<header id="header">
		<div class="header_top">
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contactinfo">
							<ul class="nav nav-pills">
								<li><a href="#"><i class="fa fa-phone"></i> (+91)
										9900001111</a></li>
								<li><a href="#"><i class="fa fa-envelope"></i>
										customer_help@havish.com</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="social-icons pull-right">
							<ul class="nav navbar-nav">
								<li><a href="#"><i class="fa fa-shield"
										aria-hidden="true"></i> Guarantee</li>
								<li><a href="#"> <i class="fa fa-credit-card"
										aria-hidden="true"></i> Payment</li>
								<li><a href="#"><i class="fa fa-truck"
										aria-hidden="true"></i> Delivery</li>
								<li><a href="#" data-target="#login" data-toggle="modal"><i
										class="fa fa-user" aria-hidden="true"></i> Register or Sign in</a></li>

							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--/header_top-->

		<div class="header-middle">
			<!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-md-2 clearfix" style="padding: 0; margin: -8px;">
						<div class="logo pull-left">
							<a href="index.jsp"><img src="resources/images/home/logo.png"
								alt="" /></a>
						</div>
					</div>

					<div class="col-md-2 clearfix Daily_Drop">
						<div class="logo pull-left1">
							<a href="index.html"><img
								class="resources/images/DailyDrop_img"
								src="resources/fonts/noun_turn_1661846.svg" alt="" />
								<p>Daily Drop</p></a>
						</div>

					</div>
					<div class="col-md-4">

						<div class="wrap">
							<div class="search">
								<input type="text" class="searchTerm" placeholder="Search"
									id="searchKey"/> <input type="hidden" id="hidSearchId" value="Amul"/> 
								<button type="submit" class="searchButton" id="searchKeyId">
									<i class="fa fa-search"></i>
								</button>
							</div>
						</div>
					</div>
					<div class="col-md-2 clearfix">
						<p class="color">7 days a week from 8:00 am to 5:00 pm</p>
					</div>

					<div class="col-md-2">
						<span class="fa-stack fa-2x has-badge" data-count="13"><i
							class="fa fa-heart"></i></span> 
							 <!-- <li onclick="showDetails(this)" id="owl" data-animal-type="bird">Owl</li> -->
							<span class="fa-stack fa-2x has-badge" onclick="showDetails(this)" data-count="8" id="dataId">
							<i style="" class="fa fa-shopping-cart" id="cartId"></i>
							</span>
					</div>
				</div>
			</div>
		</div>
		<!--/header-middle-->

		<div class="header-bottom">
			<!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle"
								data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>

						<div id="primary_nav_wrap" class="catgCls">

							<ul class="nav navbar-nav collapse navbar-collapse" id="ulId">

								<li class="dropdown Daily_Drop1"><a href="#"
									style="color: #fff"><i class="fa fa-bars"
										aria-hidden="true"></i>&nbsp;&nbsp; All Categories</a>
									<ul role="menu" class="sub-menu">

										<li><c:forEach var="catgryList" items="${catgryVo}">
												<li value="${catgryList.categoryId}"><a href="#catbutId">${catgryList.categoryName}<input
													type="hidden" value="${catgryList.categoryId}" id="catgry" class="catgryClass" /><i
													class="fa fa-angle-right"></i></a> 
													<ul  role="menu"  class="sub-menu"
														id="subCatListId${catgryList.categoryId}">

													</ul>
												</li>
											</c:forEach></li>
									</ul></li>
							</ul>
						</div>
						<ul class="nav navbar-nav collapse navbar-collapse">

							<li><a href="#sign_up">Stationary<input
										type="hidden" value="PRCT001" id="catgryId" /></a>
							<ul role="menu"  class="sub-menu" id="subCatId">

							</ul>			
							</li>
							<li><a href="#sign_up2">Electronics<input
										type="hidden" value="PRCT002" id="catgryId2" /></a>
							<ul role="menu"  class="sub-menu" id="subCatId2">

							</ul>			
							</li>
							<li><a href="#sign_up3">Grocery<input
										type="hidden" value="PRCT003" id="catgryId3" /></a>
							<ul role="menu"  class="sub-menu" id="subCatId3">

							</ul>			
							</li>
							<li><a href="#sign_up4">Medical Equipments<input
										type="hidden" value="PRCT004" id="catgryId4" /></a>
							<ul role="menu"  class="sub-menu" id="subCatId4">

							</ul>			
							</li>
							<li><a href="#sign_up5">Recharges<input
										type="hidden" value="PRCT005" id="catgryId5" /></a>
							<ul role="menu"  class="sub-menu" id="subCatId5">

							</ul>			
							</li>
							
							<!-- <li><a href="shop.html">House Keeping </a></li>
							<li><a href="shop.html">Pantry</a></li>
							<li><a href="shop.html">Electronics</a></li>
							<li><a href="shop.html">Grocery</a></li>
							<li><a href="shop.html">Recharges</a></li> -->
						</ul>

					</div>

				</div>
			</div>
		</div>
		<!--/header-bottom-->
	</header>
	<div id="login" class="modal fade" role="dialog">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<div class="modal-content">
				<div class="modal-body">
					<button data-dismiss="modal" class="close button">
						<i class="fa fa-close"></i>
					</button>
					<div class="row">
						<div class="col-md-6">
							<img src="resources/images/dailydrop/login.png" alt="">
						</div>
						<div class="col-md-6">
							<div class="tab_form_data">


								<ul class="tabs">
									<li><input type="radio" checked name="tabs" id="tab1">
										<label for="tab1">Sign In to Havish</label>
										<div id="tab-content1" class="tab-content animated fadeIn">
											<div id="form_new" class="tab_form">
												<br> <br>
												<div class="col-md-12">
													<label>Registered Havish Mobile Number or Email ID</label><br>
													<input type="text" name=""
														placeholder="Mobile Number or Email ID" id="phoneNo">
												</div>
												<div class="col-md-12">
													<label>Havish Password</label><br> <input type="text"
														name="" placeholder="*******" id="password">
													<div class="hide-show"></div>
												</div>
												<a href="#"><p class="color"
														style="float: right; font-size: 15px;">Forgot password
														?</p></a>
												<button class="btn btn-default subscribe" id="loginId"
													style="color: #fff; width: 100%;">Login</button>
												<p>
													<br>By logging in, you agree to our <span
														class="color">terms & conditions</span> <span
														class="color">Privacy & Policy</span>
												</p>

											</div>
										</div></li>
									<li><input type="radio" name="tabs" id="tab2"> <label
										for="tab2">Sign Up</label>
										<div id="tab-content2" class="tab-content animated fadeIn">

											<div id="form_new" class="tab_form">
												<br> <br>
												<div class="col-md-12">
													<label>Mobile Number</label><br> <input type="text"
														name="" id="mobileNo"
														placeholder="Mobile Number or Email ID">
												</div>
												<div class="col-md-12">
													<label>Havish Password</label><br> <input type="text"
														name="" placeholder="*******" id="password">
													<div class="hide-show"></div>
												</div>
												<div class="col-md-12">
													<label>Name</label><br> <input type="text"
														id="userName" name="" placeholder="Name">
													<div class="hide-show"></div>
												</div>
												<div class="col-md-12">
													<label>Email ID</label><br> <input type="text" name=""
														id="emailId" placeholder="Email(Optional)">
													<div class="hide-show"></div>
												</div>

												<button class="btn btn-default subscribe" id="signUpSub"
													style="color: #fff; width: 100%;">Create an
													Account</button>
											</div>
										</div></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="modal fade" id="loginotpVeri" role="dialog">
		<div class="modal-dialog">

			<div class="modal-content">
				<button data-dismiss="modal" class="close button">
					<i class="fa fa-close"></i>
				</button>
				<div class="row">

					<div class="col-md-12">

						<li><label>OTP verification</label>
							<div>
								<div>
									<br> <br>
									<div class="col-md-12">
										<label>Enter the OTP </label><br> <input type="text"
											id="lsuserotp" placeholder="OTP">
										<div class="hide-show"></div>

										<div class="col-md-12">
											
										</div>
										</br> </br>
										<div class="col-md-4">
											<button class="btn btn-default subscribe" id="logverifOTP"
												style="color: #fff; width: 100%;">Verify OTP For
												login</button>
												<input type="submit" name="loginClick" />
												<input type="hidden" id="lgeneratedOTP" name="lgenOTP" value=""
												class=""/>
										</div>
									</div>
								</div>
							</div></li>
					</div>

				</div>
			</div>

		</div>
	</div>


	<div class="modal fade" id="otpVeri" role="dialog">
		<div class="modal-dialog">

			<div class="modal-content">
				<button data-dismiss="modal" class="close button">
					<i class="fa fa-close"></i>
				</button>
				<div class="row">

					<div class="col-md-12">

						<li><label>OTP verification</label>
							<div>
								<div>
									<br> <br>
									<div class="col-md-12">
										<label>Enter the OTP send to Your Registered Mobile
											Number</label><br> <input type="text" id="userotp"
											placeholder="OTP">
										<div class="hide-show"></div>
										<div class="col-md-12">
											<input type="hidden" id="generatedOTP" name="genOTP" class="" value="">
											<input type="hidden" name="userHidName" id="userNameHidId" value="">
											<input type="hidden" name="phoneHid" id="phonenoHidId" value="">
											<input type="hidden" name="email" id="emailHid" value="">
											<input type="hidden" name="email" id="passwordHidId" value="">
										</div>
										</br> </br>
										<div class="col-md-4">
											<button class="btn btn-default subscribe" id="verifOTP"
												style="color: #fff; width: 100%;">Verify OTP</button>
										</div>
									</div>
								</div>
							</div></li>
					</div>

				</div>
			</div>

			<!-- Modal content-->
			<!-- <div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">OTP Verification</h4>
				</div>
				<div class="col-md-12">
					<label>Enter the OTP send to Your Registered Mobile Number</label><br> <input type="text" id="userotp"  placeholder="OTP">
					<div class="hide-show"></div>
				

				<div class="col-md-12">
					<input type="hidden" id="generatedOTP">
					<input type="hidden" id="userNameHidId">
					<input type="hidden" id="phonenoHidId">
					<input type="hidden" id="emailHid">
				</div>
				<button class="btn btn-default subscribe" id="verifOTP" style="color: #fff; width: 100%;">
				Verify OTP</button>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div> -->

		</div>
	</div>
</body>
<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/jquery.scrollUp.min.js"></script>
<script src="resources/js/price-range.js"></script>
<script src="resources/js/jquery.prettyPhoto.js"></script>
<script src="resources/js/main.js"></script>
<script type="text/javascript">

function showDetails(count) {
	  alert("sdnvfdsfds");
	  var ani = count.getAttribute("data-count");
	  alert("a"+ani);
	  $("#data-count").html("10");
}

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


</html>