package exercises.java;

import java.util.Arrays;

public class ForLoopExamples {

    public static void main(String[] args) {

//        for(int i = 10; i < 19; i++)
//            System.out.println(i);


//        for (int i = 10; i < 19; i++) {
////            System.out.println(i);
//            int test = i + 1;
//            System.out.println(test);
//        }


//        int[] ints = {1, 2, 3, 4, 5};
//
////        int minVal = Integer.MAX_VALUE;
//
//        for(int i = 0; i < ints.length; i++)
//            System.out.println(i);

//        int[] ints = {1, 2, 3, 4, 5};
//
//        int minVal = Integer.MAX_VALUE;
//
//        for(int i = 0; i < ints.length; i++) {
//            if(ints[i] < minVal) {
//                minVal = ints[i];
//            }
//        }


        int[] source = new int[10];
        for(int i=0; i<source.length; i++){
            source[i] = i;
        }
        System.out.println(Arrays.toString(source));

        //for(int i = 0; i < source.length; i++)

//
//        System.out.println("minVal = " + minVal);


    }
}