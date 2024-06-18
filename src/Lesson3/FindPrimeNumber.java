package Lesson3;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower bound of the range");
        int b = scanner.nextInt();
        System.out.println("Enter the upper bound of the range");
        int u = scanner.nextInt();
        for (int i = b; i <= u; i++) {
            boolean prime = true;
            for (int j = 2; j < (i / 2) ; j++)
                if (i%j == 0) {
                    prime = false;
                    break;
                }
            if (prime)
            System.out.print(i+"--");
    }


            }


        }


