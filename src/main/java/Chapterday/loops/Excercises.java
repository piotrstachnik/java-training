package Chapterday.loops;

public class Excercises {
    public static void main(String[] args) {


        /**
         * Zad1
         * Zadanie z kotem xD
         * za pomoca petli wypisz liczby od 1 do 100, niech kot
         * na każdą liczbę podzielną przez 3 zrobi "miau"
         * podzielna przez 5 zrobi "mrr" oraz
         * podzielna przez 3 i 5 zrobi "mrrał"
         */

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 5 != 0) {
                    System.out.println(i + ": miau");
                } else if (i % 3 != 0) {
                    System.out.println(i + ": mrr");
                } else {
                    System.out.println(i + ": mrrał");
                }
            } else {
                System.out.println(i);
            }
        }


        /**
         * Zad2
         * Wypisz całą piosenkę o kotach: wykorzystaj pętle
         *
         * "99 kotów mam, gdy jednego koledze dam... to zostanie mi już ich tylko 98"
         * "98 kotów mam, gdy jednego koledze dam... to zostanie mi już ich tylko 97"
         * (...)
         * "ostaniego kota mam i nikomu go nie oddam"
         */

//        for (int i = 99; i > 0; i--) {
//            if (i == 1) {
//                System.out.println("ostaniego kota mam i nikomu go nie oddam");
//            } else {
//                System.out.println(i + " kotów mam, gdy jednego koledze dam... to zostanie mi już ich tylko " + (i - 1));
//            }
//        }


/**
 * Zadanie z gwiazdką za pomocą pętli narysuj choinkę !
 * Wskazówki:
 * potrzebne będą 3 pętle:
 * 1. pętla wysokość
 * 2. pętla puste pola
 * 3. pętla malująca *
 *
 * rys. pomocniczy:
 * |_____*
 * |____***
 * |---*****
 * |__*******
 */
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
