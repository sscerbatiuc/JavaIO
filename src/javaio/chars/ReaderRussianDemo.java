package javaio.chars;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author sscerbatiuc
 */
public class ReaderRussianDemo {

    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\StepRussian.txt");
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println();
        reader.close();

    }

}
