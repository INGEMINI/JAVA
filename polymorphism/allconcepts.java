package polymorphism;

// 1️⃣ Compile-time Polymorphism (Method Overloading)
class MathOperations {
  // Overloaded methods
  void multiply(int a, int b) {
    System.out.println("Multiply integers: " + (a * b));
  }

  void multiply(double a, double b) {
    System.out.println("Multiply doubles: " + (a * b));
  }

  void multiply(int a, int b, int c) {
    System.out.println("Multiply three numbers: " + (a * b * c));
  }
}

// 2️⃣ Runtime Polymorphism (Method Overriding + Upcasting)
class Animal {
  void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog extends Animal {
  @Override
  void makeSound() {
    System.out.println("Dog barks");
  }
}

// 3️⃣ Constructor Overloading
class Car {
  Car() {
    System.out.println("Default Car Constructor");
  }

  Car(String model) {
    System.out.println("Car Model: " + model);
  }
}

// 4️⃣ Interface Polymorphism
interface Payment {
  void processPayment();
}

class CreditCardPayment implements Payment {
  public void processPayment() {
    System.out.println("Processing Credit Card Payment...");
  }
}

class UPIPayment implements Payment {
  public void processPayment() {
    System.out.println("Processing UPI Payment...");
  }
}

// 5️⃣ Abstract Class Polymorphism
abstract class Shape {
  abstract void draw();
}

class Circle extends Shape {
  void draw() {
    System.out.println("Drawing a Circle...");
  }
}

public class allconcepts {
  public static void main(String[] args) {
    // 1️⃣ Compile-time Polymorphism
    System.out.println("---- Method Overloading ----");
    MathOperations math = new MathOperations();
    math.multiply(2, 3);
    math.multiply(2.5, 3.5);
    math.multiply(2, 3, 4);

    // 2️⃣ Runtime Polymorphism (Overriding + Upcasting)
    System.out.println("\n---- Method Overriding ----");
    Animal a = new Dog(); // Upcasting
    a.makeSound(); // Calls overridden method

    // 3️⃣ Constructor Overloading
    System.out.println("\n---- Constructor Overloading ----");
    Car car1 = new Car();
    Car car2 = new Car("Tesla");

    // 4️⃣ Interface Polymorphism
    System.out.println("\n---- Interface Polymorphism ----");
    Payment p;
    p = new CreditCardPayment();
    p.processPayment();
    p = new UPIPayment();
    p.processPayment();

    // 5️⃣ Abstract Class Polymorphism
    System.out.println("\n---- Abstract Class Polymorphism ----");
    Shape shape = new Circle();
    shape.draw();
  }
}
