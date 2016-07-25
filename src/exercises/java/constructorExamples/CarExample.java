package exercises.java.constructorExamples;

public class CarExample extends VehicleExample{

    private String brand = null;
    //Here the super keyword is used to call the superclass of the CarExample class.  When super is followed by
    //parenthesis that means it is calling a constructor in the superclass, in this case the only constructor in
    //the VehicleExample class.  All of the constructors in the CarExample class will need to call a constructor
    //in the VehicleExample class because CarExample extends VehicleExample.
    public CarExample (String br, String no) {
        super(no);
        this.brand = br;
    }



}
