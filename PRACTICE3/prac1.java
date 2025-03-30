
import java.util.Scanner;

public class prac1 {

  public static void main(String[] args) {

    System.out.println("enter  name");
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    String[] news = s.split(" ");
    int c = 0;
    for (String scc : news) {
      c++;
    }
    System.out.println("total no of words r " + c);

    sc.close();
  }
}
