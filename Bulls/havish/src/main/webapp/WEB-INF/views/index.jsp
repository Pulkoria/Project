<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<body>
<h2><a href="login.htm">Havish Online Shopping</a></h2>
<a href="products.htm">Havish Home Page</a>
				 

</body>
</html>   --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>    
    <meta http-equiv="Content-Type" content="text/javascript; charset=ISO-8859-1">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
 <script src="resources/js/home.js" ></script>   
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
   <%--  <spring:url value="/WEB-INF/resouces/css" var="mycss"/>
    <link  href="${mycss}"  rel=="stylesheet" type=="text/css"/> --%>
  
    <title>Home | E-Shopper</title>
  <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/font-awesome.min.css" rel="stylesheet">
    <link href="resources/css/prettyPhoto.css" rel="stylesheet">
    <link href="resources/css/price-range.css" rel="stylesheet">
    <link href="resources/css/animate.css" rel="stylesheet">
	<link href="resources/css/main.css" rel="stylesheet">
	<link href="resources/css/responsive.css" rel="stylesheet">
    <!-- [if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]        -->
   <!--  <link rel="shortcut icon" href="resources/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="resources/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="resources/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="resources/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="resources/images/ico/apple-touch-icon-57-precomposed.png"> -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
</head><!--/head-->

<body>
	<%@ include file="header.jsp"%>
	<!-- <header id="header">header
		<div class="header_top">header_top
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

								<li><a href="#"><i class="fa fa-facebook"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter"></i></a></li>
								<li><a href="#"><i class="fa fa-linkedin"></i></a></li>
								<li><a href="#"><i class="fa fa-dribbble"></i></a></li>
								<li><a href="#"><i class="fa fa-google-plus"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>/header_top
		
		<div class="header-middle">header-middle
			<div class="container">
				<div class="row">
					<div class="col-md-2 clearfix" style="padding: 0;margin: -8px;">
						<div class="logo pull-left">
							<a href="index.html"><img src="resources/images/home/logo.png" alt="" /></a>
						</div>
					</div>

					<div class="col-md-2 clearfix Daily_Drop">
						<div class="logo pull-left1">
							<a href="index.html"><img class="DailyDrop_img" src="resources/fonts/noun_turn_1661846.svg" alt="" /> <p> Daily Drop </p></a>
						</div>					
						
					</div>
					<div class="col-md-4">
						<form method="post">
  <input type="text" class="textbox" placeholder="Search">
 <button type="submit" class="button1"><i class="fa fa-search"></i></button>
</form>
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


					<div class="col-md-2 clearfix" style="background: #FF6927">
							<a href="index.html"><img src="fonts/noun_turn_1661846.svg" alt="" />Daily Drop</a>
						</div>
					
				</div>
			</div>
		</div>/header-middle
	
		<div class="header-bottom">header-bottom
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu1 pull-left">
							<ul class="nav navbar-nav collapse navbar-collapse">								
								<li class="dropdown Daily_Drop1" ><a href="#" style="color: #fff"><i class="fa fa-bars" aria-hidden="true"></i>&nbsp;&nbsp;  All Categories</a>
                                    <ul role="menu" class="sub-menu ">
                                        <li><a href="s#">Camera & Photo <i  class="fa fa-angle-right"></i></a></li>
										<li><a href="#"> Laptops <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Mobile Phones <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Audio & Video <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Tablet & Laptop Accessories <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Office Electronics <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Storage Devices <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Smart Electronics <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Security & Protection <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Networking <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Video Games <i  class="fa fa-angle-right"></i></a></li> 
										<li><a href="#">Storage Devices <i  class="fa fa-angle-right"></i></a></li> 
                                    </ul>
                                </li> 
                            </ul>
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="#" class="active">Electronics</a></li>
								<li><a href="#" class="active">TV & ppliances</a></li>
								<li><a href="#" class="active">Home & Furniture</a></li>
								<li><a href="#" class="active">Sports, Books</a></li>
								<li><a href="#" class="active">Offer Zone</a></li>

								<li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
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
                                </li> 
                            </ul>
							
						</div>
					</div>
					
				</div>
			</div>
		</div> --><!--/header-bottom-->
	</header><!--/header-->
	
	<section id="slider"><!--slider-->
		<div class="container1">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						
						<!-- <div class="carousel-inner">
							<div class="item active">
								
								<div class="col-sm-12">
									<img src="images/slider/slider1.png" class="girl img-responsive" alt="" />
									
								</div>
							</div>
							
							
						
						</div> -->

						    <div class="carousel-inner">
      <div class="item active">
        <img src="resources/images/slider/slider1.png" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="resources/images/slider/slider1.png" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="resources/images/slider/slider1.png" alt="New york" style="width:100%;">
      </div>
    </div>

						
						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</section><!--/slider-->
	<div class="container">
		<div class="row">
			<div class="container back_color" style="border: 2px solid #E2E2E2;">
				<div class="col-md-3">
					<div class="row font_icon">
						<div class="col-md-3"><i class="fa fa-umbrella"></i></div>
					    <div class="col-md-9"><p class="bold">100% Money Guarantee</p><p class="small">30 days money back</p></div>
				</div>
			</div>

				<div class="col-md-3"><div class="row font_icon">
						<div class="col-md-3"><i class="fa fa-clock-o" aria-hidden="true"></i></div>
					    <div class="col-md-9"><p class="bold">Help Center</p><p class="small">24/7 Support System</p></div>
				</div></div>
				<div class="col-md-3"><div class="row font_icon">
						<div class="col-md-3"><i class="fa fa-credit-card" aria-hidden="true"></i></div>
					    <div class="col-md-9"><p class="bold">Payment Method</p><p class="small">Secure Payment</p></div>
				</div></div>
				<div class="col-md-3"><div class="row font_icon">
						<div class="col-md-3"><i class="fa fa-question-circle" aria-hidden="true"></i></div>
					    <div class="col-md-9"><p class="bold">No Question</p><p class="small">Asked Returns</p></div>
				</div></div>

			</div>
		</div>
	</div>

<section>

	<div class="container">
			<h3>Selected Products <small class="color"> 14 : 56 : 08 Left</small></h3>
	     
		<div class="row back_color">
		<div class="col-md-2">
			<img src="resources/images/phone/6.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>Lenovo P8 Tab3 8 plus TB</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/2.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>CARBAYTA 320 DPI 10.1' K99</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 30325.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/3.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>8.0 Inch CHUWI Hi8 Air</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/4.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>BMXC 2018 Android 7.0 OS 10</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/5.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>BDF 10 inch Design 3G</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/7.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>FULCOL DHL Free 10 inch</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>
	</div>
</div>

</section>



<section>
	<div class="container">
			<h3>Selected Products </h3>
		<div class="row">
			<div class="category-tab"><!--category-tab-->
						<div class="col-md-12">
							<ul class="nav nav-tabs">
								<li ><a href="#trending" data-toggle="tab">Trending Item</a></li>
								<li class="active"><a href="#arrivals" data-toggle="tab">New Arrivals</a></li>
								<li ><a href="#sale" data-toggle="tab">Best Sale</a></li>
								
								
							</ul>
						</div>
						<div class="tab-content">
							<div class="tab-pane fade" id="trending">
								<div class="row">
									<div class="col-md-6">
										<div class="productinfo">
											<img src="resources/images/phone/8.png" alt="">
											</div>
											</div>
									<div class="col-md-6">
									<div class="productinfo">
											<img src="resources/images/phone/9.png" alt="">
											</div>

											
									</div>
								</div>
							</div>
							
							<div class="tab-pane fade  active in" id="arrivals">
								<div class="row">
									<div class="col-md-6">
										<div class="productinfo">
											<img src="resources/images/phone/8.png" alt="">
											</div>
											</div>
									<div class="col-md-6">
									<div class="productinfo">
											<img src="resources/images/phone/9.png" alt="">

											</div>
											<div class="row back_color">
														

			<div class="col-md-4">

			<img src="resources/images/phone/5.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>8.0 Inch CHUWI Hi8 Air</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 32299</p>
		    <p  class="new" >New</p>
		</div>
		<div class="col-md-4">
			<img src="resources/images/phone/6.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>BMXC 2018 Android 7.0 OS 10</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>
		<div class="col-md-4">
			<img src="resources/images/phone/7.png" style="width: 165px;height: 165px;" />
			<img src="resources/images/phone/rating.png"  style="width: 72px;"/>
		    <p>BDF 10 inch Design 3G</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 24059 <i class="fa fa-inr" aria-hidden="true"></i> <s>23025</s></p>
		    <p  class="new" >- 50%</p>
		</div>		
	</div>



											
									</div>
								</div>
							</div>
							
							<div class="tab-pane fade " id="sale">
								<div class="row">
									<div class="col-md-6">
										<div class="productinfo">
											<img src="resources/images/phone/11.png" alt="">
											</div>
											</div>
									<div class="col-md-6">
									<div class="productinfo">
											<img src="resources/images/phone/9.png" alt="">
											</div>
											
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
		<h3>Featured Products</h3>
		<div class="row ">
			  <div class="category-tab"><!--category-tab-->
						<div class="col-sm-12">
							<ul class="nav nav-tabs">
								<li ><a href="#laptops" data-toggle="tab">Laptops</a></li>
								<li ><a href="#mobile" data-toggle="tab">Mobile Phones</a></li>
								<li class="active"><a href="#tablet" data-toggle="tab">Tablet</a></li>
								<li ><a href="#camera" data-toggle="tab">Camera & Photo</a></li>
								<li ><a href="#audio" data-toggle="tab">Audio & Video</a></li>
								<li ><a href="#games" data-toggle="tab">Video Games</a></li>
								<li ><a href="#sd" data-toggle="tab">Storage Devices</a></li>
								<li ><a href="#se" data-toggle="tab">Smart Electronics</a></li>
								<li ><a href="#other" data-toggle="tab">Other</a></li>
								
							
							</ul>
						</div>
						<div class="tab-content">
							<div class="tab-pane fade " id="laptops" >
								<p>Laptops</p>
								<div class="row back_color">
		<div class="col-md-2">
			<img src="resources/images/phone/6.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>Lenovo P8 Tab3 8 plus TB</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/2.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>CARBAYTA 320 DPI 10.1' K99</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 30325.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/3.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>8.0 Inch CHUWI Hi8 Air</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/4.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BMXC 2018 Android 7.0 OS 10</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/5.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BDF 10 inch Design 3G</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/7.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>FULCOL DHL Free 10 inch</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>
	</div>
	<div class="row back_color">
		<div class="col-md-2">
			<img src="resources/images/phone/6.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>Lenovo P8 Tab3 8 plus TB</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/2.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>CARBAYTA 320 DPI 10.1' K99</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 30325.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/3.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>8.0 Inch CHUWI Hi8 Air</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/4.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BMXC 2018 Android 7.0 OS 10</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/5.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BDF 10 inch Design 3G</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/7.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>FULCOL DHL Free 10 inch</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>
	</div>

							</div>
							
							<div class="tab-pane fade" id="mobile" >
								<h4>mobile</h4>
								<div class="row back_color">
		<div class="col-md-2">
			<img src="resources/images/phone/6.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>Lenovo P8 Tab3 8 plus TB</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/2.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>CARBAYTA 320 DPI 10.1' K99</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 30325.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/3.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>8.0 Inch CHUWI Hi8 Air</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/4.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BMXC 2018 Android 7.0 OS 10</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/5.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BDF 10 inch Design 3G</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/7.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>FULCOL DHL Free 10 inch</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>
	</div>
							</div>	
							<div class="tab-pane fade active in" id="tablet" >
								<h4>Tablet</h4>
								<div class="row back_color ">
		<div class="col-md-2">
			<img src="resources/images/phone/6.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>Lenovo P8 Tab3 8 plus TB</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/2.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>CARBAYTA 320 DPI 10.1' K99</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 30325.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/3.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>8.0 Inch CHUWI Hi8 Air</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/4.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BMXC 2018 Android 7.0 OS 10</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/5.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BDF 10 inch Design 3G</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/7.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>FULCOL DHL Free 10 inch</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>
	</div><div class="row back_color">
		<div class="col-md-2">
			<img src="resources/images/phone/6.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>Lenovo P8 Tab3 8 plus TB</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/2.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>CARBAYTA 320 DPI 10.1' K99</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 30325.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/3.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>8.0 Inch CHUWI Hi8 Air</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/4.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BMXC 2018 Android 7.0 OS 10</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/5.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>BDF 10 inch Design 3G</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>


		<div class="col-md-2">
			<img src="resources/images/phone/7.png" style="width: 165px;height: 165px;">
			<img src="resources/images/phone/rating.png" style="width: 72px;">
		    <p>FULCOL DHL Free 10 inch</p>
		    <p><i class="fa fa-inr" aria-hidden="true"></i> 3659.00</p>
		</div>
	</div>
							</div>							
							
							<div class="tab-pane fade " id="camera" >
								<h4>camera</h4>
							</div>
							
							<div class="tab-pane fade " id="audio" >
								<h4>audio</h4>
							</div>
							<div class="tab-pane fade " id="games" >
							<h4>games</h4>
							</div>
							<div class="tab-pane fade " id="sd" >
								<h4>storage device</h4>
							</div>
							<div class="tab-pane fade " id="se" >
								<h1>Smart Electronics</h1>
							</div>
								<div class="tab-pane fade " id="other" >
								<h4>other</h4>
							</div>
						
						</div>
					</div>
		</div>

	</div></section>





<section>
	<div class="container">
		<h3></h3>
		<div class="row back_color">
			<div class="col-md-12" style="padding: 10px;">
			<center><p><i class="fa fa-spinner fa-spin" style="font-size:24px"></i> Show more</p></center>	
			</div>			
			</div>
		</div>
	</section>


<section>
	<div class="container ">
		
		<div class="row ">
			<div class="col-md-10"><h3>Featured Brands</h3></div>
				<div class="col-md-2" style="    text-align: right"> <a class="left recommended-item-control" href="#recommended-item-carousel" data-slide="prev">
								<i class="fa fa-angle-left"></i>
							  </a>
							  <a class="right recommended-item-control" href="#recommended-item-carousel" data-slide="next">
								<i class="fa fa-angle-right"></i>
							  </a>	
							</div>
							</div>		
			<div class="recommended_items">
										
						<div id="recommended-item-carousel" class="carousel slide" data-ride="carousel">
							<div class="carousel-inner">
								<div class="item next left">	
									
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/1.png" alt="">
													
												</div>
											</div>
										</div>
									</div><div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/2.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/3.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/4.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/5.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/1.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="item active left">	
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/1.png" alt="">
													
												</div>
											</div>
										</div>
									</div><div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/2.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/3.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/4.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/5.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
									<div class="col-sm-2">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
													<img src="resources/images/brand/1.png" alt="">
													
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							
						</div>
					</div>


		</div>
	</section>

	<!-- <div class=" back_footer ">
		<div class="container">
			<h3>Most Search Keywords</h3>
		<div class="row ">
			<div class="col-md-12">
				<p><b>Laptops</b>: Appleo Laptop | Acero Laptop | Samsing Laptop | Lenov Laptop | Sonyo Laptop | Delli Laptop | Asuso Laptop | Toshibao Laptop | LGG Laptop | HPO Laptop </p>
				<p><b>Tablet</b>: FUKIO Watches | Titan Watches | Casioo Watches | Fastrack Watches | Timexi Watches | Fossili Watches | Dieselo Watches | Toshibao Watches | Luxury Watches </p>
				<p><b> Mobile phone</b>: Shoes | Casual Shoes | Sports Shoes | Adidasi Shoes | Gas Shoes | Pumai Shoes | Reeboki Shoes | Woodlandi Shoes | Red Tape Shoes | Nikeo Shoes</p>
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
						<img src="resources/images/cards/1.png">
						<img src="resources/images/cards/1.png">
						<img src="resources/images/cards/1.png">
						<img src="resources/images/cards/1.png">
					</p>
				</div>
			</div>
		</div>
		 -->
		 <%@ include file="footer.jsp"%>
	</footer><!--/Footer-->
	

  
    <script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/jquery.scrollUp.min.js"></script>
	<script src="resources/js/price-range.js"></script>
    <script src="resources/js/jquery.prettyPhoto.js"></script>
    <script src="resources/js/main.js"></script>
    <script type="text/javascript">// Popup Open
function popupOpen(){
    document.getElementById("popup").style.display="block";
    document.getElementById("overlay").style.display="block";
	}
// Popup Close
	function popupClose(){
    document.getElementById("popup").style.display="none";
    document.getElementById("overlay").style.display="none";
	}</script>
</body>
</html>  