package Leson_8;


import java.util.Random;

public class SlotMachine {
    String[] symbols = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
    String[] result = new String[3];
    int balance;
    int pullCost;

    int winPrice;


    public SlotMachine(int balance, int pullCost, int winPrice) {
        this.balance = balance;
        this.pullCost = pullCost;
        this.winPrice = winPrice;
    }

    public void play(int time) {
        if (time < 0) {
            System.out.println("Invalid number of plays");
            return;
        }
        for (int i = 0; i < time; i++) {
            pullLever();
            if (balance <= 0) {
                System.out.println("Insufficient balance. Game over");
                break;
            }

        }
        System.out.println("Final balance  " + balance + '$');
    }


    public void pullLever() {

        if (balance < pullCost) {
            System.out.println("Insufficient balance for another play ");
        }
        Random random = new Random();


        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < result.length; j++) {


                result[j] = symbols[random.nextInt(symbols.length)];

            }
        }
        System.out.println("Result of the lever pull: " + result[0] + " - " + result[1] + " - " + result[2]);


        if (result[0].equals(result[1]) && result[1].equals(result[2])) {
            int win = pullCost * winPrice;
            System.out.println("Congratulations! You win!" + winPrice + '$');


        } else {
            System.out.println("Sorry, you lose." + pullCost + '$');
            balance -= pullCost;

            System.out.println("Your balance  " + balance + '$');

        }


    }


}

