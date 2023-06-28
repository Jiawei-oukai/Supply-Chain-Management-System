package neu.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/ManufactureSpringBootLogin")
public class LoginController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private SupplyManagerService supplyManagerService;
	@Autowired
	private ProductionManagerService productionManagerService;
	@Autowired
	private ProcurementManagerService procurementManagerService;
	
	@GetMapping("/adminLogin/{email}")
	@ResponseStatus()
	public Admin viewAdminByEmail(@PathVariable String email) {
		
		return adminService.viewAdminByEmailAddress(email);	
	}
	
	@GetMapping("/supplyManagerLogin/{email}")
	@ResponseStatus()
	public Supplymanager viewSupplyManagerByEmail(@PathVariable String email) {
		
		return supplyManagerService.viewSupplyManagerByEmailAddress(email);	
	}
	
	@GetMapping("/productionManagerLogin/{email}")
	@ResponseStatus()
	public Productionmanager viewProductionManagerByEmail(@PathVariable String email) {
		
		return productionManagerService.viewProductionManagerByEmailAddress(email);
	}
	
	@GetMapping("/procurementManagerLogin/{email}")
	@ResponseStatus()
	public Procurementmanager viewProcurementManagerByEmail(@PathVariable String email) {
		
		return procurementManagerService.viewProcurementManagerByEmail(email);
	}
}
