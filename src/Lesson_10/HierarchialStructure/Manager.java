package Lesson_10.HierarchialStructure;


public class Manager extends Employe {

    int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void calculateBonus() {
        double bonus = getSalary() * 0.25 * teamSize;
        System.out.println(getName() + " Salary bonus " + bonus);


    }

    @Override
    public void display() {
        super.display();
        System.out.println("Team Size " + teamSize);


    }
}
