package classesobjects.inner_classes;

//non static inner class
public class outer2 {
  String outerVar = "Outer Variable";

  // Inner Class (Non-Static)
  class Inner {
    void display() {
      System.out.println("Inside Non-Static Inner Class");
      System.out.println("Accessing: " + outerVar); // Can access non-static members
    }
  }

  public static void main(String[] args) {
    outer2 outer = new outer2();
    outer2.Inner inner = outer.new Inner(); // Inner class needs outer instance
    inner.display();
  }

}
