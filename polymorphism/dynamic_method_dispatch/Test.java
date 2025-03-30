package polymorphism.dynamic_method_dispatch;

class Parent {
  Parent() {
    System.out.println("parent constructor");
  }

  void show() {
    System.out.println("Parent's show() method");
  }
}

class Child extends Parent {
  Child() {
    System.out.println("child constructor");
  }

  void show() {
    System.out.println("Child's show() method");
  }
}

public class Test {
  public static void main(String[] args) {
    Parent obj = new Child(); // Upcasting (Parent reference, Child object)
    obj.show(); // Calls Child's overridden method at runtime
  }
}
