package exercises.java.ifStatements;

public class ConditionalOperators {

    public static void main(String[] args) {

        long var1 = 101;
        long var2 = 100;

//        //example of using less than operator to get a bool condition for the if statement
//        if (var1 < var2) {
//            System.out.println("var1 is less than var2");
//        } else {
//            System.out.println("var1 is greater than var2");
//        }

//        if (var1 != var2) {
//            System.out.println("these guys are not equal");
//        } else {
//            System.out.println("these guys are equal");
//        }

//        //this is less than or equal to
//        if (var1 <= var2) {
//            System.out.println("var1 is less than or equal to var2");
//        } else {
//            System.out.println("var1 is greater than or equal to var2");
//        }

//        //You can also just have an if statement without the else statement.
//        if (var1 > var2) {
//            System.out.println("var1 is greater than var2");
//        }

        int test = 30;

        //this will return nothing because there is no else statement to handle a false condition.
        if (test < 20) {
            System.out.println("test is less than 20");
        }

    }

}
