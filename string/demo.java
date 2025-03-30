
public class demo {
  public static void main(String[] args) {

    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");
    if (s1 == s2) {
      System.out.println("yes,same same");
    } else {
      System.out.println("nah bruh !! different ");
    }
    if (s1 == s3) {
      System.out.println("yes,same same");
    } else {
      System.out.println("nah bruh !! different ");
    }

  }

}
