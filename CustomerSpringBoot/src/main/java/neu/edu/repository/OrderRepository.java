package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Object>{
	
	List<Order> findAll();
	
	Optional<Order> findByIdOrder(Integer id);

}
