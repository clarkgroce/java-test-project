package exercises.java.arrayExamples;

import java.util.Arrays;

public class ArraysEqualExample {

    public static void main(String[] args) {

        int[] ints = {0, 2, 4, 6};
        int[] ints1 = {0, 2, 4, 6};
        int[] ints2 = {0, 2, 4};

        //The equals method in the Arrays class compares two arrays by length and by elements
        //in the array to make sure they match by value and order.
        boolean intsequals = Arrays.equals(ints, ints1); //true
        boolean ints2equals = Arrays.equals(ints1, ints2); //false

        System.out.println(intsequals);
        System.out.println(ints2equals);
    }
}
