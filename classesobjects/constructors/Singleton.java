package classesobjects.constructors;
// Private Constructor (Singleton Class)

class Singleton {
  private static Singleton instance; // Stores single object

  // Private Constructor - Prevents direct object creation
  private Singleton() {
    System.out.println("Singleton Instance Created");
  }

  // Static Method to Get Single Instance
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public void showMessage() {
    System.out.println("Singleton Class Method");
  }

  public static void main(String[] args) {
    Singleton obj1 = Singleton.getInstance(); // Creates instance
    Singleton obj2 = Singleton.getInstance(); // Returns same instance

    obj1.showMessage();
    System.out.println(obj1 == obj2); // true (Same instance)
  }
}
