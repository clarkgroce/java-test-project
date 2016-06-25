package exercises.java.stringExamples;

public class StringArrayConcatenation {

    public static void main(String[] args) {

        String[] strings = {"one", "two", "three", "four"};

        //String result = null;

        //for every iteration in this loop a new StringBuilder is created. Additionally,
        // a String object is created by the toString() method. This results in a small
        // object instantiation overhead per iteration:
//        for(String string : strings) {
//            result = result + string;
//        }
//
//        System.out.println(result);

        //The fastest way of concatenating Strings is to create a StringBuilder once,
        // and reuse the same instance inside the loop. Here is how that looks:
        StringBuilder temp = new StringBuilder();
        for (String string : strings) {
            temp.append(string);
        }

        String result = temp.toString();

//        This code avoids both the StringBuilder and String object instantiations inside the loop, and therefore also
//        avoids the two times copying of the characters, first into the StringBuilder and then into a String again.
        System.out.println(result);

    }
}
