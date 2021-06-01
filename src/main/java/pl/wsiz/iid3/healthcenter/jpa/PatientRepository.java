package pl.wsiz.iid3.healthcenter.jpa;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid3.healthcenter.entity.PatientEntity;

public interface PatientRepository extends CrudRepository<PatientEntity, Long>{
    List<PatientEntity> findAllByLastName(String lastName);
}
