package javaio.bytes;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class BufferedOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\newTest.txt");
        if (newTextFile.createNewFile()) {
            System.out.println("File created");
        } else {
            System.err.println("File already exists");
            newTextFile.delete();
            newTextFile.createNewFile();
        }

        FileOutputStream fout = new FileOutputStream(newTextFile);
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris malesuada porttitor nibh non mattis.";
        byte messageAsByteArray[] = message.getBytes();
        bout.write(messageAsByteArray);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Completed");

    }
}
