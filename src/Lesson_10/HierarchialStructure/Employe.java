package Lesson_10.HierarchialStructure;

public class Employe {
    private String name;
    private double salary;


    public Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateBonus() {
        double bonus = salary * 0.15;
        System.out.println(name + " Salary bonus " + bonus);


    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("Salary " + salary);

    }


}
