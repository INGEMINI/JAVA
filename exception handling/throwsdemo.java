import java.io.*;

public class throwsdemo {
  public static void checkFile() throws IOException {
    FileReader file = new FileReader("data.txt");
  }

  public static void main(String[] args) throws IOException {
    checkFile();
  }
}
