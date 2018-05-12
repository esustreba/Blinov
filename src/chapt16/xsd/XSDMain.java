package chapt16.xsd;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

import java.io.IOException;

public class XSDMain {
    public static void main(String[] args) {
        String filename = "students.xml";
        DOMParser parser = new DOMParser();

        try {
            parser.setErrorHandler(new MyErrorHandler("log.txt"));
            parser.setFeature("http://xml.org/sax/features/validation", true);
            parser.setFeature("http://apache.org/xml/features/validation/schema", true);
            parser.parse(filename);
        } catch (SAXNotRecognizedException e) {
            e.printStackTrace();
            System.out.println("Идентификатор не распознан");
        } catch (SAXNotSupportedException e) {
            e.printStackTrace();
            System.out.print("неподдерживаемая операция");
        } catch (SAXException e) {
            e.printStackTrace();
            System.out.print("глобальная SAX ошибка ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("Ошибка ввода/вывода");
        }
        System.out.print("проверка " + filename + " завершена");
    }

}

