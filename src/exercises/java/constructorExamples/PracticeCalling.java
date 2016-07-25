package exercises.java.constructorExamples;

public class PracticeCalling {

    public static void main(String[] args) {

//        //If there was a no-args constructor in the ConstructorParams class, this is how to call
//        //the no-args constructor in the ConstructorParams class.  There isn't a no-args constructor in the class,
//        //but if there were this is how to call it.
//        ConstructorParams constructorParams = new ConstructorParams();

        //The ConstructorParms constructor takes three parameters "public ConstructorParams (String name,
        // String position, int birthdate)"  Here I have created a new instance of the ConstructorParms class
        //and called the ConstructorParms constructor and passed three values to the constructor params.
        ConstructorParams constructorParams = new ConstructorParams("Benji", "President", 1963);



    }


}
