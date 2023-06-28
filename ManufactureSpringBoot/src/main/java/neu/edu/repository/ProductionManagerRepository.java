package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Productionmanager;

public interface ProductionManagerRepository extends JpaRepository<Productionmanager, Object>{
	
	List<Productionmanager> findAll();
	Optional<Productionmanager> findByIdProductionManager(Integer id);
	Optional<Productionmanager> findByEmailAddress(String email);

}
