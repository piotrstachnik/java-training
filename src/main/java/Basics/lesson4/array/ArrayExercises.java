package Basics.lesson4.array;

import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {

    /* Zainicjuj tablice MyCat składającą się z 3 elementów,
    2 kotów o dowolnym imieniu i null, nastepnie za pomocą pętli for ( nie fori) wypisz ich imiona
    */
//        String[] MyCat = new String[3];
//
//        MyCat[0] = "Kacper";
//        MyCat[1] = "Oliwia";
//
//        for (String s : MyCat) {
//
//            System.out.println(s);
//        }


    /*
    Za pmocą Scanner dodaj do nowej tablcy 5 stringów, następnie obwróć tą tablicę. Nie można stworzyć 2 tablicy!
    Podpowiadywajka: Pamiętaj o użyciu pętli, zamieniając elementy miejscami można wykożystać zmienną tymczasową która będzie przechowywać wartość
  */
        String[] MyCat2 = new String[5];

        Scanner MyScaner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            MyCat2[i] = MyScaner.nextLine();
        }

        for (String s : MyCat2) {

            System.out.println(s);
        }

        for (int i = 0; i < MyCat2.length/2; i++) {
            String tmp = MyCat2[i];
            MyCat2[i] = MyCat2[MyCat2.length-1-i];
            MyCat2[MyCat2.length-1-i] = tmp;
        }
        for (int i = 0; i < MyCat2.length; i++) {
            System.out.println(MyCat2[i]);
        }

    }

/*
  Zadanie z * stwórz mędodę która będzie przymować tablice stringów
  Zadanie z **, stwórz metodę która w trakcjie odwracania tablicy odwróci wszystkie znaki w łańcuchu Stringów

  przykład:  "ala", "pies", "baba"  -> "baba" , "pies", "ala"
  przykład do zadania z ** - > "akcja", "pies", "bal"  -> "ajcka" , "seip", "lab"
  */

    /*
    Stwórz enmu Days, który będzie składał się z dni tygodnia,
    enum powinien pole
    String skrócona nazwa np "PN" lub "MON"
    int ile godzin pracujemy tego dnia
    Nastepnie za pomocą consoli wpisz skróconą nazwę dnia i używając switch/case wyświetl ile godzin dzisiaj pracujemy
     */
}