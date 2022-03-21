package Basics.lesson2;

public class TypesExcercises {

    public static void main(String[] args) {

        /* Zadanie 1

        Wprowadź do programu zmienne odpowiednich typów dla atrybutów klienta:
        - imię
        - nazwisko
        - wiek [lata]
        - wzrost [m]

        uzupełnij ich wartości dla przykłądowego klienta oraz wykorzystaj je do wyświetlenia informacji na ekranie.

        Na ekranie powinniśmy zobaczyć dane w postaci:
        Jan Kowalski
        40 lat
        wzrost 1,80m

        */
//        String imie = "Piotr";
//        String nazwisko = "Stachnik";
//        int wiek = 38;
//        double wzrost = 1.7;
//
//        System.out.println(imie + " " + nazwisko + "\n" + wiek + " lat" + "\n" + "wzrost " + wzrost + " m");


        /* Zadanie 2

        Wykorzystując poniżej zdefiniowane zmienne policz, przypisz do nowej zmiennej (pamiętaj o odpowiednim typie!)
        i wyświetl ją na ekranie:
        a + c
        d - a
        b * d
        b / a
        a % a

         */

        int a = 5;
        long b = 10000L;
        float c = 1.5F;
        double d = 0.02;

        float ac = a + c;
        double da = d - a;
        double bd = b * d;
        long ba = b / a;
        int aa = a % a;

        System.out.println(ac);
        System.out.println(da);
        System.out.println(bd);
        System.out.println(ba);
        System.out.println(aa);

        /* Zadanie 3

        Wykorzystując poniżej zakomentowany fragment kodu na pobranie tytułu maila od użytkownika
        oraz metodę length() klasy String wyznaczającą długość tekstu napisz prosty program, który wypisze na ekran:

        tytuł maila ma mniej niż 10 znaków
        tytuł maila ma równo 10 znaków
        tytuł maila ma więcej niż 10 znaków
        tytuł maila nie może być pusty!

         */

//        Scanner scanner = new Scanner(System.in);
//        String title = scanner.nextLine().trim();
//        int titleLength = title.length();


    }

}
