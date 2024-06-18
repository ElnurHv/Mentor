package Leson_6;

import java.util.Scanner;

public class MenuMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Kabab name::");

        System.out.print("Kabab price::");
Kabab kabab =new Kabab(sc.next(),sc.nextDouble());

        System.out.print("Meze name::");

        System.out.print("Meze price::");


        Meze meze = new Meze(sc.next(),sc.nextDouble());






        System.out.print("Ichki name::");

        System.out.print("Ichki price::");

        Ichki ichki = new Ichki(sc.next(),sc.nextDouble());


        Menu menu = new Menu(kabab,meze,ichki);
        System.out.println(menu);
        System.out.println(menu.TotalPrice());


















    }
}
