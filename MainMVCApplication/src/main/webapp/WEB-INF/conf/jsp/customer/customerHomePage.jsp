<%--<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> --%>

<%@ page contentType="text/html;charset=utf-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin Dashboard</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1, h2, h3, h4, h5, h6 {
	font-family: "Raleway", sans-serif
}

body, html {
	height: 100%;
	line-height: 1.8;
}

/* Full height image header */
.bgimg-1 {
	background-position: center;
	background-size: cover;
	background-color: lightcyan;
	background-image: url("/w3images/mac.jpg");
	min-height: 100%;
}

.w3-bar .w3-button {
	padding: 16px;
}
</style>
</head>
<body>

	<!-- Navbar (sit on top) -->
	<div class="w3-top">
		<div class="w3-bar w3-white w3-card" id="myNavbar">

			<!-- Right-sided navbar links -->
			<div class="w3-right">
				<a href="./Logout"
					class="w3-bar-item w3-button"><i class="fa fa-sign-in"></i>LOGOUT</a>
			</div>
			<!-- Hide right-floated links on small screens and replace them with a menu icon -->
		</div>
	</div>



	<!-- Header with full-height image -->
	<header class="bgimg-1 w3-display-container w3-grayscale-min" id="home">
		<div class="w3-display-top w3-text-white" style="padding: 48px">
			<p>
				<a
					class="w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-off">
					Welcome ${sessionScope['currentUser'].user}! You are the super
					Admin. You can CREATE/DELETE users of our reservation system</a>
			</p>
		</div>
		<div class="w3-display-left w3-text-black" style="padding: 48px">
			<table
				class="w3-table w3-striped w3-bordered w3-border w3-hoverable w3-white">
				<!-- column -->
				<tr>
					<th>Company Name</th>
					<th>Product</th>
					<th>Cost</th>
					<th>Inventory</th>

				</tr>
				<!-- data -->
				<tbody>
					<c:forEach var="p" items="${productInventoryList}">
						<tr>
							<td>${p.companyName}</td>
							<td>${p.productname}</td>
							<td>${p.cost}</td>
							<td>${p.inventory}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<div class="w3-display-middle w3-text-black" style="padding: 48px">
			<table
				class="w3-table w3-striped w3-bordered w3-border w3-hoverable w3-white">
				<!-- column -->
				<tr>
					<th>Company Name</th>
					<th>Destination</th>
					<th>Time</th>
					<th>Cost</th>

				</tr>
				<!-- data -->
				<tbody>
					<c:forEach var="c" items="${cityConnectionList}">
						<tr>
							<td>${c.companyName}</td>
							<td>${c.city}</td>
							<td>${c.shipTime}</td>
							<td>${c.cost}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</header>




	<!-- Footer -->
	<footer class="w3-center w3-black w3-padding-64">
		<div class="w3-xlarge w3-section">
			<i class="fa fa-facebook-official w3-hover-opacity"></i> <i
				class="fa fa-instagram w3-hover-opacity"></i> <i
				class="fa fa-snapchat w3-hover-opacity"></i> <i
				class="fa fa-pinterest-p w3-hover-opacity"></i> <i
				class="fa fa-twitter w3-hover-opacity"></i> <i
				class="fa fa-linkedin w3-hover-opacity"></i>
		</div>
		<p>
			Powered by <a href="https://www.w3schools.com/w3css/default.asp"
				title="W3.CSS" target="_blank" class="w3-hover-text-green">w3.css</a>
		</p>
	</footer>


</body>
</html>


