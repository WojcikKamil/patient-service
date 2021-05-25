package pl.wsiz.iid3.healthcenter.dto;

import java.util.List;

public class Pacjent extends Osoba{
    private int ID;
    private Osoba lekarzRodzinny;
    private List<Recepta> recepty;
    private List<Lek> leki;
    private List<Badanie> badania;
    private List<Skierowanie> skierowania;

    public Pacjent(String pesel){
        super (pesel);
    }

    public Pacjent(String imie, String nazwisko, String pesel){
        super(imie, nazwisko, pesel);
    }

    public Pacjent(String imie, String nazwisko, String miejscowosc, String nrTelefonu, String pesel) {
        super(imie, nazwisko, miejscowosc, nrTelefonu, pesel);
    }
}
