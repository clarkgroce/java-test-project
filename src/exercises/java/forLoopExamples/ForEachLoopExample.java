package exercises.java.forLoopExamples;

public class ForEachLoopExample {

    public static void main(String[] args) {

        String[] strings = {"mary", "jill", "kate"};

        //for each loop through the for loop the girlnames variable will be bound to
        // each of the string elements in the strings array.  Hence the name for each loop.
        for (String girlnames : strings) {
            System.out.println(girlnames);
        }

    }

}
