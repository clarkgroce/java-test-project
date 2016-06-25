package exercises.java.arrayExamples;

import java.util.Arrays;

public class CopyingArrayByIterating {

    public static void main(String[] args) {

        int[] source = new int[10];
        int[] dest = new int[10];

        //initializes elements in source array to 0 - 9
        for(int i = 0; i < source.length; i++){
            source[i] = i;
        }
        //copies values from source array to dest array
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }

        System.out.println(Arrays.toString(dest));

    }

}
