package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Company;


public interface CompanyRepository extends JpaRepository<Company, Object>{
	
	List<Company> findAll();
	Optional<Company> findByIdCompany(Integer id);

}
