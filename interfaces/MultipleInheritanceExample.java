package interfaces;

interface A {
  void show();
}

interface B {
  void display();
}

class C implements A, B { // Implements both interfaces
  public void show() {
    System.out.println("Show method from A");
  }

  public void display() {
    System.out.println("Display method from B");
  }
}

public class MultipleInheritanceExample {
  public static void main(String[] args) {
    C obj = new C();
    obj.show();
    obj.display();
  }
}
