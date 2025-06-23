import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorFullExample {
  public static void main(String[] args) {
    // Create a collection
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");

    // Get Iterator from the collection
    Iterator<String> iterator = fruits.iterator();

    System.out.println("Iterating over list:");

    // Iterate with hasNext() and next()
    while (iterator.hasNext()) {
      String fruit = iterator.next();
      System.out.println(fruit);

      // Remove an element safely during iteration
      if (fruit.equals("Banana")) {
        iterator.remove(); // safe removal
        System.out.println("Banana removed");
      }
    }

    System.out.println("\nList after removal:");
    System.out.println(fruits);

    // Demonstrate what happens if next() called without hasNext()
    System.out.println("\nDemonstrate NoSuchElementException:");
    Iterator<String> it2 = fruits.iterator();
    try {
      while (true) {
        System.out.println(it2.next()); // no hasNext() check intentionally
      }
    } catch (NoSuchElementException e) {
      System.out.println("Caught exception: " + e);
    }

    // Demonstrate that remove() can't be called twice without next()
    System.out.println("\nDemonstrate IllegalStateException on remove():");
    Iterator<String> it3 = fruits.iterator();
    if (it3.hasNext()) {
      it3.next();
      it3.remove(); // first remove is OK
      try {
        it3.remove(); // second remove without next() - throws exception
      } catch (IllegalStateException e) {
        System.out.println("Caught exception: " + e);
      }
    }

    // Show that modifying collection directly during iteration causes error
    System.out.println("\nDemonstrate ConcurrentModificationException:");
    try {
      Iterator<String> it4 = fruits.iterator();
      while (it4.hasNext()) {
        String f = it4.next();
        if (f.equals("Orange")) {
          fruits.remove(f); // direct removal - will cause error on next iteration
        }
      }
    } catch (java.util.ConcurrentModificationException e) {
      System.out.println("Caught exception: " + e);
    }
  }
}
