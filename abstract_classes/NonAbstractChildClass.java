package abstract_classes;

// Abstract Parent Class
abstract class Animal {
  abstract void makeSound(); // Abstract method
}

// Child class implementing the abstract method
class Dog extends Animal {
  void makeSound() { // Providing implementation
    System.out.println("Dog barks!");
  }
}

// Main class
public class NonAbstractChildClass {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.makeSound(); // Output: Dog barks!
  }
}
