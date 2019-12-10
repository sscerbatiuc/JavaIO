package javaio.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\newTest.txt");
        File newTextFileCopy = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\newTestCopy.txt");

        try (FileInputStream inStream = new FileInputStream(newTextFile);
                FileInputStream inStreamCopy = new FileInputStream(newTextFileCopy);
                SequenceInputStream sequentialStream = new SequenceInputStream(inStream, inStreamCopy);) {

            int character;
            while ((character = sequentialStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException ex) {
            System.out.println("Err");
        }

    }
}
