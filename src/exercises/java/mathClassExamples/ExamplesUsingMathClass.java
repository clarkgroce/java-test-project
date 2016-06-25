package exercises.java.mathClassExamples;

public class ExamplesUsingMathClass {

    public static void main(String[] args) {
        //returns 20 because Math.abs returns absolute value
        //int abs1 = Math.abs(-20);

        //returns 8 because Math.ceil rounds a floating point value up to the nearest integer value.
        //double test = Math.ceil(7.343);

        //returns 7 because Math.floor rounds a floating point value down to the nearest integer value.
        //double test = Math.floor(7.343);

        //Returns -12 instead of -11 because Math.floorDiv rounds the result down to nearest integer value,
        //"/" operator will round up with negative result.
        //double test = Math.floorDiv(-100,9);
        //double test2 = -100 / 9;

        //min returns the smaller of the two params passed
        //max returns the larger
        //int test = Math.max(100, 50);

        //round will round up or down based on normal math rounding rules
        //double test = Math.round(23.5612);

        //random returns a randomly generated number based on the rules you provide.  With no multiplier it returns
        //floating point number between 0 - 1, with multiplier it returns between 0 and the multiplier.
        double test = Math.random() * 50D;

        System.out.println(test);
        //System.out.println(test2);

    }
}
