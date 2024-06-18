package Lesson_7;

public class StringMaupilation {
    public static void main(String[] args) {

        //Return the character String
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);




        //Printing the length of a string character with and without spaces
        String str = "   this is a string";

        //length of the String
        System.out.println("Length of the String: "+str.length());

        //length of the String without white spaces
        System.out.println("Length of String without spaces: "+
                str.replace(" ", "").length());

        //Writing a string character in uppercase and lowercase letters
        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        //Check if the string starts with the letter 'A'.
        String Str = new String("Hello");
        System.out.println(Str.startsWith("A")); //false
        //Check if the string ends with the letter 'lo'.
        String Str1 = new String("Hello");
        System.out.println(myStr.endsWith("lo"));   // true

        //Replace all occurrences of the letter
        String Str3 = new String("Welcome to Fornuft");


        System.out.println(Str.replace('o', 'T'));

        System.out.println(Str.replace('s', 'F'));

        //Split the string into an array of words using whitespaces as the delimiter.
        String str4 = " Hello, Good, Morning";

        String[] str1 = str.split(" ");
        for(String str2 : str1)
        {

            System.out.println(str2);

            //ind the index of the first occurrence of the letter
            String str5 = new String("Welcome to Fornuft");

            System.out.print("Found n first at position : ");

            // This method returns the index within this string of the first occurrence of the specified character or -1, if the character does not occur.
            // print 14
            System.out.println(str5.indexOf('n'));

            //Extract a substring from the 5th character to the 10th character (inclusive).
            String Str6 = new String("Welcome to Fornuft");


            System.out.println(Str6.substring(10, 14));

            //Remove any leading or trailing whitespaces from the string.
            String Str7 = "       Hello World!       ";
            System.out.println(Str7);
            System.out.println(Str7.trim());

            //

        }
    }
}
