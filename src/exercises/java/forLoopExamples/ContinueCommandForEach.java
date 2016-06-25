package exercises.java.forLoopExamples;

public class ContinueCommandForEach {

    public static void main(String[] args) {

        String[] strings = {"Jill", "Jane", "Claire"};

        int wordsstartingwithj = 0;
        for (String astring : strings) {
            //uses the same logic as our UsingContineCommand class example accept in this for
            //each loop we check if astring starts with j, because astring is bound to each strings array
            //element.
            if (! astring.toLowerCase().startsWith("j")) {
                continue;
            }

            wordsstartingwithj++;
        }

        System.out.println(wordsstartingwithj);

    }

}
