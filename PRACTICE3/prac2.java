import java.util.Scanner;

public class prac2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    System.out.println("enter elements");

    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();

    }

    System.out.println("entering no done");

    for (int i = 0, j = (arr.length - 1); i < (arr.length / 2); i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    System.out.println("no after reverse");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    sc.close();

    int c = 1;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        System.out.println("array is not sorted");
        c = 0;
        break;

      }
    }
    if (c == 1) {
      System.out.println("array is sorted");
    }

  }
}
