package ba.unsa.etf.rpr.tutorijal04;

public class ObavezniPredmet extends Predmet{

    private String imePredmeta;
    private int  ECTSBodovi;

    ObavezniPredmet(){}

    ObavezniPredmet(String ime, int bodovi){
        setImePredmeta(ime);
        setECTSBodovi(bodovi);
    }
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
}
