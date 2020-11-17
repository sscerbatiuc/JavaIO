package javaio.chars;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\sscerbatiuc.INTHER\\Desktop\\employees.csv", true);
        writer.write("\nelena,boicu,3910485027");

        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("\nelena,boicu,3910485027");
        bufferedWriter.flush();
        bufferedWriter.close();

        writer.close();
    }
}
