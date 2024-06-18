package Lesson_10.CharacterBasedGame;

import java.util.Scanner;

public class CharacterGameMain {
    public static void main(String[] args) {

        Warrior gorak = new Warrior("Gorak", 50, 500);
        Mage elera = new Mage("Elera", 40, 500);

        gorak.attack();
        gorak.useSpecialAbility();
        elera.attack();
        elera.useSpecialAbility();

        Scanner scan = new Scanner(System.in);
        boolean running = true;


        while (running) {
            System.out.println("Select a character to attack (G)orak or (E)lara:");
            String choice = scan.next().toUpperCase();

            switch (choice) {
                case "G":
                    elera.health-=gorak.damage();
                    System.out.println("Elera Health "+elera.health);
                    break;
                case "S":
                    elera.health-=gorak.fulldamage();
                    System.out.println(elera.health);
                    break;
                case "E":
                    gorak.health-=elera.damage();
                    System.out.println("Gorak Health "+gorak.health);
                    break;
                case "D":
                    gorak.health-=elera.fulldamage();
                    System.out.println(gorak.health);
                default:
                    System.out.println("Invalid selection.");
                    continue;
            }


            if (gorak.health <= 0) {
                System.out.println(gorak.getName() + " is dead.");
                running = false;
            } else if (elera.health <= 0) {
                System.out.println(elera.getName() + " is dead.");
                running = false;
            }





        }



    }
}