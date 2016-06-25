package exercises.java.forLoopExamples;

public class VariableVisibilityInLoops {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++){
//            String iasno = String.valueOf(i);
//            //you can access iasno inside the for loop
//            System.out.println(iasno);
//        }
//        //You can't access iasno outside the for loop body, same is true for i
//        //System.out.println(iasno);


        //same goes for variables declared inside for each loops,
        String[] strings = {"jill", "jane"};

        for (String astring : strings) {
            String iasno = String.valueOf(astring);
            System.out.println(iasno);
        }
        //You can't access iasno outside the for loop body, same is true for i
        //System.out.println(iasno);

    }

}
