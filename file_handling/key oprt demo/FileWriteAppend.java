import java.io.FileWriter;
import java.io.IOException;

public class FileWriteAppend {
  public static void main(String[] args) {
    try {
      // true enables append mode
      FileWriter fw = new FileWriter("example.txt", true);

      // Append content to the file
      fw.write("This line is added later.\n");
      fw.write("Old content is still there!\n");

      fw.close();

      System.out.println("File written successfully in append mode.");
    } catch (IOException e) {
      System.out.println("Error writing to file.");
      e.printStackTrace();
    }
  }
}
