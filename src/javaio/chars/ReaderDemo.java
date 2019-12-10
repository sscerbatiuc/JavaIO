package javaio.chars;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author sscerbatiuc
 */
public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Step.txt");
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        System.out.println(data);
        reader.close();

    }

}
