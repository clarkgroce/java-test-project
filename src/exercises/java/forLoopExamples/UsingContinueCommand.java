package exercises.java.forLoopExamples;

public class UsingContinueCommand {

    public static void main(String[] args) {

        String[] strings = {"Jane", "Stacy", "Jill", "Liney"};

        int wordsstartingwithJ = 0;
        //here we initialize i and the in the conditional section we comapare i to the strings
        //array length and if true increment i and execute the if statement.
        for (int i = 0; i < strings.length; i++) {
            //in this if statement we check if i does not start with j and if true execute the continue
            //command.  Continue will iterate through the loop again.  if i does start with j then we
            //jump out of the if statement and increment the wordsstartingwithJ variable.
            if (! strings[i].toLowerCase().startsWith("j")) {
                continue;
            }

            wordsstartingwithJ++;

        }

        System.out.println(wordsstartingwithJ);

    }

}
