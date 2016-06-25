package exercises.java.stringExamples;

public class ComparingStrings {

    public static void main(String[] args){

        String test = "abc";
        String test1 = "abc";
        String test2 = "def";
        String test3 = "bc";
        String test4 = "ABC";
        String test5 = "longer string example";
        String a = "a";
        String b = "f";

        //uses a bool data type and equals method to determine if two strings match,
        //is case sensitive too.
        //boolean info = test3.equals(test);

        //use the String class method of equalsIgnoreCase() to compare strings ignoring case.
        //boolean info = test.equalsIgnoreCase(test4);

        //The String class methods startsWith() and endsWith() will return boolean values
        //based on the method search.
        //System.out.println(test.endsWith("c"));//true
        //System.out.println(test4.startsWith("b"));//false
        //System.out.println(test5.startsWith("example", 14));//true because "example" starts at position 14

        //The String class method compareTo() compares two strings lexicographically (essentially how they compare in alphabetical order).
        //this will be -5 since a is less than f in order of the alphabet, and 5 if we compare string b to string a.
        System.out.println(a.compareTo(b));

        //System.out.println(info);

    }

}
