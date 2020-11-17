/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaio.file;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author sscerbatiuc
 */
public class WorkingWithFilters {
    public static void main(String[] args) {
        File dir = new File("C:\\Program Files\\PostgreSQL\\12\\bin");
        File[] listFiles = dir.listFiles(new ExeFileFilter());
//        File[] listFiles = dir.listFiles();
        for(File file: listFiles){
            System.out.println(file.getName());
        }
    }
    
}

class ExeFileFilter implements FileFilter{

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".exe") || pathname.getName().endsWith(".dll");
    }

}
