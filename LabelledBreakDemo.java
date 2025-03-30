public class LabelledBreakDemo {
  public static void main(String[] args) {
    int[][][] numbers = {
        { { 10, 15, 20 }, { 25, 30, 35 } },
        { { 40, 45, 50 }, { 55, 60, 65 } },
        { { 70, 75, 80 }, { 85, 90, 95 } }
    };

    int target = 60; // Number to search
    boolean found = false; // Flag to check if number is found

    search: // Label for breaking all loops
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers[i].length; j++) {
        for (int k = 0; k < numbers[i][j].length; k++) {
          System.out.println("Checking: " + numbers[i][j][k]);

          if (numbers[i][j][k] == target) {
            System.out.println("🎯 Found " + target + " at [" + i + "][" + j + "][" + k + "]");
            found = true;
            break search; // Exits ALL loops
          }
        }
      }
    }

    if (!found) {
      System.out.println("❌ Target number not found in the array.");
    }
  }
}
