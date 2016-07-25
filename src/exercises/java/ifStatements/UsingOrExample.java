package exercises.java.ifStatements;

public class UsingOrExample {

    public static boolean main(String[] args) {

        boolean weekday = false;
        boolean weekend = true;
        boolean vacation = false;

        if (!weekday || vacation) {
            return true;
        } else return weekend;


    }

}

