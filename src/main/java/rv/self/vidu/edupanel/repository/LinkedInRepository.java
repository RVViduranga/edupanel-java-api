package rv.self.vidu.edupanel.repository;

import rv.self.vidu.edupanel.entity.LinkedIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LinkedInRepository extends JpaRepository<LinkedIn, Integer> {

}
