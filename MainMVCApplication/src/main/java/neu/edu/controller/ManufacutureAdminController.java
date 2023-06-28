package neu.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManufacutureAdminController {

	
	@RequestMapping(value = "/ManufactureAdminViewUser", method = RequestMethod.GET)
	public ModelAndView getAllUserPage() {
		
		return new ModelAndView("manufacture/admin/viewAllUser");
		
	}
	
	@RequestMapping(value = "/ManufactureAdminViewCompany", method = RequestMethod.GET)
	public ModelAndView getAllCompanyPage() {
		
		return new ModelAndView("manufacture/admin/viewAllCompany");
		
	}
	
	@RequestMapping(value = "/ManufactureAdminCreateManager", method = RequestMethod.GET)
	public ModelAndView getManufactureManagerRegister() {
		
		return new ModelAndView("register/manufacture/manufactureManagerRegister");
		
	}
	
	@RequestMapping(value = "/ManufactureAdminCreateCompany", method = RequestMethod.GET)
	public ModelAndView getManufactureCompanyRegister() {
		
		return new ModelAndView("register/manufacture/manufactureCompanyRegister");
		
	}
	
	@RequestMapping(value = "/BackToManufactureAdminHome", method = RequestMethod.GET)
	public ModelAndView getBackManufactureAdminHome() {
		
		return new ModelAndView("manufacture/admin/adminHomePage");
		
	}
}
