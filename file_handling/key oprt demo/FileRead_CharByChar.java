import java.io.FileReader;
import java.io.IOException;

public class FileRead_CharByChar {
  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader("example.txt");
      int ch;

      while ((ch = fr.read()) != -1) {
        System.out.print((char) ch);
      }

      fr.close();
    } catch (IOException e) {
      System.out.println("Error reading file.");
      e.printStackTrace();
    }
  }
}
