package exercises.java.stringExamples;

public class SearchingStringsIndexOf {

    public static void main(String[] args) {

        String myString = "Go Dawgs! Go Clark Going Places go";
        String sub = "Go";

        //will return the string position of the first character of the matching substring
        //or -1 if no matching substring is found.  It is case sensitive and will also search or blank spaces.
        //int result = myString.indexOf("Go Dawgs!");

        //this example of the indexOf method takes two params in the while loop (sub, result) to loop through myString
        //searching for the "Go" substring and adds one to the position in result to search for the next example
        //of Go.
        int result = myString.indexOf(sub);
        while(result != -1) {
            System.out.println(result);
            result = myString.indexOf(sub, result + 1);
        }

        //System.out.println(result);

    }

}
