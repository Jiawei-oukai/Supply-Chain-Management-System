package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Object>{
	
	List<Customer> findAll();
	
	Optional<Customer> findByEmailAddress(String email);
}
