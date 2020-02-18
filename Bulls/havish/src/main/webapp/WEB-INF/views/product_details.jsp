<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<meta http-equiv="Content-Type"
	content="text/javascript; charset=ISO-8859-1">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="resources/js/home.js"></script>
	<script src="resources/js/proddetails.js"></script>
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
<link href="resources/css/main1.css" rel="stylesheet">
<link href="resources/css/responsive.css" rel="stylesheet">
<link rel="shortcut icon" href="resources/images/ico/favicon.ico">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://fonts.googleapis.com/css?family=Roboto'
	rel='stylesheet'>
</head>
<!--/head-->

<body>
	<%@ include file="header.jsp"%>
	<form:form action="productsDtls" modelAttribute="prodlst" method="GET">
	<section id="advertisement">
		<div class="container">
			<br>
			<p>Home / Categories/${prodlst.prodSubCatName }/ Details</p>
			<br>
		</div>
	</section>
	<section>
		<div class="container">
			<div class="row">
				<div class="col-md-6">
				<img src="http://localhost:8082/havish/resources/images/product-details/img10.jpg">
					
					<main class="primary" style="background-image: url('${prodlst.productImage}');"></main>
				</div>
				<div class="col-md-6">
					<div class="product-information">
						<img src="resources/images/product-details/rating.png" alt=""> <small>1
							customer review  ${prodlst.prodVarientId}</small>

						<h4>${prodlst.productName} </h4>
						<p style="color: #59CF1F;">${prodlst.stockAvailable}</p>
						<div class="row">
							<div class="col-md-2">
								<p>
									<b>Quantity </b> :
								</p>
							</div>
							<div class="col-md-10">
									<form>
										<div class="value-button" id="decrease"
											onclick="decreaseValue()" value="Decrease Value">-</div>
										<input type="number" id="number" value="1" />
										
										<div class="value-button" id="increase"
											onclick="increaseValue()" value="Increase Value">+</div>
									</form>
								</div>
						</div>

						
						<div id="reviews" class="view1">
							<ul>
								<li><span class="bold"><i class="fa fa-inr"
										aria-hidden="true"></i> ${prodlst.price } </span></li>

								<li><a href="#addToCartId"
									class="btn btn-default add-to-cart_new add-to-cart_border"
									style="color: #FF6927"><input type = "hidden" value="${prodlst.prodVarientId}" id="prodVarHidId"/>Add to cart</a></li>
								<li><a href="checkout.html"
									class="btn btn-default add-to-cart_new" style="color:#fff">Buy
										Now</a></li>
							</ul>
						</div>
						<br>
						<div class="col-md-12">

							<p>
								<label>Delivery: </label> Lorem ipsum dolor sit amet,
								consectetuer adipiscing elit. Aenean commodo ligula eget dolor.
								Aenean massa.....<a href="#" class="color">View More</a>
							</p>
							<p class="pull-right1">
								<label> Payments: </label> <img
									src="resources/images/cards/1.png"> <img
									src="resources/images/cards/2.png"> <img
									src="resources/images/cards/3.png"> <img
									src="resources/images/cards/4.png"> <a href="#"
									class="color"> View More</a>
							</p>
							<br>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section>
		<div class="container">
			<div class="row">

				<div class="col-md-12 padding-right">

					<div class="category-tab">
						<!--category-tab-->
						<div class="col-sm-12" style="background: #f9f9f9;">
							<ul class="nav nav-tabs" style="margin: 0;">
								<li class="active"><a href="#description" data-toggle="tab">Description</a></li>
								<li><a href="#information" data-toggle="tab">Additional
										information</a></li>
								<li><a href="#review" data-toggle="tab">Reviews (1)</a></li>

							</ul>
						</div>
						<div class="tab-content">
							<div class="tab-pane fade active in" id="description">



								<div class="col-md-12 back_color">
									<p>Curabitur arcu erat, accumsan id imperdiet et, porttitor
										at sem. Vivamus suscipit tortor eget felis porttitor volutpat.
										Cras ultricies ligula sed magna dictum porta. Praesent sapien
										massa, convallis a pellentesque nec, egestas non nisi.
										Curabitur non nulla sit amet nisl tempus convallis quis ac
										lectus. Vestibulum ante ipsum primis in faucibus orci luctus
										et ultrices posuere cubilia Curae; Donec velit neque, auctor
										sit amet aliquam vel, ullamcorper sit amet ligula. Vestibulum
										ante ipsum primis in faucibus orci luctus et ultrices posuere
										cubilia Curae; Donec velit neque, auctor sit amet aliquam vel,
										ullamcorper sit amet ligula. Curabitur non nulla sit amet nisl
										tempus convallis quis ac lectus. Pellentesque in ipsum id orci
										porta dapibus. Quisque velit nisi, pretium ut lacinia in,
										elementum id enim. Nulla quis lorem ut libero malesuada
										feugiat. Lorem ipsum dolor sit amet, consectetur adipiscing
										elit. Cras ultricies ligula sed magna dictum porta.
										Pellentesque in ipsum id orci porta dapibus.</p>
									<p>Curabitur arcu erat, accumsan id imperdiet et, porttitor
										at sem. Vivamus suscipit tortor eget felis porttitor volutpat.
										Cras ultricies ligula sed magna dictum porta. Praesent sapien
										massa, convallis a pellentesque nec, egestas non nisi.
										Curabitur non nulla sit amet nisl tempus convallis quis ac
										lectus. Vestibulum ante ipsum primis in faucibus orci luctus
										et ultrices posuere cubilia Curae; Donec velit neque, auctor
										sit amet aliquam vel, ullamcorper sit amet ligula. Vestibulum
										ante ipsum primis in faucibus orci luctus et ultrices posuere
										cubilia Curae; Donec velit neque, auctor sit amet aliquam vel,
										ullamcorper sit amet ligula. Curabitur non nulla sit amet nisl
										tempus convallis quis ac lectus. Pellentesque in ipsum id orci
										porta dapibus. Quisque velit nisi, pretium ut lacinia in,
										elementum id enim. Nulla quis lorem ut libero malesuada
										feugiat. Lorem ipsum dolor sit amet, consectetur adipiscing
										elit. Cras ultricies ligula sed magna dictum porta.
										Pellentesque in ipsum id orci porta dapibus.</p>
								</div>
							</div>


							<div class="tab-pane fade" id="information">
								<div class="col-md-12 back_color">

									<table>

										<tr>
											<td>Warranty</td>
											<td>1 Year</td>
										</tr>
										<tr>
											<td>Flat tawa</td>
											<td>250 IB (Diameter: 23.5cm)</td>

										</tr>
										<tr>
											<td>Fry pan</td>
											<td>240 IB (Diameter: 23.5cm)</td>
										</tr>
										<tr>
											<td>Cookware Type</td>
											<td>Nonstick with induction ba</td>
										</tr>
										<tr>
											<td>Fry pan</td>
											<td>240 IB (Diameter: 23.5cm)</td>
										</tr>

									</table>
									<br>
								</div>
							</div>

							<div class="tab-pane fade" id="review">
								<div class="col-md-12 back_color">

									<a class="login-trigger" href="#" data-target="#login"
										data-toggle="modal">Add Review</a>

									<div id="login" class="modal fade" role="dialog">
										<div class="modal-dialog">

											<div class="modal-content">
												<div class="modal-body">
													<button data-dismiss="modal" class="close button">
														<i class="fa fa-close"></i>
													</button>
													<center>
														<h3>Add Review</h3>
													</center>
													<br>

													<form action="#">
														<span> <input type="text" placeholder="Your Name" />
															<input type="email" placeholder="Email Address" />
														</span>
														<textarea name="" placeholder="Message"></textarea>
														<b>Rating: </b> <img
															src="resources/images/product-details/rating.png" alt="" />
														<button type="button" class="btn btn-default pull-right">
															Submit</button>
													</form>


												</div>
											</div>
										</div>
									</div>

									<div class="row review_reply">
										<div class="col-md-8">
											<h4>Oleh Chabanov</h4>
										</div>
										<div class="col-md-4">
											<span>15 Oct, 2019</span> <img
												src="resources/images/product-details/rating.png" alt="">
										</div>
										<p class="col-md-12">
											<i class="fa fa-user" aria-hidden="true"></i> Lorem ipsum
											dolor sit amet, consectetuer adipiscing elit. Aenean commodo
											ligula eget dolor. Aenean massa. Cum sociis natoque penatibus
											et magnis dis parturient montes, nascetur ridiculus mus.
											Donec quam felis, ultricies nec, pellentesque eu, pretium
											quis, sem.
										</p>
									</div>
									<div class="row review_reply">
										<div class="col-md-8">
											<h4>Oleh Chabanov</h4>
										</div>
										<div class="col-md-4">
											<span>15 Oct, 2019</span> <img
												src="resources/images/product-details/rating.png" alt="">
										</div>
										<p class="col-md-12">
											<i class="fa fa-user" aria-hidden="true"></i> Lorem ipsum
											dolor sit amet, consectetuer adipiscing elit. Aenean commodo
											ligula eget dolor. Aenean massa. Cum sociis natoque penatibus
											et magnis dis parturient montes, nascetur ridiculus mus.
											Donec quam felis, ultricies nec, pellentesque eu, pretium
											quis, sem.
										</p>
									</div>

									<div class="row review_reply">
										<div class="col-md-8">
											<h4>Oleh Chabanov</h4>
										</div>
										<div class="col-md-4">
											<span>15 Oct, 2019</span> <img
												src="resources/images/product-details/rating.png" alt="">
										</div>
										<p class="col-md-12">
											<i class="fa fa-user" aria-hidden="true"></i> Lorem ipsum
											dolor sit amet, consectetuer adipiscing elit. Aenean commodo
											ligula eget dolor. Aenean massa. Cum sociis natoque penatibus
											et magnis dis parturient montes, nascetur ridiculus mus.
											Donec quam felis, ultricies nec, pellentesque eu, pretium
											quis, sem.
										</p>
									</div>
									<div class="row review_reply">
										<div class="col-md-8">
											<h4>Oleh Chabanov</h4>
										</div>
										<div class="col-md-4">
											<span>15 Oct, 2019</span> <img
												src="resources/images/product-details/rating.png" alt="">
										</div>
										<p class="col-md-12">
											<i class="fa fa-user" aria-hidden="true"></i> Lorem ipsum
											dolor sit amet, consectetuer adipiscing elit. Aenean commodo
											ligula eget dolor. Aenean massa. Cum sociis natoque penatibus
											et magnis dis parturient montes, nascetur ridiculus mus.
											Donec quam felis, ultricies nec, pellentesque eu, pretium
											quis, sem.
										</p>
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>



			</div>
			<!--/category-tab-->

			<div class="container ">

				<div class="row ">
					<div class="col-md-10" style="padding: 0">
						<h3>Recently Viewed</h3>
					</div>
					<div class="col-md-2">
						<h3 style="text-align: right">
							<a class="left recommended-item-control"
								href="#recommended-item-carousel" data-slide="prev"> <i
								class="fa fa-angle-left"></i>
							</a> <a class="right recommended-item-control"
								href="#recommended-item-carousel" data-slide="next"> <i
								class="fa fa-angle-right"></i>
							</a>
						</h3>
					</div>



				</div>


			</div>
			<div id="recommended-item-carousel" class="carousel slide"
				data-ride="carousel">
				<div class="carousel-inner">
					<div class="item active">
						<div class="col-md-3">
							<div class="product-image-wrapper">
								<div class="single-products">

									<img src="resources/images/phone/1.jpg"> <img
										src="resources/images/phone/rating.png">
									<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
									<p class="bold">
										<i class="fa fa-inr" aria-hidden="true"></i> 150.00
									</p>

									<div class="product-overlay">
										<div class="overlay-content">

											<a href="#" class="btn btn-default add-to-cart">Add to
												cart</a> <a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-heart"></i></a> <a class="readmore"
												href="product-details.html"> Read More </a>
										</div>
									</div>

								</div>

							</div>
						</div>

						<div class="col-md-3">
							<div class="product-image-wrapper">
								<div class="single-products">

									<img src="resources/images/phone/2.jpg"> <img
										src="resources/images/phone/rating.png">
									<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
									<p class="bold">
										<i class="fa fa-inr" aria-hidden="true"></i> 150.00
									</p>

									<div class="product-overlay">
										<div class="overlay-content">

											<a href="#" class="btn btn-default add-to-cart">Add to
												cart</a> <a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-heart"></i></a> <a class="readmore"
												href="product-details.html"> Read More </a>
										</div>
									</div>

								</div>

							</div>
						</div>
						<div class="col-md-3">
							<div class="product-image-wrapper">
								<div class="single-products">

									<img src="resources/images/phone/3.jpg"> <img
										src="resources/images/phone/rating.png">
									<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
									<p class="bold">
										<i class="fa fa-inr" aria-hidden="true"></i> 150.00
									</p>

									<div class="product-overlay">
										<div class="overlay-content">

											<a href="#" class="btn btn-default add-to-cart">Add to
												cart</a> <a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-heart"></i></a> <a class="readmore"
												href="product-details.html"> Read More </a>
										</div>
									</div>

								</div>

							</div>
						</div>
						<div class="col-md-3">
							<div class="product-image-wrapper">
								<div class="single-products">

									<img src="resources/images/phone/4.jpg"> <img
										src="resources/images/phone/rating.png">
									<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
									<p class="bold">
										<i class="fa fa-inr" aria-hidden="true"></i> 150.00
									</p>

									<div class="product-overlay">
										<div class="overlay-content">

											<a href="#" class="btn btn-default add-to-cart">Add to
												cart</a> <a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-heart"></i></a> <a class="readmore"
												href="product-details.html"> Read More </a>
										</div>
									</div>

								</div>

							</div>
						</div>





					</div>
					<div class="item">
						<div class="col-md-3">
							<div class="product-image-wrapper">
								<div class="single-products">

									<img src="resources/images/phone/5.jpg"> <img
										src="resources/images/phone/rating.png">
									<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
									<p class="bold">
										<i class="fa fa-inr" aria-hidden="true"></i> 150.00
									</p>

									<div class="product-overlay">
										<div class="overlay-content">

											<a href="#" class="btn btn-default add-to-cart">Add to
												cart</a> <a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-heart"></i></a> <a class="readmore"
												href="product-details.html"> Read More </a>
										</div>
									</div>

								</div>

							</div>
						</div>

						<div class="col-md-3">
							<div class="product-image-wrapper">
								<div class="single-products">

									<img src="resources/images/phone/6.jpg"> <img
										src="resources/images/phone/rating.png">
									<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
									<p class="bold">
										<i class="fa fa-inr" aria-hidden="true"></i> 150.00
									</p>

									<div class="product-overlay">
										<div class="overlay-content">

											<a href="#" class="btn btn-default add-to-cart">Add to
												cart</a> <a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-heart"></i></a> <a class="readmore"
												href="product-details.html"> Read More </a>
										</div>
									</div>

								</div>

							</div>
						</div>
						<div class="col-md-3">
							<div class="product-image-wrapper">
								<div class="single-products">

									<img src="resources/images/phone/7.jpg"> <img
										src="resources/images/phone/rating.png">
									<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
									<p class="bold">
										<i class="fa fa-inr" aria-hidden="true"></i> 150.00
									</p>

									<div class="product-overlay">
										<div class="overlay-content">

											<a href="#" class="btn btn-default add-to-cart">Add to
												cart</a> <a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-heart"></i></a> <a class="readmore"
												href="product-details.html"> Read More </a>
										</div>
									</div>

								</div>

							</div>
						</div>
						<div class="col-md-3">
							<div class="product-image-wrapper">
								<div class="single-products">

									<img src="resources/images/phone/8.jpg"> <img
										src="resources/images/phone/rating.png">
									<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
									<p class="bold">
										<i class="fa fa-inr" aria-hidden="true"></i> 150.00
									</p>

									<div class="product-overlay">
										<div class="overlay-content">

											<a href="#" class="btn btn-default add-to-cart">Add to
												cart</a> <a href="#" class="btn btn-default add-to-cart"><i
												class="fa fa-heart"></i></a> <a class="readmore"
												href="product-details.html"> Read More </a>
										</div>
									</div>

								</div>

							</div>
						</div>

					</div>
				</div>

			</div>
		</div>
		<!--/recommended_items-->

		</div>
		</div>
		</div>
	</section>

	<section>

		<div class="container">
			<h3>Related Products</h3>
			<div class="row back_color">
				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/1.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.htm"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>

				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/2.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>
				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/3.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>

				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/4.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>
				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/5.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>
				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/6.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>


			</div>
			<div class="row back_color">
				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/1.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>

				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/2.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>
				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/3.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>

				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/4.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>
				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/5.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>
				<div class="col-md-2">
					<div class="product-image-wrapper">
						<div class="single-products">

							<img src="resources/images/phone/6.jpg" style="width: 150px;"> <img
								src="resources/images/phone/rating.png" style="width: 72px;">
							<p>Prestige Popular Aluminum Cooker : 5 Litres</p>
							<p class="bold">
								<i class="fa fa-inr" aria-hidden="true"></i> 150.00
							</p>

							<div class="product-overlay">
								<div class="overlay-content">

									<a href="#" class="btn btn-default add-to-cart">Add to cart</a>
									<a href="#" class="btn btn-default add-to-cart"><i
										class="fa fa-heart"></i></a> <a class="readmore"
										href="product-details.html"> Read More </a>
								</div>
							</div>

						</div>

					</div>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="container">
			<h3></h3>
			<div class="row back_color">
				<div class="col-md-12" style="padding: 10px;">
					<center>
						<p>
							<i class="fa fa-spinner fa-spin" style="font-size: 24px"></i>
							Show more
						</p>
					</center>
				</div>
			</div>
		</div>
	</section>
	</form:form>

  <%@ include file="footer.jsp"%>
	</footer>
	<!--/Footer-->


	<a id="scrollUp" href="#top"><span><img
			src="resources/images/cards/up.png"></span></a>
	<!-- 		<a id="scrollUp" href="#top"><img src="images/cards/up.png"></a> -->
	<script type="text/javascript">
	
	function increaseValue() {
		  var value = parseInt(document.getElementById('number').value, 10);
		  value = isNaN(value) ? 0 : value;
		  value++;
		  document.getElementById('number').value = value;
		}

		function decreaseValue() {
		  var value = parseInt(document.getElementById('number').value, 10);
		  value = isNaN(value) ? 0 : value;
		  value < 1 ? value = 1 : '';
		  value--;
		  document.getElementById('number').value = value;
		}
	</script>
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
	<script type="text/javascript">
		$('.thumbnail').on('click', function() {
  var clicked = $(this);
  var newSelection = clicked.data('big');
  var $img = $('.primary').css("background-image","url(" + newSelection + ")");
  clicked.parent().find('.thumbnail').removeClass('selected');
  clicked.addClass('selected');
  $('.primary').empty().append($img.hide().fadeIn('slow'));
});
	</script>
</body>
</html>