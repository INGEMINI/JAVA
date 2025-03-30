public class methods {

  static int add(int x, int y) {

    int d = x + y;
    System.out.println(d);

    return d;
  }

  // static method can call a static method..and main method is static.
  public static void main(String[] args) {

    int a = add(0, 0);
    System.out.println(a);

    methods obj = new methods();
    int c = obj.add(9, 9);
    System.out.println(c);

  }
}
