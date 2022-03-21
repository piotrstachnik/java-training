package KursUdemy;

public class InstrukcjaBreakContinue {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

//        Instrukcja "continue"
//        for (int i = 1; i <= 10; i++) {
//            if (i == 3)
//                continue; // przerywa iterację od tego momentu i nie wykonuje już żadnych intrukcji poniżej
//////                  // (czyli nie printuje "i" u nas) = kontynuuje wykonywanie całej pętli,
//////                  ale bez tego co jest po instrukcji continue dla tej iteracji
//            System.out.println(i);
//        }
//        Instrukcja "break"
//        for (int i = 1; i <= 10; i++) {
//            if (i == 3)
//                break; // przerywa instrukcje od tego momentu i wychodzi całkowicie z pętli
//            System.out.println(i);
//        }

//        ćwiczenie - wypisani liczb nieparzystych
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0)
//                continue;
//            System.out.println("nieparzyste");
//            System.out.println(i);
//        }

//        ćwiczenie - wypisani liczb nieparzystych
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0)
//                continue;
//            System.out.println("parzyste");
//            System.out.println(i);
//        }
//        ćwiczeni - wypisanie co drugirgo wiersza
        for (int k = 1; k <= 10; k++) {
            for (int i = 1; i <= 10; i++) {
                if (k % 2 != 0)
                    continue;
                System.out.print(k * i + " ");
            }
            System.out.println();
        }
    }
}
