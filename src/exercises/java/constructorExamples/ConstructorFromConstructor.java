package exercises.java.constructorExamples;

public class ConstructorFromConstructor {

    private String firstname = null;
    private String lastname = null;
    private int age = 0;

    public ConstructorFromConstructor(String first, String last, int year) {

        firstname = first;
        lastname = last;
        age = year;
    }
    //The this keyword followed by parenth & params means another constructor in the same Java class is being called
    //Which other constructor is being called depends on the params you pass to the constructor call.
    public ConstructorFromConstructor(String first, String last) {
        this(first, last, -1);
    }

}
