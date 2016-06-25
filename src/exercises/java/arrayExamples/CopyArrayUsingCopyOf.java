package exercises.java.arrayExamples;

import java.util.Arrays;

public class CopyArrayUsingCopyOf {

    public static void main(String[] args) {

//        int[] ints = new int[20];
//
//        for(int i = 0; i < ints.length; i++) {
//            ints[i] = i;
//        }
//
//        int[] dest = Arrays.copyOf(ints, ints.length);
//
//        System.out.println(Arrays.toString(dest));

        int[] source = new int[20];

        for (int i = 0; i < source.length; i++) {
            source[i] = i;
        }
        //The copyofRange method takes three params, first is the array to copy,
        //second is the first index to begin the range, and third param is the last index in the range.
        //int[] dest = Arrays.copyOfRange(source, 3, 7);
        int[] dest = Arrays.copyOfRange(source, 0, source.length);

        System.out.println(Arrays.toString(dest));

    }

}
