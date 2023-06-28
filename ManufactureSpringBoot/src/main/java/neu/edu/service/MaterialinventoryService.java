package neu.edu.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Materialinventory;
import neu.edu.repository.MaterialinventoryRepository;

@Service
public class MaterialinventoryService {

	@Autowired
	private MaterialinventoryRepository materialinventoryRepository;
	
	public List<Materialinventory> viewByCompany(String companyName){
		return materialinventoryRepository.findByCompanyName(companyName);
	}
}
