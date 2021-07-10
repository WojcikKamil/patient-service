package pl.wsiz.iid3.healthcenter.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid3.healthcenter.entity.LekEntity;

import java.util.List;

public interface LekRepository extends CrudRepository<LekEntity, Long> {
    List<LekEntity> findByNazwa(String nazwa);
    List<LekEntity> findByProducent(String producent);
    List<LekEntity> findAll();
}
