package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Productinventory;

public interface ProductInventoryRepository extends JpaRepository<Productinventory, Object>{
	
	List<Productinventory> findAll();
	
	List<Productinventory> findByCompanyName(String companyName);
}
