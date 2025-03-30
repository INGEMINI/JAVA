package array;

import java.util.Scanner;

public class twod {

  //Methods called inside static main() must also be static (if called without an object).
  static boolean prime(int x) {
    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        return false;

      }

    }

    return true;
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n ie no of rows");
    n = sc.nextInt();

    int[][] arr = new int[n][];

    for (int i = 0; i < n; i++) {
      System.out.println("enter no of columns for row " + (i + 1));
      arr[i] = new int[sc.nextInt()];

    }

    System.out.println("enter elements");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = sc.nextInt();

      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);

      }
    }
    System.out.println("all odd no are and their positions are ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if ((arr[i][j] % 2) != 0) {
          System.out.println(arr[i][j]);
          System.out.println("position is : row = " + i + " column= " + j);

        }
      }
    }

    System.out.println("all prime no are ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (prime(arr[i][j])) {
          System.out.println(arr[i][j]);

        }
      }
    }

    System.out.println("all even no are and their positions are ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if ((arr[i][j] % 2) == 0) {
          System.out.println(arr[i][j]);
          System.out.println("position is : row = " + i + " column= " + j);

        }
      }
    }

    sc.close();
  }

}

//method-2 ..writing code without using static keyword in prime function

// public class twod {
  
//   boolean prime(int x) {  // Removed static
//     for (int i = 2; i < x; i++) {
//       if (x % i == 0) return false;
//     }
//     return true;
//   }

//   public static void main(String[] args) {
//     twod obj = new twod();  // Creating an object of the class
//     Scanner sc = new Scanner(System.in);
    
//     System.out.println("enter n ie no of rows");
//     int n = sc.nextInt();

//     int[][] arr = new int[n][];
//     for (int i = 0; i < n; i++) {
//       System.out.println("enter no of columns for row " + (i + 1));
//       arr[i] = new int[sc.nextInt()];
//     }

//     System.out.println("enter elements");
//     for (int i = 0; i < n; i++) {
//       for (int j = 0; j < arr[i].length; j++) {
//         arr[i][j] = sc.nextInt();
//       }
//     }

//     System.out.println("all prime no are ");
//     for (int i = 0; i < n; i++) {
//       for (int j = 0; j < arr[i].length; j++) {
//         if (obj.prime(arr[i][j])) {  // Calling using object
//           System.out.println(arr[i][j]);
//         }
//       }
//     }

//     sc.close();
//   }
// }

//Alternative (Without static)
// If you remove static from prime(), you must create an object of twod inside main() to call prime(), like this.

// This works, but using static in prime() is simpler because it avoids unnecessary object creation


