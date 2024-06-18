package Lesson_5;

public class BankMain {
    public static void main(String[] args) {
        System.out.println("::::::::Welcome Java Bank:::::::::");
        BankAcount bk = new BankAcount("45454554", 1000);
        System.out.println("Your balance  " + bk.balance);


        bk.deposit();
        bk.cashdraw();
    }
}
