package exercises.java.mathClassExamples;

public class FloatingExample {

    public static void main(String[] args) {
        //if you need fractions in variable values you have to use float or double int operators
        //and the integer data types you work with also have to be/assigned floating type.
        //for example this would still return 12.0 instead of 12.5, float result = 100 / 8;
        double num1 = 100;
        double num2 = 8;
        //or this would work: double result = 100D / 8D; or float result = 100F / 8F;

        double result = num1 / num2;

        System.out.println(result);
    }
}
