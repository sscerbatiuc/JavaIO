package javaio.file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author sscerbatiuc
 */
public class FileUtil {

    private final static String RELATIVE_PATH = "io\\files";
    private final static String absolutePath = "C:\\Users\\sscerbatiuc.INTHER\\Desktop\\Step.txt";

    public static File createTextFileAbsolute() throws IOException {
        System.out.println("---- Creating file with absolute location ----");

        File newTextFile = new File(absolutePath);
        boolean fileCreated = newTextFile.createNewFile();
        if (fileCreated) {
            System.out.println("File " + absolutePath + " created");
        } else {
            System.err.println("File " + absolutePath + " already exists");
        }
        return newTextFile;
    }

    public static File createTextFileRelative() throws IOException {
        System.out.println("\n---- Creating file with relative location ----");
        System.out.println("Creating relative location: " + RELATIVE_PATH);
        File relativeFolder = new File(RELATIVE_PATH);
        relativeFolder.mkdirs();

        System.out.println("--->" + relativeFolder.getAbsolutePath());

        File txtFile = new File(relativeFolder, "Step.txt");
        boolean isCreated = txtFile.createNewFile();
        String msg = isCreated
                ? "File " + txtFile.getAbsolutePath() + " created"
                : "File " + txtFile.getAbsolutePath() + " already exists";
        System.out.println(msg);
        return relativeFolder;
    }

    public static void demonstrateFileOperations(File file) {
        System.out.println("");
        System.out.println("Is [" + file.getAbsolutePath() + "] file:" + file.isFile());
        System.out.println("Is [" + file.getAbsolutePath() + "] folder:" + file.isDirectory());
        System.out.println("Is [" + file.getAbsolutePath() + "] hidden:" + file.isHidden());
    }
}
