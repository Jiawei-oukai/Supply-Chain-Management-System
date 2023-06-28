package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Companyproduct;
import neu.edu.entity.Distributororder;

public interface DistributororderRepository extends JpaRepository<Distributororder, Object>{
	
	List<Distributororder> findByCompanyName(String companyName);

}
