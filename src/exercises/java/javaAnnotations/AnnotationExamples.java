package exercises.java.javaAnnotations;

public class AnnotationExamples {

    public static void main(String[] args) {

        //Annotations can have attributes or params.  Here is an example with an element.
        //@Entity(tablename = "vehicles")

//        In case an annotation contains just a single element, it is convention to name that element "value",
//        like this:
//        @InsertNew(value = "yes")
//        When an annotation just contains a single element named value, you can leave out the element name, and
//        just provide the value. Here is an example of an annotation element with only the value provided:
//        @Entity("yes")


        //Use of the @Deprecated annotation informs the compiler that the class, method or field has been deprecated.
        //Good practice to use the @deprecated JavaDoc symbol for comments.
        @Deprecated
        /**
         @deprecated Use MyNewComponent instead.
         */
        class MyComponent {

        }

        //The @Override annotation is used to link a method that is overriding a method in a superclass, so that if
        //the method in the superclass changes it will throw a warning in the subclass method with the @Override
        //annotation.  Example:
//        public class MySuperClass {
//
//            public void doTheThing() {
//                System.out.println("Do the thing");
//            }
//        }
//
//
//        public class MySubClass extends MySuperClass{
//
//            @Override
//            public void doTheThing() {
//                System.out.println("Do it differently");
//            }
//        }

        //This will suppress warnings for this method.  For instance, if this method calls a deprecated method it
        // will not generate a warning.
//        @SuppressWarnings
//        public void methodWithWarning() {
//
//
//        }

        //Creating your own annotations
        //Example:
//        @interface MyAnnotation {
//
//            String   value() default ""; //by making this default it will not be required when defining values
//
//            String   name();
//            int      age();
//            String[] newNames();
//
//        }
//
//        @MyAnnotation(
//                value="123",
//                name="Jakob",
//                age=37,
//                newNames={"Jenkov", "Peterson"}
//        )
//        public class MyClass {
//
//
//        }

        //To make your annotation available at runtime, add the @Retention annotation and library.
//        import java.lang.annotation.Retention;
//        import java.lang.annotation.RetentionPolicy;
//
//        @Retention(RetentionPolicy.RUNTIME)
//
//        @interface MyAnnotation {
//
//            String   value() default "";
//
//        }

        //To specify what type java elements you want a custom annotation to apply to, add the @Target annotation.
//        import java.lang.annotation.ElementType;
//        import java.lang.annotation.Target;
//
//        @Target({ElementType.METHOD})
//        public @interface MyAnnotation {
//
//            String   value();
//        }
        //Available java elements to target with the java @Target annotation:
//        ElementType.ANNOTATION_TYPE
//        ElementType.CONSTRUCTOR
//        ElementType.FIELD
//        ElementType.LOCAL_VARIABLE
//        ElementType.METHOD
//        ElementType.PACKAGE
//        ElementType.PARAMETER
//        ElementType.TYPE

        //And to make sure your custom annotation can be included in JavaDoc, use the @Documented annotation.
//        import java.lang.annotation.Documented;
//
//        @Documented
//        public @interface MyAnnotation {
//
//        }
//

    }

}
