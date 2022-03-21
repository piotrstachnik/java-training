package KursUdemy;//package pl.ing.tci.course.practice;
//
//public class KlasyWewnetrzne {
//    public static void main(String[] args) {
//        A zewnetrzna = new A();
//
//        A.B wewnetrznaB = zewnetrzna.new B(); //aby stworzyć A.B trzeba najpierw stworzyć A
//
//        A.C wewnetrznaC = new A.C();
//    }
//}
//
//class A //klasa zewnętrzna
//{
//    A() {
//        System.out.println("Jestem z klasy zewnętrznej A");
//    }
//
//    class B //klasa wewnętrzna
//    {
//        B() {
//            System.out.println("Jestem z klasy wewnętrznej B");
//        }
//
//        void cos() {
//            int test = 5;
//        }
//
//        private int tmp;
//    }
//
//    static class C // Klasa statyczna może istniec bez klasy zewnętrznej (A),
//            // ale nie ma dostępu do jej pól
//    {
//        C() {
//            System.out.println("Jestem z klasy wewnętrznej C");
//        }
//    }
//
//    private int test; // klasa wewnętrzna ma dostęp do klasy zewnętrznej
//
//    void cos2() {
////        tmp = 2; // klasa zewnętrzna nie ma dostępu do pól klasy wewnętrznej
//    }
//}