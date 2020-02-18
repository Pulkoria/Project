<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
<meta http-equiv="Content-Type" content="text/javascript; charset=ISO-8859-1">
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="resources/js/home.js"></script>    
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
	 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
</head>
<body>
		<header id="header">
		<div class="header_top">
			<div class="container">
				<div class="row">
					<div class="col-sm-6">
						<div class="contactinfo">
							<ul class="nav nav-pills">
								<li><a href="#"><i class="fa fa-phone"></i> (+91) 9900001111</a></li>
								<li><a href="#"><i class="fa fa-envelope"></i> customer_help@havish.com</a></li>
							</ul>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="social-icons pull-right">
							<ul class="nav navbar-nav">
								<li><a href="#"><i class="fa fa-shield" aria-hidden="true"></i> Guarantee</li>
								<li><a href="#"> <i class="fa fa-credit-card" aria-hidden="true"></i> Payment</li>
								<li><a href="#"><i class="fa fa-truck" aria-hidden="true"></i> Delivery</li>
								<li><a href="login.htm"><i class="fa fa-user" aria-hidden="true"></i>Register or Sign in</li>	

								<!-- <li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
								<li><a href="#"><i class="fa fa-dribbble"></i></a></li>
								<li><a href="#"><i class="fa fa-google-plus"></i></a></li> -->
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header_top-->
		
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-md-2 clearfix" style="padding: 0;margin: -8px;">
						<div class="logo pull-left">
							<a href="index.html"><img src="resources/images/home/logo.png" alt="" /></a>
						</div>
					</div>

					<div class="col-md-2 clearfix Daily_Drop">
						<div class="logo pull-left1">
							<a href="index.html"><img class="images/DailyDrop_img" src="resources/fonts/noun_turn_1661846.svg" alt="" /> <p> Daily Drop </p></a>
						</div>					
						
					</div>
					<div class="col-md-4">
						<!-- <form method="post">
  <input type="text" class="textbox" placeholder="Search">
 <button type="submit" class="button1"><i class="fa fa-search"></i></button>
</form> -->
<div class="wrap">
   <div class="search">
      <input type="text" class="searchTerm" placeholder="Search">
      <button type="submit" class="searchButton">
        <i class="fa fa-search"></i>
     </button>
   </div>
</div>
					</div>
					<div class="col-md-2 clearfix"><p class="color">7 days a week from 8:00 am to 5:00 pm</p></div>
					
					<div class="col-md-2">
						<span class="fa-stack fa-2x has-badge" data-count="13"><i class="fa fa-heart"></i></span>
						<span class="fa-stack fa-2x has-badge" data-count="0"><i style="" class="fa fa-shopping-cart"></i></span>
					</div>


				<!-- 	<div class="col-md-2 clearfix" style="background: #FF6927">
							<a href="index.html"><img src="fonts/noun_turn_1661846.svg" alt="" />Daily Drop</a>
						</div> -->
					
				</div>
			</div>
		</div><!--/header-middle-->
	
		<div class="header-bottom"><!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-md-12" style="padding: 0;">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>



			<div id="primary_nav_wrap">
<ul> 
  <li class="dropdown Daily_Drop1" >
	<a href="#" style="color: #fff;font-size: 18px;"><img src="images/cards/menu.png" alt="">&nbsp; &nbsp; &nbsp;  All Categories</a>
     <ul role="menu" class="sub-menu ">
      <li><a href="shop.html">Stationary <i  class="fa fa-angle-right"></i></a>
        <ul role="menu" class="sub-menu ">
          <li><a href="#">Stationary 1</a></li>
          <li><a href="#">Stationary 2</a></li>
          <li><a href="#">Stationary 3</a></li>
          <li><a href="#">Stationary 4</a></li>
          <li><a href="#">Stationary 5</a></li>
        </ul>
      </li>  
                                      
	<li><a href="shop.html"> House Keeping <i  class="fa fa-angle-right"></i></a></li> 
	<li><a href="shop.html">Pantry<i  class="fa fa-angle-right"></i></a></li> 
	<li><a href="shop.html">Electronics <i  class="fa fa-angle-right"></i></a></li> 
	<li><a href="shop.html">Fation<i  class="fa fa-angle-right"></i></a></li> 
	<li><a href="shop.html">Toys &Baby <i  class="fa fa-angle-right"></i></a></li> 
	<li><a href="shop.html">Grocery <i  class="fa fa-angle-right"></i></a></li> 
	<li><a href="shop.html">Recharges<i  class="fa fa-angle-right"></i></a></li> 
										  
    </ul>
  </li> 
</ul>
</div>
		

                            
                            
							<ul class="nav navbar-nav collapse navbar-collapse">
							<li id="list">
							
							</li>
								<!-- <li><a href="#" class="active">Computers</a></li>
								<li><a href="#" class="active">Corporate Gifts</a></li>
								<li><a href="#" class="active">Office Machines</a></li>
								<li><a href="#" class="active">Medical Equipments</a></li>
								<li><a href="#" class="active">Offer Zone</a></li> -->

								<!-- <li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="shop.html">Products</a></li>
										<li><a href="product-details.html">Product Details</a></li> 
										<li><a href="checkout.html">Checkout</a></li> 
										<li><a href="cart.html">Cart</a></li> 
										<li><a href="login.html">Login</a></li> 
                                    </ul>
                                </li> 
								<li class="dropdown"><a href="#">Blog<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="blog.html">Blog List</a></li>
										<li><a href="blog-single.html">Blog Single</a></li>
                                    </ul>
                                </li>  -->
                            </ul>
							
						</div>
					</div>
					
				</div>
			</div>
		</div><!--/header-bottom-->
	</header>
</body>
</html>