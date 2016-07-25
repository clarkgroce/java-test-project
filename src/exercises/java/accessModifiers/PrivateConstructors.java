package exercises.java.accessModifiers;


public class PrivateConstructors {

    private long time = 0;
    //example of a private constructor
    private PrivateConstructors(long time) {
        this.time = time;
    }
    //example of a public constructor calling the private constructor with this(time).
    public PrivateConstructors(long time, long timeOffset) {
        this(time);
        this.time += timeOffset;

    }

}
