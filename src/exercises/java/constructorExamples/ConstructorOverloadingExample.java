package exercises.java.constructorExamples;


public class ConstructorOverloadingExample {

    private int number = 0;
    //Constructor overloading is when you have multiple constructors in the same class.
    //first example of a constructor.  This constructor is an empty constructor (nothing in the body).  Constructors
    //are used to create instances of a class.  They don't return values, but are instead used to initialize internal
    // state (fields) in the newly created object.
    public ConstructorOverloadingExample() {

    }
    //second constructor has an int parameter and assigns the parameter value to the number variable.
    public ConstructorOverloadingExample (int theNumber) {

        this.number = theNumber;
    }

}
