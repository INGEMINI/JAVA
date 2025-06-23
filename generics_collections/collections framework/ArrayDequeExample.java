import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
  public static void main(String[] args) {
    Deque<String> deque = new ArrayDeque<>();

    // Add elements at the end
    deque.addLast("Apple");
    deque.addLast("Banana");

    // Add elements at the front
    deque.addFirst("Mango");
    deque.offerFirst("Grapes"); // similar to addFirst but doesn't throw exception

    // Print deque
    System.out.println("Deque: " + deque);

    // Remove elements from front and end
    String first = deque.removeFirst(); // removes "Grapes"
    String last = deque.removeLast(); // removes "Banana"

    System.out.println("Removed first: " + first);
    System.out.println("Removed last: " + last);
    System.out.println("Deque after removals: " + deque);

    // Peek front and end (retrieve without removing)
    System.out.println("First element (peek): " + deque.peekFirst());
    System.out.println("Last element (peek): " + deque.peekLast());

    // Check if deque contains element
    System.out.println("Contains Mango? " + deque.contains("Mango"));

    // Size of deque
    System.out.println("Size: " + deque.size());

    // Iterate through deque
    System.out.println("Iterating through deque:");
    for (String fruit : deque) {
      System.out.println(fruit);
    }

    // Clear the deque
    deque.clear();
    System.out.println("After clear: " + deque);
  }
}
