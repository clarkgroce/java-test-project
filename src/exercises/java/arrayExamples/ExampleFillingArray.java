package exercises.java.arrayExamples;

import java.util.Arrays;

public class ExampleFillingArray {

    public static void main(String[] args) {

//        int[] ints = new int[10];
//        //fills each position in the array with the provided param (123)
//        Arrays.fill(ints, 123);
//
//        System.out.println(Arrays.toString(ints));

        int[] ints = new int[10];
        //fills ints positions 3 & 4 (doesn't include 5) with 123
        Arrays.fill(ints, 3, 5, 123);

        System.out.println(Arrays.toString(ints));

    }

}
