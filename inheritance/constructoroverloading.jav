class Parent {
  Parent() {
      System.out.println("Parent Default Constructor");
  }

  Parent(String msg) {
      System.out.println("Parent Parameterized Constructor: " + msg);
  }
}

class Child extends Parent {
  Child() {
      super("Hello from Child"); // Calls Parent's parameterized constructor
      System.out.println("Child Constructor");
  }
}

public class constructoroverloading {
  public static void main(String[] args) {
      Child c = new Child();
  }
}
