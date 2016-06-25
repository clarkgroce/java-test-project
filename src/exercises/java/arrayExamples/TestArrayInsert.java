package exercises.java.arrayExamples;

import java.util.Arrays;

public class TestArrayInsert {

    public static void main(String[] args) {

        int[] ints = new int[20];

        int insertIndex = 10;
        //int intValue = 125;

        //move elements below insertion point
        for (int i = ints.length - 1; i > insertIndex; i--) {
            ints[i] = ints[i - 1];
        }
        System.out.println(Arrays.toString(ints));

    }
}