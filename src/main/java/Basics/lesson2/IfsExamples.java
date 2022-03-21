package Basics.lesson2;

public class IfsExamples {

    public static void main(String[] args) {

        boolean warunek1 = true;
        boolean warunek2 = true;
        boolean warunek3 = true;

        if (warunek1) {
            System.out.println("warunek1: " + warunek1);
        } else if (warunek2) {
            System.out.println("warunek2: " + warunek2);
        } else if (warunek3) {
            System.out.println("warunek3: " + warunek3);
        } else {
            System.out.println("warunek1: " + warunek1);
            System.out.println("warunek2: " + warunek2);
            System.out.println("warunek3: " + warunek3);
        }


//        int number = 5;
//
//        if (number > 0 && number < 5) {
//            System.out.println("Mniejszy od 5");
//        } else if (number >= 5 && number < 10) {
//            System.out.println("Mniejszy od 10");
//        } else if (number >= 10 || number <= -10) {
//            System.out.println("Bezwzględnie duży");
//        } else if (number == 0) {
//            System.out.println("Zero, prawie nic");
//        } else {
//            System.out.println("Coś taki mały");
//        }


//        String dayOfWeek = "Thursday";
//
//        if ("Monday".equals(dayOfWeek)) {
//            System.out.println("Rozpoczynamy nowy tydzień pełni energii!!!!");
//        } else if ("Friday".equals(dayOfWeek)) {
//            System.out.println("Piątek, piąteczek, piątunio :)");
//        } else if ("Thursday".equals(dayOfWeek)) {
//            System.out.println("Nareszcie chapterowe.");
//        } else {
//            System.out.println("Random day, weekend maybe?");
//        }


//        switch (dayOfWeek) {
//            case "Monday":
//                System.out.println("Rozpoczynamy nowy tydzień pełni energii!!!!");
//            case "Friday":
//                System.out.println("Piątek, piąteczek, piątunio :)");
//            case "Thursday":
//                System.out.println("Nareszcie chapterowe.");
//            default:
//                System.out.println("Random day, weekend maybe?");
//        }
    }
}
