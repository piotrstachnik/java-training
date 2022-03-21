package Basics.lesson3;

import java.util.Locale;
import java.util.Scanner;

public class StringExamples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);  // skaner, czyli pobranie wartości od użytkownika (z konsoli)
//        String line = scanner.nextLine().trim();  // metoda nextLine pobiera nową linię tekstu (String)
//        System.out.println(line);

//        String a = scanner.next();  // pojedynczy String (do spacji lub entera)
//        System.out.printf("Właśnie wprowadzono Stringa: %s%n", a);
//
//        int b = scanner.nextInt();  // integer
//        System.out.printf("Właśnie wprowadzono integera: %d%n", b);
//
//        double c = scanner.nextDouble();  // double
//        System.out.printf("Właśnie wprowadzono double'a: %f%n", c);


        double d = 0.1 + 0.1 + 0.1;
        System.out.println(d);
//
//        String text = "Moja długa linia tekstu, którą wymyślaliśmy wspólnie w 3 osoby :( i zapomnieliśmy tekstu (3 razy)";
//
//        int length = text.length();  // długość tekstu
//        System.out.println(length);
//
//        String malymi = text.toLowerCase();
//        System.out.println(malymi);  // małe litery
//
//        String wielkimi = text.toUpperCase();
//        System.out.println(wielkimi);  // wielkie litery
//
//        String dluga = text.substring(5, 10);
//        System.out.println(dluga);  // fragment tekstu
//
//        boolean czyKonczySieNaNanana = text.endsWith("Nanana");
//        System.out.println(czyKonczySieNaNanana);  // sprawdza czy kończy się na czymś
//
//        boolean czyZaczynaSieNaMoja = text.startsWith("Moja");
//        System.out.println(czyZaczynaSieNaMoja);  // sprawdza czy zaczyna się czymś
//
//        String slowo = "tekstu";
//        int pierwszeSlowo = text.indexOf(slowo);  // indeks pierwszego wystąpienia ciągu znaków
//        int ostatnieSlowo = text.lastIndexOf(slowo);  // indeks ostatniego wystąpienia ciągu znaków
//
//        System.out.println(pierwszeSlowo);
//        System.out.println(ostatnieSlowo);
//
//        String slowo2 = text.substring(pierwszeSlowo, pierwszeSlowo + slowo.length());
//        System.out.println(slowo2);
//
//        String nowyTekst = text.replace("tekstu", "odpocząć");  // zamienia wszystkie wystąpienia fragmentu tekstu
//        System.out.println(nowyTekst);
//
//        String nowyTekst2 = text.replace('3', '4');  // zamienia wszystkie wystąpienia pojedynczego znaku
//        System.out.println(nowyTekst2);
//
////        String jest niemutowalny, metody Stringa zwracają nowe Stringa (nie modyfikują obecnego, bo się nie da)
////        Mutowalną odmianą Stringa jest StringBuilder
//        text.substring(5,10);
//        System.out.println(text);
//
////        Czyli jak zamienić smutną minkę na wesolutką?
//        String odwroconyTekst = new StringBuilder(text).reverse().toString();
//        System.out.println(odwroconyTekst);

    }
}
