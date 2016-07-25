package exercises.java.messinWithMethods;

public class ParametersAndFields {

    public static void main(String text1, String text2) {

        System.out.println(text1); //Reads value of text1 parameter
        System.out.println(text2); //Reads value of text2 parameter

        text1 = "new value for text1"; //change value of text1
        text2 = "new value for text2"; //change value of text2
    }

    //This is how the main method would be called and how to pass values to the
    //main method parameters text1 & text2.  Create an instance of the class and then call the method within
    //the class
    //ParametersAndFields myObject = new ParametersAndFields();
    //myObject.main("Hello", "World");

}

