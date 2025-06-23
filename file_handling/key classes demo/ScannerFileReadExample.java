
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileReadExample {
  public static void main(String[] args) {
    try {
      // Create Scanner object linked to the file
      Scanner sc = new Scanner(new File("example.txt"));

      // Loop while there is a next line
      while (sc.hasNextLine()) {
        // Read the next line from the file
        String line = sc.nextLine();
        System.out.println(line);
      }

      // Close scanner after done reading
      sc.close();

    } catch (FileNotFoundException e) {
      System.out.println("File not found!");
      e.printStackTrace();
    }
  }
}
