package Lesson_10.HierarchialStructure;

import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {

        Employe employe = new Employe("Turan", 800);

        employe.calculateBonus();
        employe.display();



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Team Size ");
        Manager manage = new Manager("Vasif", 1200, scan.nextInt());

        manage.calculateBonus();
        manage.display();

        Director direct = new Director("Isfandiyar", 2800, 10);

        direct.calculateBonus();
        direct.display();


    }

}
