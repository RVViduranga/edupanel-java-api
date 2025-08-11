package rv.self.vidu.edupanel.repository;

import rv.self.vidu.edupanel.repository.QueryRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class QueryRepositoryImpl implements QueryRepository {

    @PersistenceContext
    private EntityManager em;

}
