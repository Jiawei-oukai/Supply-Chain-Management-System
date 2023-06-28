package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Productinventory;
import neu.edu.repository.ProductInventoryRepository;

@Service
public class ProductInventoryService {
	
	@Autowired
	private ProductInventoryRepository productInventoryRepository;
	
	public List<Productinventory> viewAllProductInventory(){
		
		return (List<Productinventory>) productInventoryRepository.findAll();
	}
	
	public List<Productinventory> viewProductInventoryByCompanyName(String companyName){
		
		return (List<Productinventory>) productInventoryRepository.findByCompanyName(companyName);
	}
}
