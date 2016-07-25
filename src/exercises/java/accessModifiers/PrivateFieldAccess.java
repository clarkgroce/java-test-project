package exercises.java.accessModifiers;

public class PrivateFieldAccess {
    //Here we have a private variable declared in the class
    private long time = 0;
    //This is a getter method designed to access the time variable even though it is marked private.
    //It can access private because it's in the same class, and since the getter method is marked
    //public it can be accessed outside the class.  The getTime method returns the time variable.
    public long getTime() {
        return this.time;
    }
    //This is a setter method designed to access the private time variable and set the value differently, in
    //this case the value is set to theTime param.
    public void setTime(long theTime) {
        this.time = theTime;

    }

}
