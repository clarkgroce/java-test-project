package exercises.java.whileLoopExamples;

public class WhileBreakCommand {

    public static void main(String[] args) {

        String[] strings = {"jill", "jane", "amy", "jenny", "betty"};

        int nameswithj = 0;
        int i = 0;

        while ( i < strings.length) {
            if (strings[i].startsWith("j")) {
                nameswithj++;
                i++;
                continue;
            } else {
                i++;
            }

            if (nameswithj >= 15) {
                break;
            }

            System.out.println(nameswithj);
        }

    }

}
