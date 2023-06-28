package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Cityconnection;
import neu.edu.repository.CityconnectionRepository;

@Service
public class CityconnectionService {

	@Autowired
	private CityconnectionRepository cityconnectionRepository;
	
	public List<Cityconnection> viewAllConnection(){
		
		return (List<Cityconnection>) cityconnectionRepository.findAll();
	}
}
