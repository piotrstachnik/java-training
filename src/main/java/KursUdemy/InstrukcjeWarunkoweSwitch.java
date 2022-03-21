package KursUdemy;

import java.util.Scanner;

//import javafx.scene.transform.Scale;

public class InstrukcjeWarunkoweSwitch {
    public static void main(String[] args) {
        //        SWITCH CASE to instrukcja wielokrotnego wyboru, dzięki której można warunkowo wykonać pewne fragmenty kodu.

//        Przykład 1 (konstrukcja instrukcji switch)
//        int a = 1;
//        switch (a) {
//            case 5:
//                System.out.println("a jest równe 5");
//                break;
//            case 6:
//                System.out.println("a jest równe 6");
//                break;
//            default:
//                System.out.println("a nie jest równe ani 5 ani 6");
//        }

//        int day = 4;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }

//        int day = 4;
//        switch (day) {
//            case 6:
//                System.out.println("Today is Saturday");
//                break;
//            case 7:
//                System.out.println("Today is Sunday");
//                break;
//            default:
//                System.out.println("Looking forward to the Weekend");
//        }

//        Jakie typy zmiennych można porównywać w instrukcji switch?
//        Java wymaga, aby wartości porównywane do zmiennej wejściowej (warunki case) były znane już podczas kompilacji.
//        W praktyce oznacza to, że nie mogą tam pojawić się zmienne, czy metody zwracające wartość.

        //Przykład 2 (na to, że porównane wartości muszą być stałe)

//        Integer b = 5;
//        switch (b) {
//            case Integer.valueOf("5"):
//                System.out.println("a jest równe 5");
//                break;
//            case Integer.valueOf("6"):
//                System.out.println("a jest równe 6");
//                break;
//            default:
//                System.out.println("a nie jest równe ani 5 ani 6");
//        }

//        Jakie typy zmiennych możemy używaż w instrukcjach switch?
//        Porównywana zmienna musi być typu: byte, short, char, int, Enum lub String.
//        Obsługiwane są również klasy osłonowe (Character, Byte, Short, Integer).

        //        Przykład 3 (switch i Enum)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week:");
        String dzienTygodnia = scanner.next();
        DniTygodnia dzien = DniTygodnia.valueOf(dzienTygodnia);
        switch (dzien) {
            case MONDAY:
                System.out.println("Do weekendu pozostało 7 dni");
                break;
            case TUESDAY:
                System.out.println("Do weekendu pozostało 6 dni");
                break;
            case WEDNESDAY:
                System.out.println("Do weekendu pozostało 5 dni");
                break;
            case THURSDAY:
                System.out.println("Do weekendu pozostało 4 dni");
                break;
            case FRIDAY:
                System.out.println("Do weekendu pozostało 3 dni");
                break;
            case SATURDAY:
                System.out.println("Do weekendu pozostało 2 dni");
                break;
            case SUNDAY:
                System.out.println("Do weekendu pozostało 1 dzień");
                break;
        }
    }
}
