package inheritance;

class Singleton {
  private static Singleton instance; // Single instance

  private Singleton() { // Private constructor
    System.out.println("Singleton Instance Created");
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}

public class testprvtsucess {

  public static void main(String[] args) {
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
  }

}
