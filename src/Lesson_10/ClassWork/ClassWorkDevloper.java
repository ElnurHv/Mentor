package Lesson_10.ClassWork;

public class ClassWorkDevloper extends ClassWorkEmploye {


     private  String proqramLanguage;

    public ClassWorkDevloper(String name, double salary, String proqramLanguage) {
        super(name, salary);
        this.proqramLanguage = proqramLanguage;
    }

    @Override
    public void getprint() {
        super.getprint();
        System.out.println(proqramLanguage);
    }

    public static void main(String[] args) {
        ClassWorkDevloper devloper=new ClassWorkDevloper("Akif",444,"JAva");
        devloper.getprint();
    }





}
