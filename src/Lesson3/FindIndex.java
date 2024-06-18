package Lesson3;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the numbers elements of Array::");
        int ArraySize = scanner.nextInt();
        int[] array = new int[ArraySize];
        System.out.println(" Enter the elemets of the array::");

        for (int i = 0; i < array.length; i++) {

            array[i] = scanner.nextInt();

        }
        System.out.print("Enter the target value::");
        int target = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {


            if (array[i] == target) {
                target = i;

                System.out.print(" Target value found index:: " + target);


            }


        }
    }
}
