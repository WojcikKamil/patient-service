package pl.wsiz.iid3.healthcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid3.healthcenter.dto.Pacjent;
import pl.wsiz.iid3.healthcenter.entity.PatientEntity;
import pl.wsiz.iid3.healthcenter.jpa.PatientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Pacjent findbyId (Long id) {
        Optional<PatientEntity> res = patientRepository.findById(id);
        if (res.isPresent()) {
            PatientEntity pat = res.get();
            return new Pacjent(pat.getFirstName(), pat.getLastName(), pat.getPesel(), pat.getMiejscowosc());
        }
        return new Pacjent("None", "None");
    }

    public List<PatientEntity> findByLastName(String name){
        List<PatientEntity> rs = patientRepository.findAllByLastName(name);
        return rs;
    }

    public List<PatientEntity> findByFirstName(String name){
        List<PatientEntity> rs = patientRepository.findAllByFirstName(name);
        return rs;
    }

    public List<PatientEntity> findByPesel(String pesel){
        List<PatientEntity> rs = patientRepository.findByPesel(pesel);
        return rs;
    }

    public List<PatientEntity> findAll() {
        List<PatientEntity> rs = patientRepository.findAll();
        return rs;
    }
    /*private Pacjent[] pacjenci = {
            new Pacjent("Janusz","Januszewski", "Rzeszów","555555555","98010111111"),
            new Pacjent("Andrzej","Andrzejewicz", "Lublin","666666666","9801022222"),
            new Pacjent("Grażyna","Graziowska", "Sanok","777777777","98010133333")};

    public String getAllPatient() {
        String allPatient = "Pacjent:\t\n";
        for (Pacjent pacjent: pacjenci) {
            allPatient = allPatient+pacjent.getImie()+"\t"+pacjent.getNazwisko()+"\t"+pacjent.getMiejscowosc()+"\t"+pacjent.getNrTelefonu()+"\t"+pacjent.getPesel()+"\n";
        }
        return allPatient;
    }*/
}
