/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author sscerbatiuc
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Tekwill homework\\newTest.txt");
        File newTextFileCopy = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Tekwill homework\\newTestCopy.txt");

        FileInputStream inStream = new FileInputStream(newTextFile);
        FileInputStream inStreamCopy = new FileInputStream(newTextFileCopy);

        SequenceInputStream sequentialStream = new SequenceInputStream(inStream, inStreamCopy);
        int character;
        while ((character = sequentialStream.read()) != -1) {
            System.out.print((char) character);
        }
        sequentialStream.close();
        inStream.close();
        inStreamCopy.close();

    }
}
