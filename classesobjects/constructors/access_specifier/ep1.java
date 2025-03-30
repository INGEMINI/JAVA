package classesobjects.constructors.access_specifier;

class Car {
  String brand;

  // Public Constructor
  public Car(String brand) {
    this.brand = brand;
  }

  void display() {
    System.out.println("Car Brand: " + brand);
  }

  public class Main {
    public static void main(String[] args) {
      Car c1 = new Car("Toyota"); // Object creation using public constructor
      c1.display();
    }
  }
}
