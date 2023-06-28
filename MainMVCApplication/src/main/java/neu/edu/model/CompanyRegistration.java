package neu.edu.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CompanyRegistration {

	private Integer id_admin;
	
	@NotEmpty(message = "Username should not be empty")
	private String companyName;
	
	@NotEmpty(message = "Username should not be empty")
	private String country;
	
	@NotEmpty(message = "Username should not be empty")
	private String state;
	
	@NotEmpty(message = "Username should not be empty")
	private String city;
	
	@NotEmpty(message = "Username should not be empty")
	private String address;
	
	@Email
	private String email_address;
	
	@Size(min=9, max=9)
	@Digits(fraction = 0, integer = 9)
	private String phoneNumber;

	public Integer getId_admin() {
		return id_admin;
	}

	public void setId_admin(Integer id_admin) {
		this.id_admin = id_admin;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
}
