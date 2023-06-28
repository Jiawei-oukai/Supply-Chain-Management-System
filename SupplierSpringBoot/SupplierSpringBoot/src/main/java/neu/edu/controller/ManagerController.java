package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.service.CompanyInventoryService;
import neu.edu.service.CompanyOrderService;
import neu.edu.entity.Allorder;
import neu.edu.entity.Materialinventory;

@RestController
@RequestMapping("/SupplierSpringBootManager")
public class ManagerController {

	@Autowired
	private CompanyOrderService companyOrderService;
	@Autowired
	private CompanyInventoryService companyInventoryService;
	
	@GetMapping("/order/{companyName}")
	public @ResponseBody List<Allorder> viewCompanyOrder(@PathVariable String companyName){
		
		return companyOrderService.viewCompanyOrder(companyName);
	}
	
	@GetMapping("/inventory/{companyName}")
	public @ResponseBody List<Materialinventory> viewCompanyInventory(@PathVariable String companyName){
		
		return companyInventoryService.viewCompanyInventory(companyName);
	}
}
