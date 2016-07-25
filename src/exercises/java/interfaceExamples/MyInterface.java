package exercises.java.interfaceExamples;

//This is an interface example with a variable and a method declared.  Interfaces can only have method signatures
// and fields.  The purpose of interfaces is to help with polymorphism, which is the ability to inherit from
//multiple objects in OOP.  Interfaces provide a cleaner way of implementing cross cutting functionality
// in classes than inheritance would provide.
public interface MyInterface {

    public String hello = "Hello";

    public void sayHello();

}
