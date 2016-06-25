package exercises.java.arrayExamples;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {

        int[] ints = new int[20];

        for(int i = 0; i < ints.length; i++) {
            ints[i] = 20 - i;
        }

        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);

        System.out.println(Arrays.toString(ints));

    }

}