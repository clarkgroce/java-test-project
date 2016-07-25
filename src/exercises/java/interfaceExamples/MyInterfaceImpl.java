package exercises.java.interfaceExamples;
//This is how you implement an interface.  You must create a java class in order to access the interface.  You
//can also access more than one interface.
public class MyInterfaceImpl implements MyInterface, MyOtherInterface {
    //A class must implement all of the method signatures in an interface.  The class does not have to implement
    //all of the variables in an interface, just the methods.  That is true for all interfaces implemented by a class.
    public void sayHello() {
        //this is how you access a variable in the interface.
        System.out.println(MyInterface.hello);
    }

    public void sayGoodbye() {
        System.out.println(MyOtherInterface.goodbye);
    }

//    //If you have a class that implements the interface, then it's possible to have instances of the class referenced
//    // in instances of the interface.  Example below.  You can't implement instances of the interface on their own
//    // though, there must be a class that implements the interface first.
//    MyInterface myInterface = new MyInterfaceImpl();
//
//    myInterface.sayHello();

}
