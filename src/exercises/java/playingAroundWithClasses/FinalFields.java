package exercises.java.playingAroundWithClasses;

public class FinalFields {

    //A Java final Field can not have it's value changed, it is a fixed value
    final String strings = "strings has a fixed value";
    //This means that the strings Field has a fixed value assigned and even if
    //the field is accessed by instances of the class, it's value can't be changed.  You can't vary the field value
    //from object to object.
    //It makes sense to probably make a final Field also be static since the value can't be changed.  That way it
    //just belongs to the class.
    static final String example = "example of a static final Field declaration";

    //You can set your Fields (static or non-static) to an initial value, or don't assign a value.  It is good practice
    //to probably assign a sensible value but you don't have to.
    static String names;
    static String names1 = "Clark";


}
