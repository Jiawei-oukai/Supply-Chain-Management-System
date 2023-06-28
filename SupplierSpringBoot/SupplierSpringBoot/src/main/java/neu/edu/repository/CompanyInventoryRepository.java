package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Materialinventory;

public interface CompanyInventoryRepository extends JpaRepository<Materialinventory, Object>{

	List<Materialinventory> findAll();
	List<Materialinventory> findByCompanyName(String companyName);
}
