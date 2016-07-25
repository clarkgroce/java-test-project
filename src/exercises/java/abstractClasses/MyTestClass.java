package exercises.java.abstractClasses;

public class MyTestClass extends MyAbstractClass {

    //subclasses of an abstract class must implement and override the abstract methods in the abstract class
    //that is extended.  The only time this wouldn't be true is if the subclass of the abstract class was also
    //an abstract class.
    public void abstractMethod() {
        System.out.println("Printing from my test class");
    }

}
