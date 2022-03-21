package Chapterday.methods;


public class Sms {

    String number;

    String text;

    int priority;

    static final String PREFIX = "ING Bank Slaski:";

    void send() {
//        Zadanie 1. Zaimplementuj metodę send klasy Sms, która wypisze treść SMSa na ekran.
        System.out.println(text);
    }

    boolean checkNumber() {
//        Zadanie 2. Zaimplementuj metodę checkNumber klasy Sms, która zweryfikuje numer telefonu:

//        a) ma dokładnie 9 znaków,
        if (number.length() != 9) {
            return false;
        }
//        b) wszystkie znaki są cyframi,
        for (int i = 0; i < number.length(); i++) {
            if (!(number.charAt(i) >= '0' && number.charAt(i) <= '9')) {
                return false;
            }
        }
//        c) co najmniej 1 znak jest różny od '0'
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                return true;
            }
        }
        return false;
    }

    String correctText() {
////        Zadanie 3. Zaimplementuj metodę correctText klasy Sms, która poprawi treść SMS:

////        a) jeśli treść nie zaczyna się od "ING Bank Slaski:", to uzupełniamy treść o taki początek
        if (!text.startsWith(PREFIX)) {
            text = PREFIX + text;
        }
////        b) jeśli treść przekracza 159 znaków, to ją docinamy do zadanej długości
        if (text.length() > 159) {
            text = text.substring(0, 159);
        }
////        c) zamieniamy polskie znaki (ą,ć,... na a,c,...)
        String polskieZnaki = "ąĄćĆęĘłŁńŃóÓśŚźŹżŻ";
        String zamienniki = "aAcCeElLnNoOsSzZzZ";
        for (int i = 0; i < polskieZnaki.length(); i++) {
            text = text.replace(polskieZnaki.charAt(i), zamienniki.charAt(i));
        }
        return text;
    }
}
