package javaio.copy;

import java.io.*;

public class CopyFiles {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\example.txt");
            FileWriter writer = new FileWriter("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\copy_example.txt");
            int character;
            while((character = reader.read()) != -1){ // -1   // codul zecimal la caracter
                writer.write(character);
            }
            reader.close();
            writer.close();
        }
        catch(IOException ex) {

        }
    }
}
