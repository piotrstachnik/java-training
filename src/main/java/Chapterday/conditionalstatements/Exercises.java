package Chapterday.conditionalstatements;

public class Exercises {
    public static void main(String[] args) {
        // Zadanie 1.
        // Mając do dyspozycji poniższe zmienne logiczne. Przypisz do zmiennej wysylkaSms warunek czy do
        // klienta możemy wysłać jakąkolwiek komunikacje SMSową,
        // a następnie wypisz w konsoli odpowiedni komunikat:
        // "Kwalifikacja do wysyłki SMS spełniona.", "Kwalifikacja do wysyłki SMS nie spełniona"
        // Podpowiedź:
        // Użyj operatorów logicznych && (i), || (lub) oraz nawiasów.


        boolean wysylkaSms;

        boolean numerTelefonuIstnieje = true;
        boolean numerTelefonuMaDziewięcZnaków = true;
        boolean kwalifikacjaDoAkcjiSms = true;
        boolean kwalifikacjaDoAkcjiOperacyjnych = true;
        boolean kwalifikacjaDoAkcjiMarketingowych = false;

        //Rozwiązanie
        wysylkaSms = numerTelefonuIstnieje && numerTelefonuMaDziewięcZnaków && kwalifikacjaDoAkcjiSms &&
                (kwalifikacjaDoAkcjiOperacyjnych || kwalifikacjaDoAkcjiMarketingowych);
        if (wysylkaSms) {
            System.out.println("Kwalifikacja do wysyłki SMS spełniona.");
        } else {
            System.out.println("Kwalifikacja do wysyłki SMS nie spełniona");
        }

        // Zadanie 2.
        // Zdefiniuj zmienną znakową typSms i korzystając z instrukcji warunkowej switch wypisz w konsoli komunikaty w zależności od tej zmiennej:
        // Komunikaty: "Wysyłam sms jako marketingowy. Sprawdzenie zgod marketingowych jest wymagane.",
        // "Wysyłam sms jako operacyjny. Sprawdzenie zgód marketingowych nie jest wymagane"
        // "ERROR: Nieznany typ smsa. Zweryfikuj typ ponownie!"
        // Podpowiedź:
        // typ smsa może być marketingowy lub operacyjny

        //Rozwiązanie
        char typSms = 'O';
        switch (typSms) {
            case 'O':
                System.out.println("Wysyłam sms jako operacyjny. Sprawdzenie zgód marketingowych nie jest wymagane");
                break;
            case 'M':
                System.out.println("Wysyłam sms jako marketingowy. Sprawdzenie zgod marketingowych jest wymagane.");
                break;
            default:
                System.out.println("ERROR: Nieznany typ smsa. Zweryfikuj typ ponownie!");
        }
    }
}
