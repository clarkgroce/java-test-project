package exercises.java.whileLoopExamples;


public class DoWhileExample {

    public static void main(String[] args) {

        String[] strings = {"jill", "kate", "jane", "Liney"};

        int namesstartingwithj = 0;
        //The do while loop will always execute through the loop logic at least once, which is what
        //differentiates it from the while loop, because the while loop might not run through the loop
        //logic if the conditions aren't met (false instead of true).  In the below example the int variable is
        // increased until it is no longer less than the strings length.
        do {
            namesstartingwithj++;
        } while (namesstartingwithj < strings.length);

        System.out.println(namesstartingwithj);
    }

}
