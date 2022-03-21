package KursUdemy;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        //    Tablice mogą mieć więcej, niż jeden wymiar. Jeżeli zdefiniujemy tablicę tablic,
//   to wtedy będzie to tablica dwuwymiarowa – każdy element tablicy będzie kolejną tablicą,
//   do której będziemy mogli się odnieść za pomocą jej indeksów.

//    Można zdefiniować tablice o większej liczbie wymiarów,
//    ale w praktyce tablice o więcej niż trzech wymiarach nie są wykorzystywane.
//
//    Gry kółko i krzyżyk, albo szachy

//        Aby zdefiniować tablicę wielowymiarową, dodajemy do definicji kolejny zestaw nawiasów kwadratowych:

//        int[][] tablica2d = new int[3][5];

//        Zdefiniowana powyżej tablica to tablica trzech tablic/wiersz,
//        z których każda może przechowywać pięć wartości/kolumn typu int.

        // pierwszy element pierwszej pod-tablicy
//        tablica2d[0][0] = 5; // [0][0] adres komórki dla której przypisujmey wartoość int = 5
//
        // drugi, trzeci, i czwarty element drugiej pod-tablicy
//        tablica2d[1][1] = 10;
//        tablica2d[1][2] = 100;
//        tablica2d[1][3] = 1000;
//
        // drugi element trzeciej pod-tablicy
//        tablica2d[2][1] = 50;
//
//        System.out.println(tablica2d[0][0]);
//        System.out.println(tablica2d[0][4]);
//        System.out.println(tablica2d[1][3]);
//        System.out.println(tablica2d[2][3]);

//        Możemy dowiedzieć się, ile ma każdy z wymiarów tablicy wielowymiarowej używając atrybutu length.

//        System.out.println("Pierwszy wymiar: " + tablica2d.length);
//        System.out.println("Drugi wymiar: " + tablica2d[0].length);
//        System.out.println("Druga kolumna od konca talicy 1 to " + tablica2d[1][tablica2d[1].length - 1]);

//     Tablicę jednowymiarową inicjalizowaliśmy w następujący sposób:

//        double[] rzeczywiste = {3.14, 5, -20.5};
//
//        System.out.println("Miejsce w pamięcie komputera tablicy rzeczywiste " + rzeczywiste);
//        System.out.println("Zawartość tablicy rzeczywiste " + rzeczywiste[0] + "," + rzeczywiste[1]);
//
//     Aby zainicjalizować tablicę więcej niż jednego wymiaru, należy użyć kolejnego zestawu nawiasów klamrowych:

        char[][] kwadrat = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'X', 'X'}
        };

        System.out.println("Pierwszy wiersz, druga kolumna = " + kwadrat[0][1]);
        System.out.println("Pierwszy wiersz, druga kolumna = " + kwadrat[2][2]);
    }
}