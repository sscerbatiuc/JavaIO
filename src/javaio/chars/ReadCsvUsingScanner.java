package javaio.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCsvUsingScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\employees.csv"));
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
