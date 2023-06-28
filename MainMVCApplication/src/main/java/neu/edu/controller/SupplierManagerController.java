package neu.edu.controller;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.SupplierSpringBoot.Materialinventory;
import neu.edu.entity.SupplierSpringBoot.Allorder;

@Controller
public class SupplierManagerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/ManagerAddMaterial", method = RequestMethod.GET)
	public ModelAndView getAddMaterialPage() {

		
		return new ModelAndView("supplier/manager/addMaterial");
	}
	
	@RequestMapping(value = "/ManagerViewMaterial", method = RequestMethod.GET)
	public ModelAndView getViewAllMaterialPage() {
		
		String url = "http://localhost:8084/SupplierSpringBootManager/inventory/supplier company1";
		
		Materialinventory[] mi = restTemplate.getForObject(url, Materialinventory[].class);
		List<Materialinventory> miList = Arrays.asList(mi);
		
		ModelAndView mav = new ModelAndView("supplier/manager/viewAllMaterial");
		
		mav.addObject("miList", miList);		
		
		return mav;
		
	}
	
	@RequestMapping(value = "/ManagerViewOrder", method = RequestMethod.GET)
	public ModelAndView getViewAllOrderPage() {
		
		
		String url = "http://localhost:8084/SupplierSpringBootManager/order/supplier company1";
		
		Allorder[] order = restTemplate.getForObject(url, Allorder[].class);
		List<Allorder> orderList = Arrays.asList(order);
		
		ModelAndView mav = new ModelAndView("supplier/manager/viewAllOrder");
		
		
		mav.addObject("orderList", orderList);		
		
		return mav;
	}
	
}
