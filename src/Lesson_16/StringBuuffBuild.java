package Lesson_16;



public class StringBuuffBuild {
    public static void main(String[] args) {

        String name="Artur";
        String surname="Excalibur";
        String birthYear="55";

        String ex = surname.replace("Excalibur", "Ex");
        String substring = name.substring(0, 2);
        char c = birthYear.charAt(0);
        String year = String.valueOf(c);

        StringBuilder st = new StringBuilder(ex);
        st.append(substring);
        st.append(year);



        System.out.println(st);
    }
}
