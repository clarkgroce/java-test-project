package exercises.java.arrayExamples;

import java.util.Arrays;

public class RemoveElementsFromArray {

    public static void main(String[] args) {

        int[] ints = new int[20];

        ints[10] = 123;

        int removeIndex = 10;
        //System.out.println(Arrays.toString(ints));

        for(int i=removeIndex; i<ints.length -1; i++) {
            ints[i] = ints[i + 1];
        }

        //ints[9] = 11;

        System.out.println(Arrays.toString(ints));
    }
}
