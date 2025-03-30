package abstract_classes;

//example with multiple subclasses

abstract class Vehicle {
  abstract void start(); // Abstract method

  void fuel() { // Concrete method
      System.out.println("Filling fuel...");
  }
}

// Car class extends Vehicle
class Car extends Vehicle {
  void start() {
      System.out.println("Car starts with a key.");
  }
}

// Bike class extends Vehicle
class Bike extends Vehicle {
  void start() {
      System.out.println("Bike starts with a kick.");
  }
}

// Main class
public class Transport {
  public static void main(String[] args) {
      Vehicle v1 = new Car();
      v1.start(); // Output: Car starts with a key.
      v1.fuel();  // Output: Filling fuel...

      Vehicle v2 = new Bike();
      v2.start(); // Output: Bike starts with a kick.
      v2.fuel();  // Output: Filling fuel...
  }
}
