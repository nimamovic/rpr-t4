package ba.unsa.etf.rpr.tutorijal04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Upis> upisani = new ArrayList<Upis>();
        Scanner ulaz = new Scanner(System.in);
        int i = 1;
        //Upisuje se maximum studenata a to je npr 20
        do {
            Upis upis = new Upis();
            Student s = new Student();
            System.out.println("Unesite podatke o studentu: ");
            System.out.println("Unesite ime studenta: ");
            String ime = ulaz.nextLine();
            s.setIme(ime);
            System.out.println("Unesite prezime studenta: ");
            String prezime = ulaz.nextLine();
            s.setPrezime(prezime);
            System.out.println("Unesite broj indeksa: ");
            int brojIndeksa = ulaz.nextInt();
            s.setBrIndexa(brojIndeksa);
            System.out.println("Unesite godinu studija : ");
            int godina = ulaz.nextInt();
            s.setGodina(godina);
            upis.setStudent(s);

            System.out.println("Unesite plan studija : ");
            String ps = ulaz.nextLine();
            PlanStudija planSt = new PlanStudija();
            planSt.setNazivPlanaStudija(ps);
            upis.setPlanStudija(planSt);

            System.out.println("Unesite predmete (-1 za kraj liste) : ");
            ArrayList<Predmet> listaPredmeta = new ArrayList<>();
            while (true) {
                String pom = ulaz.nextLine();
                if (pom == "-1") break;
                Predmet p = new Predmet();
                p.setImePredmeta(pom);
                System.out.println("Da li je obavezan predmet (1 za DA, 0 za NE) : ");
                p.setObavezan(ulaz.nextBoolean());
                listaPredmeta.add(p);
            }
            upis.setPredmeti(listaPredmeta);
            i++;
            upisani.add(upis);
        } while (i != 20);

    }
}
