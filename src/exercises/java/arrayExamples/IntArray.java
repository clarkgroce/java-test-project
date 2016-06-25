package exercises.java.arrayExamples;

public class IntArray {

    public static void main(String[] args) {

        int[] Test = new int[10];

        for(int i=0; i<Test.length; i++) {
            Test[i] = i;
        }

        for(int i=0; i<Test.length; i++) {
            System.out.println(Test[i]);
        }
    }
}
