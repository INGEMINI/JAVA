package classesobjects.constructors;
// Super Constructor (super())


class Vehicle {
  String type;

  // Parent class constructor
  Vehicle(String t) {
      type = t;
      System.out.println("Vehicle Constructor Called");
  }
}

class Car extends Vehicle {
  String brand;

  // Child class constructor
  Car(String t, String b) {
      super(t); // Calls Vehicle constructor
      brand = b;
  }

  void display() {
      System.out.println("Type: " + type + ", Brand: " + brand);
  }

  public static void main(String[] args) {
      Car c1 = new Car("Four-Wheeler", "Toyota"); // First calls Vehicle constructor
      c1.display();
  }
}
