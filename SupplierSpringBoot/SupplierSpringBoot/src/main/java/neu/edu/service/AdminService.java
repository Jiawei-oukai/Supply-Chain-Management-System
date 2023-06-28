package neu.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import neu.edu.entity.Admin;
import neu.edu.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public List<Admin> viewAllAdmin(){
		
		return (List<Admin>) adminRepository.findAll();
	}
	
	public Admin viewAllAdminById(Integer id){

		return adminRepository.findByIdAdmin(id).get();
	}
	
	public Admin viewAdminByEmailAddress(String email) {
		
		return adminRepository.findByEmailAddress(email).get();
	}

}
