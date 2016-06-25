package exercises.java.switchStatements;

public class MultipleCaseStatementExecution {

    public static void main(String[] args) {

        String myString = "Yo what up switch!";

        //If there is no break after a matching case statement it will continue to execute each subsequent
        // case statement (regardless of match) until it reaches the end of the switch statement or a break.
        switch (myString) {

            case "Yo what up": System.out.println("We have a match!");
            case "Yo what up switch!": System.out.println("We don't have a match!");
            case "yada": System.out.println("match!");
        }

    }

}
