package abstract_classes;

// Abstract class
abstract class Animal {
  abstract void makeSound(); // Abstract method

  void sleep() { // Concrete method
    System.out.println("Sleeping...");
  }
}

// Subclass
class Dog extends Animal {
  void makeSound() { // Implementing abstract method
    System.out.println("Bark! Bark!");
  }
}

// Main class
public class AbstractDemo {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.makeSound(); // Output: Bark! Bark!
    d.sleep(); // Output: Sleeping...
  }
}
