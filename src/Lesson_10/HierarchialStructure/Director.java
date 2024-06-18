package Lesson_10.HierarchialStructure;

public class Director extends Employe {
    int stockOptions;

    public Director(String name, double salary, int stockOptions) {
        super(name, salary);
        this.stockOptions = stockOptions;
    }

    @Override
    public void calculateBonus() {
        double bonus = getSalary() * 0.50 * stockOptions;
        System.out.println(getName() + " Salary bonus " + bonus);
    }

    @Override
    public void display() {
        super.display();
    }
}
