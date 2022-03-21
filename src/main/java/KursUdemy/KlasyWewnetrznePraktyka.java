package KursUdemy;//package pl.ing.tci.course.practice;
//
//public class KlasyWewnetrznePraktyka {
//
//    public static void main(String[] args)
//    {
//        KontoOszczednosciowe kontoOszczednosciowe = new KontoOszczednosciowe(5000);
//
//        System.out.println("Saldo przed operacją naliczenia odsetek: " + kontoOszczednosciowe.getStanKonta());
//
//        kontoOszczednosciowe.start(1.5);
//
//        System.out.println("Saldo po operacji naliczenia odsetek: " + kontoOszczednosciowe.getStanKonta());
//    }
//}
//
//class KontoOszczednosciowe
//{
//    public KontoOszczednosciowe(double stanKonta) {
//        this.stanKonta = stanKonta;
//    }
//
//    private double stanKonta;
//
//    public double getStanKonta() {
//        return stanKonta;
//    }
//
//    void start(double stopa)
//    {
//        Odsetki odsetki = new Odsetki(stopa);
//        odsetki.zmienStanKonta(stopa);
//    }
//
//    class Odsetki
//    {
//        public Odsetki(double stopaProcentowa) {
//            this.stopaProcentowa = stopaProcentowa;
////            this.zmienStanKonta(stopaProcentowa);
//        }
//
//        void zmienStanKonta(double stopa)
//        {
//            double odsetki = (stanKonta * stopa) / 100;
//            stanKonta += odsetki;
//        }
//
//        private double stopaProcentowa;
//    }
//}