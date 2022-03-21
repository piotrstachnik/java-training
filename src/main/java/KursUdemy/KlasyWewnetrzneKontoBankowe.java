package KursUdemy;

public class KlasyWewnetrzneKontoBankowe {

    public static void main(String[] args)
    {
        KontoOszczednosciowe kontoOszczednosciowe = new KontoOszczednosciowe(5000);

        System.out.println(kontoOszczednosciowe.getStanKonta());

        kontoOszczednosciowe.start(1.5);

        System.out.println(kontoOszczednosciowe.getStanKonta());
    }
}

class KontoOszczednosciowe
{
    public KontoOszczednosciowe(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    private double stanKonta;

    public double getStanKonta() {
        return stanKonta;
    }

    void start(double stopa)
    {
        Odsetki odsetki = new Odsetki(stopa);
    }

    class Odsetki
    {
        public Odsetki(double stopaProcentowa) {
            this.stopaProcentowa = stopaProcentowa;
            this.zmienStanKonta();
        }

        void zmienStanKonta()
        {
            double odsetki = (stanKonta * stopaProcentowa) / 100;
            stanKonta += odsetki;
        }



        private double stopaProcentowa;
    }
}