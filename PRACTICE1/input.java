import java.util.Scanner;

public class input {

  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("enter a no :");
    int num = sc.nextInt();
    System.out.println("you entered : " + num);
    sc.close();

  }
}