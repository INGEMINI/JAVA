package classesobjects.inner_classes;
//static nested class
public class outer1 {

  static String outerStaticVar = "Outer Static Variable";

  // Static Nested Class
  static class StaticNested {
    void display() {
      System.out.println("Inside Static Nested Class");
      System.out.println("Accessing: " + outerStaticVar); // Can access static variables
    }
  }

  public static void main(String[] args) {
    // Directly create an object of static nested class
    outer1.StaticNested nested = new outer1.StaticNested();
    nested.display();
  }
}
