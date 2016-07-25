//package exercises.java.enumExamples;
//
//public enum LevelII {
//
//    High (3), //calls constructor with value 3
//    Med (2), //calls constructor with value 2
//    Low (1), //calls constructor with value 1
//    ; // semicolon needed when fields/methods follow
//
//    private final int levelcode;
//    //You can only use private or package (default) scope for java enum constructors.  In this constructor
//    //when the constant enum values are defined an int value is passed to the enum constructor.
////    private LevelII(int levelcode) {
////        this.levelcode = levelcode;
//
//    //You can add methods to a java enum as well.  Here is an example of that.
//    Level(int levelcode) {
//
//        this.levelcode = levelcode;
//    }
//
//    public int getlevelcode() {
//        return this.levelcode;
//    }
//
//
//    //You call an enum method via a reference to one of the constant values
//    Level level = Level.High;
//    //This code would print out the value of 3 which is the value of the levelcode field for the enum constant High
//    System.out.println(level.getlevelcode());
//
//
//}
