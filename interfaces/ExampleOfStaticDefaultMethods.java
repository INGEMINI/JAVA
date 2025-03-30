package interfaces;

interface Vehicle {
  void start(); // Abstract method

  // Default method (has body)
  default void stop() {
    System.out.println("Vehicle is stopping...");
  }

  // Static method (can be called using interface name)
  static void service() {
    System.out.println("Vehicle is being serviced...");
  }
}

class Car implements Vehicle {
  public void start() {
    System.out.println("Car is starting...");
  }
}

public class ExampleOfStaticDefaultMethods {
  public static void main(String[] args) {
    Car c = new Car();
    c.start(); // Output: Car is starting...
    c.stop(); // Output: Vehicle is stopping...

    Vehicle.service(); // Calling static method from interface
  }
}
