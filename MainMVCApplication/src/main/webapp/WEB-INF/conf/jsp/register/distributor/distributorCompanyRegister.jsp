<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<body>
	<div class="w3-container w3-light-grey" style="padding: 28px 16px"
		id="contact">
		<h3 class="w3-center">Registration</h3>
		<p class="w3-center w3-large">All fields are required</p>
		<div style="margin-top: 48px">
		<p>
		${error}
		</p>
			<form value = "./CustomerRegister" method="post">
			
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="Company Name"  name="companyName" value="${customerRegistration.username}">
					<springForm:errors path="companyName" cssClass="error" />


				</p>
				
				<p>
					<input class="w3-input w3-border" type="text" placeholder="Email"
						 name="email">
											<springForm:errors path="email" cssClass="error" />
						
				</p>
				
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="Mobile Number"  name="mobileNumber">
											<springForm:errors path="phoneNumber" cssClass="error" />
						
				</p>
				
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="Country" 
						name="country">
				</p>
				
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="State" 
						name="state">
				</p>
				
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="City" 
						name="city">
				</p>
				
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="Address: 120 Parliament" 
						name="address">
				</p>
				
				<div id='html_element'></div>

				<p>
					<button class="w3-button w3-black w3-right" type="submit">
						<i class="fa fa-arrow-circle-right"></i> Submit
					</button>
				</p>
				<p>
					<a method=get href="./BackToManufactureAdminHome" class="w3-button w3-grey"><i class="fa fa-arrow-circle-left">Back</i></a>

				</p>
			</form>

		</div>
	</div>
	
</body>
</html>