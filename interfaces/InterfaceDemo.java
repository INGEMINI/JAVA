// Java program demonstrating all key concepts of interfaces, including:
// ✅ Abstract methods
// ✅ Default methods
// ✅ Static methods
// ✅ Multiple interface inheritance
// ✅ Overriding default methods
// ✅ Using interface references

package interfaces;

// Defining an interface with abstract, default, and static methods
interface Animal {
  // Abstract method (must be implemented by child class)
  void sound();

  // Default method (can be used or overridden)
  default void eat() {
      System.out.println("Animal is eating...");
  }

  // Static method (belongs to the interface, not objects)
  static void breathe() {
      System.out.println("Animals breathe oxygen.");
  }
}

// Another interface to demonstrate multiple inheritance
interface Pet {
  void play(); // Abstract method

  default void sleep() {
      System.out.println("Pet is sleeping...");
  }
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {
  // Implementing abstract methods
  public void sound() {
      System.out.println("Dog barks...");
  }

  public void play() {
      System.out.println("Dog is playing...");
  }

  // Overriding default method from Animal
  @Override
  public void eat() {
      System.out.println("Dog is eating bones...");
  }
}

// Main class
public class InterfaceDemo {
  public static void main(String[] args) {
      // Using interface reference to hold an object
      Animal myDog = new Dog();
      myDog.sound(); // Calls implemented method from Dog
      myDog.eat();   // Calls overridden default method from Dog

      // Calling static method of interface (not using an object)
      Animal.breathe();

      // Another reference using Pet interface
      Pet petDog = new Dog();
      petDog.play();  // Calls implemented method from Dog
      petDog.sleep(); // Calls default method from Pet
  }
}
