package neu.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.entity.CustomerSpringBoot.Customer;
import neu.edu.entity.SupplierSpringBoot.Admin;
import neu.edu.entity.SupplierSpringBoot.Manager;
import neu.edu.entity.SupplierSpringBoot.Plantmanager;
import neu.edu.model.LoginInformation;

import java.util.Arrays;
import java.util.List;

import neu.edu.entity.DistributorSpringBoot.Productinventory;
import neu.edu.entity.DistributorSpringBoot.Cityconnection;

@Controller
public class LoginController {
	
	@Autowired
	private RestTemplate restTemplate;

	
	@RequestMapping(value = "/CustomerLogin", method = RequestMethod.GET)
	public ModelAndView getCustomerLoginPage() {
		
		return new ModelAndView("login/customerLogin");
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/CustomerLogin", method = RequestMethod.POST)
	public ModelAndView postCustomerHomePage(LoginInformation loginInformation) {
		String email = loginInformation.getEmail();
		String password = loginInformation.getPassword();
		
		String url = "http://localhost:8087/CustomerSpringBoot/findCustomer/";
		
		url += email;
		Customer customer = restTemplate.getForObject(url, Customer.class);
		
		System.out.println(password);
		System.out.println(customer.getPassword());
		
		if (password.equals(customer.getPassword())) {
			
			String url1 = "http://localhost:8086/SpringBootDistributorManager/productInventory";
			String url2 = "http://localhost:8086/SpringBootDistributorManager/cityConnection";
			
			Productinventory[] productInventory = restTemplate.getForObject(url1, Productinventory[].class);
			Cityconnection[] cc = restTemplate.getForObject(url2, Cityconnection[].class);
			
			List<Productinventory> productInventoryList = Arrays.asList(productInventory);
			List<Cityconnection> cityConnectionList = Arrays.asList(cc);
			
			ModelAndView mav = new ModelAndView("customer/customerHomePage");
			
			mav.addObject("productInventoryList", productInventoryList);
			mav.addObject("cityConnectionList", cityConnectionList);
			
			return mav;
		}else {
			return new ModelAndView("login/customerLogin");
		}
	}
	
	
	@RequestMapping(value = "/SupplierLogin", method = RequestMethod.GET)
	public ModelAndView getSupplierLoginPage() {
		
		return new ModelAndView("login/supplierLogin");
		
	}
	
	@RequestMapping(value = "/SupplierLogin", method = RequestMethod.POST)
	public ModelAndView postSupplierHomePage(LoginInformation loginInformation) {
		
		String role = loginInformation.getRole();
		String email = loginInformation.getEmail();
		String password = loginInformation.getPassword();
		String url = "http://localhost:8084/SupplierSpringBootLogin/";
		
		if (role.equalsIgnoreCase("admin")) {
			
			url = url + "adminLogin/" + email;
			System.out.println(url);
			
			Admin admin = restTemplate.getForObject(url, Admin.class);
			
			if (password.equals(admin.getPassword())) {
				return new ModelAndView("supplier/admin/adminHomePage");
			}else {
				return new ModelAndView("login/supplierLogin");
			}
			
			
		} else if (role.equalsIgnoreCase("manager")) {
			
			url = url + "managerLogin/" + email;
			
			Manager manager = restTemplate.getForObject(url, Manager.class);
			
			if (password.equals(manager.getPassword())) {
				
				return new ModelAndView("supplier/manager/managerHomePage");
			} else {
				return new ModelAndView("login/supplierLogin");
			}
			
			
		} else {
			
			url = url + "plantManagerLogin/" + email;
			
			Plantmanager plantManager = restTemplate.getForObject(url, Plantmanager.class);
			
			if (password.equals(plantManager.getPassword())) {
				return new ModelAndView("supplier/plantManager/plantManagerHomePage");		
			}else {
				return new ModelAndView("login/supplierLogin");
			}
		}		
	}
	
	
	
	@RequestMapping(value = "/ManufactureLogin", method = RequestMethod.GET)
	public ModelAndView getManufactureLoginPage() {
		
		return new ModelAndView("login/manufactureLogin");
		
	}
	
	@RequestMapping(value = "/ManufactureLogin", method = RequestMethod.POST)
	public ModelAndView postManufactureHomePage(LoginInformation loginInformation) {
		
		String role = loginInformation.getRole();
		System.out.println(role);
		
		if (role.equalsIgnoreCase("admin")) {
			
			return new ModelAndView("manufacture/admin/adminHomePage");
			
		} else if (role.equalsIgnoreCase("procurementManager")) {
			
			return new ModelAndView("manufacture/procurementManager/procurementManagerHomePage");
		
		}else if (role.equalsIgnoreCase("productionManager")) {
			
			return new ModelAndView("manufacture/productionManager/productionManagerHomePage");
			
		}
			
		return new ModelAndView("manufacture/supplyManager/supplyManagerHomePage");			
	}
	
	
	
	@RequestMapping(value = "/DistributorLogin", method = RequestMethod.GET)
	public ModelAndView getDistributorLoginPage() {
		
		return new ModelAndView("login/distributorLogin");
		
	}
	
	
	
	@RequestMapping(value = "/DistributorLogin", method = RequestMethod.POST)
	public ModelAndView postDistributorHomePage(LoginInformation loginInformation) {
		
		String role = loginInformation.getRole();
		System.out.println(role);
		
		if (role.equalsIgnoreCase("admin")) {
			
			return new ModelAndView("distributor/admin/adminHomePage");
			
		} 
			
		return new ModelAndView("distributor/distributorManager/distributorManagerHomePage");	
	}
	
	@RequestMapping(value = "/BackToIndex", method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		
		return new ModelAndView("index");
		
	}
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public ModelAndView getLogoutPage() {
		
		return new ModelAndView("index");
		
	}
	
}
