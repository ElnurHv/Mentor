package Lesson_5;

public class StudentGrade {
    String name;
    int age;
    int grade;


    void ttx(){
        System.out.println("Student Name: "+this.name);
        System.out.println("Student Age: "+this.age);
        System.out.println("Student Grade: "+this.grade);
        System.out.println("Exam passing score over 60");
        if (this.grade>60){
            System.out.println("Congrat you passed exam  ");

        }else {
            System.out.println("You didn't pass the exam");
        }

    }

}
