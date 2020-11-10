package javaio.chars;

import java.io.*;

public class ReadCsvBufferedReader {
    public static void main(String[] args) throws IOException {
        File fileToRead = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\employees.csv");
        BufferedReader reader = new BufferedReader(new FileReader(fileToRead));
        String line;
        while((line = reader.readLine())!= null){
            System.out.println(line);
        }
    }
}
