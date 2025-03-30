package classesobjects.static_block;
//Multiple Static Blocks Example

class Test {
  static {
      System.out.println("First static block");
  }

  static {
      System.out.println("Second static block");
  }

  public static void main(String[] args) {
      System.out.println("Main method");
  }
}
