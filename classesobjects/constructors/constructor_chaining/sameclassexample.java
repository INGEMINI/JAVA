package classesobjects.constructors.constructor_chaining;

public class sameclassexample {
  sameclassexample() {
    this(100); // Calls another constructor in the same class
    System.out.println("Default Constructor");
  }

  sameclassexample(int x) {
    this(x, 200); // Calls another constructor
    System.out.println("One-Parameter Constructor: " + x);
  }

  sameclassexample(int x, int y) {
    System.out.println("Two-Parameter Constructor: " + x + ", " + y);
  }

  public static void main(String[] args) {
    sameclassexample obj = new sameclassexample(); // Triggers constructor chaining
  }

}
