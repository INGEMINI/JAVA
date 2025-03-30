package polymorphism.dynamic_method_dispatch;

// Parent class
class Animal {
  void makeSound() {
    System.out.println("Animal makes a sound");
  }
}

// Child class 1
class Dog extends Animal {
  void makeSound() {
    System.out.println("Dog barks");
  }
}

// Child class 2
class Cat extends Animal {
  void makeSound() {
    System.out.println("Cat meows");
  }
}

public class test2 {
  public static void main(String[] args) {
    // Parent reference, Child object (Upcasting)
    Animal obj;

    obj = new Dog();
    obj.makeSound(); // Calls Dog's overridden method

    obj = new Cat();
    obj.makeSound(); // Calls Cat's overridden method
  }
}
