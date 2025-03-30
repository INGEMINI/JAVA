package polymorphism;

// Parent class
class Vehicle {
  void start() { // Method Overriding
    System.out.println("Vehicle is starting...");
  }

  // Method Overloading
  void fuelCapacity(int liters) {
    System.out.println("Fuel capacity: " + liters + " liters");
  }

  void fuelCapacity(double gallons) {
    System.out.println("Fuel capacity: " + gallons + " gallons");
  }
}

// Child class
class Car extends Vehicle {
  @Override
  void start() { // Overriding
    System.out.println("Car is starting with a key...");
  }
}

// Another child class
class Bike extends Vehicle {
  @Override
  void start() { // Overriding
    System.out.println("Bike is starting with a self-start button...");
  }
}

public class Test {
  public static void main(String[] args) {
    // Method Overloading
    Vehicle v = new Vehicle();
    v.fuelCapacity(50); // Calls int version
    v.fuelCapacity(13.2); // Calls double version

    // Method Overriding with Upcasting
    Vehicle v1 = new Car();
    v1.start(); // Calls Car's start()

    Vehicle v2 = new Bike();
    v2.start(); // Calls Bike's start()
  }
}
