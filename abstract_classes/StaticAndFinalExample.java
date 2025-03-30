package abstract_classes;

abstract class Vehicle {
  static int totalVehicles = 100; // Static variable (shared)
  final int maxSpeed = 200; // Final variable (cannot change)

  abstract void start();
}

class Car extends Vehicle {
  void start() {
    System.out.println("Car is starting...");
  }
}

public class StaticAndFinalExample {
  public static void main(String[] args) {
    System.out.println("Total Vehicles: " + Vehicle.totalVehicles); // Accessing static variable
    Car myCar = new Car();
    System.out.println("Max Speed: " + myCar.maxSpeed); // Accessing final variable
  }
}
