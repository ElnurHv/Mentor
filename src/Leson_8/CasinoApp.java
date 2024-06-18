package Leson_8;

import java.util.Scanner;

public class CasinoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Only the casino owner wins gambling\n" + "Gambling is very dangerous");
        System.out.println("The cost of pulling the lever is  5$ ");
        System.out.println("Big Jackpot   X1000 ");
        System.out.println("Enter your Money $ ");

        int balance = scanner.nextInt();
        int pullCost = 5;
        int winPrice = 1000;

        SlotMachine slotMachine = new SlotMachine(balance, pullCost, winPrice);
        System.out.println("How many times do you want to play?");
        int time = scanner.nextInt();

        slotMachine.play(time);
        slotMachine.pullLever();


    }
}
