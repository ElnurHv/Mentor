package Lesson3;

import java.util.Scanner;

public class ClassWork3 {
    public static void main(String[] args) {


    Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter array size");

        int arrayinOlcusu = scanner.nextInt();


int sum =0;
int [] numbers=new int[arrayinOlcusu];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the "+i+"elements");

            numbers[i]=scanner.nextInt();
            sum = sum + numbers[i];

        }
            double avarage= sum/numbers.length;

            System.out.println("Avarage value of elements is:"+avarage);


}
}