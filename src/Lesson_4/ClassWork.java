package Lesson_4;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the numbers of colums:");
        int col = scanner.nextInt();
        int[][] arrrays = new int[row][col];


        for (int i = 0; i < arrrays.length; i++) {

            for (int j = 0; j < arrrays[i].length; j++) {
                System.out.print("Enter the elements at position (" + i + "; " + j + " )");
                arrrays[i][j] = scanner.nextInt();


            }


        }

        for (int k = 0; k < arrrays.length; k++) {
            for (int i = 0; i < arrrays[k].length; i++) {
                System.out.print(arrrays[i][k] + " ");
            }
            System.out.println();
        }
        int largest = arrrays[0][0];
        for (int i = 0; i < arrrays.length; i++) {
            for (int j = 0; j < arrrays[i].length; j++) {
                if (arrrays[i][j] > largest) {
                    largest = arrrays[i][j];


                }

            }
        }
        System.out.println("The biggest element:: "+largest);
    }

}