package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Manager;
import neu.edu.repository.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository managerRepository;
	
	public List<Manager> viewAllManager(){
		
		return (List<Manager>) managerRepository.findAll();
	}
	
	public Manager viewManagerById(Integer id){

		return managerRepository.findByIdManager(id).get();
	}
	
	public Manager viewManagerByEmail(String email){

		return managerRepository.findByEmailAddress(email).get();
	}
}
