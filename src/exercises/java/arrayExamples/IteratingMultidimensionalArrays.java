package exercises.java.arrayExamples;

public class IteratingMultidimensionalArrays {

    public static void main(String[] args) {

        int[][] intArrays = new int[10][20];

        for(int i=0; i < intArrays.length; i++){
            for(int j=0; j < intArrays[i].length; j++){
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
