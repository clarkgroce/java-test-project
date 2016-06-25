package exercises.java.stringExamples;

public class StringSingletons {

    public static void main(String[] args) {

        //The below example actually creates a constant/singleton string object "Hello" that is shared by
        //the myString & myString1 variables.
        //String myString = "Hello";
        //String myString1 = "Hello";

        //If you want to be sure that two String variables point to separate String objects
        //then use the "new" operator like this:
        String myString = new String ("Hello World!");
        String myString1 = new String ("Hello World!");

        System.out.println(myString1);

    }

}
