package Lesson_4;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many add book in library ::");
        int bookcount = scanner.nextInt();


        String[][] library = new String[bookcount][2];

        for (int i = 0; i < bookcount; i++) {

            System.out.print((i + 1) + " Enter book name:::");
            library[i][0] = scanner.next();
            System.out.print((i + 1) + " Enter Author name:::");
            library[i][1] = scanner.next();


        }
        for (int i = 0; i < library.length; i++) {
            for (int j = 0; j < library[i].length; j++) {

            }
            System.out.println(" Library: ");
            System.out.println(" Book name  " + library[i][0]);
            System.out.println(" Author  " + library[i][1]);
        }
    }
}
