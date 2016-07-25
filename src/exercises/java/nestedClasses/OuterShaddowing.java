package exercises.java.nestedClasses;

public class OuterShaddowing {

    private String text = "I am an outer field";

    public class InnerShaddowing {
        //The inner class has a field called text just like the outer class, so the inner field is said to
        //shadow the outer field.  When the inner class refers to the text field it is referring to the inner
        //text field.  Same rule applies for the outer field.
        private String text = "I am an inner field";

        public void main(String[] args) {
            System.out.println(text);
            //Java makes it possible to refer to the outer text variable from the inner class by prefixing
            // the outer class name, then "this", then field name.
            System.out.println(OuterShaddowing.this.text);
        }
    }

}
