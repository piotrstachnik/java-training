package KursUdemy;

public class SumaWartości {
    public static void main(String[] args) {
//        dodawanie licz w pętli

//        tworze tablice liczby
        int[] liczby = {5, 5, 5, 5, 5};
////        tworzymy zmienną która przechowuje wynik
        int suma = 0;

////        tworzymy pętle
//        Petla For
//        for (int i = 0; i < liczby.length; i++)
//        {
////            suma = suma + liczby[i];
//            suma += liczby[i]; //lepszy zapis
//        }
//        System.out.println(suma);

//        Petla Enchance for czyli ulepszona pętla for
        for (int liczba : liczby) {
            suma += liczba;
        }
        System.out.println(suma);
    }
}
