package exercises.java.abstractClasses;

import java.io.IOException;
import java.io.InputStream;

public class URLProcessorImpl extends URLProcessorBase {
    //As an example, this subclass only needs to worry about processing the data from the InputStream passed to the
    //processURLData method.  This makes it easier to implement classes that process data from URLs
    protected void processURLData(InputStream input) throws IOException {

        int data = input.read();
        while (data != -1) {
            System.out.println((char) data);
            data = input.read();
        }

    }

    //Example of how the URLProcessorImpl would be used.  A new instance is created and the process method is called in
    //the URLProcessorBase superclass which in turn calls the processURLData method in URLProcessorImpl, and passes
    //the url "http://jenkov.com" from the InputStream input param.
//    URLProcessorImpl urlProcessor = new URLProcessorImpl();
//
//    urlProcessor.process(new URL("http://jenkov.com"));


}
