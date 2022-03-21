package Chapterday.refactoring;

public class Sms {
    String phoneNumber;
    String text;
    Integer priority;

    // Opowiem chwilę o modyfikatorach dostępu (wystarczy public i private). Pokażę jak stworzyć gettery i settery.

    // Zadanie1: stwórz konstruktor przyjmujący numer, treść i priorytet, żeby możliwe było tworzenie instancji obiektów
    // w taki sposób
    // Sms sms = new Sms("609998877", "abc", 1);

    public Sms(String phoneNumber, String text, Integer priority) {
        this.phoneNumber = phoneNumber;
        this.text = text;
        this.priority = priority;
    }
}
