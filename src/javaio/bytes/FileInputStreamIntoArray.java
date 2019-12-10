package javaio.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javaio.file.FileUtil;

/**
 *
 * @author sscerbatiuc
 */
public class FileInputStreamIntoArray {

    public static void main(String[] args) throws IOException {
        // Specifying the size of the array
        String[] array = new String[1024];
        String result = "";
        
        File txtFile = FileUtil.createTextFileAbsolute();
        FileInputStream inStream = new FileInputStream(txtFile);

        // Temporary variable.
        int intChar;
        
        // Reading all the characters:
        for(int i = 0; (intChar = inStream.read()) != -1; i++){
            array[i] = String.valueOf((char)intChar);
            result += (char)intChar;
            System.out.println(array[i]);
        }
        
        System.out.println(result);
        // Closing resources
        inStream.close();

    }
}
