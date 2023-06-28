package neu.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SupplierPlantManagerController {
	
	@RequestMapping(value = "/SupplierPlantManagerAddIssue", method = RequestMethod.GET)
	public ModelAndView getAddSupplyChainIssuePage() {
		
		return new ModelAndView("supplier/plantManager/addSupplyChainIssue");
		
	}
	
	
	@RequestMapping(value = "/SupplierPlantManagerViewIssue", method = RequestMethod.GET)
	public ModelAndView getViewSupplyChainIssuerPage() {
		
		return new ModelAndView("supplier/plantManager/viewSupplyChainIssue");
		
	}
	
}
