package exercises.java.arrayExamples;


import java.util.Arrays;

public class ArrayBinarySearch {

    public static void main(String[] args) {

        int[] ints = {0, 2, 4, 6, 8};
        //searches for ints position 6
        //int index = Arrays.binarySearch(ints, 6);

        //searches for 7 but can't locate in the array but knows it should be in position
        //4 if sort order is kept.  So it returns -4 - 1 = -5 (just how that interface works (neg value minus one)).
        //int index = Arrays.binarySearch(ints, 7);

        //if all array elements are less than the searched param it will return -length - 1 just like above
        //in this case (-6)
        //int index = Arrays.binarySearch(ints, 10);

        //important to note when searching elements in an array like below it will return
        //the search string (0 - 3) minus -1, instead of sting length minus -1.  So -4 in this example
        //remember 3 isn't included in the search).
        //int index = Arrays.binarySearch(ints, 0, 3, 12);

        //this will search the ints array between index positions 0 & 2 (doesn't include 3)
        //for the value 4, and return it's position.
        int index = Arrays.binarySearch(ints, 0, 3, 4);

        System.out.println(index);

    }

}
