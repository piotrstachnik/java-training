package KursUdemy;

public class ZmienneLogiczne {
    public static void main(String[] args){
        //        Zmienne logiczne przyjmują tylko dwie wartości: true lub false
//        boolean logiczna1 = true;
//        boolean logiczna2 = false;
//        System.out.println("Wartość zmiennej logicznej logiczna1: " + logiczna1 + ".");
//        System.out.println("Wartość zmiennej logicznej logiczna1: " + logiczna2 + ".");

//        Operacje na zmiennych logicznych
//        Operatory logiczne działają na wartościach logicznych (typ boolean) i same zwracają wartość logiczną.
//        Operatory logiczne:

//        1. NEGACJA : !
//        boolean logiczna3 = !logiczna1;
//        boolean logiczna4 = !logiczna2;
//        System.out.println("");
//        System.out.println("Wartość negacji zmiennej logicznej logiczna1: " + logiczna3 + ".");
//        System.out.println("Wartość negacji zmiennej logicznej logiczna1: " + logiczna4 + ".");

//        Prawo podwójnej negacji - dwie negacje danego zdania w wyniku dają to samo zdanie
//        boolean logiczna5 = !!logiczna1;
//        boolean logiczna6 = !!logiczna2;
//        System.out.println("");
//        System.out.println("Wartość podwójnej negacji zmiennej logicznej logiczna1: " + logiczna5 + ".");
//        System.out.println("Wartość podwójnej negacji zmiennej logicznej logiczna1: " + logiczna6 + ".");

//        2. KONIUNKCJA : && (koniunkcja jest prawdziwa wtedy, gdy oba wyrażenia są prawdziwe)
//        boolean logiczna7 = logiczna1 && logiczna2;
//        boolean logiczna8 = logiczna1 && !logiczna2;
//        System.out.println("");
//        System.out.println("Wartość koniunkcji (leniwej) zmiennej logiczna1 i logiczna2: " + logiczna7 + ".");
//        System.out.println("Wartość koniunkcji (leniwej) zmiennej logiczna1 i negacji zmiennej logiczna2: " + logiczna8 + ".");

//        KONIUNKCJA : &
//        boolean logiczna7a = logiczna1 & logiczna2;
//        boolean logiczna8a = logiczna1 & !logiczna2;
//        System.out.println("");
//        System.out.println("Wartość koniunkcji zmiennej logiczna1 i logiczna2: " + logiczna7a + ".");
//        System.out.println("Wartość koniunkcji zmiennej logiczna1 i negacji zmiennej logiczna2: " + logiczna8a + ".");

//        Kiedy to się może przydać?
//        int x = 2;
//        int y = 10;
//        if(x > 0 & y/x > 1){
//            System.out.println("");
//            System.out.println("Wartość w if'e była równa true");
//        } else {
//            System.out.println("");
//            System.out.println("Wartość w if'ie była równa false");
//        }

//        3. ALTERNATYWA : || (alternatywa jest prawdziwa wtedy, gdy co najmniej jeden z warunków jest spełniony)
//        boolean logiczna9 = logiczna1 || logiczna2;
//        boolean logiczna10 = !logiczna1 || logiczna2;
//        System.out.println("");
//        System.out.println("Wartość alternatywy (leniwej) zmiennej logiczna1 i logiczna2: " + logiczna9 + ".");
//        System.out.println("Wartość alernatywy (leniwej) negacji zmiennej logiczna1 i zmiennej logiczna2: " + logiczna10 + ".");

//        ALTERNATYWA : |
//        boolean logiczna9a = logiczna1 | logiczna2;
//        boolean logiczna10a = !logiczna1 | logiczna2;
//        System.out.println("");
//        System.out.println("Wartość alternatywy zmiennej logiczna1 i logiczna2: " + logiczna9a + ".");
//        System.out.println("Wartość alernatywy negacji zmiennej logiczna1 i zmiennej logiczna2: " + logiczna10a + ".");

        //        Kiedy to się może przydać?
//        int z = 2;
//        int t = 10;
//        if(z != 0 | t/z > 1){
//            System.out.println("");
//            System.out.println("Wartość w if'e była równa true");
//        } else {
//            System.out.println("");
//            System.out.println("Wartość w if'ie była równa false");
//        }

//        4. RÓWNOWAŻNOŚĆ : == (i jej przeciwieństwo !=)
//        boolean logiczna11 = logiczna1 == logiczna2;
//        boolean logiczna12 = !logiczna1 == logiczna2;
//        System.out.println("");
//        System.out.println("Wartość równoważności zmiennej logiczna1 i logiczna2: " + logiczna11 + ".");
//        System.out.println("Wartość równoważności negacji zmiennej logiczna1 i zmiennej logiczna2: " + logiczna12 + ".");

//        Równoważność dla zmiennych typu primitywnego
//        int a = 5;
//        int b = 10;
//        boolean logiczna13 = a == b;
//        System.out.println("");
//        System.out.println("Czy wartość zmiennej a jest równa wartości zmiennej b?: " + logiczna13);

//        float c = 12.200f;
//        float d = 12.2f;
//        boolean logiczna14 = c == d;
//        System.out.println("");
//        System.out.println("Czy wartość zmiennej c jest równa wartości zmiennej d?: " + logiczna14);

//        typy prymitywne: int, byte, short, long, char, float, double

//        Porównywanie zmienych, które nie są typu prymitywnego odbywa się poprzez użycie metody equals(Object) z klasy Object
//        String tekst1 = "przykład";
//        String tekst2 = "przykład";
//        String tekst3 = new String("przykład");
//        boolean logiczna15 = tekst1 == tekst2;
//        boolean logiczna16 = tekst1.equals(tekst2);
//        boolean logiczna17 = tekst1 == tekst3;
//        boolean logiczna18 = tekst1.equals(tekst3);
//        System.out.println("");
//        System.out.println("Czy obiekt tekst1 jest wskaźnikiem do tego samego miejsca w pamięci co test2?: " + logiczna15);
//        System.out.println("Czy zawartość obiektu tekst1 jest równy zawartości obiektu tekst2?: " + logiczna16);
//        System.out.println("Czy obiekt tekst1 jest wskaźnikiem do tego samego miejsca w pamięci co test3?: " + logiczna17);
//        System.out.println("Czy zawartość obiektu tekst1 jest równy zawartości obiektu tekst3?: " + logiczna18);

    }
}
