package classesobjects.constructors.constructor_chaining;

class Parent {
  Parent() {
    System.out.println("Parent Default Constructor");
  }

  Parent(int x) {
    System.out.println("Parent Parameterized Constructor: " + x);
  }
}

class Child extends Parent {
  Child() {
    super(50); // Calls the parent constructor
    System.out.println("Child Default Constructor");
  }
}

public class diffclassexample {

  public static void main(String[] args) {
    Child obj = new Child();
  }

}
