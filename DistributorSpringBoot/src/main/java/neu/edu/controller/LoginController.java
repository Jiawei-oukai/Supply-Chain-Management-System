package neu.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Admin;
import neu.edu.entity.Distributormanager;
import neu.edu.service.AdminService;
import neu.edu.service.DistributorService;

@RestController
@RequestMapping("/DistributorSpringBootLogin")
public class LoginController {
	
	@Autowired
	private AdminService adminService;
	@Autowired
	private DistributorService distributorService;
	
	
	@GetMapping("/adminLogin/{email}")
	@ResponseStatus()
	public Admin viewAdminByEmail(@PathVariable String email) {
		
		return adminService.viewAdminByEmailAddress(email);	
	}
	
	@GetMapping("/DistributorManagerLogin/{email}")
	@ResponseStatus()
	public Distributormanager  viewDistributorManagerByEmail(@PathVariable String email) {
		
		return distributorService.viewManagerByEmail(email);
	}
	
}
