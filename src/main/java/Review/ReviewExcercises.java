package Review;

public class ReviewExcercises {
    public static void main(String[] args) {
        /*
        * Zadanie 1
        * ---------
        * Stwórz klasę reprezentującą subofertę, która powinna posiadać następujące pola (pamiętaj o odpowiednich typach!):
        * - numer suboferty (np. 185, 1185)
        * - opis komunikacji (słowno-muzyczny)
        * - typ suboferty (marketingowa, operacyjna, informacyjna)
        * - daty ważności (od, do)
        * - flaga czy komunikujemy globalną grupę kontrolną (T/N)
        * - flaga zgody na profilowanie marketingowe (T/N/A)
        * - flaga zgody na marketing elektroniczny (T/N/A)
        * - poziom personalizacji (np. 1.1, 2.1, ...)
        * */



        /*
         * Zadanie 2
         * ---------
         * Dla klasy suboferty zaimplementuj następujące metody:
         * - wyświetl szczegóły suboferty: numer, opis, typ, data końca ważności
         * - sprawdź czy suboferta jest aktualna pod względem daty ważności (T/N)
         * - sprawdź czy suboferta jest poprawna tzn.:
         *      dla suboferty marketingowej są zweryfikowane zgody na profilowanie i marketing,
         *      dla suboferty operacyjnej jest zweryfikowana zgoda na profilowanie
         * - (*) porównaj poziomy personalizacji 2 subofert i zwróć:
         *      -1 dla przypadku, gdy druga suboferta będzie miała wyższy poziom personalizacji
         *      0 dla równych poziomów personalizacji
         *      1 dla przypadku, gdy piersza suboferta będzie miała wyższy poziom personalizacji
         * */

        /*
         * Zadanie 3
         * ---------
         * Stwórz klasę reprezentującą klienta, która powinna posiadać następujące pola (pamiętaj o odpowiednich typach!):
         * - numer klienta
         * - flaga czy posiada zgodę na profilowanie marketingowe
         * - flaga czy posiada zgodę na merketing elektroniczny
         * i zaimplementuj metodę dla suboferty:
         * - sprawdź czy suboferta może być wysłana dla danego klienta:
         *      czy aktualna
         *      czy poprawna
         *      czy występuje zgodność zgód na profilowanie i marketing
         * */

        /*
         * Zadanie 4
         * ---------
         * Stwórz tablice:
         * - 5 subofert o różnych parametrach
         * - 5 klientów o różnych parametrach
         * i za pomocą pętli wypisz dla każdego klienta szczegóły subofert, które mogą być dla nich wysłane.
         * (*) Dla każdego klienta wypisz szczegóły suboferty (pasującej dla klienta) o najwyższym poziomie personalizacji.
         * */
    }
}
