package array;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArrayProperties {

  // Method to display array elements
  public static void printArray(int[] arr) {
    System.out.println("Array Elements: " + Arrays.toString(arr));
  }

  // Method to return an array
  public static int[] createArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < size; i++) {
      newArray[i] = i + 1; // Assigning values
    }
    return newArray;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1. DECLARATION & INITIALIZATION
    int[] arr1 = new int[5]; // Declaration of array
    int[] arr2 = { 10, 20, 30, 40, 50 }; // Direct initialization

    System.out.println("Enter 5 elements for arr1:");
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = sc.nextInt(); // Taking input
    }

    // 2. ACCESSING & MODIFYING ELEMENTS
    System.out.println("First element: " + arr1[0]); // Accessing first element
    arr1[2] = 100; // Modifying an element
    System.out.println("After modification, arr1[2] = " + arr1[2]);

    // 3. TRAVERSAL
    System.out.println("Traversing using for loop:");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }
    System.out.println();

    System.out.println("Traversing using enhanced for loop:");
    for (int num : arr1) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 4. FINDING LENGTH OF ARRAY
    System.out.println("Length of arr1: " + arr1.length);

    // 5. COPYING ARRAYS
    int[] arrCopy = arr1.clone(); // Cloning
    System.out.println("Copied array using clone(): " + Arrays.toString(arrCopy));

    int[] arrManualCopy = new int[arr1.length];
    System.arraycopy(arr1, 0, arrManualCopy, 0, arr1.length);
    System.out.println("Copied manually using System.arraycopy(): " + Arrays.toString(arrManualCopy));

    // 6. SORTING ARRAY
    Arrays.sort(arr1);
    System.out.println("Sorted arr1: " + Arrays.toString(arr1));

    // 7. SEARCHING ELEMENTS
    // Linear Search
    System.out.println("Enter element to search in arr1:");
    int key = sc.nextInt();
    boolean found = false;
    for (int num : arr1) {
      if (num == key) {
        found = true;
        break;
      }
    }
    System.out.println(found ? "Element found (Linear Search)" : "Element not found");

    // Binary Search (Only works on sorted arrays)
    int index = Arrays.binarySearch(arr1, key);
    if (index >= 0)
      System.out.println("Element found at index (Binary Search): " + index);
    else
      System.out.println("Element not found in Binary Search");

    // 8. PASSING ARRAY TO METHOD
    printArray(arr1);

    // 9. RETURNING AN ARRAY FROM A METHOD
    int[] returnedArray = createArray(5);
    System.out.println("Array returned from method: " + Arrays.toString(returnedArray));

    sc.close();
  }
}
