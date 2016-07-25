package exercises.java.abstractClasses;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public abstract class URLProcessorBase {

    public void process(URL url) throws IOException {
        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();

        try {
            processURLData(input);
        } finally {
            input.close();
        }
    }
    //By creating this abstract class, subclasses of URLProcessorBase can override the processURLData method but
    //not have to worry about creating the connection or getting the input, those are handled by the the
    //URLProcessorBase class.  It also signals to users of the URLProcessorBase class that it should not be used as is,
    //that there is additional functionality to use in subclasses.
    protected abstract void processURLData(InputStream input)
        throws IOException;

}
