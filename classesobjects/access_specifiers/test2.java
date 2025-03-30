package classesobjects.access_specifiers;

//private
public class test2 {

  private int data = 10;

  private void display() {
    System.out.println("Private Method");
  }

  public void showData() {
    System.out.println("Data: " + data); // Allowed inside the same class
  }
}

// Usage in another class (will cause an error):

// public class Main {
// public static void main(String[] args) {
// Test obj = new Test();
// // System.out.println(obj.data); // ❌ ERROR: data is private
// // obj.display(); // ❌ ERROR: display() is private
// }
// }
