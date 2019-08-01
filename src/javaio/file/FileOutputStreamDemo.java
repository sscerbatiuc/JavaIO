/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\newTest.txt");
        if (newTextFile.exists()) {
            newTextFile.delete();

        }
        if (newTextFile.createNewFile()) {
            System.out.println("File created");
        }

        FileOutputStream fout = new FileOutputStream(newTextFile);

        fout.write(65); // FileOutputStream can only write bytes 65 -> A
        // Writing String
        String hello = "\nHello world";

        System.out.println(hello.getBytes());
        fout.write(hello.getBytes());
        fout.close();

    }
}
