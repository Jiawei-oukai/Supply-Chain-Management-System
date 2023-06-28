package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Procurementmanager;

public interface ProcurementManagerRepository extends JpaRepository<Procurementmanager, Object>{
	
	List<Procurementmanager> findAll();
	Optional<Procurementmanager> findByIdProcurementManager(Integer id);
	Optional<Procurementmanager> findByEmailAddress(String email);

}
