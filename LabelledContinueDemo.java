public class LabelledContinueDemo {

  public static void main(String[] args) {
    outerLoop: for (int row = 1; row <= 3; row++) { // Rows
      for (int col = 1; col <= 3; col++) { // Columns
        if (col == 2) {
          continue outerLoop; // Skips rest of current row, moves to next row
        }
        System.out.print(row + "," + col + "  ");
      }
      System.out.println(); // New line for next row
    }
  }
}
