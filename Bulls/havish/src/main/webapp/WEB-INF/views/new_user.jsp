<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title> </head>
 <body> <center>
  <center>
 <h2>Login</h2>
 <center>
 <center> 
 <form:form action="new_user" method="post">
	  Username <input type="text" name="userName"> <br/><br/> 
	  Password <input type="password" name="password"><br/><br/> 
	  UserRole <input type="text" name="userRole"> <br/><br/> 
	  UserCategory <input type="text" name="userCategory"><br/><br/> 
	  OrganisationId <input type="text" name="organisationId"> <br/><br/> 

  <br/><input type="submit" value="Submit"></br></br><a href="resetPass.htm">Reset Password</a>
  </center>
  </form:form>
  </body>
  </html>
</html>