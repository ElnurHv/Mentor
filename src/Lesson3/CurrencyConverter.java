package Lesson3;

import java.util.Scanner;

public class CurrencyConverter {
    public static <source> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print(" Enter the amoubt to be converted: ");
        int amount = scanner.nextInt();
        String source = scanner.nextLine();
        System.out.print(" Enter the target currency code: ");
        String target = scanner.nextLine();
        int amountc=0;

        switch (source ) {
            case "USD":
                System.out.println(amount*1.76+"Enter the source currency code:");

            case "EUR":
                System.out.println(amount*1.80);
        }



    }

}

