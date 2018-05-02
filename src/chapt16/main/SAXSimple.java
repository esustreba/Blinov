package chapt16.main;

import chapt16.sax.SimpleHandler;
import org.xml.sax.XMLReader;

import org.xml.sax.SAXException;
import java.io.IOException;

import org.xml.sax.helpers.XMLReaderFactory;

public class SAXSimple {
    public static void main(String[] args) {
        try {
//создание SAX-анализатора
            XMLReader reader = XMLReaderFactory.createXMLReader();
            SimpleHandler contentHandler = new SimpleHandler();
            reader.setContentHandler(contentHandler);
            reader.parse("students.xml");
        } catch (SAXException e) {
            e.printStackTrace();
            System.out.print("ошибка SAX парсера");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("ошибка I/О потока");
        }
    }
}
