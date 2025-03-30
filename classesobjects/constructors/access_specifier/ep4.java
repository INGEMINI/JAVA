package classesobjects.constructors.access_specifier;

class Person {
  String name;

  // Default (Package-Private) Constructor
  Person(String name) {
    this.name = name;
  }

  void display() {
    System.out.println("Name: " + name);
  }

  public class Main {
    public static void main(String[] args) {
      Person p1 = new Person("John"); // Works because it's in the same package
      p1.display();
    }
  }
}