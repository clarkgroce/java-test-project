package exercises.java.stringExamples;

import java.util.Arrays;

public class StringSplitExample {

    public static void main(String[] args) {

        String source = "This is an example of a string.";

        //the String class method split() will split the string where "s" is located.  The s characters
        // are considered delimiters to split the String by, and the delimiters are not returned in the
        // resulting String array.
        //String[] aftermath = source.split("s");

        //There is a version of the split() method that takes a limit param which limits the number of
        //arrays that can be returned in the split() method.
        int limit = 2;
        //This will return two arrays, the first is the split and the second is the rest of the string
        //after the split.  if the limit variable were set to 3 then it would return two splits
        //if matched and then the rest of the string.
        String[] secondsplit = source.split("s", limit);

        System.out.println(Arrays.toString(secondsplit));
    }

}
