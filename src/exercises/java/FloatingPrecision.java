package exercises.java;

public class FloatingPrecision {

    public static void main(String[] args) {

        double result1 = 0D;
        System.out.println(result1);

        for (int i=0; i<100; i++) {
            result1 += 0.01D;
        }
        //The result of this should be 1 but it is 1.000000000000007, be aware of floating point precision
        System.out.println(result1);
    }
}
