package Chapterday.refactoring;

public class Runner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("111", 150f, "PLN");
        bankAccount.printAccountBalance();
        bankAccount.changeAccountCurrency(null);
        bankAccount.printAccountBalance();
        bankAccount.changeAccountCurrency("PLN");
        bankAccount.printAccountBalance();
//        bankAccount.curency = "EUR";
        bankAccount.printAccountBalance();

//        String s1 = new String("Ala ma kota");
//        System.out.println(s1);
//        String s2 = new String("Ala ma kota");
//        System.out.println(s2);
//        String s3 = "Ala ma kota";
//        String s4 = "Ala ma kota";
//        System.out.println(s3);
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(s1 == s3);
//        System.out.println(s3 == s4);
//        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));
//        System.out.println(System.identityHashCode(s3));
//        System.out.println(System.identityHashCode(s4));
    }
}
