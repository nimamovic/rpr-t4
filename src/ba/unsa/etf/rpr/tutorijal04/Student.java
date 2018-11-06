package ba.unsa.etf.rpr.tutorijal04;

public class Student {
    private String ime, prezime;
    private int brIndexa, godina;

    public Student(){}

    public Student(String i, String p, int indeks, int g) {
        setIme(i);
        setPrezime(p);
        setBrIndexa(indeks);
        setGodina(g);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }
}
