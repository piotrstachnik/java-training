package Chapterday.refactoring;


public class BankAccount {
    private String ibanNumber;
    private Float balance;
    private String curency;

    public void printAccountBalance() {
        System.out.println("Account balance for account "
                + ibanNumber + " is " + balance.toString()
                + " " + curency);
    }

    public void changeAccountCurrency(String newCurrency) {
        if (this.curency.equals(newCurrency)) {
            System.out.println("No need to change " + this.curency + " -> " + newCurrency);
        } else {
            if ("PLN".equals(newCurrency)) {
                System.out.println("Currency changed " + this.curency + " -> " + newCurrency);
                this.balance *= 4.5522f;
                this.curency = "PLN";
            } else if ("EUR".equals(newCurrency)) {
                System.out.println("Currency changed " + this.curency + " -> " + newCurrency);
                this.balance *= 0.2153f;
                this.curency = "EUR";
            } else {
                System.out.println("No such currency " + newCurrency);
            }
        }
    }

    public BankAccount(String ibanNumber, Float balance, String curency) {
        this.ibanNumber = ibanNumber;
        this.balance = balance;
        this.curency = curency;
    }
}
