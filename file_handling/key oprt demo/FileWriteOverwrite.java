import java.io.FileWriter;
import java.io.IOException;

public class FileWriteOverwrite {
  public static void main(String[] args) {
    try {
      // FileWriter in overwrite mode (default)
      FileWriter fw = new FileWriter("example.txt");

      // Write content to the file
      fw.write("This is a fresh start.\n");
      fw.write("Old content was erased!\n");

      // Always close the stream
      fw.close();

      System.out.println("File written successfully in overwrite mode.");
    } catch (IOException e) {
      System.out.println("Error writing to file.");
      e.printStackTrace();
    }
  }
}
