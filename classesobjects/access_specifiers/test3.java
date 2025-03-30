package classesobjects.access_specifiers;
//protected

public class test3 {
  protected int data = 10;

  protected void display() {
    System.out.println("Protected Method");
  }

}

// Usage in the same package:

// package mypackage;
// public class Main {
// public static void main(String[] args) {
// Test obj = new Test();
// System.out.println(obj.data); // ✅ Accessible
// obj.display(); // ✅ Accessible
// }
// }