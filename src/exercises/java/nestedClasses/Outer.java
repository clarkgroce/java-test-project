package exercises.java.nestedClasses;

//static nested classes are declared like this.  You have the outer class, and inside the outer class
//is the nested class.
public class Outer {

    public static class Nested {

    }
    //In order to create an instance of the nested class you must reference by the outer class first followed by
    //the nested class using dot notation.  Also, since the nested class is static, it can only reference instance
    // variables of the enclosing class through a reference to the instance of the enclosing class.
    Outer.Nested instanceex = new Outer.Nested();
}
