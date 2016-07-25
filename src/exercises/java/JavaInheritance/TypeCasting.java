package exercises.java.JavaInheritance;

public class TypeCasting {


    //It is possible to create an instance of a subclass and then assign the value of the subclass to an instance
    //of the superclass.  In effect you can use the instance of the subclass as if it were an instance of
    //the superclass.  This can be accomplished because Car inherits from Vehicle.  You could treat a car instance
    //just as you would a Vehicle instance.  This is called type casting, when you reference the object of a class as
    //a different type from the class itself (i.e., vehicle instead of car).  You can always cast an object of a
    //subclass to one of its superclasses.  This is referred to as upcasting (casting from a subclass to superclass)
    Car car = new Car();

    Vehicle vehicle = car;  //upcasting

    Car car2 = (Car) vehicle; //downcasting back to a car object.  This is only possible because we are creating
    //another car object, downcasting isn't possible into another type of object,like Truck for example.  If you
    //attempt to downcast into a different type of object you'll receive a ClassCastException error at runtime.

}
