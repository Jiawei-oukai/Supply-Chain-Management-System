package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Materialorder;
import neu.edu.repository.MaterialorderRepository;

@Service
public class MaterialorderService {

	@Autowired 
	private MaterialorderRepository materialorderRepository;
	
	public List<Materialorder> viewOrderByCompanyName(String comanyName){
		return materialorderRepository.findByCompanyName(comanyName);
	}
}
