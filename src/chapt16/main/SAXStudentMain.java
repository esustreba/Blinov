package chapt16.main;

import chapt16.entity.Student;
import chapt16.sax.StudentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;



import java.io.IOException;
import java.util.ArrayList;

public class SAXStudentMain {
    public static void main(String[] args) {
        try {
            XMLReader reader = XMLReaderFactory.createXMLReader();
            StudentHandler sh = new StudentHandler();
            reader.setContentHandler(sh);
            ArrayList<Student> list;
            if(sh != null) {
                reader.parse("students.xml");
                System.out.println(sh.getStudents());
            }
        }catch (SAXException e) {
            e.printStackTrace();
            System.out.println("Error SAX parser");
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("I/O Exception");
        }
    }
}
