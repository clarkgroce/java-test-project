package exercises.java.switchStatements;

public class ExampleSwitchStatement {

    public static void main(String[] args) {

        int test = 9;

        //The switch method is passed the variable "test" and then uses each case statement to compare
        //the constant in the case statement with "test" and if it matches it will execute the code after the colon
        //and then break out of the switch statement if there is "break" provided in the case statement.  The default
        //will execute if there is no match in the case statements, or if there is no break and the case statements
        //just continue to fire one after another due to no "break" provided.
        switch (test) {

            case 9: System.out.println("amount is 0 yea!"); break;
            case 2: System.out.println("case statement printed amount 9 yea!"); break;
            case 10: System.out.println("amount is 10 yea!"); break;
            default: System.out.println("default yea!"); break;
        }

    }

}
