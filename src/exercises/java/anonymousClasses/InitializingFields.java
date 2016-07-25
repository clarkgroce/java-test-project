package exercises.java.anonymousClasses;

public class InitializingFields {

    final String texttoprint = "Text";

    InitializingFields instanceexample = new InitializingFields() {
        //You don't have to assign a value to text here, just fyi.  It will be assigned a value in the static
        //initializer below.
        private String text;

        //Here we use a static initializer to initialize the text field in the anonymous class, and then assign it
        //the value of texttoprint field.
        {this.text = texttoprint;}

        public void doIt() {
            System.out.println(this.text);
        }
    };

}
