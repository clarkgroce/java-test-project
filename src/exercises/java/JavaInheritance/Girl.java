package exercises.java.JavaInheritance;

public class Girl extends Person {

    //By calling super inside the Girl constructor we execute the constructor inside the Person class.  Java
    //inheritance mechanisms do not include constructors, in other words constructors of a superclass are not
    // inherited by the subclass.  In fact, a subclass constructor is required to call one of the constructors in the
    //superclass, as I've done below in the Girl constructor.
    public Girl() {
        super();

    }

}
