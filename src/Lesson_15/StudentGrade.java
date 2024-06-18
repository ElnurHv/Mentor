package Lesson_15;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args)  {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of student ");
        int studentNumber = scan.nextInt();


        int grade[] = new int[studentNumber];


        for (int i = 0; i < studentNumber; i++) {
            System.out.println("Enter grade for Student " + i + "  ");
            grade[i] = scan.nextInt();
        }
            double avarage = calculateAvarage(grade);
            int highest = findHighest(grade);

            System.out.println(avarage);
            System.out.println(highest);







    }

    public static double calculateAvarage(int[] grade) {
        if (grade.length == 0) {
            return 0;
        }
   double sum=0;
        for (int grades:grade) {
            sum += grades;
        }
        return sum/grade.length;

    }


    public static  int findHighest(int[] grade){
        if (grade.length==0) {

        }

              int highest=grade[0];
        for (int i = 0; i < grade.length; i++) {
            if (grade[i]>highest){
                highest=grade[i];
            }

        }
                return highest;
        }
    }


















