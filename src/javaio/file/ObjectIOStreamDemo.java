/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

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
        Employee[] emp = {new Employee("Ion", "Mocanu"), new Employee("Ion2", "Mocanu2")};

        try {
            FileOutputStream out = new FileOutputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\newTest.txt");
            ObjectOutputStream oout = new ObjectOutputStream(out);

            oout.writeObject(emp[0]);
            oout.writeObject(emp[1]);
            oout.flush();

            System.out.println(Float.valueOf("0.1").floatValue());
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\newTest.txt"));

            System.out.println("" + (Employee) ois.readObject());
            System.out.println("" + (Employee) ois.readObject());
            System.out.println(intTest(1, 2));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static int intTest(Integer a, Integer b){
        return 1;
    }
    
    public static int intTest(int a, int b){
        return 0;
    }
}
