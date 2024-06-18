package Lesson_9;

import java.util.Scanner;

public class StringConcat {
    Scanner scan = new Scanner(System.in);
  private   String name;
  private   int repeat;



    public void concatString() {
        System.out.print("Enter the String: ");
        this.name = scan.next();
        System.out.print("Enter the number of times concatante: ");
        this.repeat = scan.nextInt();


    }

    public void repeatString(int time) {

        System.out.println( name.repeat(time));
//        for (int i = 0; i < repeat; i++) {
//            System.out.print(name);
//s
//        }
    }

    public static void main(String[] args) {
        StringConcat string = new StringConcat();
        string.concatString();
        string.repeatString(5);


    }
}
