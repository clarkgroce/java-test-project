package exercises.java.accessModifiers;

public class ProtectedModifier {
    //Here we have a protected variable which has almost the same meaning as the default (no access modifier provided)
    // modifier.  The default modifier means any class in the package can access what is marked with the default
    //access modifier.  The protected modifier means even subclasses outside of the package can access the fields
    //and methods in the superclass extended by the subclass.
    protected long time = 0;

    public class Timestuff extends ProtectedModifier {
        //The time variable can be accessed by the Timestuff class even if it is not in the same package as
        //the ProtectedModifier class, due to time being marked protected.
        public long getTimeSeconds() {
            return this.time / 1000;
        }

    }


}
