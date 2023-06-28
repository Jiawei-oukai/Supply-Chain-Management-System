package neu.edu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import neu.edu.model.CustomerRegistration;




@Controller
public class RegisterController {

	@RequestMapping(value = "/CustomerRegister", method = RequestMethod.GET)
	public ModelAndView getCustomerLoginPage() {
		
		return new ModelAndView("register/customerRegister");		
	}
	
	@RequestMapping(value = "/BackToCustomerLogin", method = RequestMethod.GET)
	public ModelAndView getBackCustomerLoginPage() {
		
		return new ModelAndView("login/customerLogin");		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView postRegistrationPage(@Valid @ModelAttribute("customerRegistration") CustomerRegistration customerRegistration,
			BindingResult bindingResult, 
			Model model) {
		
		String error = "";


		if (bindingResult.hasErrors()) {

			for (FieldError fieldError : bindingResult.getFieldErrors()) {
				System.out.println(fieldError.getField() + "::" + fieldError.getDefaultMessage());
				error += fieldError.getField() + " : " + fieldError.getDefaultMessage() + "<br/>";

			}

			System.out.println("Has errors");
			model.addAttribute("error", error);
			return new ModelAndView("register/customerRegister");

		} else {

			System.out.println("NO ERRORS");
		}
		return new ModelAndView("customer/customerHomePage");
	}
	
}
