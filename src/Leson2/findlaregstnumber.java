package Leson2;

import java.util.Random;
import java.util.Scanner;

public class findlaregstnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the range 0-10 number");
        int num1, num2, num3;

        System.out.println("Enter first number");
         num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2 = scanner.nextInt();
        System.out.println("Enter third number");
        num3 = scanner.nextInt();

        int largest = 0;

        if (num1 > num2 && num1 > num3) {

            System.out.println(" largest number is " + num1);
            largest = num1;
        } else if (num2 > num1 && num2 > num3) {

            System.out.println(" largest number is " + num2);
            largest = num2;
        } else if (num3 > num1 && num3 > num2) {

            System.out.println(" largest number is " + num3);
            largest = num3;
        } else {
            System.out.println("The number are all equal");
        }

        int r = random.nextInt(10);

        if (r == largest) {
            System.out.println(r + " Equal number " + largest);

        } else {
            System.out.println(r + " Not Equal " + largest);
        }

    }
}
