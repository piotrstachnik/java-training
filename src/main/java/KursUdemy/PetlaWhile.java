package KursUdemy;

public class PetlaWhile {
    public static void main(String[] args) {
        //    Czym są pętle - pętla while i do while
//    Pętle są jednym z podstawowych narzędzi wykorzystywanych przez programistę.
//    Dzięki nim można wywołać określoną funkcjonalność podaną ilość razy, zamiast za każdym razem wywoływać ją ręcznie.

//    W Javie mamy do dyspozycji kilka rodzajów pętli: while, do while, for i foreach.
//    Funkcjonalność wszystkich jest wymienna, a decyzja, którą należy użyć w danym momencie, zależy głównie od kontekstu,
//    w jakim ma być wykorzystana oraz od preferencji programisty.

//    Pętla while najczęściej jest wykorzystywana, gdy nie możemy określić konkretnej ilości powtórzeń do wykonania.
//    Znamy jednak warunki określające, jak długo dana sytuacja będzie zachodziła.
//    Przykładowo: „dopóki licznik nie przekroczy zakresu tablicy, wypisz jej kolejny element”.
//
//    Pętla jest wykonywana tak długo, póki warunek jest spełniony.
//    Jeżeli warunek od początku nie będzie spełniony, taka pętla nie zostanie wywołana ani razu.
//    W pierwszym kroku sprawdzany jest warunek pętli,  jeżeli tak, to wyświetlany jest element z tego indeksu, a sam indeks jest zwiększany
//    Następnie znowu sprawdzany jest warunek pętli i tak dalej, aż do momentu niespełnienia warunku.

//    Pętla do while jest to modyfikacja pętli while.
//    Głowna różnica polega na tym, że ciało pętli zostanie wykonane przynajmniej raz, nawet jeżeli warunek zawsze jest niespełniony.
//    Najpierw wykonywane są instrukcje zdefiniowane wewnątrz pętli, a dopiero potem sprawdzany jest jej warunek.
//    Warto zwrócić uwagę, że po warunku pętli niezbędny jest średnik, o którym na początku często się zapomina.

//    Nieskończona pętla
//    Na koniec jeszcze mała przestroga.
//    Korzystając z pętli, trzeba uważać określając warunki zakończenia wykonywania iteracji.
//    Jeżeli zrobimy to niewłaściwie, możemy otrzymać nieskończoną pętlę.

        //// 1
        //while (true) {
        //    }
        //// 2
        //for (;;) {
        //    }
        //    // 3
        //    int i = 0;
        //while (i < 10) {
//    }
//    Powyższy kod nigdy nie zakończy swojego działania i doprowadzi do zawieszenia się aplikacji.

//        Pętla WHILE

//        String[] kursyProgramowania =
//                {
//                        "Java",
//                        "Java Aplikacje",
//                        "Java Strumienie",
//                        "Java Aspekty Zaawansowane",
//                        "Java Android",
//                        "C#",
//                        "C# Tworzenie Aplikacji",
//                        "C# LINQ",
//                        "Pascal",
//                        "Cyber Bezpieczeństwo"
//                };
//        int i = 0;
//        while (i < kursyProgramowania.length) {
//            System.out.println(kursyProgramowania[i]);
//            i++;
//        }


//      Pętla DO WHILE
//        String[] kursyProgramowania =
//                {
//                        "Java",
//                        "Java Aplikacje",
//                        "Java Strumienie",
//                        "Java Aspekty Zaawansowane",
//                        "Java Android",
//                        "C#",
//                        "C# Tworzenie Aplikacji",
//                        "C# LINQ",
//                        "Pascal",
//                        "Cyber Bezpieczeństwo"
//                };
//        int i = 0;
//        do
//        {
//            System.out.println(kursyProgramowania[i]);
//
//            i++;
//        }while(i < kursyProgramowania.length);

//         ZADANIE
//        int licznik = 0;
//
//        while(licznik<10){
//            System.out.println("To jest petla");
//            licznik++;
//        }
//        System.out.println("Koniec pętli");

        //         ZADANIE

//        int[] tab1 = new int[10];
//        int k = 0;
//        while (k < tab1.length) {
//            tab1[k] = k + 1;
//            System.out.println(tab1[k]);
//            k++;
//        }
    }
}