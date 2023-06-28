package neu.edu.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import neu.edu.entity.Customer;
import neu.edu.entity.Order;
import neu.edu.service.CustomerService;
import neu.edu.service.OrderService;


@RestController
@RequestMapping("/CustomerSpringBoot")
public class CustomerController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/view")
	public List<Order> viewAllOrder(){

		return orderService.viewAllOrder();
	}
	
	@GetMapping("/view/{id}")
	public @ResponseBody Order viewAllOrderById(@PathVariable Integer id){
		
		return orderService.viewAllOrderById(id);
	
	}
	
	@GetMapping("/findCustomer/{email}")
	public @ResponseBody Customer findCustomerByEmail(@PathVariable String email){
		
		return customerService.findCustomerByEmail(email);	
	}
}