package Leson_8;

public class ClassWork {

String text;
char target;

    static int temp (String text){

    String a[] =text.split(" ");
    return a.length;

}

    static int charOcurrenences(String text, char target) {

    target=0;

char [] a =text.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(text.charAt(i)==target);
            target++;


        }

return target;
    }
}
