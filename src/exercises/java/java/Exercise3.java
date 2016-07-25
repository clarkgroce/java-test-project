package exercises.java.java;

public class Exercise3 {

    public static void main(String[] args) {

        int[] numbers = {5,10,15,20,25};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            //the += math operator is specifically used to add numbers to a variable, in this case it adds all
            //the numbers in the numbers array and assigns that value to sum.
            sum += numbers[i];
        }

        System.out.println(sum);
    }


}
