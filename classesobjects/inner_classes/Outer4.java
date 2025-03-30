package classesobjects.inner_classes;
//Anonymous Inner Class

//Code Example (Extending a Class)

class Parent {
  void display() {
    System.out.println("Inside Parent Class");
  }
}

public class Outer4 {
  public static void main(String[] args) {
    // Creating an Anonymous Inner Class extending Parent
    Parent obj = new Parent() {
      void display() {
        System.out.println("Inside Anonymous Inner Class");
      }
    };

    obj.display(); // Calls the anonymous class method
  }

}

// Code Example (Implementing an Interface)

// interface Animal {
// void sound();
// }

// public class Outer {
// public static void main(String[] args) {
// // Anonymous Inner Class implementing Animal interface
// Animal dog = new Animal() {
// public void sound() {
// System.out.println("Dog says Woof!");
// }
// };

// dog.sound();
// }
// }