package javaio.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCsv {
    public static void main(String... args) {
        try {
            File fileToRead = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\employees.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToRead));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}