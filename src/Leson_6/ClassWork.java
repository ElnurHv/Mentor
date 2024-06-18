package Leson_6;

public class ClassWork {
    int id;
    String Name;
    String Position;
    double salary;

    @Override
    public String toString() {
        return "ClassWork{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Position='" + Position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public ClassWork(int id, String name, String position, double salary) {
        this.id = id;
        Name = name;
        Position = position;
        this.salary = salary;
    }

    void increaseSlalary(double faiz) {


        double ewSalary = salary + salary * faiz / 100;
        System.out.println(ewSalary);

    }
}