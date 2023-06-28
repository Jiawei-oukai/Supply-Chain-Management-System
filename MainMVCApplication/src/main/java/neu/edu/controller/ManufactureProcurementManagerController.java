package neu.edu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.ManufactureSpringBoot.Materialorder;
import neu.edu.entity.SupplierSpringBoot.Manager;
import neu.edu.entity.SupplierSpringBoot.Materialinventory;

@Controller
public class ManufactureProcurementManagerController {
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/ManufactureProcurementManagerViewMaterial", method = RequestMethod.GET)
	public ModelAndView getViewAllMaterialPage() {
		
		
		String url = "http://localhost:8084/SupplierSpringBootAdmin/Inventory";
		
		Materialinventory[] inventory = restTemplate.getForObject(url, Materialinventory[].class);
		List<Materialinventory> inventoryList = Arrays.asList(inventory);
		
		ModelAndView mav = new ModelAndView("manufacture/procurementManager/viewAllMaterial");
		
		mav.addObject("inventoryList", inventoryList);
		
		return mav;
		
	}
	
	@RequestMapping(value = "/ManufactureProcurementManagerViewOrder", method = RequestMethod.GET)
	public ModelAndView getViewAllOrderPage() {
		
		
		String url = "http://localhost:8085/ManufactureSpringBootProcurementManager/viewOrder/manufacture company1";
		
		Materialorder[] materialOrder = restTemplate.getForObject(url, Materialorder[].class);
		List<Materialorder> materialOrderList = Arrays.asList(materialOrder);

		ModelAndView mav = new ModelAndView("manufacture/procurementManager/viewAllOrder");
		
		mav.addObject("materialOrderList", materialOrderList);
		
		
		return mav;
		
	}
	
}
