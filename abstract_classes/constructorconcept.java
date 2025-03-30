package abstract_classes;
// 4️⃣ Abstract Classes and Constructor Chaining

// Even though an abstract class cannot be instantiated, its constructor is still called when a subclass object is created.

abstract class Parent {
  Parent() {
    System.out.println("Parent Constructor");
  }

  abstract void show(); // Abstract method
}

class Child extends Parent {
  Child() {
    System.out.println("Child Constructor");
  }

  void show() {
    System.out.println("Child Show Method");
  }
}

public class constructorconcept {

  public static void main(String[] args) {
    Child c = new Child();
    c.show();
  }

}
