package Review;//package pl.ing.tci.course.review;
//
//import java.time.ZonedDateTime;
//
//import static pl.ing.tci.course.review.TypSuboferty.MARKETINGOWA;
//
//public class Suboferta {
//
//    int numerSuboferty;
//    String opisKomunikacji;
//    TypSuboferty typSuboferty;
//    ZonedDateTime dataWaznosciOd;
//    ZonedDateTime dataWaznosciDo;
//    boolean grupaGlobalna;
//    FlagiMarketingowe profilowaniMarketingowe;
//    FlagiMarketingowe marketingElektroniczny;
//    double poziomPersonalizacji;
//
//    void wyswietlSzczegoly(){
//        System.out.println("numer suboferty:" + numerSuboferty);
//        System.out.println("opis suboferty:" + opisKomunikacji);
//        System.out.println("typ suboferty:" + typSuboferty);
//        System.out.println("data ważności końca suboferty:" + dataWaznosciDo);
//    }
//
//    boolean aktualnoscSuboferty(){
//        ZonedDateTime today = ZonedDateTime.now();
//
//        return today.isAfter(dataWaznosciOd) && today.isBefore(dataWaznosciDo);
//    }
//
//    boolean pprawnoscSuboferty(){
//        if(typSuboferty == MARKETINGOWA){
//            return profilowaniMarketingowe == FlagiMarketingowe.T && marketingElektroniczny == FlagiMarketingowe.T;
//
//        }
//
//
//    }

//}

//         * Zadanie 2
//                 * ---------
//                 * Dla klasy suboferty zaimplementuj następujące metody:
//                 * - wyświetl szczegóły suboferty: numer, opis, typ, data końca ważności
//                 * - sprawdź czy suboferta jest aktualna pod względem daty ważności (T/N)
//                 * - sprawdź czy suboferta jest poprawna tzn.:
//                 *      dla suboferty marketingowej są zweryfikowane zgody na profilowanie i marketing,
//                 *      dla suboferty operacyjnej jest zweryfikowana zgoda na profilowanie
//                 * - (*) porównaj poziomy personalizacji 2 subofert i zwróć:
//                 *      -1 dla przypadku, gdy druga suboferta będzie miała wyższy poziom personalizacji
//                 *      0 dla równych poziomów personalizacji
//                 *      1 dla przypadku, gdy piersza suboferta będzie miała wyższy poziom personalizacji
//                 * */

