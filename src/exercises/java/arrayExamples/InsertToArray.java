package exercises.java.arrayExamples;

import java.util.Arrays;

public class InsertToArray {

    public static void main(String[] args) {

        int[] ints   = new int[20];

        int insertIndex = 10;
        int newValue    = 123;

//move elements below insertion point.
        for(int i=ints.length-1; i > insertIndex; i--){
            ints[i] = ints[i-1];
        }

//insert new value
        ints[insertIndex] = newValue;

        System.out.println(Arrays.toString(ints));
    }
}
