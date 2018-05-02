package chapt16.xsd;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DemoJSR {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Student.class);
            Marshaller m = context.createMarshaller();
            Student s = new Student(1, "Bender");
            m.marshal(s, new FileOutputStream("stud.xml"));
        } catch (FileNotFoundException e) {
            System.out.println("XML - file not found");
            e.printStackTrace();
        } catch (JAXBException e) {
            System.out.println("JAXB exception");
            e.printStackTrace();
        }
    }


@XmlRootElement
private static class Student {
    private int id;
    private String name;

    public Student() {

    }
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setID(int id) {
        this.id = id;
    }
}
}