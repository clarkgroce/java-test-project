package exercises.java.stringExamples;

public class StringTrimExample {

    public static void main(String[] args) {

        String trim = "  This is my trim example   .  ";

        //the String class method trim() removes white spaces before and after the non white space characters.
        String trimmed = trim.trim();

        System.out.println(trimmed);

    }

}
