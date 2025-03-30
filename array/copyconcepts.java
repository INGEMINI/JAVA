package array;

import java.util.Arrays;

public class copyconcepts {

  public static void main(String[] args) {
    // 🔹 Original Array
    int[] original = { 1, 2, 3, 4, 5 };

    // 🔹 1. Direct Assignment → (Shallow Copy: Same memory used)
    int[] directCopy = original; // Both refer to the same array, changes in one affect the other.

    // 🔹 2. clone() Method → (Deep Copy for primitive array, Shallow Copy for
    // objects)
    int[] cloneCopy = original.clone(); // Creates a new array but copies same values.

    // 🔹 3. System.arraycopy() → (Deep Copy: Copies elements to a new array)
    int[] systemCopy = new int[original.length];
    System.arraycopy(original, 0, systemCopy, 0, original.length); // Manually copies values.

    // 🔹 4. Arrays.copyOf() → (Deep Copy: Creates a completely new array)
    int[] copyOfCopy = Arrays.copyOf(original, original.length); // Creates a new array with the same values.

    // 🔹 5. Arrays.copyOfRange() → (Deep Copy: Copies a part of the array)
    int[] copyOfRangeCopy = Arrays.copyOfRange(original, 1, 4); // Copies index 1 to 3.

    // 🔹 6. Manual Loop Copy → (Deep Copy: Each value is copied one by one)
    int[] manualCopy = new int[original.length];
    for (int i = 0; i < original.length; i++) {
      manualCopy[i] = original[i]; // Manually copying values
    }

    // 🔹 7. Using Streams (Java 8+) → (Deep Copy: Creates a new array)
    int[] streamCopy = Arrays.stream(original).toArray(); // Converts array to stream and back.

    // 🔹 Display All Copies
    System.out.println("Original: " + Arrays.toString(original));
    System.out.println("Direct Assignment (Shallow Copy): " + Arrays.toString(directCopy));
    System.out.println("clone() Method: " + Arrays.toString(cloneCopy));
    System.out.println("System.arraycopy(): " + Arrays.toString(systemCopy));
    System.out.println("Arrays.copyOf(): " + Arrays.toString(copyOfCopy));
    System.out.println("Arrays.copyOfRange(): " + Arrays.toString(copyOfRangeCopy));
    System.out.println("Manual Loop Copy: " + Arrays.toString(manualCopy));
    System.out.println("Stream Copy: " + Arrays.toString(streamCopy));
  }
}
