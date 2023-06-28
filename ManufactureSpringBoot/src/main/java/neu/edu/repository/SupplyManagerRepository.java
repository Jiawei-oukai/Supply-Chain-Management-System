package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Supplymanager;

public interface SupplyManagerRepository extends JpaRepository<Supplymanager, Object>{
	
	List<Supplymanager> findAll();
	Optional<Supplymanager> findByIdSupplyManager(Integer id);
	Optional<Supplymanager> findByEmailAddress(String email);

}
