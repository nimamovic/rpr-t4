package ba.unsa.etf.rpr.tutorijal04;

import ba.unsa.etf.rpr.tutorijal04.Predmet;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {
    @Test
    void getImePredmeta() {
        Predmet p = new Predmet();
        p.setImePredmeta("Osnove elektrotehnike")
        assertEquals("Osnove elektrotehnike", p.getImePredmeta();
    }


    @Test
    void getECTSBodovi() {
        Predmet p = new Predmet();
        p.setECTSBodovi(7)
        assertEquals(7, p.getECTSBodovi());
    }


    @Test
    void isObavezan() {
        Predmet p = new Predmet();
        p.setObavezan(true)
        assertEquals(true, isObavezan());
    }

}