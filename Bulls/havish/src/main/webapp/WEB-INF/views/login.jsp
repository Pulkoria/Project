


<li><a href="#" data-target="#login" data-toggle="modal"><i
		class="fa fa-user" aria-hidden="true"></i> Register or Sign in</a></li>
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
						<img src="images/dailydrop/login.png" alt="">
					</div>
					<div class="col-md-6">
						<div class="tab_form_data">


							<ul class="tabs">
								<li><input type="radio" checked name="tabs" id="tab1">
									<label for="tab1">Sign In to Havish</label>
									<div id="tab-content1" class="tab-content animated fadeIn">
										<div id="form_new" class="tab_form">
											<br>
											<br>
											<div class="col-md-12">
												<label>Registered Havish Mobile Number or Email ID</label><br>
												<input type="text" name=""
													placeholder="Mobile Number or Email ID">
											</div>
											<div class="col-md-12">
												<label>Havish Password</label><br> <input type="text"
													name="" placeholder="*******">
												<div class="hide-show"></div>
											</div>
											<a href="#"><p class="color"
													style="float: right; font-size: 15px;">Forgot password
													?</p></a>
											<button class="btn btn-default subscribe"
												style="color: #fff; width: 100%;">Login</button>
											<p>
												<br>By logging in, you agree to our <span class="color">terms
													& conditions</span> <span class="color">Privacy & Policy</span>
											</p>

										</div>
									</div></li>
								<li><input type="radio" name="tabs" id="tab2"> <label
									for="tab2">Sign Up</label>
									<div id="tab-content2" class="tab-content animated fadeIn">

										<div id="form_new" class="tab_form">
											<br>
											<br>
											<div class="col-md-12">
												<label>Registered Havish Mobile Number or Email ID</label><br>
												<input type="text" name=""
													placeholder="Mobile Number or Email ID">
											</div>
											<div class="col-md-12">
												<label>Havish Password</label><br> <input type="text"
													name="" placeholder="*******">
												<div class="hide-show"></div>
											</div>
											<div class="col-md-12">
												<label>Email ID</label><br> <input type="text" name=""
													placeholder="Email">
												<div class="hide-show"></div>
											</div>

											<button class="btn btn-default subscribe"
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








<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
    <meta http-equiv="Content-Type" content="text/javascript; charset=ISO-8859-1">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>  
.error{color:red}  
</style>  
<style>  
.p{color:red}  
</style> 
<html>
<head>
<meta charset="ISO-8859-1">
<title></title> <style type="text/css">
.error {
	color: red;
}
</style></head>
 <body> <center>
  <center>
 <h2>Login</h2> <form:form action="login" modelAttribute="userform" method="post">
 UserName   <input type="text" name="userName" maxlength="45"> <br/><br/> 
 Password   <input type="text" name="password"><br/><br/> 
  <br/><input type="submit" value="Submit"> <br/> <br/><a href="new_user.htm">Sign Up</a>
  <br/> <br/><a href="forgotPass.htm">Forgot Password?</a></form:form>
  </center>
  </body>
  </html>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | E-Shopper</title>
   <link href="resources/css/bootstrap.min.css" rel="stylesheet"  type="text/css" media="screen"/>
    <link href="resources/css/font-awesome.min.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="resources/css/prettyPhoto.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="resources/css/price-range.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="resources/css/animate.css" rel="stylesheet" type="text/css" media="screen"/>
	<link href="resources/css/main.css" rel="stylesheet" type="text/css" media="screen"/>
	<link href="resources/css/responsive.css" rel="stylesheet" type="text/css" media="screen"/>
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="resources/images/ico/favicon.ico" type="text/css"/>
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="resources/images/ico/apple-touch-icon-144-precomposed.png"/>
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="resources/images/ico/apple-touch-icon-114-precomposed.png"/>
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="resources/images/ico/apple-touch-icon-72-precomposed.png"/>
    <link rel="apple-touch-icon-precomposed" href="resources/images/ico/apple-touch-icon-57-precomposed.png"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
</head>

<body>
<%@ include file="header.jsp"%>
	<section id="form"><!--form-->
		<div class="container">
			<div class="row back_color">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form"><!--login form-->
						<h2>Login to your account</h2>
						<form:form action="login" modelAttribute="userVo" method="POST">
							<!-- <input type="text" placeholder="Name" name="userName"/>
							<input type="text" placeholder="Email Address" name="password"/>
							 -->
							${status}
							
							<form:input path="userId" placeholder="Name"/>

							<c:if test = "${status eq 'ERINVP'}">
							<p>Invalid user password</p>
							<!-- <script>
							//call after page loaded
								window.onload = myFunction ; 
							</script> -->
							</c:if>
							
							<form:input  placeholder="Password" path="password"/>
							
							
							<c:if test = "${status eq 'ERINU'}">
							<p>Invalid user Name.Click on Sign Up to create an Account.</p>
							<!-- <script>
							//call after page loaded
								window.onload = myFunction ; 
							</script> -->
							</c:if>
							<span>
								<input type="checkbox" class="checkbox"> 
								Keep me signed in
							</span>
							<form:button type="submit" class="btn btn-default">Login</form:button>
						</form:form>
					</div><!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form"><!--sign up form-->
						<h2>New User Signup!</h2>
						<form:form action="newUser" modelAttribute="newUser" method="POST">
							
							<form:input  path="userId" placeholder="UserName" />
							
							<form:input  path="emailId"  placeholder="Email Address"/>
							
							<input type ="text" name="phoneNo"  placeholder="PhoneNo"/>
							
							<form:input  path="userName" placeholder="Name" />
							
							<form:input  path="password" placeholder="Password"/>
							
							<form:button type="submit" class="btn btn-default">Signup</form:button>
						</form:form>
					</div><!--/sign up form-->
				</div>
			</div>
		</div>
	</section>
	
	<%@ include file="footer.jsp"%>
  	<script type="text/javascript">
	function myFunction() {
		 alert("I am an alert box!");
	}
	</script>
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
</html></html> --%>