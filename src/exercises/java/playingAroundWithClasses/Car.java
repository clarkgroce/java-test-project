package exercises.java.playingAroundWithClasses;

public class Car {

    //declaring fields in a class
    public String brand = null;
    public String model = null;
    public String color = null;

    //creating a method in the class
    public void setColor (String newColor) {
        this.color = newColor;
    }

}

    //If I wanted to create an instance of the Car class I would do so by instantiating an object using
    //the "new" keyword.  This create 3 car variables and assigns the Car class to each variable, thus making
    //each an object of the Car class.
//    Car car1 = new Car();
//    Car car2 = new Car();
//    Car car3 = new Car();

    //Here I call the setColor method on each object and assign a color for each of the
    //Car objects.
//    car1.setColor = ("blue");
//    car2.setColor = ("red");
//    car3.setColor = ("green");
