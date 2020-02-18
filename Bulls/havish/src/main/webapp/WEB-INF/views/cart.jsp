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
<script src="resources/js/cart.js"></script>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/prettyPhoto.css" rel="stylesheet">
<link href="css/price-range.css" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/responsive.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
<link rel="shortcut icon" href="images/ico/favicon.ico">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href='https://fonts.googleapis.com/css?family=Roboto'
	rel='stylesheet'>
</head>
<!--/head-->
<body>
	<%@ include file="header.jsp"%>
	<form:form action="cartListVo" modelAttribute="cartListVo" method="GET">
		<section id="advertisement">
			<div class="container">
				<br>
				<p>Home / My Cart</p>
				<br>
				<h3>My Cart(${NoOfItems})</h3>
			</div>
		</section>
		<section>
			<div class="container">
				<div class="row">
					<div class="col-md-9 padding-right1">
						<section id="cart_items">
							<ul id="prodlist">
								<c:forEach var="cartList" items="${cartListVo}">
									<li class="back_color submenuli"> 
										<div class="row back_color">
											<div class="col-md-4">
												<img src="${cartList.productImage}" alt=""
													aria-labelledby="item4-description" style="width: 180px;">
											</div>										
											<div class="col-md-7">
												<p class="font_size">${cartList.prodName}</p>
												<p class="bold">
													<i class="fa fa-inr" aria-hidden="true"></i>${cartList.priceRate}
													 <a href="#"
														class="btn btn-default add-to-cart1">${cartList.stockAvail}</a>
												</p>
												<p>
													<img src="resources/images/phone/rating.png">
												</p>
												<div class="col-md-10">
													<form>
														<div class="value-button" id="decrease"
															onclick="decreaseValue()" value="Decrease Value">-</div>
														<input type="number" id="number" value="${cartList.prodQuantity}"/></input>
														<div class="value-button" id="increase"
															onclick="increaseValue()" value="Increase Value">+</div>
													</form>												
												</div>
												<br>
												<div class="division">
													<c:url var="URLR" value="editUserCartSaveCart.htm">
														<c:param name="userCartId" value="${cartList.userCartId }" />
														<c:param name="savelater" value="Y" />
													</c:url>
													<h4>
														<a href="<c:out value="${URLR}"/>" class="color_new">Save
															for Later</a>
													</h4>
												</div>
											</div>
											<div class="col-md-1">
												<p style="text-align: right;">
													<i class="icloseId"><input type="hidden" id="hidClass" value="${cartList.userCartId}"
												class="userCartId" /><img
														src="resources/images/cards/close.png"></i>
												</p>
											</div>
											<p class="text_new" style="float: right;">Delivery by
												Tomorrow, Friday</p>
										</div>
									</li>									
								</c:forEach>
							</ul>
							<hr>
							<h3>Saved for later ( ${noOfSavedItems })</h3>
							<ul id="prodlist1">
								<c:forEach var="savecartList" items="${savedcartListVo}">
									<li class="back_color">
										<div class="row back_color">
											<div class="col-md-4">
												<img src="${savecartList.productImage}" alt=""
													aria-labelledby="item4-description" style="width: 180px;">
											</div>

											<div class="col-md-7">

												<p class="font_size">${savecartList.prodName}</p>
												<p class="bold">
													<i class="fa fa-inr" aria-hidden="true"></i>
												</p>
												${savecartList.priceRate}
												<p>
													<img src="resources/images/phone/rating.png">
												</p>
																								
												<div class="col-md-10">
													<form>
														<div class="value-button" id="decrease"
															onclick="decreaseValue()" value="Decrease Value">-</div>
														<input type="number" id="number" value="${savecartList.prodQuantity}"/>

														<div class="value-button" id="increase"
															onclick="increaseValue()" value="Increase Value">+</div>
													</form>
													<%-- <div>
														<input type= "button"  id="sub"> + </input>
														 <button class="count" >${savecartList.prodQuantity} </button> 
														 <button class="add"> - </button>
													</div> --%>
												</div>
												<br>
												<div class="division">
													<c:url var="URLR" value="editUserCartSaveCart.htm">
														<c:param name="userCartId" value="${savecartList.userCartId }" />
														<c:param name="savelater" value="N" />
													</c:url>

													<h4>
														<a href="<c:out value="${URLR}"/>" class="color_new">Move to Cart</a>

													</h4>											
												</div>
											</div>
											<div class="col-md-1">
												<p style="text-align: right;">
													<i class="fa fa-close"></i>
												</p>
											</div>
										</div>
									</li>
									<hr>
								</c:forEach>
							</ul>
						</section>
					</div>


					<div class="col-md-3">
						<div class="left-sidebar1">
							<div class="panel panel-default">
								<div class="panel-body">
									<small><b>Deliver to</b></small>
									
										<select name="Sort by" id="addressId">
											<c:forEach var="addresslistId" items="${addressList}">
											<option value="${addresslistId.street }">${addresslistId.street}</option>
										</c:forEach>
										
											<!-- <option value="offc">#253, 3rd Cross, 6th Phase, JP…</option> -->

										</select> 
									
								</div>
								<div id="sportswear1" class="panel-collapse collapse1">
									<div class="panel-body">
										<p class="font_size1">Price Details</p>
										<div class="row">
											<div class="col-md-6">
												<p>Price (${NoOfItems})</p>
											</div>
											<div class="col-md-6">
												<p>
													<i class="fa fa-inr" aria-hidden="true"></i> ${totalPrice}
												</p>
											</div>
										</div>
										<div class="row">
											<div class="col-md-6">
												<p>Delivery Fee</p>
											</div>
											<div class="col-md-6 color_gren">
												<p>FREE</p>
											</div>
										</div>
										<p class="color_gren">
											You will save <i class="fa fa-inr" aria-hidden="true"></i>${offerPrice}
											on this order
										</p>
										<hr>
										<div class="row">
											<br>
											<div class="col-md-6">
												<p class="bold1">Total Payable</p>
											</div>
											<div class="col-md-6">
												<p class="bold1">
													<i class="fa fa-inr" aria-hidden="true"></i>${totalPay}
												</p>
											</div>
										</div>
										<hr>

										<center>
											<a href="checkout.html"
												class="btn btn-default add-to-cart_new">Place Order</a>
										</center>

									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</section>
	</form:form>

	<%@ include file="footer.jsp"%>

	<a id="scrollUp" href="#top"><span><img
			src="resouces/images/cards/up.png"></span></a>
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
	<script src="resouces/js/jquery.js"></script>
	<script src="resouces/js/bootstrap.min.js"></script>

	<script src="resouces/js/price-range.js"></script>
	<script src="resouces/js/jquery.prettyPhoto.js"></script>
	<script src="resouces/js/main.js"></script>
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