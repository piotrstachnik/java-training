package KursUdemy;

public class PetlaWPetli {
    public static void main(String[] args) {
        // Tabliczka mnożenia - najpierw pojedyńcza pętla
//        for(int i = 1; i <= 10; i++){
//            System.out.print(i + " ");
//        }
//        System.out.println("ENTER");
        // Taraz dodaję kolejne wiersze do przemnożenia, czyli pętka w pęti
//        for (int j = 1; j <= 10; j++) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.print(i * j + " ");
//            }
//            System.out.println();
//        }

        //  a jakby dodac warunek ze jak 1 cyfra to spacja? - yruwnanie tabeki

        for (int j = 1; j <= 10; j++) {
            for (int i = 1; i <= 10; i++) {
                int wynik = i * j;
                if (wynik >= 10) {
                    System.out.print(wynik + " ");
                } else {
                    System.out.print(" " + wynik + " ");
                }
            }
            System.out.println();
        }

    }
}



