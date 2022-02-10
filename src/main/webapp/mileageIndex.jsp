<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculate Miles</title>
</head>
<body>
<h1>Mileage Converter</h1>

<form action="getMilesServlet" method="post">
Please Enter Number of Inches: <input type="text" name="userUnits" size="15">
<input type="submit" value="Convert" />
</form>
</body>
</html>