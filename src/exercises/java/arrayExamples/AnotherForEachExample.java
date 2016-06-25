package exercises.java.arrayExamples;

public class AnotherForEachExample {

    public static void main(String[] args) {
        //assigns values to the array
        //int[] Test1 = {10, 20, 30, 40};
        //initializes a new array
        //int[] Test1 = new int[10];

        //Will loop through the Test1 array assigned to theTest
//        for (int theTest: Test1) {
//            System.out.println(theTest);
//        }
        //for-each loop can loop through String values too
        String[] Test2 = {"Print", "Me", "Now"};

        for (String assignme: Test2) {
            System.out.println(assignme);
        }
    }
}
