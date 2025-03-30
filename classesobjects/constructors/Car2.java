package classesobjects.constructors;
//Constructor Chaining (this())
class Car2 {
  String brand;
  int price;

  // Constructor 1 (Default)
  Car2() {
    this("Unknown", 0); // Calls Constructor 3
  }

  // Constructor 2 (Single Parameter)
  Car2(String b) {
    this(b, 0); // Calls Constructor 3
  }

  // Constructor 3 (Main Initialization)
  Car2(String b, int p) {
    brand = b;
    price = p;
  }

  void display() {
    System.out.println("Brand: " + brand + ", Price: " + price);
  }

  public static void main(String[] args) {
    Car2 c1 = new Car2(); // Calls Constructor 1 → Calls Constructor 3
    Car2 c2 = new Car2("Tesla"); // Calls Constructor 2 → Calls Constructor 3
    Car2 c3 = new Car2("BMW", 50000); // Directly calls Constructor 3

    c1.display();
    c2.display();
    c3.display();
  }
}
