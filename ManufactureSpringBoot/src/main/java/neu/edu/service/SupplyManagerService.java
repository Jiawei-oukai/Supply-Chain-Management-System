package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Supplymanager;
import neu.edu.repository.SupplyManagerRepository;

@Service
public class SupplyManagerService {

	@Autowired
	private SupplyManagerRepository supplyManagerRepository;
	
	public List<Supplymanager> viewSupplyManager(){
		
		return (List<Supplymanager>) supplyManagerRepository.findAll();
	}
	
	public Supplymanager viewSupplyManagerById(Integer id) {
		
		return supplyManagerRepository.findByIdSupplyManager(id).get();
	}
	
	public Supplymanager viewSupplyManagerByEmailAddress(String email) {
		
		return supplyManagerRepository.findByEmailAddress(email).get();
	}
}
