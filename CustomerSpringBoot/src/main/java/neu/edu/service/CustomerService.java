package neu.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Customer;
import neu.edu.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer findCustomerByEmail(String email) {
		
		return customerRepository.findByEmailAddress(email).get();
	}
}
