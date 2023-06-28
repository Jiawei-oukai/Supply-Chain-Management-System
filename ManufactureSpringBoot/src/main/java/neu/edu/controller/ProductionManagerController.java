package neu.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Companyproduct;
import neu.edu.entity.Distributororder;
import neu.edu.entity.Materialinventory;
import neu.edu.service.CompanyproductService;
import neu.edu.service.DistributororderService;
import neu.edu.service.MaterialinventoryService;

@RestController
@RequestMapping("/ManufactureSpringBootProductManager")
public class ProductionManagerController {

	@Autowired
	private MaterialinventoryService materialinventoryService;
	@Autowired
	private CompanyproductService companyproductService;
	@Autowired
	private DistributororderService distributororderService;
	
	@GetMapping("/material/{companyName}")
	public @ResponseBody List<Materialinventory> viewCompanyMaterial(@PathVariable String companyName){

		return materialinventoryService.viewByCompany(companyName);
	}
	
	@GetMapping("/product/{companyName}")
	public @ResponseBody List<Companyproduct> viewCompanyProduct(@PathVariable String companyName){

		return companyproductService.viewByCompany(companyName);
	}
	
	@GetMapping("/distributorOrder/{companyName}")
	public @ResponseBody List<Distributororder> viewDistributorOrder(@PathVariable String companyName){

		return distributororderService.viewByCompany(companyName);
	}
}
