package javaio.difference;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author sscerbatiuc
 */
public class ReaderRussianDemo {

    public static void main(String[] args) throws IOException {
        String[] chars = new String[1024];
        Reader reader = new FileReader("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\StepRussian.txt");
        int data;
        int index = 0;
        while ((data = reader.read()) != -1) {
            chars[index++] = String.valueOf((char) data);
            System.out.println(chars[index - 1]);
        }
        System.out.println();
        reader.close();

    }

}
