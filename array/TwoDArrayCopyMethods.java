package array;

import java.util.Arrays;

public class TwoDArrayCopyMethods {
  public static void main(String[] args) {
    // ✅ Original 2D array
    int[][] original = {
        { 1, 2, 3 },
        { 4, 5, 6 }
    };

    // ✅ 1. Manual Deep Copy (Element-by-Element)
    int[][] deepCopy = new int[original.length][original[0].length];
    for (int i = 0; i < original.length; i++) {
      for (int j = 0; j < original[i].length; j++) {
        deepCopy[i][j] = original[i][j];
      }
    }

    // ✅ 2. clone() Method (Shallow Copy)
    int[][] cloneCopy = original.clone(); // Only copies outer array, inner remains linked

    // ✅ 3. Arrays.copyOf() (Shallow Copy)
    int[][] copyOfCopy = Arrays.copyOf(original, original.length); // Similar to clone()

    // ✅ 4. System.arraycopy() (Shallow Copy)
    int[][] systemCopy = new int[original.length][];
    System.arraycopy(original, 0, systemCopy, 0, original.length); // Copies rows only

    // ✅ 5. Using Arrays.stream() (Deep Copy)
    int[][] streamCopy = Arrays.stream(original)
        .map(int[]::clone) // Clones each row separately
        .toArray(int[][]::new);

    // ✅ Modify an element in the original array
    original[0][0] = 99;

    // ✅ Checking which copies changed (Deep vs Shallow)
    System.out.println("Original after modification: " + Arrays.deepToString(original));
    System.out.println("Deep Copy: " + Arrays.deepToString(deepCopy)); // No change
    System.out.println("Shallow Clone Copy: " + Arrays.deepToString(cloneCopy)); // Changes
    System.out.println("Shallow Arrays.copyOf(): " + Arrays.deepToString(copyOfCopy)); // Changes
    System.out.println("Shallow System.arraycopy(): " + Arrays.deepToString(systemCopy)); // Changes
    System.out.println("Deep Stream Copy: " + Arrays.deepToString(streamCopy)); // No change
  }
}
