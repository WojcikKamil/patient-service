package pl.wsiz.iid3.healthcenter.service;

import pl.wsiz.iid3.healthcenter.dto.Pacjent;

public class PatientService {
    private Pacjent[] pacjenci = {
            new Pacjent("Janusz","Januszewski", "Rzeszów","555555555","98010111111"),
            new Pacjent("Andrzej","Andrzejewicz", "Lublin","666666666","9801022222"),
            new Pacjent("Grażyna","Graziowska", "Sanok","777777777","98010133333")};

    public String getAllPatient() {
        String allPatient = "Pacjent:\t\n";
        for (Pacjent pacjent: pacjenci) {
            allPatient = allPatient+pacjent.getImie()+"\t"+pacjent.getNazwisko()+"\t"+pacjent.getMiejscowosc()+"\t"+pacjent.getNrTelefonu()+"\t"+pacjent.getPesel()+"\n";
        }
        return allPatient;
    }
}
