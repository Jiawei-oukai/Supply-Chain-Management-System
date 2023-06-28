package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Materialinventory;
import neu.edu.repository.CompanyInventoryRepository;

@Service
public class CompanyInventoryService {
	
	@Autowired
	private CompanyInventoryRepository companyInventoryRepository;
	
	public List<Materialinventory> viewCompanyInventory(String companyName){
		
		return (List<Materialinventory>) companyInventoryRepository.findByCompanyName(companyName);
	}
	
	public List<Materialinventory> viewAllInventory(){
		
		return (List<Materialinventory>) companyInventoryRepository.findAll();
	}

}
