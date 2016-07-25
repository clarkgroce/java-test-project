package exercises.java.playingAroundWithClasses;

public class AccessModifiersAndFields {


        //Let's say this was a class for a Customer object.  Some examples of Fields and different access
        //modifiers are below.

        private String email; //only code inside this class can access this Field.
        public String city; //all code in the app can access this Field.
        String position; //No access modifier equates to package level access - meaning code inside classes that
                         //belong to the package can access the Field.
        protected String company; //The protected access modifier is the same as package except subclasses
                                  //outside the package can also access the Field.  Subclasses "extend" code
                                  // from super classes (superclass is a class that is extended to a sub class)

}
