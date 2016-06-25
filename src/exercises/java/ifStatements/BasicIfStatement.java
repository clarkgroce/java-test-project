package exercises.java.ifStatements;

public class BasicIfStatement {

    public static void main(String[] args) {

        boolean isValid = false;

        //This if statement checks the isValid variable condition for true and prints the "valid"
        //statement if true, and will print the "invalid" statement if the isValid condition is false.
        if (isValid) {
            System.out.println("Is Valid, Yea!");
        } else {
            System.out.println("Not today, sorry!");
        }

        //you could also write it this way since the block of code to be executed is just a single statement
//        if (isValid) System.out.println("Is Valid, Yea!");
//        else System.out.println("Not today, sorry!");
    }

}
