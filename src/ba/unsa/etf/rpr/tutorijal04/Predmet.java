package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;

public class Predmet{
    private ArrayList<Student> studentiNaPredmetu;

    Predmet(){}
    Predmet(ArrayList<Student> niz){
        setStudentiNaPredmetu(niz);
    }
    public ArrayList<Student> getStudentiNaPredmetu() {
        return studentiNaPredmetu;
    }

    public void setStudentiNaPredmetu(ArrayList<Student> studentiNaPredmetu) {
        this.studentiNaPredmetu = studentiNaPredmetu;
    }
}
