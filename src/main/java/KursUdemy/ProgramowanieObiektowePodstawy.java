package KursUdemy;

public class ProgramowanieObiektowePodstawy {
    public static void main(String[] args) {
//          Main - funkcja głowna, czyli taka, która wykonuje się jako pierwsza po odpaleniu przycisku "zielona strzałka"
//          Statis - statyczne, dostępne zawsze.
//          Void - funkcja wykonująca.
//          Public - czyli distępny dla każdego.

//          Obiekty - pojemniki do przechowywania zmiennych i funkcji tematycznie powiązanych ze sobą,
//          do dalszego pownownego uzycia.
//          W programowaniu obiektowym chcemy mieć wszytko ładnie poukładane i wtedy łatwo się do wszystkiego
//          dostać.

//          Obiekt to każdy element, który tworzysz i który moze zostać opisany - jego właściwości
//          Obiekty mają właściwości - Properties (wysokość, szerokość, waga, kolor itp.)
//
//          Metody - funkcje - to coś co obiekt moze wykonywać, metoda na wykonanie czegoś (np. włącz, wyłącz, nadaj, zmień)
//
//          Klasy - foremki do tworzenia egzemlarzy obiektów(instancji) tematycznie ze sobą powiązanych

        Pracownik abc = new Pracownik(); //stowrzenie obiektu typu Pracownik o nazwie 'abc'
        Pracownik xyz = new Pracownik(); //stowrzenie innego, kolejnego obiektu typu Pracownik o nazwie 'xyz'
//        to są 2 różne egzemplarze, instancje !!!

        //odwoałnie do właściwości klasy pracownik
        String ImiePierwszyPracownik = "Piotr";
        abc.staz = 5;
        abc.wynagrodzenie = 5000;

        String ImieDrugiPracownik = "Arek";
        xyz.staz = 10;
        xyz.wynagrodzenie = 1500;

        System.out.println("Imię pracownika abc: " + ImiePierwszyPracownik.toUpperCase());
        System.out.println("Wynagrodzenie pracownika abc: " + abc.wynagrodzenie);
        System.out.println();
        System.out.println("Imię pracownika xyz: " + ImieDrugiPracownik.toUpperCase());
        System.out.println("Staż pracownika xyx: " + xyz.staz);

        //odwoałnie do metod klasy Pracownik
        abc.ustaw();
        abc.zmien();
        xyz.zmien();
        xyz.ustaw();
    }
}

//  klasa tworząca pracownika i właściwości
class Pracownik {
    int staz;
    int wynagrodzenie;

    //  metody wykonujące - można je potem wybrać po wpisaniu nazwy obiektu danej klasy (abc.)
    void ustaw() {
//miejsce na kod
    }

    void zmien() {
//miejsce na kod
    }

//    (o słówku 'new' będzie poźniej, o public i static też później)
//    package: wszytko jest w pakunku, mozna tam tworzyć wiele klas, do których mozna się odnieść,
//    mozna go zaimportować później
    //  docs.oracle.com/javase/8/docs/api
}
