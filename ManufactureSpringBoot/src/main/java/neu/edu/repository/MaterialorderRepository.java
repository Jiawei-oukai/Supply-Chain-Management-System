package neu.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import neu.edu.entity.Materialorder;

public interface MaterialorderRepository extends JpaRepository<Materialorder, Object>{
	
	List<Materialorder> findByCompanyName(String name);

}
