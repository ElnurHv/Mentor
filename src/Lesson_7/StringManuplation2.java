package Lesson_7;

public class StringManuplation2 {
    public static void main(String[] args) {
        ///Count the number of vowels in the string.

        String text = "Welcome to Fornuft";
        int count = 0;
        for (char i : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(i) != -1) {
                count++;
            }
        }
        System.out.println(
                "Total no of vowels in string are: " + count);


//Reverse the string.
        String input = "Welcome the Fornuft";

        StringBuilder input1 = new StringBuilder();

        input1.append(input);


        input1.reverse();

        System.out.println(input1);

        //Check if the string contains the word "Hello".

        String myStr = "Hello";
        System.out.println(myStr.toLowerCase().contains("hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));    // false

        //Replace all occurrences of the word "example" with "sample".
        String text1 = "Hello";
        System.out.println(text1.replace('l', 'p'));

        //Remove all punctuation marks from the string.
        String text3 = "Welcome???@@##$ to#$%%$^$%^&Fornuft";

        // similar to Matcher.replaceAll
        text3 = text3.replaceAll("\\p{Punct}", "");

        System.out.println(text3);


        //Check if the string contains only alphabetic characters.

        String input2 = "Welcometo55Fornuft";

        boolean alphabeticOnly = input2.matches("[a-zA-Z]+");
        System.out.println(alphabeticOnly);


        ///Convert the string to title case (capitalize the first letter of each word).

        String input5 = "welcome to fornuft";

        String titleCase = toTitleCase(input5);
        System.out.println("Başlık harfine dönüştürüldü: " + titleCase);
    }

    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder();

        boolean nextTitleCase = true;
        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();









    }
}