package exercises.java.whileLoopExamples;

public class BooleanWhileLoop {

    public static void main(String[] args) {

        boolean whiletrue = true;

        while (whiletrue == true) {

            System.out.println("running");
            //uses Math.random method to generate random number between 0 & 10.
            double number = Math.random() * 10D;
            // if else states if number variable is less than 5 whiletrue is true and it will loop through
            //the while loop again.
            if (number < 5) {
                whiletrue = true;
            } else {
                whiletrue = false;
            }

        }


    }


}
