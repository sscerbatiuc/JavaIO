/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author sscerbatiuc
 */
public class PrintWriterDemo {

    public static void main(String[] args) throws FileNotFoundException {
        //Data to write on Console using PrintWriter  
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Random string that we need to have in the console\n");
        writer.flush();
        writer.close();
        //Data to write in File using PrintWriter       
        PrintWriter writer1 = null;
        writer1 = new PrintWriter(new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Tekwill homework\\newTest.txt"));
        writer1.write("Hi dude, this text is going to be written ");
        writer1.flush();
        writer1.close();
    }
}
