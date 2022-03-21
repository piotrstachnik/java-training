package Basics.lesson4.array;

import Basics.lesson4.MyCat;

public class ArrayExample {
    public static void main(String[] args) {


        /*
        Tablice to zbiór zmiennych tego samego typu, do których odwołujemty się przy uzyyciu wspólnej nazwy.
        Można tworzyć dowolny typ tablicy o jednym lub wielu wymiarach. Do elementów tablic odwołujemy
        się za pomocą ich indeksu.

        Do czego używamy tablic?
        Do grupowania powiązanych ze sobą inforamcji
         */

        /*
        Tablica jednowymiarowa jest listą elementów. Deklarujemy ją w następujący sposób
        przykład: Typ nazwa-pola[];
        */
        //to jest deklaracja, tablica jeszcze nie została utworzona
        int[] monthDaysExample;

        /*
        aby zainicjalizować to pole należy użyć operatora "new" podać typ tablicy oraz zadeklarować ile tablica ma mieć miejsca
        przykład:  "= new typ[rozmiar]"
         */
        //inicjujemy 12 elementową tablice
        monthDaysExample = new int[12];

        /*
        cały proces możemy zredukować do 1 liniki
         */

        int[] monthDays = new int[12];
        String[] month = new String[12];
        MyCat[] cats = new MyCat[2];

        /*
        jak wygląda wypisanie tablicy na ekran za pomcą sout?
         */

        System.out.print(monthDays);
        System.out.print( "    <-  ten dziwny numernic nam nie mówi :O ");

        /* każdy element tablicy ma przypisany index,
        indexujemy od 0 do długości tablicy - 1

        wartości do indeksu przypisujemy za pomocą odwołania się do jego nr i uzycia operatora =
         */

        month[0] = "Styczeń";
        month[1] = "luty";

        cats[1] = new MyCat("mirek");

        System.out.print(month[0]);
        System.out.print(" <- tutaj już wyświetlamy konkretną wartość dla indexu dlatego widzimy co jest w środku");


        /*
        w przypadku typu prosych ( przypomnienie :) int, long, double)
        tablica po zainicjalizowaniu uzupełnia się 0 na karzdym indeksie,
        W przypadku OBIEKTÓW ( Integer, String, Cat) tablica uzupełniana jest null-ami

         */

        System.out.println(cats[0]);
        System.out.println(monthDays[10]);

        /*
        UWAGA Jeśli spubujemy odwołać się do nieistniejącego indexu otrzymamy błąd IndexOutOfBoundsException i program
        przestanie działać.
         */
        // System.out.println(cats[2].name);


            /*
            Tablice można zainicjować razem z wartościami, używamy do tego {wartość1, wartość2, wartość3}
            przykład: typ[] nazwa = {wartość1, wartość2}
             */

        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        /*
        Korzystając z tablicy i pętli jesteśmy w stanie przeiterować po wszystkich elementach tablicy
        możemy napisać nazwa-tablicy.fori i IDE samo stworzy nam pętle
         */

//        for (int i = 0; i < dayOfWeek.length; i++) {
//            System.out.println(dayOfWeek[i]);
//        }

        /*
        Mam też pętle for na sterydach!
        for( typ nazwa : nazwa-tabeli){
                nazwa
            }
        W kolenjnych iteracjach wartość pola "nazwy" ma wartość kolejnego pola
         */
        int i = 0;
        for (String day : dayOfWeek) {
            System.out.println("iteracja nr: " + i++);
            System.out.println(day);
        }

        /*
        Tablice wielowymiarowe inicjujemy w podobny sposób
        typ[][] nazwa = new typ[rozmiar][rozmiar]
        lub
        typ[][] nazwa = { {wartoscTablicy1, wartoscTablicy1}, {wartoscTablicy2,wartoscTablicy2} };
         */

        int[][] table = new int[1][1];
        int[][] number = {{1, 2, 3, 4}, {5, 6, 7, 8}};
    }
}
