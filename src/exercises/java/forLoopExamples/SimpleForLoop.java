package exercises.java.forLoopExamples;

public class SimpleForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        //you could also write the for loop like this:
        for(int i = 0; i < 10; i++)
            System.out.println("i is 1 : " + i); //executed inside loop becasue it is right after the loop body
            System.out.println("second line after loop body not included in loop execution"); // executed after loop.
    }

}
