package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Admin;
import neu.edu.entity.Distributormanager;
import neu.edu.repository.DistributorManagerRepository;

@Service
public class DistributorService {
	
	@Autowired
	private DistributorManagerRepository distributorManagerRepository;
	
public List<Distributormanager> viewAllManager(){
		
		return (List<Distributormanager>) distributorManagerRepository.findAll();
	}
	
	public Distributormanager viewManagerById(Integer id){

		return distributorManagerRepository.findByIdDistributorManager(id).get();
	}
	
	public Distributormanager viewManagerByEmail(String email){

		return distributorManagerRepository.findByEmailAddress(email).get();
	}


}
