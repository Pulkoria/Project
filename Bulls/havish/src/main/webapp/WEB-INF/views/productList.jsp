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
<script src="resources/js/home/home.js"></script>
<script src="resources/js/productCategory.js"></script>
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
<link rel="stylesheet"
	href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
<link rel="shortcut icon" href="resources/images/ico/favicon.ico">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://fonts.googleapis.com/css?family=Roboto'
	rel='stylesheet'>

<!-- <script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script> -->
</head>
<body>
	<%@ include file="header.jsp"%>
	<section>
		<section id="advertisement">
			<div class="container">
				<br>
				<c:choose>
				<c:when test="${catgryName ne null}"><p>Home / Categories / ${catgryName} / ${prodCatgryName}</p></c:when>
				<c:otherwise>
				<p>Home / Categories</p>
				</c:otherwise>
				</c:choose>
				<br>
				<h3>${catgryName}</h3>
			</div>
		</section>

		<div class="container">
			<form:form action="userCart" modelAttribute="prodlst"
				method="GET">
				<div class="row">
					<div class="col-md-3">
						<div class="left-sidebar">

							<div class="panel-group category-products" id="accordian">
								<!--category-productsr-->
								<%-- <div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#accordian"
												href="#sportswear"> <span class="badge pull-left"><img
													src="resources/images/cards/sort-down.png"></span> Related
												Categories
											</a>

										</h4>
									</div>
									<div id="sportswear" class="panel-collapse collapse1">
										<div class="panel-body">
											<ul>
												<li><a href=""><a href="#"><Categories</a>
												<c:forEach items="{prodList}" var="prodSubCatgList">
														<p>${prodCatgryName}</p>
												</c:forEach>
												</li>
											</ul>
										</div>
									</div>
								</div> --%>

								<div class="panel panel-default">

									<div class="panel-heading">

										<a data-toggle="collapse" data-parent="#accordian"
											href="#mens"> <span class="badge pull-left"><img
												src="resources/images/cards/sort-down.png"></span> Brand
										</a>
										</h4>
									</div>
									<div id="os" class="panel-collapse collapse1">
										<div class="panel-body">
											<ul>
												<li id="brandId"><c:forEach items="${distinctBrands}"
														var="brandsList">
														<input type="checkbox" name="check" class="chckCls"
															value="${brandsList}" />${brandsList}
															
											<input type="hidden" value="${subcatgryId }"
															id="prodSubCatHidId" />
														<input type="hidden" value="${searchKey }"
															class="searchKeyId" />
														</br>

													</c:forEach></li>

											</ul>
										</div>
									</div>

								</div>

								<div class="panel panel-default">
									<div class="panel-heading">
										<h4 class="panel-title">
											<a data-toggle="collapse" data-parent="#accordian"
												href="#womens"> <span class="badge pull-left"><img
													src="resources/images/cards/sort-down.png"></span> Price
												Range
											</a>
										</h4>
									</div>

									<%-- <div class="col-md-12">
									  <div class="row">
											<div class="col-sm-12">
												<div id="slider-range"></div>
											</div> 
										</div>
										<div class="row slider-labels">
											<div class="col-xs-6 caption">
												<strong>Min:</strong> <span id="slider-range-value1"></span>
											</div>
											<div class="col-xs-6 text-right caption">
												<strong>Max:</strong> <span id="slider-range-value2"></span>
											</div>
										</div>
										<div class="row">
											<div class="col-sm-12">
												<form>
													<input type="hidden" name="min-value" value=""> <input
														type="hidden" name="max-value" value="">
												</form>
											</div>
										</div>
									  </div> --%>

									<div class="panel panel-default">
										<div class="panel-heading">
											<h4 class="panel-title">
												<a data-toggle="collapse" data-parent="#accordian"
													href="#price"> <span class="badge pull-left"></span> Price
												</a>
											</h4>
										</div>
										<div id="price" class="panel-collapse collapse1">
											<div class="panel-body">
												<section class="range-slider" id="facet-price-range-slider">
													<input name="range-1" value="10" min="10" max="100" id="minValId"
														step="1" type="range"> <input name="range-2"
														value="1000" min="0" max="1000" step="1" type="range" id="maxValId">
												</section>
											</div>
										</div>
									</div>


								</div>
							</div>
						</div>
					</div>

					<div class="col-md-9">

						<div class="gallery-widget">

							<div class="row" style="padding-bottom: 25px;">
								<div class="col-md-9">
									<button class="control-view">
										<!-- <img src="images/cards/grid.png"> -->
										<img src="resources/images/cards/list1.png"
											style="width: 100%" id="ControlBtnId">
									</button>
								</div>
								<div class="col-md-3">
									<form action="#">
										<span>Sort by :</span> <select name="category" id="ajaxId">

											<option value="asc">price low to highest</option>
											<option value="desc">price high to low</option>
											
											<input type="hidden" value="${subcatgryId}" id="catgry" />
										</select>
									</form>
								</div>
							</div>
							<div class="jspCls">
								<ul id="prodlist">
									<c:forEach var="productList" items="${prodlst}">
										<li class="back_color"><img
											src="${productList.productImage}" alt=""
											aria-labelledby="item4-description" style="width: 72px;" />
											<p>
												<span id="item4-description"><c:url var="URL"
														value="productsDtls.htm">
														<c:param name="productId"
															value="${productList.productId }" />
													</c:url> <a href="<c:out value="${URL}"/>">${productList.productName}</a>
												</span> <span><i class="fa fa-inr" aria-hidden="true"></i>
													${productList.price}</span> <small> <c:url var="URLR"
														value="productsDtls.htm">
														<c:param name="productId"
															value="${productList.productId }" />

													</c:url> <a href="<c:out value="${URLR}"/>"
													class="btn btn-default add-to-cart">Read More</a> <!-- <a href=""
												class="btn btn-default add-to-cart">Read More</a> --> <a
													href="" class="btn btn-default add-to-cart">Add to cart</a>
												</small> <small> <img
													src="resources/images/phone/rating.png"
													style="width: 72px;"> <a href="#" class="btn "><img
														src="resources/images/cards/heart.png"> </a>
												</small>
											</p></li>
									</c:forEach>
							</div>
							<div class="ajaxCls">
								<ul id="listId1" class="priceFilterCls">

								</ul>
								
							</div>
						</div>
						<center>

							<ul class="pagination">

								<li><a href=""><</a></li>
								<li class="active"><a href="">1</a></li>
								<li><a href="">2</a></li>
								<li><a href="">3</a></li>
								<li><a href="">4</a></li>
								<li><a href="">..</a></li>
								<li><a href="">30</a></li>
								<li><a href="">></a></li>
							</ul>
						</center>


						<section>
							<div class="container1">
								<h3>Recently Viewed</h3>
								<div class="row back_color">
									<div class="col-md-3">
										<div class="product-image-wrapper">
											<div class="single-products">

												<img src="resources/images/phone/1.jpg"
													style="width: 150px;"> <img
													src="resources/images/phone/rating.png"
													style="width: 72px;">
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

												<img src="resources/images/phone/2.jpg"
													style="width: 150px;"> <img
													src="resources/images/phone/rating.png"
													style="width: 72px;">
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

												<img src="resources/images/phone/3.jpg"
													style="width: 150px;"> <img
													src="resources/images/phone/rating.png"
													style="width: 72px;">
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

												<img src="resources/images/phone/4.jpg"
													style="width: 150px;"> <img
													src="resources/images/phone/rating.png"
													style="width: 72px;">
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

						</section>

					</div>

				</div>
			</form:form>
		</div>
	</section>
	</div>
	<!--features_items-->
	</div>
	</div>

	</div>
	</section>






	<!-- <div class=" back_footer ">
		<div class="container">
			<h3>Most Search Keywords</h3>
		<div class="row ">
			<div class="col-md-12">
				<p  style="color: #979797"><b>Laptops</b>: <span style="font-size: 13px;">Appleo Laptop &nbsp; | &nbsp; Acero Laptop &nbsp; |  &nbsp; Samsing Laptop &nbsp; |  &nbsp; Lenov Laptop &nbsp; |  &nbsp; Sonyo Laptop &nbsp; |  &nbsp; Delli Laptop &nbsp; |  &nbsp; Asuso Laptop &nbsp; |  &nbsp; Toshibao Laptop &nbsp; |  &nbsp; LGG Laptop &nbsp; |  &nbsp; HPO Laptop</span> </p>
				<p  style="color: #979797"><b>Tablet</b>:<span style="font-size: 13px;"> FUKIO Watches &nbsp; |  &nbsp; Titan Watches &nbsp; |  &nbsp; Casioo Watches &nbsp; |  &nbsp; Fastrack Watches &nbsp; |  &nbsp; Timexi Watches &nbsp; |  &nbsp; Fossili Watches &nbsp; |  &nbsp; Dieselo Watches &nbsp; |  &nbsp; Toshibao Watches &nbsp; |  &nbsp; Luxury Watches</span> </p>
				<p  style="color: #979797"><b> Mobile phone</b>:<span style="font-size: 13px;"> Shoes &nbsp; |  &nbsp; Casual Shoes &nbsp; |  &nbsp; Sports Shoes &nbsp; |  &nbsp; Adidasi Shoes &nbsp; |  &nbsp; Gas Shoes &nbsp; |  &nbsp; Pumai Shoes &nbsp; |  &nbsp; Reeboki Shoes &nbsp; |  &nbsp; Woodlandi Shoes &nbsp; |  &nbsp; Red Tape Shoes &nbsp; |  &nbsp; Nikeo Shoes</span></p>
				<br>
				
			</div>
		</div>
		</div>
	</div>


		<div class="footer-widget">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Contact us</h2>
							<ul class="nav nav-pills nav-stacked">
							  <li> <i class="fa fa-phone"></i> (+91) 9900001111</li>
								<li><i class="fa fa-envelope"></i> help@havish.com</li>
								<li><i class="fa fa-map-marker" aria-hidden="true"></i> Location store</li>
							
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Policies & Info</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Terms Conditions</a></li>
								<li><a href="#"> Policy for Sellers</a></li>
								<li><a href="#">Policy for Buyers</a></li>
								<li><a href="#">Shipping & Refund </a></li>
								<li><a href="#">Wholesale Policy</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>Quick Links</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Seller Login</a></li>
								<li><a href="#">Seller Sign up</a></li>
								<li><a href="#">Seller Handbook </a></li>
								<li><a href="#">Seller Control  </a></li>
									<li><a href="#">Panel Seller FAQs</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-2">
						<div class="single-widget">
							<h2>My account</h2>
							<ul class="nav nav-pills nav-stacked">
								<li><a href="#">Accessories </a></li>
								<li><a href="#">Balcony Tabl </a></li>
							    <li><a href="#">Bar Units</a></li>
							    <li><a href="#">Beds Bedside Tables</a></li>
								
							</ul>
						</div>
					</div>
					<div class="col-sm-3 col-sm-offset-1">
						<div class="single-widget">
							<h2>Subscribe now</h2>
							<p>Contrary to popular belief of lorem Ipsm Latin amet ltin from.</p>
							<div class="wrap">
   <div class="search">
      <input type="text" class="searchTerm" placeholder="Your E-mail address...">
      <button type="submit" class="searchButton">
      <i class="fa fa-send-o"></i>

     </button>
   </div>
   
				<form action="#" method="#" role="search">
					<div class="input-group"> 
						<input class="form-control1" placeholder="Your E-mail address..." type="text">
						<div class="input-group-btn">
							<button type="submit" id="searchbtn">
							<i class="fa fa-send-o"></i></button>
							  </div>
							</div>
						</form>
				
   <ul class="nav navbar-nav">
								<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
								<li><a href="#"><i class="fa fa-youtube" aria-hidden="true"></i></a></li>
								<li><a href="#"><i class="fa fa-rss" aria-hidden="true"></i></a></li>
						
							</ul>
</div>
						</div>

						
				
					</div>
					
				</div>
			</div>
		</div>

		<div class="footer-bottom">
			<div class="container">
				<div class="row">
					<p class="pull-left">Copyright © 2019 Havish</p>
					<p class="pull-right">
						<img src="images/cards/1.png">
						<img src="images/cards/2.png">
						<img src="images/cards/3.png">
						<img src="images/cards/1.png">
					</p>
				</div>
			</div>
		</div>
		
	</footer> -->
	<!--/Footer-->
	<%@ include file="footer.jsp"%>
	<a id="scrollUp" href="#top"><span><img
			src="resources/images/cards/up.png"></span></a>
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
	<script>
		var galleryWidgetElements = document
				.querySelectorAll('.gallery-widget');

		for (var i = 0, controlViewElement; i < galleryWidgetElements.length; i++) {
			controlViewElement = galleryWidgetElements[i]
					.querySelector('.control-view');
			controlViewElement.galleryWidgetElement = galleryWidgetElements[i];

			controlViewElement.addEventListener('click', function() {
				toggleView(this.galleryWidgetElement);
			});
		}

		function toggleView(galleryWidgetElement) {
			galleryWidgetElement.classList.toggle('list-view');
		}
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
		// bootstrap-tagsinput.js file - add in local

		(function($) {
			"use strict";

			var defaultOptions = {
				tagClass : function(item) {
					return 'label label-info';
				},
				itemValue : function(item) {
					return item ? item.toString() : item;
				},
				itemText : function(item) {
					return this.itemValue(item);
				},
				itemTitle : function(item) {
					return null;
				},
				freeInput : true,
				addOnBlur : true,
				maxTags : undefined,
				maxChars : undefined,
				confirmKeys : [ 13, 44 ],
				delimiter : ',',
				delimiterRegex : null,
				cancelConfirmKeysOnEmpty : true,
				onTagExists : function(item, $tag) {
					$tag.hide().fadeIn();
				},
				trimValue : false,
				allowDuplicates : false
			};

			/**
			 * Constructor function
			 */
			function TagsInput(element, options) {
				this.itemsArray = [];

				this.$element = $(element);
				this.$element.hide();

				this.isSelect = (element.tagName === 'SELECT');
				this.multiple = (this.isSelect && element
						.hasAttribute('multiple'));
				this.objectItems = options && options.itemValue;
				this.placeholderText = element.hasAttribute('placeholder') ? this.$element
						.attr('placeholder')
						: '';
				this.inputSize = Math.max(1, this.placeholderText.length);

				this.$container = $('<div class="bootstrap-tagsinput"></div>');
				this.$input = $(
						'<input type="text" placeholder="' + this.placeholderText + '"/>')
						.appendTo(this.$container);

				this.$element.before(this.$container);

				this.build(options);
			}

			TagsInput.prototype = {
				constructor : TagsInput,

				/**
				 * Adds the given item as a new tag. Pass true to dontPushVal to prevent
				 * updating the elements val()
				 */
				add : function(item, dontPushVal, options) {
					var self = this;

					if (self.options.maxTags
							&& self.itemsArray.length >= self.options.maxTags)
						return;

					// Ignore falsey values, except false
					if (item !== false && !item)
						return;

					// Trim value
					if (typeof item === "string" && self.options.trimValue) {
						item = $.trim(item);
					}

					// Throw an error when trying to add an object while the itemValue option was not set
					if (typeof item === "object" && !self.objectItems)
						throw ("Can't add objects when itemValue option is not set");

					// Ignore strings only containg whitespace
					if (item.toString().match(/^\s*$/))
						return;

					// If SELECT but not multiple, remove current tag
					if (self.isSelect && !self.multiple
							&& self.itemsArray.length > 0)
						self.remove(self.itemsArray[0]);

					if (typeof item === "string"
							&& this.$element[0].tagName === 'INPUT') {
						var delimiter = (self.options.delimiterRegex) ? self.options.delimiterRegex
								: self.options.delimiter;
						var items = item.split(delimiter);
						if (items.length > 1) {
							for (var i = 0; i < items.length; i++) {
								this.add(items[i], true);
							}

							if (!dontPushVal)
								self.pushVal();
							return;
						}
					}

					var itemValue = self.options.itemValue(item), itemText = self.options
							.itemText(item), tagClass = self.options
							.tagClass(item), itemTitle = self.options
							.itemTitle(item);

					// Ignore items allready added
					var existing = $.grep(self.itemsArray, function(item) {
						return self.options.itemValue(item) === itemValue;
					})[0];
					if (existing && !self.options.allowDuplicates) {
						// Invoke onTagExists
						if (self.options.onTagExists) {
							var $existingTag = $(".tag", self.$container)
									.filter(
											function() {
												return $(this).data("item") === existing;
											});
							self.options.onTagExists(item, $existingTag);
						}
						return;
					}

					// if length greater than limit
					if (self.items().toString().length + item.length + 1 > self.options.maxInputLength)
						return;

					// raise beforeItemAdd arg
					var beforeItemAddEvent = $.Event('beforeItemAdd', {
						item : item,
						cancel : false,
						options : options
					});
					self.$element.trigger(beforeItemAddEvent);
					if (beforeItemAddEvent.cancel)
						return;

					// register item in internal array and map
					self.itemsArray.push(item);

					// add a tag element

					var $tag = $('<span class="tag '
							+ htmlEncode(tagClass)
							+ (itemTitle !== null ? ('" title="' + itemTitle)
									: '') + '">' + htmlEncode(itemText)
							+ '<span data-role="remove"></span></span>');
					$tag.data('item', item);
					self.findInputWrapper().before($tag);
					$tag.after(' ');

					// add <option /> if item represents a value not present in one of the <select />'s options
					if (self.isSelect
							&& !$('option[value="'
									+ encodeURIComponent(itemValue) + '"]',
									self.$element)[0]) {
						var $option = $('<option selected>'
								+ htmlEncode(itemText) + '</option>');
						$option.data('item', item);
						$option.attr('value', itemValue);
						self.$element.append($option);
					}

					if (!dontPushVal)
						self.pushVal();

					// Add class when reached maxTags
					if (self.options.maxTags === self.itemsArray.length
							|| self.items().toString().length === self.options.maxInputLength)
						self.$container.addClass('bootstrap-tagsinput-max');

					self.$element.trigger($.Event('itemAdded', {
						item : item,
						options : options
					}));
				},

				/**
				 * Removes the given item. Pass true to dontPushVal to prevent updating the
				 * elements val()
				 */
				remove : function(item, dontPushVal, options) {
					var self = this;

					if (self.objectItems) {
						if (typeof item === "object")
							item = $
									.grep(
											self.itemsArray,
											function(other) {
												return self.options
														.itemValue(other) == self.options
														.itemValue(item);
											});
						else
							item = $.grep(self.itemsArray, function(other) {
								return self.options.itemValue(other) == item;
							});

						item = item[item.length - 1];
					}

					if (item) {
						var beforeItemRemoveEvent = $.Event('beforeItemRemove',
								{
									item : item,
									cancel : false,
									options : options
								});
						self.$element.trigger(beforeItemRemoveEvent);
						if (beforeItemRemoveEvent.cancel)
							return;

						$('.tag', self.$container).filter(function() {
							return $(this).data('item') === item;
						}).remove();
						$('option', self.$element).filter(function() {
							return $(this).data('item') === item;
						}).remove();
						if ($.inArray(item, self.itemsArray) !== -1)
							self.itemsArray.splice($.inArray(item,
									self.itemsArray), 1);
					}

					if (!dontPushVal)
						self.pushVal();

					// Remove class when reached maxTags
					if (self.options.maxTags > self.itemsArray.length)
						self.$container.removeClass('bootstrap-tagsinput-max');

					self.$element.trigger($.Event('itemRemoved', {
						item : item,
						options : options
					}));
				},

				/**
				 * Removes all items
				 */
				removeAll : function() {
					var self = this;

					$('.tag', self.$container).remove();
					$('option', self.$element).remove();

					while (self.itemsArray.length > 0)
						self.itemsArray.pop();

					self.pushVal();
				},

				/**
				 * Refreshes the tags so they match the text/value of their corresponding
				 * item.
				 */
				refresh : function() {
					var self = this;
					$('.tag', self.$container)
							.each(
									function() {
										var $tag = $(this), item = $tag
												.data('item'), itemValue = self.options
												.itemValue(item), itemText = self.options
												.itemText(item), tagClass = self.options
												.tagClass(item);

										// Update tag's class and inner text
										$tag.attr('class', null);
										$tag.addClass('tag '
												+ htmlEncode(tagClass));
										$tag.contents().filter(function() {
											return this.nodeType == 3;
										})[0].nodeValue = htmlEncode(itemText);

										if (self.isSelect) {
											var option = $('option',
													self.$element)
													.filter(
															function() {
																return $(this)
																		.data(
																				'item') === item;
															});
											option.attr('value', itemValue);
										}
									});
				},

				/**
				 * Returns the items added as tags
				 */
				items : function() {
					return this.itemsArray;
				},

				/**
				 * Assembly value by retrieving the value of each item, and set it on the
				 * element.
				 */
				pushVal : function() {
					var self = this, val = $.map(self.items(), function(item) {
						return self.options.itemValue(item).toString();
					});

					self.$element.val(val, true).trigger('change');
				},

				/**
				 * Initializes the tags input behaviour on the element
				 */
				build : function(options) {
					var self = this;

					self.options = $.extend({}, defaultOptions, options);
					// When itemValue is set, freeInput should always be false
					if (self.objectItems)
						self.options.freeInput = false;

					makeOptionItemFunction(self.options, 'itemValue');
					makeOptionItemFunction(self.options, 'itemText');
					makeOptionFunction(self.options, 'tagClass');

					// Typeahead Bootstrap version 2.3.2
					if (self.options.typeahead) {
						var typeahead = self.options.typeahead || {};

						makeOptionFunction(typeahead, 'source');

						self.$input
								.typeahead($
										.extend(
												{},
												typeahead,
												{
													source : function(query,
															process) {
														function processItems(
																items) {
															var texts = [];

															for (var i = 0; i < items.length; i++) {
																var text = self.options
																		.itemText(items[i]);
																map[text] = items[i];
																texts
																		.push(text);
															}
															process(texts);
														}

														this.map = {};
														var map = this.map, data = typeahead
																.source(query);

														if ($
																.isFunction(data.success)) {
															// support for Angular callbacks
															data
																	.success(processItems);
														} else if ($
																.isFunction(data.then)) {
															// support for Angular promises
															data
																	.then(processItems);
														} else {
															// support for functions and jquery promises
															$
																	.when(data)
																	.then(
																			processItems);
														}
													},
													updater : function(text) {
														self
																.add(this.map[text]);
														return this.map[text];
													},
													matcher : function(text) {
														return (text
																.toLowerCase()
																.indexOf(
																		this.query
																				.trim()
																				.toLowerCase()) !== -1);
													},
													sorter : function(texts) {
														return texts.sort();
													},
													highlighter : function(text) {
														var regex = new RegExp(
																'('
																		+ this.query
																		+ ')',
																'gi');
														return text
																.replace(regex,
																		"<strong>$1</strong>");
													}
												}));
					}

					// typeahead.js
					if (self.options.typeaheadjs) {
						var typeaheadConfig = null;
						var typeaheadDatasets = {};

						// Determine if main configurations were passed or simply a dataset
						var typeaheadjs = self.options.typeaheadjs;
						if ($.isArray(typeaheadjs)) {
							typeaheadConfig = typeaheadjs[0];
							typeaheadDatasets = typeaheadjs[1];
						} else {
							typeaheadDatasets = typeaheadjs;
						}

						self.$input
								.typeahead(typeaheadConfig, typeaheadDatasets)
								.on(
										'typeahead:selected',
										$
												.proxy(
														function(obj, datum) {
															if (typeaheadDatasets.valueKey)
																self
																		.add(datum[typeaheadDatasets.valueKey]);
															else
																self.add(datum);
															self.$input
																	.typeahead(
																			'val',
																			'');
														}, self));
					}

					self.$container.on('click', $.proxy(function(event) {
						if (!self.$element.attr('disabled')) {
							self.$input.removeAttr('disabled');
						}
						self.$input.focus();
					}, self));

					if (self.options.addOnBlur && self.options.freeInput) {
						self.$input.on('focusout', $.proxy(function(event) {
							// HACK: only process on focusout when no typeahead opened, to
							//       avoid adding the typeahead text as tag
							if ($('.typeahead, .twitter-typeahead',
									self.$container).length === 0) {
								self.add(self.$input.val());
								self.$input.val('');
							}
						}, self));
					}

					self.$container.on('keydown', 'input', $.proxy(function(
							event) {
						var $input = $(event.target), $inputWrapper = self
								.findInputWrapper();

						if (self.$element.attr('disabled')) {
							self.$input.attr('disabled', 'disabled');
							return;
						}

						switch (event.which) {
						// BACKSPACE
						case 8:
							if (doGetCaretPosition($input[0]) === 0) {
								var prev = $inputWrapper.prev();
								if (prev.length) {
									self.remove(prev.data('item'));
								}
							}
							break;

						// DELETE
						case 46:
							if (doGetCaretPosition($input[0]) === 0) {
								var next = $inputWrapper.next();
								if (next.length) {
									self.remove(next.data('item'));
								}
							}
							break;

						// LEFT ARROW
						case 37:
							// Try to move the input before the previous tag
							var $prevTag = $inputWrapper.prev();
							if ($input.val().length === 0 && $prevTag[0]) {
								$prevTag.before($inputWrapper);
								$input.focus();
							}
							break;
						// RIGHT ARROW
						case 39:
							// Try to move the input after the next tag
							var $nextTag = $inputWrapper.next();
							if ($input.val().length === 0 && $nextTag[0]) {
								$nextTag.after($inputWrapper);
								$input.focus();
							}
							break;
						default:
							// ignore
						}

						// Reset internal input's size
						var textLength = $input.val().length, wordSpace = Math
								.ceil(textLength / 5), size = textLength
								+ wordSpace + 1;
						$input.attr('size', Math.max(this.inputSize, $input
								.val().length));
					}, self));

					self.$container
							.on(
									'keypress',
									'input',
									$
											.proxy(
													function(event) {
														var $input = $(event.target);

														if (self.$element
																.attr('disabled')) {
															self.$input.attr(
																	'disabled',
																	'disabled');
															return;
														}

														var text = $input.val(), maxLengthReached = self.options.maxChars
																&& text.length >= self.options.maxChars;
														if (self.options.freeInput
																&& (keyCombinationInList(
																		event,
																		self.options.confirmKeys) || maxLengthReached)) {
															// Only attempt to add a tag if there is data in the field
															if (text.length !== 0) {
																self
																		.add(maxLengthReached ? text
																				.substr(
																						0,
																						self.options.maxChars)
																				: text);
																$input.val('');
															}

															// If the field is empty, let the event triggered fire as usual
															if (self.options.cancelConfirmKeysOnEmpty === false) {
																event
																		.preventDefault();
															}
														}

														// Reset internal input's size
														var textLength = $input
																.val().length, wordSpace = Math
																.ceil(textLength / 5), size = textLength
																+ wordSpace + 1;
														$input
																.attr(
																		'size',
																		Math
																				.max(
																						this.inputSize,
																						$input
																								.val().length));
													}, self));

					// Remove icon clicked
					self.$container.on('click', '[data-role=remove]', $.proxy(
							function(event) {
								if (self.$element.attr('disabled')) {
									return;
								}
								self.remove($(event.target).closest('.tag')
										.data('item'));
							}, self));

					// Only add existing value as tags when using strings as tags
					if (self.options.itemValue === defaultOptions.itemValue) {
						if (self.$element[0].tagName === 'INPUT') {
							self.add(self.$element.val());
						} else {
							$('option', self.$element).each(function() {
								self.add($(this).attr('value'), true);
							});
						}
					}
				},

				/**
				 * Removes all tagsinput behaviour and unregsiter all event handlers
				 */
				destroy : function() {
					var self = this;

					// Unbind events
					self.$container.off('keypress', 'input');
					self.$container.off('click', '[role=remove]');

					self.$container.remove();
					self.$element.removeData('tagsinput');
					self.$element.show();
				},

				/**
				 * Sets focus on the tagsinput
				 */
				focus : function() {
					this.$input.focus();
				},

				/**
				 * Returns the internal input element
				 */
				input : function() {
					return this.$input;
				},

				/**
				 * Returns the element which is wrapped around the internal input. This
				 * is normally the $container, but typeahead.js moves the $input element.
				 */
				findInputWrapper : function() {
					var elt = this.$input[0], container = this.$container[0];
					while (elt && elt.parentNode !== container)
						elt = elt.parentNode;

					return $(elt);
				}
			};

			/**
			 * Register JQuery plugin
			 */
			$.fn.tagsinput = function(arg1, arg2, arg3) {
				var results = [];

				this
						.each(function() {
							var tagsinput = $(this).data('tagsinput');
							// Initialize a new tags input
							if (!tagsinput) {
								tagsinput = new TagsInput(this, arg1);
								$(this).data('tagsinput', tagsinput);
								results.push(tagsinput);

								if (this.tagName === 'SELECT') {
									$('option', $(this)).attr('selected',
											'selected');
								}

								// Init tags from $(this).val()
								$(this).val($(this).val());
							} else if (!arg1 && !arg2) {
								// tagsinput already exists
								// no function, trying to init
								results.push(tagsinput);
							} else if (tagsinput[arg1] !== undefined) {
								// Invoke function on existing tags input
								if (tagsinput[arg1].length === 3
										&& arg3 !== undefined) {
									var retVal = tagsinput[arg1](arg2, null,
											arg3);
								} else {
									var retVal = tagsinput[arg1](arg2);
								}
								if (retVal !== undefined)
									results.push(retVal);
							}
						});

				if (typeof arg1 == 'string') {
					// Return the results from the invoked function calls
					return results.length > 1 ? results : results[0];
				} else {
					return results;
				}
			};

			$.fn.tagsinput.Constructor = TagsInput;

			/**
			 * Most options support both a string or number as well as a function as
			 * option value. This function makes sure that the option with the given
			 * key in the given options is wrapped in a function
			 */
			function makeOptionItemFunction(options, key) {
				if (typeof options[key] !== 'function') {
					var propertyName = options[key];
					options[key] = function(item) {
						return item[propertyName];
					};
				}
			}
			function makeOptionFunction(options, key) {
				if (typeof options[key] !== 'function') {
					var value = options[key];
					options[key] = function() {
						return value;
					};
				}
			}
			/**
			 * HtmlEncodes the given value
			 */
			var htmlEncodeContainer = $('<div />');
			function htmlEncode(value) {
				if (value) {
					return htmlEncodeContainer.text(value).html();
				} else {
					return '';
				}
			}

			/**
			 * Returns the position of the caret in the given input field
			 * http://flightschool.acylt.com/devnotes/caret-position-woes/
			 */
			function doGetCaretPosition(oField) {
				var iCaretPos = 0;
				if (document.selection) {
					oField.focus();
					var oSel = document.selection.createRange();
					oSel.moveStart('character', -oField.value.length);
					iCaretPos = oSel.text.length;
				} else if (oField.selectionStart
						|| oField.selectionStart == '0') {
					iCaretPos = oField.selectionStart;
				}
				return (iCaretPos);
			}

			/**
			 * Returns boolean indicates whether user has pressed an expected key combination.
			 * @param object keyPressEvent: JavaScript event object, refer
			 *     http://www.w3.org/TR/2003/WD-DOM-Level-3-Events-20030331/ecma-script-binding.html
			 * @param object lookupList: expected key combinations, as in:
			 *     [13, {which: 188, shiftKey: true}]
			 */
			function keyCombinationInList(keyPressEvent, lookupList) {
				var found = false;
				$
						.each(
								lookupList,
								function(index, keyCombination) {
									if (typeof (keyCombination) === 'number'
											&& keyPressEvent.which === keyCombination) {
										found = true;
										return false;
									}

									if (keyPressEvent.which === keyCombination.which) {
										var alt = !keyCombination
												.hasOwnProperty('altKey')
												|| keyPressEvent.altKey === keyCombination.altKey, shift = !keyCombination
												.hasOwnProperty('shiftKey')
												|| keyPressEvent.shiftKey === keyCombination.shiftKey, ctrl = !keyCombination
												.hasOwnProperty('ctrlKey')
												|| keyPressEvent.ctrlKey === keyCombination.ctrlKey;
										if (alt && shift && ctrl) {
											found = true;
											return false;
										}
									}
								});

				return found;
			}

			/**
			 * Initialize tagsinput behaviour on inputs and selects which have
			 * data-role=tagsinput
			 */
			$(function() {
				$(
						"input[data-role=tagsinput], select[multiple][data-role=tagsinput]")
						.tagsinput();
			});
		})(window.jQuery);
	</script>
</body>
</html>