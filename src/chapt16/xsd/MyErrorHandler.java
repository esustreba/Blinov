package chapt16.xsd;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import java.io.IOException;


public class MyErrorHandler implements ErrorHandler {

    private Logger logger;

    public MyErrorHandler(String log) throws IOException {
        logger = Logger.getLogger("chapt16.xsd");
        logger.addAppender(new FileAppender(new SimpleLayout(), log));
    }

    @Override
    public void warning(SAXParseException e) {
        logger.warn(getLineAddress(e) + "-" + e.getMessage());

    }

    @Override
    public void error(SAXParseException e) {
        logger.error(getLineAddress(e) + "-" + e.getMessage());

    }

    @Override
    public void fatalError(SAXParseException e) {
        logger.fatal(getLineAddress(e) + "-" + e.getMessage());

    }

    private String getLineAddress(SAXParseException e) {

        return e.getLineNumber() + " : "
                + e.getColumnNumber();
    }
}
