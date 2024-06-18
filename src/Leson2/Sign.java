package Leson2;


import java.util.Scanner;

public class Sign {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            String username=sc.nextLine();
                    String password= sc.nextLine();

            if (username.equals("Fornuft") && password.equals("12345")) {

                System.out.println("You're logged in");


            } else {
                System.out.println("Invalid credentials");
            }





        }

    }