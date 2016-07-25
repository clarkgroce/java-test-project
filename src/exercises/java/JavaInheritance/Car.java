package exercises.java.JavaInheritance;

public class Car extends Vehicle {

    int numberOfSeats = 0;

    public int getNumberOfSeats() {

        return this.numberOfSeats;

    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

//    //You can use the instanceof java operation to check the method relationship to see if an object is an
//    //instance of the class it's in, or if an object is an instance of a superclass.
//    Car car = new Car();
//    //this will evaluate to true
//    boolean carcheck = car instanceof Car;
//
//    Vehicle vehicle1 = new Vehicle();
//    //this will evaluate to false
//    boolean vehcheck = vehicle1 instanceof Car;

//    //Example of a method override in the Vehicle superclass.  You can override a method from the superclass
//    //if the method signature stays the same.  It has to have the same method name, and the same number and Type
//    //of params, otherwise java will consider it a new method.
//    @Override //When you override a method in the superclass you should use the @override annotation so the
//    //compiler knows if the method is changed in the superclass, it needs to inform the user of the overwritten
//    //methods in the subclass/es.
//    public void getLicensePlate(String license) {
//
//        this.licensePlate = license.toLowerCase();
//
//    }

//    //You could also call the method in the superclass, even from an overwritten method.  Here is an example of
//    //how that is done.  You use the super keyword to call the superclass method, instead of the overwritten method
//    //in the subclass.  This is also how you call the superclass method, it doesn't just have to be used from
//    //an overwritten method.  You can call superclass implementations from any method in the subclass this way.
//    public void getLicensePlate(String license) {
//        super.getLicensePlate(license);
//    }

}
