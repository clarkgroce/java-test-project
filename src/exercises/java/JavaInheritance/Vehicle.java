package exercises.java.JavaInheritance;

public class Vehicle {

    protected String licensePlate = null;

    public void getLicensePlate (String license) {
        this.licensePlate = license;
    }

    public String setLicensePlate() {
        return licensePlate;
    }

}
