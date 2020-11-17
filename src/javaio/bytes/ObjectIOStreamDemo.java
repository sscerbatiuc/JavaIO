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
            FileOutputStream out = new FileOutputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\example.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            for(Employee e: emp){
                objectOutputStream.writeObject(e);
            }
            objectOutputStream.flush();


            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\example.dat"));
            while(true){
                try{
                    Object o = objectInputStream.readObject();
                    if(o == null){
                        break;
                    }
                    System.out.println("" + (Employee) o);
                } catch (Exception ex) {
                    System.out.println("EOF rezolvat");
                    break;
                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
