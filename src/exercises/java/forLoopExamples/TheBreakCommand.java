package exercises.java.forLoopExamples;

public class TheBreakCommand {

    public static void main(String[] args) {

        String[] strings = {"Jill", "Jane", "Jenny", "Cloe", "Claire", "Charleze"};

        int namesstartingwithj = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].toLowerCase().startsWith("j")){
                namesstartingwithj++;
            }
            //Using the break command will force a jump out of the loop even if the loop condition
            //is still true.  In this case the namesstartingwithj variable = 2, even though there were 3 names
            //starting with j in the strings array.
            if (namesstartingwithj >= 2) {
                break;
            }

        }

        System.out.println(namesstartingwithj);

    }

}
