package exercises.java.messinWithMethods;

public class MultipleReturnTypes {

    //This method takes two strings and a bool as parameters.  In the if statement in the method body it tests
    //revconcat for true, and if so returns val2 and val1 in revers order, otherwise return in normal order.  Also,
    //only one return statement will execute per method.  When a return statement executes in a method java will jump
    //back to the code that called the method.
    public String reverse (String val1, String val2, boolean revconcat) {

        if (revconcat) {
            return val2 + val1;
        } else {
            return val1 + val2;
        }
    }

}
