package KursUdemy;

public class PetlaFor {
    public static void main(String[] args){
        //        Pętla for pozwala na łatwe iterowanie po tablicy bądź kolekcji. Jej składnia jest następująca:

//        for (typ nazwaZmiennejPetli : tablica_badz_kolekcja) {
//            // instrukcje
//
//        W pętli definiujemy zmienną pętli oraz jej typ, a po dwukropku podajemy tablicę (bądź kolekcję),
//        którą chcemy przeprocesować.
//        Typ zmiennej pętli powinien być zgodny z typem, jakie tablica może przechowywać.
//        Zmienna pętli w każdym obiegu będzie zawierała wartość kolejnego elementu tablicy.
//

//        int[] liczby = {1, 5, 20};
//        for (int x : liczby) {
//            System.out.print(x + ", ");
//        }
//        Zmienna pętli nazywa się x i w każdym obiegu pętli przyjmuje wartość z tablicy liczby.
//        Będą to, kolejno, liczby: 1, 5, oraz 20, ponieważ takie liczby przechowuje tablica liczby.
//        Typ int zmiennej x jest zgodny z typem wartości, jakie przechowuje tablica liczby.


        /*  Materiał z Chapter Day

         * struktura petli for
         * for( <initcjalizacja> ; <warunek-logiczny>; <krok>){
         *      wykonywane operacje
         * }
         */

//        for (int i = 0; i < 10; i += 2) {
//            System.out.println(i);
//        }
//
//            for (int i = 0; i > -10; i--) {
//                System.out.print(i + ",");
//            }

//            /*
//             *  jeśli warunek będzie fałszywy pętla się nie wykona!
//             */
//            for (int i = 0; i < 2; i++) {
//                System.out.println("to nigdy się nie wyświetli");
//            }

        /*
         *  Natomiast jeśli warunek będzie zawsze prawdziwy pętla będzie się wykonywać w nieskończoność
         *  chyba że sami przerwiemy jej działanie sami jej nie przerwiemy
         */

//        for (int i = 0; true; i++) {
//            System.out.println("cały czas");
//            if (i == 5) {
//                break;
//            }
//        }

        /*
         * W pętli można wykonywać dowolne operacje wykorzystując rosnący lub malejący increment,
         * możemy również wykoywać inne operacje np chcielibyśmy zsumwać osobno wszystkie liczby parzyste i nieparzyste
         * w przedziale od 0 do 10
         */

//        int sumOddNumber = 0;
//        int sumEvenNumber = 0;
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) {
//                sumOddNumber += i;
//                System.out.println("liczby podzielne przez 2 :" + sumOddNumber);
//            }
//            else {
//                sumEvenNumber += i;
//                System.out.println("liczby nie podzielne przez 2 :" +sumEvenNumber);
//            }
//        }

        /*
         * Instrukcje brake i continue
         *  podzas działani pętli można pominąć pojedyńczą iterazcje lub przerwać działanie pętli. Do tego wykorzystujemy
         * następujące instrukcje
         * break - przerywa działanie pętli
         * continue - przerywa w tym momecie pojedyńczą iteracje i kontynnuje działanie pętli
         *
         * najlepiej ilustruje to przyklad, chcemy wyświetlić liczby od 9 (iterując do 20) pomijajac te podzielne przez 3
         */

//        for (int i = 0; i <= 20; i++) {
//            if (i % 3 == 0) {
//                continue;
//            }
//            System.out.println("ten napis sie nie wyświetli jeśli liczba jest podzielna przez 3 ponieważ wyżej jest continue");
//            if (i == 10) {
//                break;
//            }
//            System.out.println(i);
//        }
    }
}
