<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME USER</h1>
<h3>NAME: ${model_user.getName()}</h3>
<h3>PHONE: ${model_user.getPhonenum()}</h3>
<h3>EMAIL: ${model_user.getEmail()}</h3>
<h3>CITY: ${model_user.getCity()}</h3>
</body>
</html>