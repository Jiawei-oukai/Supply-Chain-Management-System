package neu.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DistributorAdminController {
	
	
	@RequestMapping(value = "/DistributorAdminViewUser", method = RequestMethod.GET)
	public ModelAndView getAllUserPage() {
		
		return new ModelAndView("distributor/admin/viewAllUser");
		
	}
	
	@RequestMapping(value = "/DistributorAdminViewCompany", method = RequestMethod.GET)
	public ModelAndView getAllCompanyPage() {
		
		return new ModelAndView("distributor/admin/viewAllCompany");
		
	}
	
	@RequestMapping(value = "/DistributorAdminCreateManager", method = RequestMethod.GET)
	public ModelAndView getDistributorManagerRegister() {
		
		return new ModelAndView("register/distributor/distributorManagerRegister");
		
	}
	
	@RequestMapping(value = "/DistributorAdminCreateCompany", method = RequestMethod.GET)
	public ModelAndView getDistributorCompanyRegister() {
		
		return new ModelAndView("register/distributor/distributorCompanyRegister");
		
	}
	
	@RequestMapping(value = "/BackToDistributorAdminHome", method = RequestMethod.GET)
	public ModelAndView getBackDistributorAdminHome() {
		
		return new ModelAndView("distributor/admin/adminHomePage");
		
	}
	
}
