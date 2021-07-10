package pl.wsiz.iid3.healthcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid3.healthcenter.dto.Lek;
import pl.wsiz.iid3.healthcenter.entity.LekEntity;
import pl.wsiz.iid3.healthcenter.jpa.LekRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class LekService {
    @Autowired
    private LekRepository lekRepository;

    public List<Lek> getAllMedicine() {
        List<Lek> lista = new ArrayList<>();
        for (LekEntity lek : lekRepository.findAll()) {
            lista.add(new Lek(lek.getNazwa(), lek.getCena(), lek.getProducent()));
        }
        return lista;
    }

    public String findMedicineByName(String nazwa){
        List<LekEntity> r = lekRepository.findByNazwa(nazwa);
        return r.toString();
    }
    public String findMedicineByProducent(String producent){
        List<LekEntity> rr = lekRepository.findByProducent(producent);
        return rr.toString();
    }

    public List<Lek> getAllMedByName(String nazwa) {
        List<Lek> lista = new ArrayList<>();
        for (LekEntity lek : lekRepository.findByNazwa(nazwa)) {
            lista.add(new Lek(lek.getNazwa(), lek.getCena(), lek.getProducent()));
        }
        return lista;
    }

    public List<Lek> getAllMedByProducent(String producent) {
        List<Lek> lista = new ArrayList<>();
        for (LekEntity lek : lekRepository.findByProducent(producent)) {
            lista.add(new Lek(lek.getNazwa(), lek.getCena(), lek.getProducent()));
        }
        return lista;
    }
}
