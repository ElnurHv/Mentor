package Lesson_11.ClassWork;

public class Main {
    public static void main(String[] args) {
ClassWorkCalculator work=new ClassWorkCalculator();

work.add(5,5);
work.add(6,6);
work.add(4,4,4);
        System.out.println(work.add(5,5));
ScientificCalculator calc=new ScientificCalculator();
calc.power(5,2);

    }
}
