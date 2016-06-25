package exercises.java.arrayExamples;

public class JavaArraysTwo {

    public static void main(String[] args) {

        String[] TestMethod = new String[10];

        for(int i=0; i < TestMethod.length; i++) {
            TestMethod[i] = "String no " + i;
        }

        for (int i = 0; i < TestMethod.length; i++) {
            System.out.println(TestMethod[i]);
        }
    }
}
