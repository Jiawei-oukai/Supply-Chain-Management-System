package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Allorder;

public interface CompanyOrderRepository extends JpaRepository<Allorder, Object>{
	
	List<Allorder> findByCompanyName(String companyName);
}
