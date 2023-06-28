package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Companyproduct;

public interface CompanyproductRepository extends JpaRepository<Companyproduct, Object> {
	
	List<Companyproduct> findByCompanyName(String companyName);

}
