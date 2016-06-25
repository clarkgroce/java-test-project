package exercises.java.arrayExamples;

public class FindMaxValueInArray {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5};

        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < ints.length; i++) {
            if(ints[i] > maxVal) {
                maxVal = ints[i];
            }
        }

        System.out.println("maxVal " + maxVal);

    }

}
