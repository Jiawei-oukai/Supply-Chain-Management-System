package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Order;
import neu.edu.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> viewAllOrder(){
		
		return (List<Order>) orderRepository.findAll();
	}
	
	public Order viewAllOrderById(Integer id){

		return orderRepository.findByIdOrder(id).get();
	}

}
