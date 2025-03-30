package classesobjects;

final class Parent {
  void show() {
    System.out.println("Parent Method");
  }
}

// class Child extends Parent { // ❌ ERROR: Cannot inherit from a final class
// }

public class finalinclass {
  public static void main(String[] args) {
    Parent p = new Parent();
    p.show();
  }

}
