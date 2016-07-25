package exercises.java.JavaInheritance;

public class Truck extends Vehicle {


    protected String licensePlate = null;

    @Override
    public void getLicensePlate(String license) {
        super.getLicensePlate(license);
    }

    @Override
    public String setLicensePlate() {
        return super.setLicensePlate();
    }

    public void updateLicensePlate(String license) {
        this.licensePlate = license;
    }

    Truck truck = new Truck();

//    truck.setLicensePlate("123"); //This will set licensePlate to 123 for the licensePlate field in the Vehicle class
//    truck.updateLicensePlate("abc"); //This will set licensePlate to abc for the licensePlate field in the Truck
//    //class.
//
//    System.out.println("license plate: "
//            + truck.getLicensePlate());



}
