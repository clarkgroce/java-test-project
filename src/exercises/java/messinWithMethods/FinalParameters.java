package exercises.java.messinWithMethods;

public class FinalParameters {

    //A Java method parameter can be declared final just like a Java Field.  In this example the text1 & text2
    //parameters are declared final, therefore the String values passed into these parameters can't be reassigned
    //to any other parameters other than text1 and text2.
    public  void writeText(final String text1, final String text2) {

        System.out.println(text1);
        System.out.println(text2);

    }

}
