import java.util.Scanner;

public class array {
  public static void main(String[] args) {

    int[] marks = new int[10];
    marks[0] = 12;
    marks[1] = 18;
    marks[2] = 15;
    marks[3] = 14;
    marks[4] = 13;
    marks[5] = 11;
    System.out.println(marks[5]);

    // method 2
    int[] m = { 1, 2, 3, 4, 5 };
    System.out.println(m[0]);
    System.out.println(" ");

    // method 3
    // System.out.println("enter n");
    // Scanner sc = new Scanner(System.in);

    // int n = sc.nextInt();
    // int[] v;
    // v = new int[n];
    // /v[0] = 1;
    // System.out.println(v[0]);
    // System.out.println(v.length);

    for (int ele : marks) {
      System.out.println(ele);
    }

    // multi dimension array

    int[][] flats;
    flats = new int[2][3];
    flats[0][0] = 100;
    flats[0][1] = 101;
    flats[0][2] = 102;
    flats[1][0] = 103;
    flats[1][1] = 104;

    for (int i = 0; i < flats.length; i++) {
      for (int j = 0; j < flats[i].length; j++) {

        System.out.print(flats[i][j]);
        System.out.print(" ");

      }
      System.out.println(" ");
    }

  }
}
