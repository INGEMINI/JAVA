package classesobjects.access_specifiers;

//public
public class test1 {

  public int data = 10;

  public void display() {
    System.out.println("Public Method");
  }
}

// Usage in another package:

// import mypackage.Test; // Allowed since Test is public

// public class Main {
// public static void main(String[] args) {
// Test obj = new Test();
// System.out.println(obj.data); // Accessible
// obj.display(); // Accessible
// }
// }
