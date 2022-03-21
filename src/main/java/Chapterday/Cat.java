package Chapterday;

public class Cat {

    String imie;
    double rozmiar;
    int masa;
    Boolean czyWButach;
    int agresywnosc;
    boolean glodny;

    // konstruktor - budowniczy kota

    public Cat() {
    }

    public Cat(String imie, double rozmiar, int masa, Boolean czyWButach, int agresywnosc) {
        this.imie = imie;
        this.rozmiar = rozmiar;
        this.masa = masa;
        this.czyWButach = czyWButach;
        this.agresywnosc = agresywnosc;
    }


    void miaucz() {
        System.out.println(dajGlos());
    }

    String dajGlos() {
        return "Miauu!";
    }

    String zapiszImie() {
        String mojeImie = "";
        for (int i = 0; i < imie.length(); i++) {
            mojeImie += "ą";
            miaucz();
        }
        return mojeImie;
    }

    void miaucz(boolean znaczaco) {
        if (znaczaco) {
            System.out.println("Miaaauuuuuu!");
            glodny = true;
            return;
        }
        miaucz();
    }

    void przedstawSie() {
        for (int i = 0; i < imie.length(); i++) {
            miaucz(i % 2 == 0);
        }
    }

    int policzMyszy(int iloscMyszy) {
        for (int i = 0; i < iloscMyszy; i++) {
            miaucz();
        }
        glodny = false;
        return 0;
    }
}