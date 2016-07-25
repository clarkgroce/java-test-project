package exercises.java.constructorExamples;

public class ConstructorParams {

    //Say this class was for an Employee definition

    private String name = null;
    private String position = null;
    private int birthdate = 0;

    //here is a constructor that initializes the values of the above class variables with the params
    //of the constructor.
    public ConstructorParams (String name, String position, int birthdate) {

//        name = nameref;
//        position = title;
//        birthdate = bday;

        //To let the Java compiler know you are referring to the Fields in the ConstructorParams class (name,
        //position, birthdate) instead of the constructor parameters you can add the this keyword to the
        //Field name in the constructor.  This is especially helpful if the params have the same name as the Fields.
        this.name = name;
        this.position = position;
        this.birthdate = birthdate;



    }


}
