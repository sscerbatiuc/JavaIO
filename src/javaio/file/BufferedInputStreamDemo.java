/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class BufferedInputStreamDemo {

    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Tekwill homework\\newTest.txt");
        if (newTextFile.createNewFile()) {
            System.out.println("File created");
        } else {
            System.err.println("File already exists");
        }

        FileInputStream inStream = new FileInputStream(newTextFile);
        BufferedInputStream bin = new BufferedInputStream(inStream);
        int character;
        while ((character = bin.read()) != -1) {
            System.out.print((char) character);
        }
         while ((character = bin.read()) != -1) {
            System.out.print((char) character);
        }
        bin.close();
        inStream.close();

    }
}
