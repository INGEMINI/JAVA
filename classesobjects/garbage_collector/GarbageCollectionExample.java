package classesobjects.garbage_collector;

class Demo {
  // Constructor
  Demo() {
    System.out.println("Object created");
  }

  // finalize() method (acts like a destructor)
  protected void finalize() {
    System.out.println("Object is being destroyed");
  }
}

public class GarbageCollectionExample {
  public static void main(String[] args) {
    Demo d1 = new Demo();
    Demo d2 = new Demo();

    d1 = null; // Object becomes eligible for GC
    d2 = null; // Object becomes eligible for GC

    System.gc(); // Request garbage collection (not guaranteed)

    System.out.println("End of main method");
  }
}
