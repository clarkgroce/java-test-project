package exercises.java.accessModifiers;

public class AccessModifierHeirarchy {

    //Classes can only have public or default marked since they have to be accessed to used.  The access modifier
    //used for classes trumps the modifiers used inside the class.  If a class is marked with the default modifier
    //then the fields, constructors and methods inside that class can only be accessed from classes within the package.

    //Interfaces also can only have public or default because their fields are meant to be used by classes using
    //the interface.  You can't use the default access modifier for fields and constructors in interfaces because
    //they are implicitly marked public in order to be shared.

    //Access modifiers for fields, methods and constructors in a subclass must have the same level of access as they
    //have in the superclass, or at least not have more restrictive access.  This is so the subclass can overwrite
    // the method in a superclass if needed.  You can expand the accessibility in the subclass in most cases, just not
    //restrict it.

}
