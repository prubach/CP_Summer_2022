package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        String fileName = "out.txt";
        File myFile = new File(fileName);
        FileWriter fw = new FileWriter(myFile);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("This is my header");
        bw.newLine();
        bw.write("2nd line");
        bw.newLine();
        bw.write("3rd line");
        bw.close();
        fw.close();
    }
}
