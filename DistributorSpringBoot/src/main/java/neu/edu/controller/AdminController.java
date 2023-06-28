package neu.edu.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Admin;
import neu.edu.entity.Distributormanager;
import neu.edu.service.AdminService;
import neu.edu.service.DistributorService;


@RestController
@RequestMapping("/DistributorAdminSpringBoot")
public class AdminController {
	
	@Autowired
	private AdminService adminService;

	@GetMapping("/view")
	@ResponseStatus()
	public List<Admin> viewAllAdmin(){

		return adminService.viewAllAdmin();
	}
	
	@GetMapping("/view/{id}")
	@ResponseStatus()
	public Admin viewAllAdminById(@PathVariable Integer id){
		
		return adminService.viewAllAdminById(id);
	
	}
	
	@Autowired
	private DistributorService distributorService;
	
	
	@GetMapping("/viewAllManager")
	@ResponseStatus()
	public List<Distributormanager> viewAllManager(){

		return distributorService.viewAllManager();
	}
	
	@GetMapping("/viewManagerById/{id}")
	@ResponseStatus()
	public Distributormanager viewManagerById(@PathVariable Integer id){
		
		return distributorService.viewManagerById(id);
	
	}
}