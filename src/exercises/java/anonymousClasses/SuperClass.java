package exercises.java.anonymousClasses;

public class SuperClass {

    public void doIt() {
        System.out.println("SuperClass doIt()");
    }

    class Website {
        //Here we create an anonymous inner class, which is actually creating an instance of the anonymous class
        //called "instance" which is a subclass of SuperClass.  The main reason to do this is it allows you to override
        //methods in a superclass because anonymous classes extend the superclass.  You can do that by creating a new
        // class and then have the new class extend the superclass and then normally override the method in the
        // superclass.  But by creating an anonymous class
        //its a little quicker way to override methods in a superclass, without having to create a class, extend
        // the superclass and then override.  You would only create an anonymous inner class to override 1 method.
        SuperClass instance = new SuperClass() {

            public void doIt() {
                System.out.println("Anonymous class doIt()");
            }
        };
    }
}
