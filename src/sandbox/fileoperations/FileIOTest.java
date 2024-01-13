package sandbox.fileoperations;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileIOTest {
    private static final Logger logger = Logger.getLogger(FileIOTest.class.getName());

    public static void main(String[] args) throws IOException {
        var file = new File("src/sandbox/fileoperations/TestFile.txt");
        writeInFile(file, "This this is soo powerful !!!! Damn !!!");
        readAndPrintFile(file);
        writeInFile(file, "I forged the information I am OP.");
        readAndPrintFile(file);
    }

    private static void writeInFile(File file, String fileString) throws IOException {
        try (var fileOutputStream = new FileOutputStream(file)) {
            fileOutputStream.write(fileString.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException fileNotFoundException) {
            errorHandlerMessage();
        }
    }

    private static void readAndPrintFile(File file) throws IOException {
        try (var fileInputStream = new FileInputStream(file)) {
            var i = 0;
            var fileStringBuilder = new StringBuilder("The file output is : \n");
            while ((i = fileInputStream.read()) != -1) {
                fileStringBuilder.append((char) i);
            }
            var fileString = fileStringBuilder.toString();
            logger.info(fileString);
        } catch (FileNotFoundException fileNotFoundException) {
            errorHandlerMessage();
        }
    }

    private static void errorHandlerMessage() {
        logger.log(Level.SEVERE, "Bitch put a correct path.");
    }
}
