package javaio.bytes;

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
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\newTest.txt");
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
        System.out.println((char)bin.read());
        bin.close();
        inStream.close();

    }
}
