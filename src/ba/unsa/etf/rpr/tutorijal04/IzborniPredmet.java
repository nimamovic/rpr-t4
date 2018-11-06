package ba.unsa.etf.rpr.tutorijal04;

public class IzborniPredmet extends Predmet{

    private String imePredmeta;
    private int ECTSBodovi;

    IzborniPredmet(){}

    IzborniPredmet(String ime, int bodovi){
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
