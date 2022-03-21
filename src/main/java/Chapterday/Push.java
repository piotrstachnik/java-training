package Chapterday;

import java.time.LocalDate;

public class Push {

    int iloscZnakow;
    String login;
    String tresc;
    boolean paratmetr;
    int idObrazka;
    String link;
    LocalDate dataWaznosci;
    int priorytet;
    String sourceSap;
    int stopienPersonalizacji;

    // konstruktor - budowniczy Push

    public Push() {
    }

    public Push(int iloscZnakow, String login, String tresc, boolean paratmetr, int idObrazka, String link, LocalDate dataWaznosci, int priorytet, String sourceSap, int stopienPersonalizacji) {
        this.iloscZnakow = iloscZnakow;
        this.login = login;
        this.tresc = tresc;
        this.paratmetr = paratmetr;
        this.idObrazka = idObrazka;
        this.link = link;
        this.dataWaznosci = dataWaznosci;
        this.priorytet = priorytet;
        this.sourceSap = sourceSap;
        this.stopienPersonalizacji = stopienPersonalizacji;
    }
}

//wyruwnanie lini Ctr + Alt + l