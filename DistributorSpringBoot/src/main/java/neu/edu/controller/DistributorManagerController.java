package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Cityconnection;
import neu.edu.entity.Productinventory;
import neu.edu.service.CityconnectionService;
import neu.edu.service.ProductInventoryService;

@RestController
@RequestMapping("/SpringBootDistributorManager")
public class DistributorManagerController {
	
	@Autowired
	private ProductInventoryService productInventoryService;
	@Autowired
	private CityconnectionService cityconnectionService;
	
	@GetMapping("/productInventory")
	public @ResponseBody List<Productinventory> viewAllProductInventory(){
		
		return productInventoryService.viewAllProductInventory();
	}
	
	@GetMapping("/productInventory/{companyName}")
	public @ResponseBody List<Productinventory> viewProductInventoryByCompany(@PathVariable String companyName){
		
		return productInventoryService.viewProductInventoryByCompanyName(companyName);
	}

	@GetMapping("/cityConnection")
	public @ResponseBody List<Cityconnection> viewAllCityConnection(){
		
		return cityconnectionService.viewAllConnection();
	}

}
