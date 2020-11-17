package javaio.bytes;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\example.dat");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.write(123);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeDouble(12.55);
            dataOutputStream.writeChar('a');
            dataOutputStream.writeUTF("Și unde e parlamentul? Hă"); // "UTF-8"
            dataOutputStream.flush();
            dataOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException");
            System.out.println(ex.getMessage());
        }

    }
}
