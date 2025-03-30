package interfaces;

interface A {
  default void show() {
    System.out.println("Default method from A");
  }
}

interface B {
  default void show() {
    System.out.println("Default method from B");
  }
}

class C implements A, B {
  public void show() {
    A.super.show(); // Explicitly calling A's method
  }
}

public class DiamondProblemExample {
  public static void main(String[] args) {
    C obj = new C();
    obj.show();
  }
}
