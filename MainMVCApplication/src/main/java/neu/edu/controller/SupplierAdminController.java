package neu.edu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.DistributorSpringBoot.Productinventory;
import neu.edu.entity.SupplierSpringBoot.Company;
import neu.edu.entity.SupplierSpringBoot.Manager;
import neu.edu.entity.SupplierSpringBoot.Plantmanager;
@Controller
public class SupplierAdminController {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/SupplierAdminViewUser", method = RequestMethod.GET)
	public ModelAndView getAllUserPage() {
		
		
		String url2 = "http://localhost:8084/SupplierSpringBootAdmin/manager";
		String url3 = "http://localhost:8084/SupplierSpringBootAdmin/plantManager";
		
		
		
		Manager[] manager = restTemplate.getForObject(url2, Manager[].class);
		List<Manager> managerList = Arrays.asList(manager);
		
		Plantmanager[] plantManager = restTemplate.getForObject(url3, Plantmanager[].class);
		List<Plantmanager> plantManagerList = Arrays.asList(plantManager);
		
		ModelAndView mav = new ModelAndView("supplier/admin/viewAllUser");
		
		
		mav.addObject("managerList", managerList);
		mav.addObject("plantManagerList", plantManagerList);
		return mav;
		
	}
	
	@RequestMapping(value = "/SupplierAdminViewCompany", method = RequestMethod.GET)
	public ModelAndView getAllCompanyPage() {
		String url1 = "http://localhost:8084/SupplierSpringBootAdmin/company";
		
		Company[] company = restTemplate.getForObject(url1, Company[].class);
		List<Company> companyList = Arrays.asList(company);
		
		ModelAndView mav = new ModelAndView("supplier/admin/viewAllCompany");
		
		mav.addObject("companyList", companyList);
		return mav;
		
	}
	
	@RequestMapping(value = "/SupplierAdminCreateManager", method = RequestMethod.GET)
	public ModelAndView getSupplierManagerRegister() {
		
		return new ModelAndView("register/supplier/supplierManagerRegister");
		
	}
	
	@RequestMapping(value = "/SupplierAdminCreateCompany", method = RequestMethod.GET)
	public ModelAndView getSupplierCompanyRegister() {
		
		return new ModelAndView("register/supplier/supplierCompanyRegister");
		
	}
	
	@RequestMapping(value = "/BackToSupplierAdminHome", method = RequestMethod.GET)
	public ModelAndView getBackSupplierAdminHome() {
		
		return new ModelAndView("supplier/admin/adminHomePage");
		
	}
	
}
