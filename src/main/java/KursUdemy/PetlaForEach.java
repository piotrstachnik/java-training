package KursUdemy;

public class PetlaForEach {
    public static void main(String[] args) {
        // Enhanced For - ulepszona pętla (Pętla For-Each)
// Ulepszony for: pętla ogranicza liczbę parametrów wewnątrz nawiasów.
// W tym typie nie musimy wspominać o żadnym warunku ani wartości zwiększania / zmniejszania.
// Sekwencyjne przeglądanie różnych zbiorów danych. Mogą nimi być tablice, a także dynamiczne struktury jak na przykład listy.

// ************PRZYKŁAD 1************
        int[] tablica = new int[10];
//wypełnienie tablicy
        for (int i = 0; i < 10; i++) {
            tablica[i] = i + 1;
//            System.out.println(tablica[i]);
        }
//wyświetlenie tablicy - pętla for-each
        for (int x : tablica) {
            System.out.println(x);
        }
        System.out.println("");
        //modyfikacja tablicy
        tablica[4] = 90;
        for (int x : tablica) {
            System.out.println(x);
        }

// ************PRZYKŁAD 2************
//            String[] lang = {"Java","C","C++","PHP","VBScript","Javascript"};
//            for(String names: lang) {
//                System.out.println(names);
//            }
// ************PRZYKŁAD 3************
// tworzymy listę
//        ArrayList<String> myArray = new ArrayList<>();
//        myArray.add("Jabłko");
//        myArray.add("Banan");
//        myArray.add("Grejpfrut");

//myArray.for() -> java sama proponuje nam urposzczony zapis (wynik poniżej)
//        for (String s : myArray) {
//
//        }
// for-each
//        for (String myValue : myArray) {
//            System.out.println(myValue);
//        }
//************PRZYKŁAD 4************
//            String[] kursyProgramowania =
//                    {
//                            "Java",
//                            "Java Aplikacje",
//                            "Java Strumienie",
//                            "Java Aspekty Zaawansowane",
//                            "Java Android",
//                            "C#",
//                            "C# Tworzenie Aplikacji",
//                            "C# LINQ",
//                            "Pascal",
//                            "AutoIT"
//                    };
        // for (INICJALIZACJA ZMIENNYCH; WARUNEK PETLI; CO MA SIE STAC PO WYKONANIU INSTRUKCJI WSZYSTKICH W PETLI)
//        for(int i = 0; i < kursyProgramowania.length; i++)
//        {
//            System.out.println(kursyProgramowania[i]);
//
//        }
        //ENHANCED FOR
//            for(String nazwaKursu: kursyProgramowania)
//            {
//                System.out.println(nazwaKursu);
//            }

    }
}
