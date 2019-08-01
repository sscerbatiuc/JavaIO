/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class ManipulatingFile {

    public static void main(String[] args) throws IOException {
        File newTextFile = new File("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Tekwill homework\\newTest.txt");
        if (newTextFile.createNewFile()) {
            System.out.println("File created");
        } else {
            System.err.println("File already exists");
        }

        // Check if a file is a directory?
        System.out.println("Is directory: " + newTextFile.isDirectory());

        // Get the parent
        System.out.println("Parent " + newTextFile.getParent());
        
        // Delete the file
         // System.out.print(newTextFile.delete());
         newTextFile.deleteOnExit();
         System.out.print("Pause here");

    }
}
