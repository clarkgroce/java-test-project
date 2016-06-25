package exercises.java.stringExamples;

public class LastIndexOfExample {

    public static void main(String[] args) {

        String myString = "USMNT won last night!";
        String sub = "night";

        //example searching for specific text
        //int example = myString.lastIndexOf("night");

        //example searching for a String variable
        int example = myString.lastIndexOf(sub);

        System.out.println(example);

    }

}
