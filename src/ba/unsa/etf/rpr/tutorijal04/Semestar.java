package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Semestar {
    private int semestar;
    private int ukupniECTS;
    private ArrayList<Predmet> predmetiSemestra;

    public int getSemestar() {
        return semestar;
    }

    public void setSemestar(int semestar) {
        this.semestar = semestar;
    }

    public int getUkupniECTS() {
        return ukupniECTS;
    }

    public void setUkupniECTS(int ukupniECTS) {
        this.ukupniECTS = ukupniECTS;
    }

    public ArrayList<Predmet> getPredmetiSemestra() {
        return predmetiSemestra;
    }

    public void setPredmetiSemestra(ArrayList<Predmet> predmetiSemestra) {
        this.predmetiSemestra = predmetiSemestra;
    }
}
