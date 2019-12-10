package javaio.bytes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javaio.file.FileUtil;

/**
 *
 * @author sscerbatiuc
 */
public class FileInputStreamArrayList {

    public static void main(String[] args) throws IOException {
        ArrayList<String> arrList = new ArrayList<String>();
        File txtFile = FileUtil.createTextFileAbsolute();
        FileInputStream inStream = new FileInputStream(txtFile);

        // Temporary variable.
        int intChar;

        // Reading all the characters:
        while ((intChar = inStream.read()) != -1) {
            arrList.add(String.valueOf((char)intChar));
        }
        
        System.out.println(arrList);
        
        // Closing resources
        inStream.close();

    }
}
