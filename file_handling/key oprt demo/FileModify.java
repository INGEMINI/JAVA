import java.io.*;

public class FileModify {
  public static void main(String[] args) {
    try {
      // Step 1: Read the original file
      BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
      StringBuilder modifiedText = new StringBuilder();
      String line;

      while ((line = reader.readLine()) != null) {
        // Step 2: Modify content
        line = line.replace("old", "new");
        modifiedText.append(line).append("\n");
      }
      reader.close();

      // Step 3: Write back to the same file
      BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"));
      writer.write(modifiedText.toString());
      writer.close();

      System.out.println("File updated successfully!");

    } catch (IOException e) {
      System.out.println("Error occurred during file modification.");
      e.printStackTrace();
    }
  }
}
