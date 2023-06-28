package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Object>{
	
	List<Admin> findAll();
	
	Optional<Admin> findByIdAdmin(Integer id);
	
	Optional<Admin> findByEmailAddress(String email);
}
