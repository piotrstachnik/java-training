package Basics.lesson4.enums;

public enum EnumClassExample {

    /*
    Typ wyliczeniowy to nic innego jak lista nazwanych stałych które definiują typ danych i jego dopuszczalne wartości.
    Oznacza to że wartoś enumu może być tylko taka jaką zadeklarowaliśmy na jego liście.

    enumy deklarujemy zazwyczaj dużymi literami WARTOSC_1 , WARTOSC_2 i oddzielamy przecinkami. Dobrą praktyką poprawiającą
    czytelność jest pisanie enumów od nowej liniki:
    WARTOSC_JEDEN,
    WARTOSC_DWA

   Każdy enum zawiera 2 predefiniowane metod:
   value() -> zwraca tablicę wszystkich enumów
   valueOf(String) -> Sprawdzamy czy w naszym enumie znajduje się taki jak wpisany w Stringu i nastepnie go zwracamy

   enum również ma swój konstruktor podobnie jak klasa javy. dzięki temu mozemy enumą przypisać dodatkowe właściwości takie jak np, kod błędu
     */
}
