package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Plantmanager;
import neu.edu.repository.PlantManagerRepository;

@Service
public class PlantManagerService {

	@Autowired
	private PlantManagerRepository plantManagerRepository;
	
public List<Plantmanager> viewAllPlantManager(){
		
		return (List<Plantmanager>) plantManagerRepository.findAll();
	}
	
	public Plantmanager viewPlantManagerById(Integer id){

		return plantManagerRepository.findByIdPlantManager(id).get();
	}
	
	public Plantmanager viewPlantManagerByEmail(String email){

		return plantManagerRepository.findByEmailAddress(email).get();
	}
}

