package exercises.java.nestedClasses;

//example of a non static nested class, also known as inner class.
public class OuterII {

        private String text = "I am private";

        public class Innerex {
            //
            public void printText() {
                System.out.println(text);
            }

        }


        //to create an instance of an inner class you must first create an instance of the outer class.
        OuterII outerII = new OuterII();
        //Then the outer class must be referenced when creating the inner class instance.
        OuterII.Innerex inner = outerII.new Innerex();
        //This is how you would call the printText method:
        //inner.printText();

    }
