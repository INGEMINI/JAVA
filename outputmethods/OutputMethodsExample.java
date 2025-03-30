package outputmethods;

import java.io.*;

public class OutputMethodsExample {
  public static void main(String[] args) throws IOException {
    // 1️⃣ Using System.out.println()
    System.out.println("1️⃣ System.out.println() - Prints with newline");

    // 2️⃣ Using System.out.print()
    System.out.print("2️⃣ System.out.print() - ");
    System.out.print("Prints without newline\n"); // Manually adding newline

    // 3️⃣ Using System.out.printf()
    int age = 21;
    double height = 5.9;
    System.out.printf(" System.out.printf() - Age: %d, Height: %.2f meters\n", age, height);

    // 4️⃣ Using System.out.format() (Same as printf)
    System.out.format("4️⃣ System.out.format() - Formatted price: $%.2f\n", 99.99);

    // 5️⃣ Using BufferedWriter (More efficient for large text output)
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write("5️⃣ BufferedWriter - More efficient for large text output");
    bw.newLine(); // Adds newline
    bw.flush(); // Flushes output to console

    // 6️⃣ Using PrintWriter (More advanced printing)
    PrintWriter pw = new PrintWriter(System.out);
    pw.println("6️⃣ PrintWriter - Supports formatted output and file writing");
    pw.flush(); // Flushes output

    // 7️⃣ Writing to a file using PrintWriter
    PrintWriter fileWriter = new PrintWriter("output.txt");
    fileWriter.println("7️⃣ Writing to a file using PrintWriter");
    fileWriter.printf("Formatted Output: %s = %d\n", "Total Marks", 95);
    fileWriter.close(); // Always close the file after writing

    System.out.println("✅ All output methods executed successfully!");
  }
}
