
import java.util.Scanner;

public class demo2 {

  public static void main(String[] args) {

    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter elements");
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();

    }

    System.out.println("array elements are ");

    for (int i = 0; i < 5; i++) {
      System.out.println(arr[i] + " ");
    }
    sc.close();

  }
}
