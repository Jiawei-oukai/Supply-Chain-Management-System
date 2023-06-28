package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Procurementmanager;
import neu.edu.repository.ProcurementManagerRepository;

@Service
public class ProcurementManagerService {

	
	@Autowired
	private ProcurementManagerRepository procurementManagerRepository;
	
	public List<Procurementmanager> viewProcurementManager(){
		
		return (List<Procurementmanager>) procurementManagerRepository.findAll();
	}
	
	public Procurementmanager viewProcurementManagerById(Integer id) {
		
		return procurementManagerRepository.findByIdProcurementManager(id).get();
	}
	
	public Procurementmanager viewProcurementManagerByEmail(String eamil) {
		
		return procurementManagerRepository.findByEmailAddress(eamil).get();
	}
}
