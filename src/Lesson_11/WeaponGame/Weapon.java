package Lesson_11.WeaponGame;


public class Weapon {


    public void attack() {
        System.out.println("Performing a basic attack");
    }

    public void attack(int damage) {
        System.out.println("Performing a regular attack with " + damage + " damage");
    }

    public void attack(double criticMultipler) {
        System.out.println("Performing a critical attack with a damage multiplier of " + criticMultipler);

    }

    public void attack(String specialMove) {
        System.out.println("Performing aspecial attack " + specialMove);
    }


}
