package neu.edu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.ManufactureSpringBoot.Materialinventory;
import neu.edu.entity.ManufactureSpringBoot.Companyproduct;
@Controller
public class ManufactureProductionManagerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/ManufactureProductionManagerViewMaterial", method = RequestMethod.GET)
	public ModelAndView getMaterialInventoryPage() {
		
		String url = "http://localhost:8085/ManufactureSpringBootProductManager/material/manufacture company1";
		
		Materialinventory[] mi = restTemplate.getForObject(url, Materialinventory[].class);
		List<Materialinventory> miList = Arrays.asList(mi);
		
		ModelAndView mav = new ModelAndView("manufacture/productionManager/materialInventory");
		
		mav.addObject("miList", miList);		
		
		return mav;
		
	}
	
	@RequestMapping(value = "/ManufactureProductionManagerViewProduct", method = RequestMethod.GET)
	public ModelAndView getProductInventoryPage() {
		
		String url = "http://localhost:8085/ManufactureSpringBootProductManager/product/manufacture company1";
		
		Companyproduct[] cp = restTemplate.getForObject(url, Companyproduct[].class);
		List<Companyproduct> cpList = Arrays.asList(cp);
		
		ModelAndView mav = new ModelAndView("manufacture/supplyManager/productInventory");
		
		mav.addObject("cpList", cpList);		
		
		
		return mav;
		
	}
	
	@RequestMapping(value = "/ManufactureProductionManagerCreateProduct", method = RequestMethod.GET)
	public ModelAndView getCreateProductPage() {
		
		return new ModelAndView("manufacture/productionManager/createProduct");
		
	}
}
