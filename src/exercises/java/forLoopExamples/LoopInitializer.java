package exercises.java.forLoopExamples;

public class LoopInitializer {

    public static void main(String[] args) {

        int n = 10;

        //the first part of the loop body is the loop initializer
        //it is usually a variable that will be affected by the loop condition(middle section of loop body)
        for (int i = 0; i < n; i++) {
            System.out.println(" i = " + i);

        }

    }

}
