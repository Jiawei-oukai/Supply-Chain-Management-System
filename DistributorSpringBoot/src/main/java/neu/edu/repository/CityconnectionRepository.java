package neu.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Cityconnection;

import java.util.List;

public interface CityconnectionRepository extends JpaRepository<Cityconnection, Object>{
	
	List<Cityconnection> findAll();
}
