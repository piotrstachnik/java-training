package KursUdemy;

public class PorownywanieStringow {
    public static void main(String[] args) {
//        Co to jest String - jest to klasa wbudowa w Jave i jest jedna z najczęściej wykorzystywanych klas.
//        1. Porównajmy dwa Stringi (ciagi znaków)

        String Imie_1 = "Emilia";
        String Imie_2 = "Emilia";

        if (Imie_1 == Imie_2)
            System.out.println("Są sobie równe - CZY TO JEST PRAWDA ???");
        else
            System.out.println("Nie są sobie równe - CZY TO JEST PRAWDA ???");
    }
}







//        To zależy, gdyby imiona zostały przesłane z zewnątrz to NIE, natomiast gdy wpisujemy ręcznie to TAK:
//        Jeśli przypisujemy wartości ręcznie i jeśli te dwa osobne ciągi znaków tzw. literały są do siebie podobne
//        to Java trzyma je w tym samy miejscu w pamieci tzw. optymalizacja. Jeśli porównujemy w powyższy sposób typy
//        refencyjne (jest określenie profesjonalne) (Imie_1 z Imie_2) to porównujemy ich adresy.
//        A zatem w powyższym przypadku te dwa imiona są sobie równe bo taka optymalizacja tu zaszła.
//        W przypadku braku otymalizacji byłby problem. Zatem w każdym przypadku należy używać metody "equals".

//        2. Porównywanie za pomocą metody "equals" - względy bezpieczeństwa
//
//        a.brak optymalizacji
//        String Imie_1 = new String("Emilia"); // brak optymalizacji, stwórz Stringa pod nowym adresem
//        String Imie_2 = "Emilia";
//
//        if (Imie_1 == Imie_2) // Błąd - wartości są te same, tylko adresy są różne (miejsca w pamięci)
//            System.out.println("Są sobie równe");
//        else
//            System.out.println("Nie są sobie równe");
//
//            System.out.println(); // spacja
//
//        if (Imie_1.equals(Imie_2))
//            System.out.println("Są sobie równe");
//        else
//            System.out.println("Nie są sobie równe");
//    }
//}
//
//        Inne metoda zastosowania.

//        Przykład A
//
//        Pracownicy abc = new Pracownicy(); //stowrzenie obiektu typu Pracownik o nazwie 'abc'
//        Pracownicy xyz = new Pracownicy();//stworzenie innego, kolejnego obiektu typu Pracownicy o nazwie 'xyz'
//
//        String Abc = abc.imiePracownika = "Emilia";
//        String Xyz = xyz.imiePracownika = "Emilia";
//
////        if (Abc == Xyz) // Błąd !!!
//        if (Abc.equals(Xyz))
//            System.out.println("Są sobie równe");
//        else
//            System.out.println("Nie sobie są równe");
//    }
//}
//class Pracownicy {
//
//    String imiePracownika;
//}
//      Przykład B

//        Pracownicy imiona[] = new Pracownicy[2];
//        imiona[0] = new Pracownicy("Emilia");
//        imiona[1] = new Pracownicy("Emilia");
//
//        String Abcde = imiona[0].getImiePracownika();
//        String Fghij = imiona[1].getImiePracownika();
//
////        if (Abcde == Fghij) // Błąd !!!
//        if (Abcde.equals(Fghij))
//            System.out.println("Są sobie równe");
//        else
//            System.out.println("Nie sobie są równe");
//    }
//}

//class Pracownicy {
//
//    String imiePracownika;
//
//    public String getImiePracownika() {
//        return imiePracownika;
//    }
//
//    public Pracownicy(String imiePracownika) {
//        this.imiePracownika = imiePracownika;
//    }
//}