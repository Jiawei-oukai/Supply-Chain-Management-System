package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Allorder;
import neu.edu.repository.CompanyOrderRepository;

@Service
public class CompanyOrderService {

	@Autowired
	private CompanyOrderRepository companyOrderRepository;
	
	public List<Allorder> viewCompanyOrder(String companyName){
		
		return (List<Allorder>) companyOrderRepository.findByCompanyName(companyName);
	}
}
