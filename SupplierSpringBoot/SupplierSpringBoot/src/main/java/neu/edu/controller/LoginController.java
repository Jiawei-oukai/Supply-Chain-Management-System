package neu.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Admin;
import neu.edu.entity.Manager;
import neu.edu.entity.Plantmanager;
import neu.edu.service.AdminService;
import neu.edu.service.ManagerService;
import neu.edu.service.PlantManagerService;

@RestController
@RequestMapping("/SupplierSpringBootLogin")
public class LoginController {
	
	@Autowired
	private AdminService adminService;
	@Autowired
	private ManagerService managerService;
	@Autowired
	private PlantManagerService plantManagerService;
	
	
	@GetMapping("/adminLogin/{email}")
	public @ResponseBody Admin viewAdminByEmail(@PathVariable String email) {
		
		return adminService.viewAdminByEmailAddress(email);
	}
	
	@GetMapping("/managerLogin/{email}")
	public @ResponseBody Manager viewManagerByEmail(@PathVariable String email) {
		
		return managerService.viewManagerByEmail(email);
	}
	
	@GetMapping("/plantManagerLogin/{email}")
	public @ResponseBody Plantmanager viewPlantManagerByEmail(@PathVariable String email) {
		
		return plantManagerService.viewPlantManagerByEmail(email);
	}

}
