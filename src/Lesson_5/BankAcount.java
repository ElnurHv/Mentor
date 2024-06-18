package Lesson_5;

import java.util.Scanner;

public class BankAcount {
    Scanner sc = new Scanner(System.in);
    String accountname;
    double balance;


    BankAcount(String accountname, double balance) {
        this.accountname = accountname;
        this.balance = balance;
    }


    void deposit() {
        System.out.println("Enter deposit money:::");

        double depositmoney = sc.nextDouble();


        if (depositmoney != 0) {
            balance = this.balance + depositmoney;


            System.out.println("Remaining money:::: " + balance);

        } else {

            System.out.println("Invalid amount");
        }
    }

    void cashdraw() {
        System.out.println("How much cash will you withdraw?:::");
        double cashdrawmoney = sc.nextDouble();


        if (balance > cashdrawmoney) {

            balance = balance - cashdrawmoney;
            System.out.println("Remaining money:::: " + balance);
        } else {
            System.out.println(" insuffisient funds ");
        }
    }


}
