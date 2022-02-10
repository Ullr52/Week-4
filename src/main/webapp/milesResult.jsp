<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${userMilesWalked.getUnits()} Number of Miles from inches: <br />
${userMilesWalked.getMiles()} Miles: <br />
${userMilesWalked.getYards()} Yards: <br />
${userMilesWalked.getFeet()} Feet: <br />
${userMilesWalked.getInches()} Inches <br />

</p>
<a href="mileageIndex.jsp">Enter in another distance</a>
</body>
</html>