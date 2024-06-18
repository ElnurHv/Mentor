package Lesson_9;

import java.util.Scanner;

public class StringReverse {

    Scanner scan = new Scanner(System.in);
    String text;


    public void reverseString() {
        System.out.println("Welcome Text reverse Game!! ");
        while (true) {
            System.out.println("Enter a sentence(or type 'exit' to quit): ");
            this.text = scan.next();
            if (text.equals("exit")) {
                System.out.println("Exiting the game.Goodbye!");
                break;
            }


            String[] words = text.split(" ");
            for (int i = 0; i < words.length; i++) {
                String reversedWord = "";
                for (int j = words[i].length() - 1; j >= 0; j--) {
                    reversedWord += words[i].charAt(j);
                }
                words[i] = reversedWord;
            }
            String reversedSentence = String.join(" ", words);
            System.out.println("Reversed sentence: " + reversedSentence);
        }
    }

    public static void main(String[] args) {
        StringReverse text = new StringReverse();
        text.reverseString();
    }

}

