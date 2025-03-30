package abstract_classes;

// Abstract Parent Class
abstract class Animal {
  abstract void makeSound();
}

// Abstract Child Class (Does not implement makeSound)
abstract class Dog extends Animal {
  // Still an abstract class, so no need to implement makeSound()
}

// Subclass of Dog that finally implements makeSound()
class Labrador extends Dog {
  void makeSound() {
    System.out.println("Labrador barks loudly!");
  }
}

public class AbstractChildClass {
  public static void main(String[] args) {
    Labrador lab = new Labrador();
    lab.makeSound(); // Output: Labrador barks loudly!
  }
}
