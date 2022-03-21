package Chapterday;

import java.time.LocalDate;

public class ChapterDay {

    public static void main(String[] args) {

//        1. OBIEKTY - KLASY, POLA


        // jak stworzyć kota na podstawie klasy - czyli z przepisu

        Cat jakisKot = new Cat();
        Cat kotKoks = new Cat("Koks", 0.52, 3560, false, 6);

        // Tworzymy wywowałanie dla PUSH'a, którego wcześniej stworzyłem klasę.
        Push jakisPush = new Push();
        Push wiadomoscObligo = new Push(150, "dulpio7308", "Dziś jest Chapter Day",
                false, 134, "www.google.pl", LocalDate.now().plusDays(1), 1,
                "batchChapterDay", 1);


//        2. INSTRUKCJE WARUNKOWE

        //        == -> równa się
//        != -> różne
//        ! -> Negacja, !true -> false
//        >= -> wieksze lub równe
//        <= -> mniejsze lub równe
//        > -> wieksze
//        < -> mniejsze
//        && -> (i)
//        || -> (lub)
//        () - > służą do grupowania warunków logicznych

//        if (kotKoks.czyWButach) {
////            ped = ped * 2;
//            System.out.println("Pęd kota w butach: " + ped);
//        }
//        switch (kotKoks.agresywnosc) {
//            case 1:
//                System.out.println("Kot nie agresywny");
//                break;
//            default:
//                System.out.println("Wartosc nieokreslona");
//        }
//
//        Przejdź do: src/main/java/pl/ing/tci/course/chapterday/conditionalstatements/Exercises.java
//
//
//        3. PĘTLE
//
//        Przejdź do: src/main/java/pl/ing/tci/course/chapterday/loops/Excercises.java
//
//
//        4. METODY
//
//        Przejdź do: src/main/java/pl/ing/tci/course/chapterday/methods/Sms.java

        kotKoks.miaucz();
        String imieKotaKoksa = kotKoks.zapiszImie();
        System.out.println(imieKotaKoksa);
        System.out.println(kotKoks.glodny);
        kotKoks.miaucz(true);
        System.out.println(kotKoks.glodny);
        kotKoks.przedstawSie();
//
//
//        5. REFACTORING
//
//        Przejdź do: src/main/java/pl/ing/tci/course/chapterday/refactoring/Validator.java
//

    }

}
