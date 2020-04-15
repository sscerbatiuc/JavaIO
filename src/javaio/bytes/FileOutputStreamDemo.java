package javaio.bytes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javaio.file.FileUtil;

/**
 *
 * @author sscerbatiuc
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        File txtFile = FileUtil.createTextFileAbsolute();

        FileOutputStream fout = new FileOutputStream(txtFile, false);

        fout.write(65); // FileOutputStream can only write bytes 65 -> A
        // Writing String
        String hello = "\nHello world !!!";
        for(byte ch: hello.getBytes()){
            System.out.print(ch);
        }
        fout.write(hello.getBytes());
        fout.close();

    }
}
