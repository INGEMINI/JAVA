package array;

import java.util.Scanner;

public class TwoDArrayProperties {

  // ✅ Function to check if a number is prime
  static boolean isPrime(int num) {
    if (num < 2)
      return false;
    for (int i = 2; i * i <= num; i++) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // ✅ 1. Input: Create a 2D array with user-defined rows & columns
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();

    int[][] arr = new int[rows][cols]; // Fixed-size 2D array

    // ✅ 2. Input Elements
    System.out.println("Enter elements of the 2D array:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    // ✅ 3. Output the 2D array
    System.out.println("Your 2D array:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    // ✅ 4. Finding Odd, Even, and Prime Numbers
    System.out.println("\nOdd numbers & their positions:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (arr[i][j] % 2 != 0) {
          System.out.println(arr[i][j] + " at row " + i + ", column " + j);
        }
      }
    }

    System.out.println("\nEven numbers & their positions:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (arr[i][j] % 2 == 0) {
          System.out.println(arr[i][j] + " at row " + i + ", column " + j);
        }
      }
    }

    System.out.println("\nPrime numbers in the array:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (isPrime(arr[i][j])) {
          System.out.println(arr[i][j] + " ");
        }
      }
    }

    // ✅ 5. Copying a 2D Array (Manual Deep Copy)
    int[][] copyArr = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        copyArr[i][j] = arr[i][j]; // Copying elements manually
      }
    }

    // ✅ 6. Transposing the Matrix (Rows become Columns)
    int[][] transpose = new int[cols][rows];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        transpose[j][i] = arr[i][j];
      }
    }

    System.out.println("\nTranspose of the Matrix:");
    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }

    // ✅ 7. Sum of Rows & Columns
    System.out.println("\nSum of Each Row:");
    for (int i = 0; i < rows; i++) {
      int sum = 0;
      for (int j = 0; j < cols; j++) {
        sum += arr[i][j];
      }
      System.out.println("Row " + (i + 1) + " Sum: " + sum);
    }

    System.out.println("\nSum of Each Column:");
    for (int j = 0; j < cols; j++) {
      int sum = 0;
      for (int i = 0; i < rows; i++) {
        sum += arr[i][j];
      }
      System.out.println("Column " + (j + 1) + " Sum: " + sum);
    }

    // ✅ 8. Variable Column (Jagged Array Example)
    System.out.print("\nEnter number of rows for jagged array: ");
    int jaggedRows = sc.nextInt();
    int[][] jaggedArr = new int[jaggedRows][]; // Variable column size

    for (int i = 0; i < jaggedRows; i++) {
      System.out.print("Enter columns for row " + (i + 1) + ": ");
      int colSize = sc.nextInt();
      jaggedArr[i] = new int[colSize]; // Allocating different column sizes
    }

    System.out.println("\nJagged Array Structure:");
    for (int i = 0; i < jaggedRows; i++) {
      for (int j = 0; j < jaggedArr[i].length; j++) {
        System.out.print("* "); // Representing jagged structure
      }
      System.out.println();
    }

    sc.close();
  }
}
