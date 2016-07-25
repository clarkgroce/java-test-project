//package exercises.java.interfaceExamples;
//
//import javax.annotation.Resource;
//import java.nio.file.Path;
//
//public interface ResourceLoader {
//
//    Resource load(String resourcePath);
//    //This is a default method in an interface.  After java 8, default methods were allowed so classes that implement
//    //an interface have a way to use a default method in case they don't already have record of that method for
//    // that interface.  Remember a class has to use all of the methods in an interface it implements.  The default
//    //method makes this less buggy because now java has a way to use new methods added to an interface.
//    default Resource load(Path resourcePath) {
//        //provide default implementation to load
//        //resource from a Path and return the content
//        //in a Resource object.
//    }
//
//}
