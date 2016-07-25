package exercises.java.playingAroundWithClasses;

public class StaticVsNonStaticFields {

    //Static Field access
    static String names;//By declaring this Field static inside this class, any instances of this class
                        //will not have the names Field, but will have access to the names field with the value
                        //set in this class.

    public static void main(String[] args) {

        StaticVsNonStaticFields.names = "value"; //This is how you can access the names Field in the class and in
                                                 //instances of the class.
    }

//    //Non static field access
//    //To create a non static Field you simply leave off the static declaration
//    String names;
//
//    StaticVsNonStaticFields second = new StaticVsNonStaticFields(); //Here we have created a new instance of the class
////and can now access the non static Field second that we created.
//
//    second.names = "value"; //This is how the field would be accessed in a new object.

}


