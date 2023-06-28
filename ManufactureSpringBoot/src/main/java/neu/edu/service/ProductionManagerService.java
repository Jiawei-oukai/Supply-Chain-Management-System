package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Productionmanager;
import neu.edu.repository.ProductionManagerRepository;



@Service
public class ProductionManagerService {
	
	@Autowired
	private ProductionManagerRepository productionManagerRepository;
	
    public List<Productionmanager> viewProductionManager(){
		
		return (List<Productionmanager>) productionManagerRepository.findAll();
	}
	
	public Productionmanager viewProductionManagerById(Integer id) {
		
		return productionManagerRepository.findByIdProductionManager(id).get();
	}
	
    public Productionmanager viewProductionManagerByEmailAddress(String email) {
		
		return productionManagerRepository.findByEmailAddress(email).get();
	}

}
