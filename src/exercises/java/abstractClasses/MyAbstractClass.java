package exercises.java.abstractClasses;

public abstract class MyAbstractClass {

    //Abstract classes can't be instantiated.  Their purpose is to be used as a base class for subclasses.
    //MyAbstractClass myAbstractClass = new MyAbstractClass();

    //Abstract classes can have abstract methods, and you declare an abstract method the same as you do the
    //abstract class, by the abstract keyword.  Abstract methods have no method body, just a method signature.
    //just like methods in a Java interface.  An abstract class can have abstract and non abstract methods, but
    //if there is an abstract method, the class must be abstract.
    public abstract void abstractMethod();

}
