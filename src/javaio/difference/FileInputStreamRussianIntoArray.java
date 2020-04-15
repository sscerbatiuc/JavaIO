package javaio.difference;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class FileInputStreamRussianIntoArray {

    public static void main(String[] args) throws IOException {
        // Specifying the size of the array
        String[] array = new String[1024];
        FileInputStream inStream = new FileInputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\StepRussian.txt");

        // Temporary variable.
        int intChar;
        
        // Reading all the characters:
        for(int i = 0; (intChar = inStream.read()) != -1; i++){
            array[i] = String.valueOf((char)intChar);
            System.out.print(array[i]);
        }
        
        System.out.println(array);
        
        // Closing resources
        inStream.close();

    }
}
