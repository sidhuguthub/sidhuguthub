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
<title>create</title>
</head>
<body>
	<h2 style="color:red;">Create Lead</h2>
	<form action="saveForm" method="post">
	
	<h2 style="color:green;">
	<b>
	<i>
		<pre>
		First Name      <input type="text" name="firstName"/>
		Middle Name     <input type="text" name="middleName"/>
		Last Name       <input type="text" name="lastName"/>
		Email           <input type="text" name="email"/>
		Mobile          <input type="text" name="mobile"/>
		Locality        <input type="text" name="locality"/>
		City            <input type="text" name="city"/>
		State           <input type="text" name="state"/>
		Country         <input type="text" name="country"/>
		Pin No          <input type="text" name="pinNo"/>
		Education       <input type="text" name="education"/>
		College         <input type="text" name="college"/>
		Gender          <input type="text" name="gender"/>
		Religion        <input type="text" name="religion"/>
		Status          <input type="text" name="status"/>
		Gardian's Name  <input type="text" name="gardiansName"/>
		Height          <input type="text" name="height"/>
		Weight          <input type="text" name="weight"/>
		Color           <input type="text" name="colours"/>
		<input type="submit" value="save"/>
		</pre>
		
		</i>
		</b>
		</h2>
		
	</form>	
	
	${msg}	
</body>
</html>