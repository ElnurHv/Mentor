package Lesson_10.ClassWork;

public class ClassWorkManager extends ClassWorkEmploye {

    private int teamSize;

    public ClassWorkManager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void getprint() {
        super.getprint();
        System.out.println(teamSize);
    }

    public static void main(String[] args) {
        ClassWorkManager manager = new ClassWorkManager("Elnur", 555, 8);
manager.getprint();
    }
}