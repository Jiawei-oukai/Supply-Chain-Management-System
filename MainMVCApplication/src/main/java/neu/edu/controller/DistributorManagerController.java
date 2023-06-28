package neu.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DistributorManagerController {

	
	@RequestMapping(value = "/DistributorViewProductInventory", method = RequestMethod.GET)
	public ModelAndView getProductInventoryPage() {
		
		return new ModelAndView("distributor/distributorManager/productInventory");
		
	}
	
	@RequestMapping(value = "/DistributorViewManufactureOrder", method = RequestMethod.GET)
	public ModelAndView getManufactureOrderPage() {
		
		return new ModelAndView("distributor/distributorManager/orderToManufacture");
		
	}
	
	@RequestMapping(value = "/DistributorViewCustomerOrder", method = RequestMethod.GET)
	public ModelAndView getCustomerOrderPage() {
		
		return new ModelAndView("distributor/distributorManager/orderFromCustomer");
		
	}
	
	@RequestMapping(value = "/DistributorViewCompanyProduct", method = RequestMethod.GET)
	public ModelAndView getCompanyProductPage() {
		
		return new ModelAndView("distributor/distributorManager/viewCompanyProduct");
		
	}
}
