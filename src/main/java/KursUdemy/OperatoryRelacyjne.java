package KursUdemy;

public class OperatoryRelacyjne {
    public static void main(String[] args) {

//        Operatory relacyjne to operatory służące do określania relacji między dwoma zmiennymi.
//        Wynik zastosowania operatora relacyjnego zwraca zmienną typu boolean, czyli zmienną logiczną.

        //        Zmienne logiczne przyjmują tylko dwie wartości: true lub false
        boolean zmiennaLogiczna1 = true;
        boolean zmiennaLogiczna2 = false;

//        Operatory logiczne:

//        1. == sprawdza równość wartości
//        boolean zmiennaLogiczna3 = 5 == 3;
//        System.out.println(zmiennaLogiczna3);
//
//        boolean zmiennaLogiczna4 = 5 == 5;
//        System.out.println("");
//        System.out.println(zmiennaLogiczna4);
//
////        2. != sprawdza, że dwie wartości są różne
//        boolean zmiennaLogiczna5 = 1 != 5;
//        System.out.println("");
//        System.out.println(zmiennaLogiczna5);
//
//        boolean zmiennaLogiczna6 = 1 != 1;
//        System.out.println("");
//        System.out.println(zmiennaLogiczna6);

//        3. >= , <=  sprawdzają, że jedna wartość jest większa/mniejsza lub równa drugiej
//        boolean zmiennaLogiczna7 = 1 >= 1;
//        System.out.println("");
//        System.out.println(zmiennaLogiczna7);

//        4. > , < sprawdza, że jedna wartość jest większa/mniejsza od drugiej
//        boolean zmiennaLogiczna8 = 1 > 1;
//        System.out.println("");
//        System.out.println(zmiennaLogiczna8);

//        Uwaga na typ porównywanych zmiennych!
//        boolean zmiennaLogiczna9 = 1.5 > 1; // to jest ok
//        System.out.println("");
//        System.out.println(zmiennaLogiczna9);

//        boolean zmiennaLogiczna10 = true == 1; // to NIE jest ok/
//        System.out.println("");
//        System.out.println(zmiennaLogiczna10);

//        Porównywanie zmienych, które nie są typu prymitywnego odbywa się poprzez użycie metody equals(Object) z klasy Object
//        String tekst1 = "przykład";
//        String tekst2 = "przykład";
//        String tekst3 = new String("przykład");
//        boolean logiczna15 = tekst1 == tekst2;
//        boolean logiczna16 = tekst1.equals(tekst2);
//        boolean logiczna17 = tekst1 == tekst3;
//        boolean logiczna18 = tekst1.equals(tekst3);
//        System.out.println("");
//        System.out.println("Czy obiekt tekst1 jest wskaźnikiem do tego samego miejsca w pamięci co test2?: " + logiczna15);
//        System.out.println("Czy zawartość obiektu tekst1 jest równy zawartości obiektu tekst2?: " + logiczna16);
//        System.out.println("Czy obiekt tekst1 jest wskaźnikiem do tego samego miejsca w pamięci co test3?: " + logiczna17);
//        System.out.println("Czy zawartość obiektu tekst1 jest równy zawartości obiektu tekst3?: " + logiczna18);

//        jak odkomentujesz poniższą linijkę, to wywołasz metodę porownywarkaLiczb
//        porownywarkaLiczb();
//    }

//            Przykład użycia

//    private static void porownywarkaLiczb() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj liczbe1:");
//        int liczba1 = scanner.nextInt();
//        System.out.println("Podaj liczbe2:");
//        int liczba2 = scanner.nextInt();
//
//        if (liczba1 > liczba2) {
//            System.out.println("Pierwsza liczba jest większa od drugiej");
//        } else if (liczba1 == liczba2) {
//            System.out.println("Pierwsza liczba jest równa drugiej");
//        } else {
//            System.out.println("Pierwsza liczba jest mniejsza od drugiej");
//        }
    }
}
