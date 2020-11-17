package javaio.chars;

import java.io.*;

public class ReadCsvBufferedReader {
    public static void main(String[] args) throws IOException {
        File fileToRead = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\employees.csv");
        FileReader fileReader = new FileReader(fileToRead);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        while((line = reader.readLine())!= null){
            System.out.println(line);
        }
    }
}
