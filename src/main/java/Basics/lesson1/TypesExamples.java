package Basics.lesson1;

import java.time.LocalDateTime;

public class TypesExamples {
    public static void main(String[] args) {
//        main <- psvm

//        print <- sout
        System.out.println("Hello World!");

//        Numeryczne
        byte najmniejszy = 5 + 1;
        short trocheWiekszy = 5 + 1;
        int number = 5 + 1;
        long longNumber = 3000000000L + 1;

        Integer max = Integer.MAX_VALUE;
        System.out.println(max);

        Integer min = Integer.MIN_VALUE;
        System.out.println(min);

        int a = 2147483647;
        int b = 2;

        System.out.println("Wynik");
        System.out.println((long) a + b);

        float zmiennoPrzecinkowa = 0.5F;
        double number2 = 0.5;

//        znakowe

        String imie = "Marcin";

        System.out.println("Witaj " + imie + "!");

//        Kopiowanie linii CRTL+D
        char znak = 'a';
        char znak2 = 'b';

        System.out.println(znak + znak2);

//        datowe

//        Rozwiązanie problemu ALT + ENTER np. import
        LocalDateTime localDateTime = LocalDateTime.of(2021, 2, 18, 13, 56);

//      logiczne

        boolean sign = true;
        boolean sign2 = false;

        String napis2 = "aaaa";

        if ("aaaa".equals(napis2)) {
            System.out.println("OK!");
        }


//        Komentarz (CTRL + ?)
    }
}
