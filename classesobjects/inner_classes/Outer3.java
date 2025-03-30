package classesobjects.inner_classes;
//Method-Local Inner Class

public class Outer3 {

  void outerMethod() {
    String localVar = "Local Variable"; // Effectively final

    // Inner Class inside a method
    class MethodInner {
      void display() {
        System.out.println("Inside Method-Local Inner Class");
        System.out.println("Accessing: " + localVar);
      }
    }

    MethodInner inner = new MethodInner(); // Object created inside method
    inner.display();
  }

  public static void main(String[] args) {
    Outer3 outer = new Outer3();
    outer.outerMethod();
  }
}
