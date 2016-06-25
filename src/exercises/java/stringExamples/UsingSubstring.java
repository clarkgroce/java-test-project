package exercises.java.stringExamples;


public class UsingSubstring {

    public static void main(String[] args){

        String myString = "Go Dawgs!";

        //include up to 4, but doesn't include 4
        String newString = myString.substring(0,4);

        System.out.println(newString);

    }

}

