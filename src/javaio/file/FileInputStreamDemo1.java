/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author sscerbatiuc
 */
public class FileInputStreamDemo1 {

    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\newTest.txt");
        ArrayList<String> arrList = new ArrayList<String>();
        if (newTextFile.createNewFile()) {
            System.out.println("File created");
        } else {
            System.err.println("File already exists");
        }

        FileInputStream inStream = new FileInputStream(newTextFile);
//        int intChar = inStream.read();
        int intChar;
        // How to read all the characters?
        while ((intChar = inStream.read()) != -1) {
//            System.out.print((char) intChar);
            arrList.add(String.valueOf((char)intChar));
        }
        
        
        System.out.println(arrList);
        inStream.close();

    }
}
