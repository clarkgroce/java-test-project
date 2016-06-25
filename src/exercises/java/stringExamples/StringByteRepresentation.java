package exercises.java.stringExamples;

import java.nio.charset.Charset;

public class StringByteRepresentation {

    public static void main(String[] args){

        String test = "My pizza is getting cold!";

        byte[] bytetest = test.getBytes();//returns byte representation of the test string
        byte[] bytetest2 = test.getBytes(Charset.forName("UTF-8"));//returns specific UTF-8 byte representation

        System.out.println(bytetest);
        System.out.println(bytetest2);
    }

}
