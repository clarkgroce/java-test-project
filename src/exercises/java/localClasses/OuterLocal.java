package exercises.java.localClasses;

public class OuterLocal {

    public void main(String[] args) {
        //The InnerLocal class is declared inside the main method, making it a local class since it is created
        //inside a method.  Local classes can only be accessed from inside the scope block of the method where
        //they are defined.  Local classes can access members of it's enclosing class just like inner classes.  Same
        //shadowing rules apply for local classes as inner classes.
        class InnerLocal {

        }

        InnerLocal innerLocal = new InnerLocal();

    }

}
