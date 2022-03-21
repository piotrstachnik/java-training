package KursUdemy;

public class Konstruktory {
    public static void main(String[] args) {
//        Język Java, jak i inne języki obiektowe, udostępnia specjalny rodzaj metod nazywanych
//        konstruktorami, które służą do inicjalizacji obiektów klasy. Są to zbiory instrukcji, które mają
//        zostać wykonane podczas gdy, właśnie tworzymy obiety
//
//        Konstruktory mają dwie cechy specjalne, które wyróżniają je na tle innych metod:
//
//          • nazwy konstruktorów są zawsze takie same, jak nazwa klasy, w której się znajdują –
//            dla przykładu, konstruktor klasy Produkt będzie nazywał się Produkt,
//
//          • konstruktory nie zwracają żadnej wartości (nie stosujemy nawet void!) – podczas
//            definiowania konstruktora po prostu omijamy zwracany typ.

        //Konsturkor Domyślny

//        Każda klasa, którą napiszemy w języku Java, będzie miała konstruktor –
//        niezależnie od tego, czy go napiszemy, czy nie.
//
//        Taki konstruktor nazywany jest konstruktorem domyślnym i jest dla nas generowany
//        automatycznie przez kompilator języka Java w jednym, konkretnym w przypadku:
//        gdy my, jako autorzy klasy, nie dostarczymy sami konstruktora dla klasy.
//
//        Konstruktor domyślny:
//        • nie przyjmuje żadnych argumentów,
//        • nie wykonuje żadnych instrukcji – jego ciało jest puste,
//        • występuje tylko w tych klasach, w których nie został zdefiniowany żaden konstruktor przez
//        programistę.

//        1. Budowa konstruktora domyślnego, bez paramtrów
//        Punkt p = new Punkt(); // rezerwacja miejsca w pamięci, z przypisaniem do konkretnej zminnej
//        Punkt p = new Punkt(); // wywołanie kontruktora bez prametrów

//
//        p.x = 10;
//        p.y = 15;
//        // po zakomentowaniu powyższych wartości konstruktor przyjmie wartości z klasy Punkt
////        po zostawieniu, mimo wprowadzeniu wartości do klasy, one pozostaną pnieważ te z klasy zostaną podminone
//
//        System.out.println("p.x " + p.x);
//        System.out.println("p.y " + p.y);
//    }
//}
//
//class Punkt {
//    // wywyłonia konstruktora domyślnego bez paramerów
//    Punkt() {
//        System.out.println("Wywołanie konstruktora domyślnego");
//        // konstruktor domyślny powinien przypisywać jakieś wartoci
////        x = 20;
////        y = 30;
//    }
//
//    int x;
//    int y;
//}

//        2. Budowa konstruktora własnego z parametrami
//        Punkt p = new Punkt(10, 20); // wywołanie kontruktora z prametrami, przesyłamy dwie wartości
//                                                    // system nie wywoła konstruktota domyślnego
//
//        p.x = 10;
//        p.y = 15;
//        // po zakomentowaniu powyższych wartości konstruktor przyjmie wartości z klasy Punkt
////        po zostawieniu, mimo wprowadzeniu wartości do klasy, one pozostaną pnieważ te z klasy zostaną podminone
//
//        System.out.println("p.x " + p.x);
//        System.out.println("p.y " + p.y);
//    }
//}
//
//class Punkt {
//    //    konstruktor domyślny
//    Punkt() {
//        System.out.println("Wywołanie konstruktora domyślnego");
//    }
//    //    kontruktor z parametrami
//    Punkt(int pierwszy, int drugi) {
//        System.out.println("Wywołanie konstruktora z dwama parametrami");
//    }
//
//    int x;
//    int y;
//}

//      3. Konstruktor z parametrami - prawidłowy zapis
//        Punkt p = new Punkt(10, 20);
//        // mozemy dodać sobie kolejny punkt w szybszy sposób
//        Punkt p2 = new Punkt(15, 30);
//
//        System.out.println("p.x " + p.x);
//        System.out.println("p.y " + p.y);
//        System.out.println();
//        System.out.println("p2.x " + p2.x);
//        System.out.println("p2.y " + p2.y);
//    }
//}
//
//class Punkt {
//    Punkt(int pierwszy, int drugi) {
//        System.out.println("Wywołanie konstruktora z dwama parametrami");
//        // do parametrów przypisujemy wartości, które zostały przysłane
//        x = pierwszy;
//        y = drugi;
//    }
//
//    int x;
//    int y;
//}

        //      3. Konstruktor z parametrami - słowo "this"
//        Zapis kod ze słowem "this" - czyli odwołanie się do aktualne na, którym obecnie operujemy obiekcie.
//
//        Punkt p = new Punkt(10, 20);
//        // mozemy dodać sobie kolejny punkt w szybszy sposób
//        Punkt p2 = new Punkt(15, 30);
//
//        System.out.println("p.x " + p.x);
//        System.out.println("p.y " + p.y);
//        System.out.println();
//        System.out.println("p2.x " + p2.x);
//        System.out.println("p2.y " + p2.y);
//    }
//}
//
//class Punkt {
//    Punkt(int x, int y) {
//        System.out.println("Wywołanie konstruktora z dwama parametrami");
//        // do parametrów przypisujemy wartości, które zostały przysłane
//        this.x = x;
//        this.y = y;
//    }
//
//    int x;
//    int y;
//}

//    Czym jest 'this' ?
//        this to z ang. 'ten'. W programowaniu lepiej brzmi coś w stylu: 'z tego (obiektu)'.
//        Gdy wpiszesz 'this.' i skorzystasz ze skrótu CTRL + SPACE to dostaniesz dostęp do wszystkiego
//        na czym możesz operować z pomocą this. A będą to wszystkie metody/właściwości, które można
//        wywołać/zmienić, gdy pracujesz na jakimś konkretnym obiektem. Przypominam, że klasa to forma do
//        tworzenia obiektów. Możesz stworzyć z jednej klasy 100 różnych obiektów.

//        Gdy masz np. klasę Samochod i zrobisz:
        Samochod samochody[] = new Samochod[3];
//////        i teraz napiszesz
        samochody[0] = new Samochod("BMW");
        samochody[1] = new Samochod("Ford");
        samochody[2] = new Samochod("Opel");
//        To samochody[0] i samochody[1] oraz samochody[2] to są trzy różne obiekty z tej samej formy.
//        Każdy z nich ma te same właściwości (zmienne), ale ich wartości są różne.

//        Kiedy wywołujesz powiedzmy metodę: String getNazwaSamochod(){  return this.nazwaSamochodu;}
//        w taki sposób:

        String Samochod_1 = samochody[0].getNazwaSamochodu();
        String Samochod_2 = samochody[1].getNazwaSamochodu();
        String Samochod_3 = samochody[2].getNazwaSamochodu();


        System.out.println(Samochod_1);
        System.out.println(Samochod_2);
        System.out.println(Samochod_3);

    }
}

class Samochod {

    String nazwaSamochodu;

    //         Tworzymy argumenty konstruktora - motoda "getter"
    public String getNazwaSamochodu() {
        return nazwaSamochodu;
    }

    //          Budowa konstruktora
    public Samochod(String nazwaSamochodu) {
        this.nazwaSamochodu = nazwaSamochodu;
    }
}

// ------------------Notatki od Jarka--------------------//

//class Sklep {
//    public static void main(String[] args) {
//        Produkt czeresnie = new Produkt();
//        Produkt herbata = new Produkt();
//        czeresnie.setCena(8.0);
//        czeresnie.setNazwa("Czeresnie");
//        herbata.setCena(12.0);
//        herbata.setNazwa("Herbata czarna");
//        System.out.println("Nazwa pierwszego produktu to: " + czeresnie.getNazwa());
//        System.out.println("Cena pierwszego produktu to: " + czeresnie.getCena());
//        System.out.println(czeresnie); //wywołanie metody toString
//    }
//}

//class Warzywniak {
//    public static void main(String[] args) {
//
//        Produkt papryka = new Produkt(5.0, "Papryka"); // argumenty konsturkora zawartego w klasie Produkt
//        Produkt czereśnie = new Produkt(20.0, "Czereśnie"); // argumenty konsturkora zawartego w klasie Produkt
//
//        System.out.println(papryka); //wywołanie metody toString
//        System.out.println(czereśnie); //wywołanie metody toString
//    }
//}
//    Wartości przesłane jako argumenty konstruktora (1) zostały przypisane do pól cena i nazwa,
//    co widać po wypisaniu tekstowej reprezentacji obiektow.

// Tworzymy klasę Produkt
//class Produkt {
//
//    private double cena;
//    private String nazwa;
//
//    // Konstruktor domyślny - konstuktor który nie przyjmuje żadnych agrumentów tzw.
//    // Dodany po to żeby działa klasa Sklep
//
//    public Produkt() {
//    }
//    //   agrmenty kontruktora tworzymy przy użyciu setterów i getterów
//
//    public double getCena() {
//        return cena;
//    }
//
//    public void setCena(double cena) {
//        this.cena = cena;
//    }
//
//    public String getNazwa() {
//        return nazwa;
//    }
//
//    public void setNazwa(String nazwa) {
//        this.nazwa = nazwa;
//    }

//  Budowa konstruktora
//   (1)(2) (3) (4)
//    public Produkt(double cena, String nazwa) {
//        this.cena = cena; // 5 this odwołujemy sie do aktualnego argumentu
//        this.nazwa = nazwa; // 6
//
//    }


//    Klasa Produkt posiada jeden konstruktor – jego cechy to:

//    • publiczny dostęp (1) – każdy będzie mógł tworzyć obiekty typu Produkt za pomocą tego konstruktora,
//
//    • brak zwracanego typu (2) – zazwyczaj, pomiędzy modyfikatorami a nazwą metody,
//    umieszczamy typ wartości, którą metoda zwraca – w przypadku konstruktorów pomijamy
//    całkowicie zwracany typ (nie piszemy nawet słowa void)
//
//    • nazwa (3) jest taka sama, jak nazwa klasy w której konstruktor się znajduje (3) – nazwa
//    konstruktora to Produkt, ponieważ zawarty jest w klasie o nazwie Produkt,
//
//    • dwa argumenty (4) – wartości, którymi zostaną zainicjalizowane pola cena (5) oraz nazwa (6)
//    jak widzimy, korzystamy w konstruktorze ze słowa this,
//    by odwołać się do pól obiektu, który tworzymy. Dzięki użyciu słowa kluczowego this
//    możemy nazwać argumenty konstruktora tak samo, jak nazwy pól/zmiennych naszej klasy.

//   settery i gettery zostały pominięte.

//  Metoda toString (publiczna, typu String) zwraca tekstową prezentację danego obiektu
//    public String toString() {
//        return "Produkt o nazwie " + nazwa + " kosztuje " + cena;
//    }
//}