package Basics.lesson3;

public class StringExcercises {

    public static void main(String[] args) {

        /* Zadanie 1

        Wykorzystując metody klasy String wyciągnij z podanego tekstu 2 numery IBAN rachunków.
        Następnie wyciągniej z numerów IBAN 10 ostatnich cyfr.

        */

        String tekst = "2021-03-02 14:48 Przelwe z numeru rachunku: PL12345678901234567890123456 na numer rachunku: PL12345678901234567890123457";

        String nrIBAN1 = tekst.substring(tekst.indexOf("PL"),tekst.indexOf("PL")+28);
        String nrIBAN2 = tekst.substring(tekst.indexOf("PL",tekst.indexOf("PL")+2),tekst.indexOf("PL", tekst.indexOf("PL")+2)+28);
        System.out.println(nrIBAN1);  // fragment tekstu
        System.out.println(nrIBAN2);  // fragment tekstu

        /* Zadanie 2

        Wykorzystując metody Stringa odszyfruj niespodziankę zamieniając:

        & na e
        QWERTY na w
        R na rz
        H na cz
        Ł (użyj CapsLock) na t
        0 na o
        $ na spację
        ^ na ć
        4 na a
        1 na i

        */

//        String niespodzianka = "L1ŁQWERTY0,$OjHyzn0$m0j4!$Ły$j&sŁ&ś$j4k$zdr0QWERTY1&;\n" +
//                "Il&$c1ę$ŁR&b4$c&n1^,$Ł&n$Łylk0$s1ę$d0QWERTY1&,\n" +
//                "KŁ0$c1ę$sŁr4c1ł.$Dz1ś$p1ękn0ś^$ŁQWERTYą$QWERTY$c4ł&j$0zd0b1&\n" +
//                "W1dzę$1$0p1suję,$b0$Łęskn1ę$p0$Ł0b1&.";
//
//        System.out.println(niespodzianka);
    }

}
