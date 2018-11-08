package ba.unsa.etf.rpr.tutorijal04;

import java.util.Map;
import java.util.Set;

public class PlanStudija {
    private String nazivPlanaStudija;
    private Map<Semestar, Set<Predmet>> spisakPredmeta;

    public String getNazivPlanaStudija() {
        return nazivPlanaStudija;
    }

    public void setNazivPlanaStudija(String nazivPlanaStudija) {
        this.nazivPlanaStudija = nazivPlanaStudija;
    }

    public Map<Semestar, Set<Predmet>> getSpisakPredmeta() {
        return spisakPredmeta;
    }

    public void setSpisakPredmeta(Map<Semestar, Set<Predmet>> spisakPredmeta) {
        this.spisakPredmeta = spisakPredmeta;
    }
}
