package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Distributororder;
import neu.edu.repository.DistributororderRepository;

@Service
public class DistributororderService {

	@Autowired
	private DistributororderRepository distributororderRepository;
	
	public List<Distributororder> viewByCompany(String companyName){
		return distributororderRepository.findByCompanyName(companyName);
	}
	
	
}
