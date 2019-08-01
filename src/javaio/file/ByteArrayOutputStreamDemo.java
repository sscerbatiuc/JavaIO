/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Tekwill homework\\newTest.txt");
        File newTextFileCopy = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Tekwill homework\\newTestCopy.txt");
        if (newTextFile.createNewFile()) {
            System.out.println("File created");
        } else {
            System.err.println("File already exists");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(newTextFile);
        FileOutputStream fileOutputStreamCopy = new FileOutputStream(newTextFileCopy);

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fileOutputStream);
        bout.writeTo(fileOutputStreamCopy);

        bout.flush();
        bout.close();//has no effect    
        System.out.println("Success...");

    }
}
