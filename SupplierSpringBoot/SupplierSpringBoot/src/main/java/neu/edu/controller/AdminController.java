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
import neu.edu.entity.Company;
import neu.edu.entity.Manager;
import neu.edu.entity.Materialinventory;
import neu.edu.entity.Plantmanager;
import neu.edu.service.AdminService;
import neu.edu.service.CompanyInventoryService;
import neu.edu.service.CompanyService;
import neu.edu.service.ManagerService;
import neu.edu.service.PlantManagerService;


@RestController
@RequestMapping("/SupplierSpringBootAdmin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	@Autowired
	private PlantManagerService plantManagerService;
	@Autowired
	private ManagerService managerService;
	@Autowired
	private CompanyService companyService;
	@Autowired
	private CompanyInventoryService companyInventoryService;
//	@GetMapping("/view")
//	@ResponseStatus()
//	public List<Admin> viewAllAdmin(){
//
//		return adminService.viewAllAdmin();
//	}
//	
//	@GetMapping("/view/{id}")
//	@ResponseStatus()
//	public Admin viewAllAdminById(@PathVariable Integer id){
//		
//		return adminService.viewAllAdminById(id);
//	
//	}
//	
	
	
	@GetMapping("/manager")
	public @ResponseBody List<Manager> viewAllManager(){

		return managerService.viewAllManager();
	}
	
	@GetMapping("/manager/{id}")
	public @ResponseBody Manager viewManagerById(@PathVariable Integer id){
		
		return managerService.viewManagerById(id);
	
	}
	
	@GetMapping("/plantManager")
	public @ResponseBody List<Plantmanager> viewAllPlantManager(){

		return plantManagerService.viewAllPlantManager();
	}
	
	@GetMapping("/plantManager/{id}")
	public @ResponseBody Plantmanager viewPlantManagerById(@PathVariable Integer id){
		
		return plantManagerService.viewPlantManagerById(id);
	
	}
	
	
	@GetMapping("/company")
	public @ResponseBody List<Company> viewAllCompany(){

		return companyService.viewAllCompany();
	}
	
	@GetMapping("/company/{id}")
	public @ResponseBody Company viewCompanyById(@PathVariable Integer id){
		
		return companyService.viewCompanyById(id);
	
	}
	
	
	@GetMapping("/Inventory")
	public @ResponseBody List<Materialinventory> viewAllInventory(){
		
		return companyInventoryService.viewAllInventory();
	
	}
	
}