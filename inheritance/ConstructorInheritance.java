package inheritance;

// Base class (Superclass)
class Animal {
  String name;

  // Constructor of Animal
  Animal(String name) {
    this.name = name;
    System.out.println("Animal constructor called for: " + name);
  }
}

// Derived class (Single Inheritance)
class Dog extends Animal {
  String breed;

  // Constructor of Dog
  Dog(String name, String breed) {
    super(name); // Calling the parent class constructor
    this.breed = breed;
    System.out.println("Dog constructor called for: " + breed);
  }
}

// Multilevel Inheritance Example
class Puppy extends Dog {
  int age;

  // Constructor of Puppy
  Puppy(String name, String breed, int age) {
    super(name, breed); // Calling Dog's constructor
    this.age = age;
    System.out.println("Puppy constructor called for age: " + age);
  }
}

public class ConstructorInheritance {
  public static void main(String[] args) {
    System.out.println("Creating a Dog Object...");
    Dog d = new Dog("Bruno", "Labrador");

    System.out.println("\nCreating a Puppy Object...");
    Puppy p = new Puppy("Max", "Beagle", 2);
  }
}
