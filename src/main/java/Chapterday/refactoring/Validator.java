package Chapterday.refactoring;
import java.util.Locale;
public class Validator {
    /**
     * Checks if @param sms is valid. Valid sms:
     * <p>
     * phoneNumber:
     * - contains only digits
     * - is exactly 9 digits long
     * - doesn't start with 0
     * <p>
     * text:
     * - cannot be null nor empty String
     * - isn't longer than 160 characters
     * - doesn't contain Polish diacritical marks (ą, ć, ę, ł, ń, ó, ś, ź, ż)
     * <p>
     * priority:
     * - cannot be empty
     * - must be in range 1-100
     *
     * @return true is @param sms is valid
     */
//    public boolean isSmsValid(Sms sms) {
//        // Zadanie 5
//        // Mając zaimplementowane metody weryfikujące poszczególne elementy SMSa, sprawdź czy SMS jako całość jest poprawny.
//        // Zadanie 6
//        // Uruchom testy z pliku ValidatorTest i sprawdź czy przechodzą.
//        return isPriorityValid(sms.priority) && isTextValid(sms.text) && isPhoneNumberValid(sms.phoneNumber);
//    }
//    private boolean isPriorityValid(Integer priority) {
//        // Zadanie 2
//        // Zaimplementuj metodę zgodnie z wymaganiami biznesowymi (patrz javadoc na początku tej klasy).
//        return priority != null && priority >= 1 && priority <= 100;
//    }
//    private boolean isTextValid(String text) {
//        // Zadanie 3
//        // Zaimplementuj metodę zgodnie z wymaganiami biznesowymi (patrz javadoc na początku tej klasy).
//        if (text == null || text.isEmpty())
//            return false;
//        if (text.length() >= 160)
//            return false;
//        text=text.toLowerCase();
//        String polskieLiterki = "ąćęłńóśźż";
//        for (int i)
//            if (text.contains("ą"))
//                return false;
//        return true;
//    }
//    private boolean isPhoneNumberValid(String phoneNumber) {
//        // Zadanie 4
//        // Zaimplementuj metodę zgodnie z wymaganiami biznesowymi (patrz javadoc na początku tej klasy).
//        return false;
//    }
}
