package abstract_classes;

// Grandparent class (abstract)
abstract class Vehicle {
  abstract void start();
}

// Parent class (abstract, does not implement start())
abstract class Car extends Vehicle {
  void wheels() {
    System.out.println("Cars have 4 wheels.");
  }
}

// Concrete child class (implements start())
class Sedan extends Car {
  void start() {
    System.out.println("Sedan starts with a button.");
  }
}

// Main class
public class InheritanceChainExample {
  public static void main(String[] args) {
    Sedan s = new Sedan();
    s.start(); // Output: Sedan starts with a button.
    s.wheels(); // Output: Cars have 4 wheels.
  }
}
