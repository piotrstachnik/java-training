package KursUdemy;//package pl.ing.tci.course.practice;
//
//public class KlasyWewnetrznePrzyklad {
//
//    public static void main(String[] args) {
//        KontoBankowe kontoBankowe = new KontoBankowe(1000);
//
//        System.out.println(kontoBankowe.getStanKonta()); // stan konta przed operacją
//
//        kontoBankowe.start(1.5); // stopa procentowa, którą podajemy
//
//        System.out.println(kontoBankowe.getStanKonta()); // stan konta przed operacją
//    }
//}
//
//class KontoBankowe {
//    public KontoBankowe(double stanKonta) {
//        this.stanKonta = stanKonta;
//    }
//
//    private double stanKonta;
//
//    public double getStanKonta() {
//        return stanKonta;
//    }
//
//    void start(double stopa) {
//        Odsetki odsetki = new Odsetki(stopa);
////    odsetki.zmienStanKonta(stopa);
//    }
//
//    class Odsetki {
//        public Odsetki(double stopaProcentowa) {
//            this.stopaProcentowa = stopaProcentowa;
//            this.zmienStanKonta(stopaProcentowa);
//        }
//
//        void zmienStanKonta(double stopa) {
//            double odsetki = (stanKonta * stopa) / 100;
//            stanKonta += odsetki;
//        }
//
//        private double stopaProcentowa;
//    }
//}