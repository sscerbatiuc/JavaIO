/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class ByteArrayInputStreamDemo {

    public static void main(String[] args) throws IOException {
        // buf can come from various places
        byte[] buf = "Hello".getBytes();
        // Create the new byte array input stream  
        ByteArrayInputStream bytArrInStream = new ByteArrayInputStream(buf);
        int code = 0;
        while ((code = bytArrInStream.read()) != -1) {
            //Conversion of a byte into character  
            char character = (char) code;
            System.out.println("ASCII value of Character is:" + code + "; Special character is: " + character);
        }
    }

}
