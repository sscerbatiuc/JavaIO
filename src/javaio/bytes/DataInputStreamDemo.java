package javaio.bytes;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamDemo {
    public static void main(String[] args) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\example.dat"));
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readBoolean());
        System.out.println(dataInputStream.readChar());
    }
}
