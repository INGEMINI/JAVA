package inheritance;

// Base class (Parent Class)
class Animal {
  String name;

  Animal(String name) {
    this.name = name;
  }

  void eat() {
    System.out.println(name + " is eating.");
  }

  void sleep() {
    System.out.println(name + " is sleeping.");
  }
}

// Single Inheritance (Dog inherits from Animal)
class Dog extends Animal {
  String breed;

  Dog(String name, String breed) {
    super(name); // Calling parent constructor
    this.breed = breed;
  }

  void bark() {
    System.out.println(name + " is barking.");
  }
}

// Multilevel Inheritance (Puppy inherits from Dog)
class Puppy extends Dog {
  int age;

  Puppy(String name, String breed, int age) {
    super(name, breed);
    this.age = age;
  }

  void weep() {
    System.out.println(name + " (a puppy) is weeping.");
  }
}

// Hierarchical Inheritance (Cat also inherits from Animal)
class Cat extends Animal {
  Cat(String name) {
    super(name);
  }

  void meow() {
    System.out.println(name + " is meowing.");
  }
}

// Multiple Inheritance (via Interfaces)
interface Pet {
  void play();
}

class PetDog extends Dog implements Pet {
  PetDog(String name, String breed) {
    super(name, breed);
  }

  public void play() {
    System.out.println(name + " (a pet dog) is playing.");
  }
}

public class InheritanceDemo {
  public static void main(String[] args) {
    // Single Inheritance
    Dog d = new Dog("Bruno", "Labrador");
    d.eat();
    d.bark();

    System.out.println();

    // Multilevel Inheritance
    Puppy p = new Puppy("Max", "Beagle", 1);
    p.eat();
    p.bark();
    p.weep();

    System.out.println();

    // Hierarchical Inheritance
    Cat c = new Cat("Whiskers");
    c.eat();
    c.meow();

    System.out.println();

    // Multiple Inheritance via Interface
    PetDog petD = new PetDog("Rocky", "Golden Retriever");
    petD.eat();
    petD.bark();
    petD.play();
  }
}
