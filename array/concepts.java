// 1D Array – Basic operations (declaration, initialization, and traversal).
// 2D Array – Row-column representation.
// Variable Column 2D Array – Jagged array.
// Multi-dimensional Array – 3D array example.

package array;

import java.util.Scanner;

public class concepts {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1D Array
    System.out.println("1D Array Example:");
    int[] oneDArray = new int[5]; // Declaration of 1D array

    System.out.println("Enter 5 elements for 1D array:");
    for (int i = 0; i < oneDArray.length; i++) {
      oneDArray[i] = sc.nextInt();
    }

    System.out.println("1D Array Elements:");
    for (int num : oneDArray) {
      System.out.print(num + " ");
    }
    System.out.println("\n");

    // 2D Array (Matrix)
    System.out.println("2D Array (Matrix) Example:");
    int[][] twoDArray = new int[3][3]; // Declaration of 2D array (3x3)

    System.out.println("Enter 9 elements for 3x3 matrix:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        twoDArray[i][j] = sc.nextInt();
      }
    }

    System.out.println("2D Array (Matrix):");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(twoDArray[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    // Jagged Array (Variable column 2D array)
    System.out.println("Variable Column (Jagged) Array Example:");
    int[][] jaggedArray = new int[3][]; // Declaring a jagged array

    jaggedArray[0] = new int[2]; // First row has 2 columns
    jaggedArray[1] = new int[4]; // Second row has 4 columns
    jaggedArray[2] = new int[3]; // Third row has 3 columns

    System.out.println("Enter elements for jagged array:");
    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        jaggedArray[i][j] = sc.nextInt();
      }
    }

    System.out.println("Jagged Array:");
    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println();

    // Multi-dimensional Array (3D)
    System.out.println("3D Array Example:");
    int[][][] threeDArray = new int[2][2][2]; // 2x2x2 3D array

    System.out.println("Enter 8 elements for 3D array:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
          threeDArray[i][j][k] = sc.nextInt();
        }
      }
    }

    System.out.println("3D Array Elements:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
          System.out.print(threeDArray[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }

    sc.close();
  }
}

// When you write System.out.println(); without any content inside the
// parentheses, it simply prints a blank line (i.e., a line break).