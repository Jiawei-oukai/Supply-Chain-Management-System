package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Admin;
import neu.edu.entity.Distributormanager;

public interface DistributorManagerRepository extends JpaRepository<Distributormanager, Object>{

	List<Distributormanager> findAll();
	Optional<Distributormanager> findByIdDistributorManager(Integer id);	
	Optional<Distributormanager> findByEmailAddress(String email);
}
