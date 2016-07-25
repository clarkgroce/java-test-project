package exercises.java.anonymousClasses;

public interface MyInterface {

    public void doIt();
    //Here we use an anonymous class to implement an interface, which is the same way we used an anonymous
    //class to extend a superclass.
    MyInterface instanceex = new MyInterface() {
        @Override
        public void doIt() {
            System.out.println("Anonymous class doIt()");
        }
    };
}

