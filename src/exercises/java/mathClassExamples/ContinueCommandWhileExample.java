package exercises.java.mathClassExamples;

public class ContinueCommandWhileExample {

    public static void main(String[] args) {

        String[] strings = {
                "John", "Jack", "Abraham", "Jennifer", "Ann" };

        int wordsStartingWithJ = 0;
        int i = 0;

        while( i < strings.length ) {
            if(! strings[i].toLowerCase().startsWith("a")) {
                i++;
                continue;
            }
            i++;
            wordsStartingWithJ++;

        }

        System.out.println(wordsStartingWithJ);

    }

}
