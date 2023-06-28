package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Manager;
import neu.edu.entity.Plantmanager;

public interface PlantManagerRepository extends JpaRepository<Plantmanager, Object>{
	
	List<Plantmanager> findAll();
	Optional<Plantmanager> findByIdPlantManager(Integer id);
	Optional<Plantmanager> findByEmailAddress(String email);

}
