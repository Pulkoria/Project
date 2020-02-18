<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
 <center>
<form:form action="resetPassword" method="post">
	  Password <input type="password" name="userName"><br/><br/> 
	  Old Password <input type="text" name="oldPassword"> <br/><br/> 
	  New Password <input type="text" name="newPassword1"><br/><br/> 
	  New Password <input type="text" name="newPassword2"><br/><br/> 

  <br/><input type="submit" value="Submit"></br></br>
  </center>
  </form:form>
  
	Reset password done
</body>
</html>