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
import neu.edu.entity.Procurementmanager;
import neu.edu.entity.Productionmanager;
import neu.edu.entity.Supplymanager;
import neu.edu.service.AdminService;
import neu.edu.service.ProcurementManagerService;
import neu.edu.service.ProductionManagerService;
import neu.edu.service.SupplyManagerService;


@RestController
@RequestMapping("/ManufactureSpringBootAdmin")
public class AdminController {
	
//	@Autowired
//	private AdminService adminService;
	@Autowired
	private ProcurementManagerService procurementManagerService;
	@Autowired
	private ProductionManagerService productionManagerService;
	@Autowired
	private SupplyManagerService supplyManagerService;

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
	
	@GetMapping("/procurementManager")
	@ResponseStatus()
	public List<Procurementmanager> viewAllProcurementManager(){

		return procurementManagerService.viewProcurementManager();
	}
	
	@GetMapping("/procurementManager/{id}")
	@ResponseStatus()
	public Procurementmanager viewProcurementManagerById(@PathVariable Integer id){

		return procurementManagerService.viewProcurementManagerById(id);
	}
	
	@GetMapping("/productionManager")
	@ResponseStatus()
	public List<Productionmanager> viewAllProductionManager(){

		return productionManagerService.viewProductionManager();
	}
	
	@GetMapping("/productionManager/{id}")
	@ResponseStatus()
	public Productionmanager viewProductionManagerById(@PathVariable Integer id){

		return productionManagerService.viewProductionManagerById(id);
	}
	
	@GetMapping("/supplyManager")
	@ResponseStatus()
	public List<Supplymanager> viewAllSupplyManager(){

		return supplyManagerService.viewSupplyManager();
	}
	
	@GetMapping("/supplyManager/{id}")
	@ResponseStatus()
	public Supplymanager viewSupplyManagerById(@PathVariable Integer id){

		return supplyManagerService.viewSupplyManagerById(id);
	}
	
}