package abstract_classes;

abstract class Person {
  String name;

  // Constructor
  Person(String name) {
    this.name = name;
    System.out.println("Person constructor called for: " + name);
  }

  abstract void work();
}

// Employee class
class Employee extends Person {
  Employee(String name) {
    super(name); // Call abstract class constructor
  }

  void work() {
    System.out.println(name + " is working as an Engineer.");
  }
}

// Main class
public class AbstractwithConstructor {
  public static void main(String[] args) {
    Employee e = new Employee("John");
    e.work();
  }
}
