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
public class Demo {
    public static void main(String[] args) throws IOException {
//        File absoluteFile = FileUtil.createTextFileAbsolute();
        File relativeFile = FileUtil.createTextFileRelative();
    }
}
