
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
  public static void main(String[] args) {
    try {
      // 1️⃣ Create FileWriter in append mode
      FileWriter fw = new FileWriter("buffered.txt", true);

      // 2️⃣ Wrap it inside BufferedWriter
      BufferedWriter bw = new BufferedWriter(fw);

      // 3️⃣ Writing lines
      bw.write("Hello from BufferedWriter!");
      bw.newLine(); // Moves to the next line
      bw.write("This is faster than FileWriter alone.");
      bw.newLine();
      bw.write("♥ Java File Handling");
      bw.newLine();

      bw.flush();

      // 4️⃣ Always close it!
      bw.close();
      fw.close();

      System.out.println("✅ Buffered writing done successfully!");

    } catch (IOException e) {
      System.out.println("🚨 Error occurred while writing.");
      e.printStackTrace();
    }
  }
}
