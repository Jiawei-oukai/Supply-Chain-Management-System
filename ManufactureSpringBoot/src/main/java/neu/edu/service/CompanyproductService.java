package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Companyproduct;
import neu.edu.entity.Materialinventory;
import neu.edu.repository.CompanyproductRepository;

@Service
public class CompanyproductService {
	
	@Autowired
	private CompanyproductRepository companyproductRepository;
	
	public List<Companyproduct> viewByCompany(String companyName){
		return companyproductRepository.findByCompanyName(companyName);
	}
}
