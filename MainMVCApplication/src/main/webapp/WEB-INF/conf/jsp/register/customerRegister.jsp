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
						placeholder="Username"  name="username" value="${customerRegistration.username}">
					<springForm:errors path="username" cssClass="error" />


				</p>
				
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="First Name" 
						name="firstName">
				</p>
				
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="Last Name" 
						name="lastName">
				</p>
				
				
				<p>
					<input class="w3-input w3-border" type="password" id="pw1"
						placeholder="Password"  name="password">
					<springForm:errors path="password" cssClass="error" />

				</p>
				
				<p>
					<input class="w3-input w3-border" type="password" name="re_pw"
						id="pw2" placeholder="Re-Type Password" onkeyup="validate()" /><span
						id="hint"></span>
				</p>
				
				<p>
					<input class="w3-input w3-border" type="text" placeholder="Email"
						 name="email">
											<springForm:errors path="email" cssClass="error" />
						
				</p>
				<p>
					<input class="w3-input w3-border" type="text"
						placeholder="Mobile Number"  name="mobileNumber">
											<springForm:errors path="password" cssClass="error" />
						
				</p>
				
				<label for="city">Choose your City:</label>
				 <select name="city" id="city">
    				<option value="toronto">Toronto</option>
   				    <option value="vancouver">Vancouver</option>
                    <option value="montreal">Montreal</option>
  				 </select>	
				
				
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
					<a method=get href="./BackToCustomerLogin" class="w3-button w3-grey"><i class="fa fa-arrow-circle-left">Back</i></a>

				</p>
			</form>

		</div>
	</div>
	<script type="text/javascript">		
		function validate() {
			var pw1 = document.getElementById("pw1").value;
			var pw2 = document.getElementById("pw2").value;
			if (pw1 == pw2) {
				document.getElementById("hint").innerHTML = "<font color='green'>Password Matched</font>";
				document.getElementById("submit").disabled = false;
			} else {
				document.getElementById("hint").innerHTML = "<font color='red'>Password Mismatched</font>";
				document.getElementById("submit").disabled = true;
			}
		}
	</script>
</body>
</html>