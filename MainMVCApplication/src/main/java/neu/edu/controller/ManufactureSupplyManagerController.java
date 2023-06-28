package neu.edu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.ManufactureSpringBoot.Companyproduct;
import neu.edu.entity.ManufactureSpringBoot.Distributororder;

@Controller
public class ManufactureSupplyManagerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/ManufactureSupplyManagerProductInventory", method = RequestMethod.GET)
	public ModelAndView getProductInventroyPage() {

		String url = "http://localhost:8085/ManufactureSpringBootProductManager/product/manufacture company1";
		
		Companyproduct[] cp = restTemplate.getForObject(url, Companyproduct[].class);
		List<Companyproduct> cpList = Arrays.asList(cp);
		
		ModelAndView mav = new ModelAndView("manufacture/supplyManager/productInventory");
		
		mav.addObject("cpList", cpList);		
		
		
		return mav;
		
		
	}
	
	@RequestMapping(value = "/ManufactureSupplyManagerViewDistributorOrder", method = RequestMethod.GET)
	public ModelAndView getDistributorOrderPage() {
		
		String url = "http://localhost:8085/ManufactureSpringBootProductManager/distributorOrder/manufacture company1";
		
		Distributororder[] Dorder = restTemplate.getForObject(url, Distributororder[].class);
		List<Distributororder> doList = Arrays.asList(Dorder);
		
		ModelAndView mav = new ModelAndView("manufacture/supplyManager/viewDistributorOrder");
		
		mav.addObject("doList", doList);		
		
		
		return mav;
		
		
	}
	
}
