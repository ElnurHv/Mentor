package Leson2;

import java.util.Scanner;

public class AS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.println("Enter number");
        a = scanner.nextInt();

        if (a > 0 && a <= 100) {


            if (a % 2 == 0) {
                System.out.println("even number" + (a));

            } else {
                System.out.println("odd" + (a));
            }


        } else {
            System.out.println("Error");

        }


    }
}
