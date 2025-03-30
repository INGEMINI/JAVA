package interfaces;

// Defining an interface
interface Animal {
  void makeSound(); // Abstract method (no implementation)
}

// Implementing the interface in a class
class Dog implements Animal {
  public void makeSound() { // Must provide implementation
    System.out.println("Woof! Woof!");
  }
}

class Cat implements Animal {
  public void makeSound() {
    System.out.println("Meow!");
  }
}

// Main class
public class Main {
  public static void main(String[] args) {
    Animal d = new Dog(); // Using interface reference
    d.makeSound(); // Output: Woof! Woof!

    Animal c = new Cat();
    c.makeSound(); // Output: Meow!
  }
}
