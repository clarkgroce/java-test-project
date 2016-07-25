//package exercises.java.lambdaExpressions;
//
//public class StateOwner {
//
//    public void addStateListener(StateChangeListener listener) {
//        }
//
//    StateOwner stateOwner = new StateOwner();

    //This is the Lambda expression.  You can use a Lambda expression in Java 8 if the Lambda expression
    //matches a single method interface, including the params and the return type (all have to match between
    // the interface and the lambda expression).  Notice the StateChangeListener interface is not mentioned
    //in the lambda expression.  That's because the type is inferred by the single method in the interface, as are
    //the parameters from the interface method.
//    stateOwner.addStateListener(
//            (oldState, newState) -> System.out.println("State changed")
//            );

    //If the method in the interface you are matching against has no parameters then you can write the lambda
    //expression like this:
    //() -> System.out.println("Zero parameter lambda");
    //one param example:
    //(param) -> System.out.println("One parameter: " + param);
    //You can enclose in curly brackets if you have multiple lines in the lambda expression.
//    (oldState, newState) -> {
//    System.out.println("Old state: " + oldState);
//    System.out.println("New state: " + newState);
//}
    //You can also return a value in a lambda expression, here is an example:
//    (param) -> {
//        System.out.println("param: " + param);
//        return "return value";
//    }

    //Another example of an interface and how the lambda expression can be used and called.
//    public interface MyComparator {
//
//        public boolean compare(int a1, int a2);
//
//    }
//
//    //Here is the lambda expression and the variable the expression is assigned to (perfectly acceptable since
//    //lambda expressions are essentially objects
//    MyComparator myComparator = (a1, a2) -> return a1 > a2;
//
//    //This is how the lambda expression is called through the interface and variable assigned the lambda expression.
//    boolean result = myComparator.compare(2, 5);



//
//}
