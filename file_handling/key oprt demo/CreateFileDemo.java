
import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
  public static void main(String[] args) {
    try {
      // Create a File object with the filename
      File file = new File("newfile.txt");

      // createNewFile() returns true if file created, false if it already exists
      if (file.createNewFile()) {
        System.out.println("File created successfully: " + file.getName());
      } else {
        System.out.println("File already exists: " + file.getName());
      }
    } catch (IOException e) {
      System.out.println("An error occurred while creating the file.");
      e.printStackTrace();
    }
  }
}
