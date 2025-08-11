package rv.self.vidu.edupanel.repository;

import rv.self.vidu.edupanel.entity.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PictureRepository extends JpaRepository<Picture, Integer> {

}
