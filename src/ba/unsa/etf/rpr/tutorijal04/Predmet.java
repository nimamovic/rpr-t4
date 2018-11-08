package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Predmet{
    private ArrayList<Student> studentiNaPredmetu;
    private String imePredmeta;
    private int ECTSBodovi;
    private boolean obavezan;

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getECTSBodovi() {
        return ECTSBodovi;
    }

    public void setECTSBodovi(int ECTSBodovi) {
        this.ECTSBodovi = ECTSBodovi;
    }

    public boolean isObavezan() {
        return obavezan;
    }

    public void setObavezan(boolean obavezan) {
        this.obavezan = obavezan;
    }

    Predmet(){}
    Predmet(ArrayList<Student> niz){
        setStudentiNaPredmetu(niz);
    }

    public Student upisiStudenta(String s){
        return 0;
    }
    public ArrayList<Student> getStudentiNaPredmetu() {
        return studentiNaPredmetu;
    }

    public void setStudentiNaPredmetu(ArrayList<Student> studentiNaPredmetu) {
        this.studentiNaPredmetu = studentiNaPredmetu;
    }
}
