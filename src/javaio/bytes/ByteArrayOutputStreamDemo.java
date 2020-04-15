package javaio.bytes;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Step.txt");
        File newTextFileCopy = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\StepCopy.txt");
        File newFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\StepBinary");
        if (newTextFile.createNewFile()) {
            System.out.println("File created");
        } else {
            System.err.println("File already exists");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(newTextFile);
        FileOutputStream fileOutputStreamCopy = new FileOutputStream(newTextFileCopy);
        FileOutputStream fileOutputStreamBinary = new FileOutputStream(newFile);

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        byte[] data = {0,1,2,3,4};
        bout.write(data);
        bout.writeTo(fileOutputStream);
        bout.writeTo(fileOutputStreamCopy);
        bout.writeTo(fileOutputStreamBinary);

        bout.flush();
        bout.close();//has no effect    
    }
}
