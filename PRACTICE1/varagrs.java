public class varagrs {
  // static int sum(int... arr) {
  // int result = 0;
  // for (int a : arr) {
  // result += a;

  // }
  // return result;

  // }

  static int sum(int x, int... arr) {
    int result = x;
    for (int a : arr) {
      result += a;

    }
    return result;

  }

  // multiple variable given to function randomly
  public static void main(String[] args) {
    System.out.println("varargs demo initiated.");
    System.out.println("4+5 is " + sum(4, 5));
    System.out.println("4+5+ 1 is " + sum(4, 5, 1));
    System.out.println("4+5+1+2 is " + sum(4, 5, 1, 2));
    System.out.println("0 is " + sum(1));

    System.out.println("2 + 0+ 4+5 is " + sum(2, 0, 4, 5));
  }
}
