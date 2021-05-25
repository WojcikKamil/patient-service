package pl.wsiz.iid3.healthcenter.service;

import org.springframework.stereotype.Service;
import pl.wsiz.iid3.healthcenter.dto.Lek;

@Service
public class LekService {
    private Lek[] leki = {
            new Lek("Ibuprom", "Sanofi"),
            new Lek("Szczepionka", "Pfizer"),
            new Lek("Paracetamol", "Polfa")};

    public Lek findLek(String nazwa){
        for(Lek lek: leki){
            if (lek.getNazwa().equals(nazwa)) {
                return lek;
            }
        }
        return new Lek(nazwa);
    }

    public String getAllLek() {
        String allMedicine = "Lek\tProducent\n";
        for (Lek lek: leki) {
            allMedicine = allMedicine+lek.getNazwa()+"\t"+lek.getProducent()+"\n";
        }
        return allMedicine;
    }
}
