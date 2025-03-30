package interfaces;

interface MyInterface {
  void normalMethod(); // Abstract method

  // Default method with implementation
  default void defaultMethod() {
    System.out.println("This is a default method in an interface.");
  }
}

// Implementing class
class MyClass implements MyInterface {
  public void normalMethod() {
    System.out.println("Implementing the abstract method.");
  }
}

public class DefaultMethodExample {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.normalMethod(); // Output: Implementing the abstract method.
    obj.defaultMethod(); // Output: This is a default method in an interface.
  }
}
