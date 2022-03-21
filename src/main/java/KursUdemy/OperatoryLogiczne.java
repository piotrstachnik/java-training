package KursUdemy;

public class OperatoryLogiczne {
    public static void main(String[] args) {

        //OPERATORY LOGICZNE TRUE/FALSE

// Operatory logiczne działają na wartościach logicznych (typ boolean) i same zwracają wartość logiczną, realizując podstawowe operacje algebry Boole’a.
// Argumenty operatorów wyliczane są zawsze od lewej do prawej strony.
// Wyliczenie wartości drugiego operatora może zostać pominięte, jeżeli na podstawie pierwszego można określić wynik całej operacji.
//Operatory te są wręcz stworzone do tego by używać ich razem z instrukcją warunkową!

// RODZAJE OPERATORÓW LOGICZNYCH:
// 1. Negacja (+ prawo podwójnego zaprzeczenia)
// 2. Koniunkcja
// 3. Alternatywa (+ alternatywa rozłączna)
// 4. Równoważność

// 1. NEGACJA !
//      Negację, czyli zaprzeczenie, można tłumaczyć jako „nieprawda, że”.
//      W Javie do jej prezentacji wykorzystywany jest operator znaku wykrzyknika !.
//      !(true) - false
//      !(false) - true

//            boolean value1 = true;
//            boolean value2 = !value1;
//            System.out.println(value2);

//      Prawo podwójnego zaprzeczenia: Podwójne przeczenie zeruje się i wartość pozostaje bez zmian.
//            boolean value3 = true;
//            boolean value4 = !!value3;
//            System.out.println(value4);

// 2. KONIUNKCJA &&
//      Operator koniunkcji przyjmuje dwa argumenty typu boolean i również zwraca typ boolean.
//      Można go przetłumaczyć jako zdanie, że koniunkcja jest prawdziwa wtedy i tylko wtedy, gdy oba jej argumenty są prawdą.
//      Koniunkcja nazywana jest też iloczynem logicznym.

//            boolean value5 = true;
//            boolean value6 = true;
//            boolean value7 = value5&&value6;
//            System.out.println(value7);

//      true true -> true
//      true false -> false
//      false true -> false
//      false false -> false

//        KONIUNKCJA : &
//        boolean logiczna7a = logiczna1 & logiczna2;
//        boolean logiczna8a = logiczna1 & !logiczna2;
//        System.out.println("");
//        System.out.println("Wartość koniunkcji zmiennej logiczna1 i logiczna2: " + logiczna7a + ".");
//        System.out.println("Wartość koniunkcji zmiennej logiczna1 i negacji zmiennej logiczna2: " + logiczna8a + ".");

//            int x = 2;
//            int y = 10;
//            if(x > 0 & y/x > 1){
//                System.out.println("");
//                System.out.println("Wartość w if'e była równa true");
//            } else {
//                System.out.println("");
//                System.out.println("Wartość w if'ie była równa false");
//            }

// 3. ALTERNATYWA ||
//      Alternatywa, czyli suma logiczna, jest prawdziwa, jeżeli chociaż jeden z jej argumentów jest prawdziwy.

//            boolean value8 = true;
//            boolean value9 = false;
//            boolean value10 = value5||value6;
//            System.out.println(value10);

//      true true -> true
//      true false -> true
//      false true -> true
//      false false -> false

//        ALTERNATYWA : |
//        boolean logiczna9a = logiczna1 | logiczna2;
//        boolean logiczna10a = !logiczna1 | logiczna2;
//        System.out.println("");
//        System.out.println("Wartość alternatywy zmiennej logiczna1 i logiczna2: " + logiczna9a + ".");
//        System.out.println("Wartość alernatywy negacji zmiennej logiczna1 i zmiennej logiczna2: " + logiczna10a + ".");

//            int z = 2;
//            int t = 10;
//            if(z != 0 | t/z > 1){
//                System.out.println("");
//                System.out.println("Wartość w if'e była równa true");
//            } else {
//                System.out.println("");
//                System.out.println("Wartość w if'ie była równa false");
//            }

//      W przeciwieństwie do koniunkcji, w alternatywie może zdarzyć się, że jej drugi argument nie zostanie wyliczony.
//      Argumenty zawsze wyliczane są od lewego do prawego. Jeżeli pierwszy będzie prawdą, to niezależnie od wyniku drugiego,
//      całe wyrażenie również zwróci prawdę, dlatego w celach optymalizacyjnych Java pomija wyliczanie drugiego argumentu.
//      Jeżeli drugi argument będzie metodą i nie zostanie ona wywołana, może to skutkować trudnymi do wykrycia błędami,
//      dlatego nie powinno się uzależniać swojego kodu od jej wykonania.

//      ALTERNATYWA ROZŁĄCZNA (XOR) !=
//      Można ją przetłumaczyć jako: albo to, albo tamto, czyli jej argumenty muszą być różne, żeby całe wyrażenie zwróciło prawdę.

//            boolean value11 = true;
//            boolean value12 = false;
//            boolean value13 = value11!=value12;
//            System.out.println(value13);

//      true true -> false
//      true false -> true
//      false true -> true
//      false false -> false

// 4. RÓWNOWAŻNOŚĆ ==
//      Równoważność jako wyrażenie jest poprawne, jeżeli oba jej argumenty są identyczne, czyli albo oba są prawdą, albo oba fałszem.

//            boolean value14 = true;
//            boolean value15 = false;
//            boolean value16 = value14==value15;
//            System.out.println(value16);

        //PRZYKŁADY ZASTOSOWANIA W PROSTYCH KONSTRUKCJACH WARUNKOWYCH
//        int x = 3;
//        int y = 5;
//
//        if ((x > 2) && (y < 6)) //prawda bo x jest większe od 2 i y jest mniejsze od 6
//        if ((x > 2) && (y < 6)) //prawda bo x jest większe od 2 i y jest mniejsze od 6
//        if ((x > 2) || (y < 3)) //prawda bo x jest większe od 2
//        if (x != 2) //prawda bo x jest różne od 2
//        if (!(x != 2)) //fałsz bo x jest różne od 2
//        if (x >= 3) //prawda bo x jest równe 3
//        if (x == 3) //prawda bo x jest równe 3 i jest tego samego typu co cyfra 3
//        if (x == "3") //fałsz bo x jest równe 3 ale nie jest typu znakowego
//        if (x != "3")  //prawda bo x jest równe 3 ale nie jest typu znakowego
//        if ((x == 3) ^ (y == 3)) //prawda bo x jest równe 3 a y nie jest równe 3 (tylko 1 spełniony)
//        if ((x == 3) ^ (y == 5)) //fałsz bo x jest równe 3 i y jest równe 5 9oba spełnione)
//        if ((x == 3) && (typeof(3) == 'number')) //prawda, bo x jest równe 3 i x jest typu number
//        if (!(x != 3)) //prawda, bo x nie nie jest równe 3
//        if (y % 2 == 0)//fałsz, bo y nie jest liczbą parzystą

//            ZADANIE
        int itemValue = 100 + 50;
        System.out.println(itemValue);

        int itemCurrentValue = itemValue + 250;
        System.out.println(itemCurrentValue);

        int itemNextValue = itemCurrentValue + itemValue;
        System.out.println(itemNextValue);

        // Przypisanie nowej wartości do zmiennej
        itemValue = 10;
        System.out.println(itemValue);

        // Dodanie nowej wartości do zmiennej
        // i przypisanie wyniku do tej samej zmiennej
        itemValue += 5;
        System.out.println(itemValue);

        // Pomnożenie wartości zmiennej
        // i przypisanie wyniku do tej samej zmiennej
        itemValue *= 3;
        System.out.println(itemValue);

        if (itemValue >= 10) {
            System.out.println("Zmienna jest większa od 10.");
        }
    }
}
