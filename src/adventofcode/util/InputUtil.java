package adventofcode.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputUtil {
  private InputUtil() {/** Cannot instantiate utility class. */}

  public static List<String> getFileData(String filePath) {
    File file = new File(filePath);
    ArrayList<String> data = new ArrayList<>();
    String lineString;
    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
      while ((lineString = br.readLine()) != null) {
        data.add(lineString);
      }
    } catch (IOException e) {
      System.out.println("Failed to read file.");
      e.printStackTrace();
    }
    return data;
  }
}
