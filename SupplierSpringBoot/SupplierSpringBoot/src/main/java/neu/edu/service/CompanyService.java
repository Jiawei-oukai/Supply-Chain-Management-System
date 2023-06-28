package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Company;
import neu.edu.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
    public List<Company> viewAllCompany(){
		
		return (List<Company>) companyRepository.findAll();
	}
	
	public Company viewCompanyById(Integer id){

		return companyRepository.findByIdCompany(id).get();
	}
	
	
	
}
