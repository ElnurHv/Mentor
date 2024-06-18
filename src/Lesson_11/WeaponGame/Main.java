package Lesson_11.WeaponGame;

public class Main {
    public static void main(String[] args) {
        Weapon sword=new Weapon();
        Weapon bow=new Weapon();


        sword.attack();
        sword.attack(50);
        sword.attack(5.5);
        sword.attack("Uppercut");

        System.out.println("===========");
        bow.attack();
        bow.attack(20);
        bow.attack(5.6);
        bow.attack("Nage-Waza");
    }
}
