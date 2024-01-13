package sandbox.fileoperations;

import java.io.*;

import static java.lang.System.out;

public class BufferedWRTest {
    public static void main(String[] args) throws IOException {
        var filePath = "src/sandbox/fileoperations/TestFileForBWR.txt";
        writeInFile(filePath, "This is the original G \n M to the \n B to the \n M to the Bee");
        readAndPrintFile(filePath);
        writeInFile(filePath, "Now it changed. But It's fast at least :)");
        readAndPrintFile(filePath);
    }

    private static void writeInFile(String filePath, String fileString) throws IOException {
        try (var bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write(fileString);
        }
    }

    private static void readAndPrintFile(String filePath) throws IOException {
        try (var bufferedReader = new BufferedReader(new FileReader(filePath))) {
            bufferedReader.lines().forEach(out::println);
        }
    }
}
