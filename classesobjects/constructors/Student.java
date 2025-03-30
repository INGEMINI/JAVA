package classesobjects.constructors;

// Default Constructor
class Student {
  int id;
  String name;

  // No constructor is written, so Java gives a default one like this:
  // Student() { }

  void display() {
    System.out.println("ID: " + id + ", Name: " + name);
  }

  public static void main(String[] args) {
    Student s1 = new Student(); // Default constructor is called
    s1.display(); // Outputs default values (0, null)
  }
}
