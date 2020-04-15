package javaio.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sscerbatiuc
 */
public class PrintWriterDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Data to write on Console using PrintWriter  
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Random string that we need to have in the console\n");
        writer.flush();
        writer.close();
        //Data to write in File using PrintWriter       
        PrintWriter writer1 = null;
        FileWriter fileWriter = 
                new FileWriter(new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Step.txt"), true);
        writer1 = new PrintWriter(fileWriter);
        // writer1.append ???
        writer1.write("Hi dude, this text is going to be written ");
        writer1.flush();
        writer1.close();
    }
}
