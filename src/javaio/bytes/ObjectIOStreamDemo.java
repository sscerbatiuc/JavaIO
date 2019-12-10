package javaio.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javaio.model.Employee;

/**
 *
 * @author sscerbatiuc
 */
public class ObjectIOStreamDemo {

    public static void main(String[] args) {
        Employee[] emp = {new Employee("Peter", "Smith"), new Employee("Jake", "Dean")};

        try {
            FileOutputStream out = new FileOutputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\StepObjects.txt");
            ObjectOutputStream oout = new ObjectOutputStream(out);

            oout.writeObject(emp[0]);
            oout.writeObject(emp[1]);
            oout.flush();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\StepObjects.txt"));

            System.out.println("" + (Employee) ois.readObject());
            System.out.println("" + (Employee) ois.readObject());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}