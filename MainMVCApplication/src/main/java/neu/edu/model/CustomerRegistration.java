package neu.edu.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class CustomerRegistration {

	
	@NotEmpty(message = "Username should not be empty")
	private String username;
	
	@NotEmpty(message = "First name should not be empty")
	private String firstName;
	
	@NotEmpty(message = "Last name should not be empty")
	private String lastName;
	
	@NotBlank @Size(min=2, max=30)
	private String password;
	
	@Email
	private String email;
	
	@Size(min=9, max=9)
	@Digits(fraction = 0, integer = 9)
	private String mobileNumber;
	
	private String city;
	
	@Size(min=2, max=40)
	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
