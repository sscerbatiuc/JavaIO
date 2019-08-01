/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author sscerbatiuc
 */
public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Tekwill homework\\newTest.txt");
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        System.out.println(reader.read());
        reader.close();

    }

}
