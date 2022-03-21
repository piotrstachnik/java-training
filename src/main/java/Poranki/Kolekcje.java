package Poranki;

import java.util.*;

public class Kolekcje {
    public static void main(String[] args) {
        Random random = new Random();
        int dimmension = 10;

        List<Set> someList = new ArrayList<>();
        for (int i = 0; i < dimmension; i++) {
            Set<Integer> integers = new HashSet<>();
            for (int j = 0; j < dimmension; j++) {
                integers.add(random.nextInt(1000) + 100);
            }
            someList.add(integers);
//            System.out.println(integers);
        }
//        System.out.println(someList);

//    Zadania:
//    1.   Napisz metodę, która zwraca listę wszystkich elementów podzielnych przez 7. Lista źródłowa do wykonania zadania generowana jest przez powyższy kod.

//        List<Integer> mojalista = getIntegersDivisbleBy7(someList);
//
//        System.out.println(mojalista);


//        List<Integer> mojalista2 = new ArrayList<Integer>();
//        for (int k = 0; k < someList.size(); k++) {
//            for (int l = 0; l < someList.get(k).size(); l++) {
//                if (someList.get(k). % 7 == 0) { nie można tego wykorzystać poniewac set nie ma indeksów
//                    mojalista2.add(l);
//                }
//            }
//        }
//        System.out.println(mojalista2);

//        Rozwiązanie zad. 2

        List<String> liczby = new ExtArrayList();
        for (int i = 0; i <= 50; i++) {
            liczby.add(String.valueOf(i));
        }

        System.out.println(liczby);
        System.out.println();

        liczby.remove("5");
        System.out.println(liczby);
        System.out.println();


    }

    private static List<Integer> getIntegersDivisbleBy7(List<Set> someList) {
        List<Integer> mojalista = new ArrayList<Integer>();
        for (Set k : someList) {
            for (Object o : k) {
                int liczba = (Integer) o;
                if ((liczba % 7) == 0) {
                    mojalista.add(liczba);
                }
            }
        }
        return mojalista;
    }
}

//    2.   Stwórz klasę, która realizuje wszystkie funkcjonalności ArrayList, ale
//    a.   Gdy zwrócimy jej reprezentację (System.out.println(obiekt);) to dostaniemy na ekranie:
//    Lista przechowuje dane typu <typ>
//    Elementy listy:
//    index=0 wartość=...
//    index=1 wartość=...
//    b.   Gdy usuniemy jeden z elementów listy, to powinien zastąpić go null. Indeksy pozostałych nie powinny zostać zmienione.

//    wykotrzystać nadpisywanie metod, toString() - metoda do reprezentacji, dziedziczenie po ArrayList

