package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Materialinventory;

public interface MaterialinventoryRepository extends JpaRepository<Materialinventory, Object>{
	
	List<Materialinventory> findByCompanyName(String companyName);

}
