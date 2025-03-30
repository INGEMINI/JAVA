package finalkeyexp;

class Person {
  String name;

  Person(String name) {
    this.name = name;
  }
}

public class withobj {
  public static void main(String[] args) {
    final Person p = new Person("Alice");
    System.out.println("Name: " + p.name);

    p.name = "Bob"; // ✅ Allowed: modifying the object
    System.out.println("Updated Name: " + p.name);

    // p = new Person("Charlie"); // ❌ ERROR: Cannot reassign a final reference
  }
}
