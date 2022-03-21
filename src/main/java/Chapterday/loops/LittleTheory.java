package Chapterday.loops;

public class LittleTheory {
    public static void main(String[] args) {
        /*
          Często pisząc porgram potrzebujemy wykonać jakąś operację kilkukrotnie,
          np wyświetlić jakiś napis 3 razy, albo powtórzyć jakąś czynność kilkukrotnie.
          oczywiście możemy zapisać każdą operację osobno
         */
        System.out.println("text");
        System.out.println("text");
        System.out.println("text");
        /**
         * ale ten sam efekt możemy uzyskać korzystając z pętli która mniejsza ilość kodu.
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("text");
        }

        /*
         * struktura petli for
         * for( <initcjalizacja> ; <warunek-logiczny>; <krok>){
         *      wykonywane operacje
         * }
         */

        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 0; i > -10; i--) {
            System.out.println(i);
        }

        /*
         *  jeśli warunek będzie fałszywy pętla się nie wykona!
         */
        for (int i = 0; i < -1; i++) {
            System.out.println("to nigdy się nie wyświetli");
        }

        /*
         *  Natomiast jeśli warunek będzie zawsze prawdziwy pętla będzie się wykonywać w nieskończoność
         *  chyba że sami przerwiemy jej działanie sami jej nie przerwiemy
         */

        for (int i = 0; true; i++) {
            System.out.println("cały czas");
            if (i == 5) {
                break;
            }
        }

        /*
         * W pętli można wykonywać dowolne operacje wykorzystując rosnący lub malejący increment,
         * możemy również wykoywać inne operacje np chcielibyśmy zsumwać osobno wszystkie liczby parzyste i nieparzyste
         * w przedziale od 0 do 10
         */
        int sumOddNumber = 0;
        int sumEvenNumber = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                sumOddNumber += i;
            } else {
                sumEvenNumber += i;
            }
        }

        /*
         * Instrukcje brake i continue
         *  podzas działani pętli można pominąć pojedyńczą iterazcje lub przerwać działanie pętli. Do tego wykorzystujemy
         * następujące instrukcje
         * break - przerywa działanie pętli
         * continue - przerywa w tym momecie pojedyńczą iteracje i kontynnuje działanie pętli
         *
         * najlepiej ilustruje to przyklad, chcemy wyświetlić liczby od 9 (iterując do 20) pomijajac te podzielne przez 3
         */

        for (int i = 0; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("ten napis sie nie wyświetli jeśli liczba jest podzielna przez 3 ponieważ wyżej jest continue");
            if (i == 10) {
                break;
            }
            System.out.println(i);
        }

        /*
         *  Natomiast jeśli warunek będzie zawsze prawdziwy pętla będzie się wykonywać w nieskończoność
         *  chyba że sami przerwiemy jej działanie sami jej nie przerwiemy
         */

        for (int i = 0; true; i++) {
            System.out.println("cały czas");
            if (i == 5) {
                break;
            }
        }

        /*
         * nieskonczona petle mozna zapisac tez w postaci for(;;)
         */

        for (; ; ) {
            System.out.println("gdyby nie break ta petla dzialala by wiecznuie");
            break;
        }

        /**
         * pętla while
         * struktura petli
         * while( <warunek-logiczny> ){
         *              operacje
         * }
         */
        int a = -10;
        while (a < 0) {
            a++;
            System.out.println(a);
        }

        /**
         * podobnie jak w pętli for pętle while mozna przerwać instrukcją brake lub continie
         */

        int b = 0;
        while (true) {
            b++;
            if (b > 4 && b < 10) {
                continue;
            }
            System.out.println(b);
            if (b == 20) {
                break;
            }
        }

        /**
         * pętla "do while" różni się od pętli while tylko tym że nawet jeśli warunek będzie nieprawdziwy pętla wykona się conajmniej raz!
         */

        do {
            System.out.println("wyswietle sie raz bo jest fales");
        } while (false);


        /*
         * petla w pętli
         */

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i =" + i + " j= " + j);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }





        /*
         *  Jakie pętle mamy Javie?
         *  Dostępnych mamy kilka pętli:
         *      for
         *      for (rozszerzona)
         *      while
         *      do while
         *  Kiedy używamy pętli for a kiedy while / do while?
         *      Pętli for używamy najczęściej kiedy znamy liczbę elementów lub liczbę powtórzeń danej
         *      instrukcji. Dodatkowo, gdy chcemy mieć (łatwy) dostęp do licznika pętli. Pętli while / do while
         *      używamy, z gdy z góry nie wiemy, ile razy będziemy iterować - zależy do od jakiegoś czynnika.
         *
         *  Czym się różni pętla for od pętli for (rozszerzonej)?
         *      Pętla for umożliwia zadeklarowanie sposobu iteracji poprzez sterowanie licznikiem pętli. Jeśli
         *      interesuje nas tylko przejście przez dany zbiór (bez wnikania w sposób iteracji), wybieramy
         *      pętlę for (rozszerzoną), zwaną pętlą for each.
         *
         *Czym się różni pętla while od do while?
         *      Pętla do while wykona się zawsze choć jeden raz, nawet gdy warunek logiczny będzie fałszywy
         *      na początku; pętla while w tym wypadku się nie wykona.
         */
    }
}
