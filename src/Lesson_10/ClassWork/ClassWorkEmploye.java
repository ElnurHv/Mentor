package Lesson_10.ClassWork;

public class ClassWorkEmploye {
 private    String name;
   private double salary;


    public ClassWorkEmploye(String name, double salary) {
        this.name = name;
        this.salary =salary;
    }

    public void getprint(){
        System.out.println(name);
        System.out.println(salary);

    }

    public static void main(String[] args) {
        ClassWorkEmploye employe=new ClassWorkEmploye("Elnur",555);
        employe.getprint();
    }

}
