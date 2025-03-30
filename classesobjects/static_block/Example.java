package classesobjects.static_block;

//Example of Static Block in a Class
class Example {
  static int x;

  // Static Block
  static {
    System.out.println("Static block executed");
    x = 10; // Initializing static variable
  }

  public static void display() {
    System.out.println("Value of x: " + x);
  }

  public static void main(String[] args) {
    System.out.println("Main method executed");
    display();
  }
}
