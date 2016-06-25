package exercises.java.arrayExamples;

public class FindMinValueInArray {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5};

        int minVal = Integer.MAX_VALUE;

        for(int i = 0; i < ints.length; i++) {
            if(ints[i] < minVal) {
                minVal = ints[i];
            }
        }

        System.out.println("minVal = " + minVal);

    }

}
