package exercises.java.ifStatements;

public class ChainingIfStatements {

    public static void main(String[] args) {

        String name = "max";

        //example of how you can chain if statements together using else if
        if (name.equals("jane")) {
            System.out.println("the name equals jane");
        } else if (name.equals("frank")) {
            System.out.println("the name equals frank");
        } else if (name.equals("max")) {
            System.out.println("the name equals max");
        }
    }
}