package Lesson_5;

public class RecMAin {
    public static void main(String[] args) {
        RectangleAP rc=new RectangleAP();

        rc.widht=15;
        rc.lenght=10;

        System.out.println(rc.areaCalculate());
        System.out.println(rc.perimetrcalculate());

    }
}
