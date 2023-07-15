<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{background-image:
 url('https://www.hdwallpapers.in/download/white_flower_4k_8k_hd-HD.jpg');
 background-repeat: no-repeat;
 background-attachment: fixed;
 background-size: 100% 100%
}
</style>
<title>Read All Leads</title>
</head>
<body>
<h2 style="color:green;">Read All Leads</h2>
<table>
<tr>
<th>Id</th>
<th>First Name</th>
<th>Middle Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Locality</th>
<th>City</th>
<th>State</th>
<th>Country</th>
<th>Pin No</th>
<th>Education</th>
<th>College</th>
<th>Gender</th>
<th>Religion</th>
<th>Status</th>
<th>Gardian's Name</th>
<th>Height</th>
<th>Weight</th>
<th>Color</th>
<th>Action</th>
</tr>
<c:forEach var="form" items="${forms}">
<tr>
<td>${form.id}</td>
<td>${form.firstName}</td>
<td>${form.middleName}</td>
<td>${form.lastName}</td>
<td>${form.email}</td>
<td>${form.mobile}</td>
<td>${form.locality}</td>
<td>${form.city}</td>
<td>${form.state}</td>
<td>${form.country}</td>
<td>${form.pinNo}</td>
<td>${form.education}</td>
<td>${form.college}</td>
<td>${form.gender}</td>
<td>${form.religion}</td>
<td>${form.status}</td>
<td>${form.gardiansName}</td>
<td>${form.height}</td>
<td>${form.weight}</td>
<td>${form.colour}</td>
<td><a href="delete?id=${form.id}">delete</a></td>
<td><a href="update?id=${form.id}">update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>