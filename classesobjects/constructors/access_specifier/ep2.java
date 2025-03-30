package classesobjects.constructors.access_specifier;

class Database {
  private static Database instance; // Static instance of the class

  // Private Constructor
  private Database() {
    System.out.println("Database Connection Established!");
  }

  // Public method to get the instance (Singleton Pattern)
  public static Database getInstance() {
    if (instance == null) {
      instance = new Database();
    }
    return instance;
  }

  public class Main {
    public static void main(String[] args) {
      // Database db = new Database(); // ERROR: Cannot create an object

      Database db1 = Database.getInstance(); // Only one instance is allowed
      Database db2 = Database.getInstance(); // Returns the same instance

      System.out.println(db1 == db2); // true (Both references point to the same object)
    }
  }
}