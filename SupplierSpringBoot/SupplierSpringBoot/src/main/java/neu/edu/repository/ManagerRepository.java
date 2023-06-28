package neu.edu.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Admin;
import neu.edu.entity.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Object>{
	
	List<Manager> findAll();
	Optional<Manager> findByIdManager(Integer id);
	Optional<Manager> findByEmailAddress(String email);
}
