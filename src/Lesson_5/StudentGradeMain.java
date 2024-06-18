package Lesson_5;

import java.util.Scanner;

public class StudentGradeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StudentGrade st=new StudentGrade();
        System.out.println("Student Name: ");
        st.name=sc.next();
        System.out.println("Student Age: ");
        st.age=sc.nextInt();
        System.out.println("Student Grade");
         st.grade= sc.nextInt();


         st.ttx();








    }
}
