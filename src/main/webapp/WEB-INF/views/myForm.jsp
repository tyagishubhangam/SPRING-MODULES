<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Form</title>
</head>
<body>
<h1>MY FORM</h1>
<form action = "submitForm" method = "POST">
<div class = "name">Name: <input type = "text" name = "name" placeholder = "name"/></div>
<div class = "phonum">Phone Number: <input type = "tel" name = "phonenum" placeholder = "Enter phone number"/></div>
<div class = "email">Email: <input type = "email" name = "email" placeholder = "Enter your email"/></div>
<div class = "city">City: <input type = "text" name = "city" placeholder = "Enter your city"/></div>
<input type = "submit" value = "Submit"/><input type = "reset" value = "reset"/>
</form>

</body>
</html>