import java.util.*;

public class LinkedListDemo {
  public static void main(String[] args) {
    // ✅ Create LinkedList of Strings
    LinkedList<String> names = new LinkedList<>();

    // ✅ Add elements
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    // ✅ Add at specific index
    names.add(1, "David");

    // ✅ Add at first and last
    names.addFirst("Start");
    names.addLast("End");

    System.out.println("LinkedList: " + names);

    // ✅ Get elements
    System.out.println("Element at index 2: " + names.get(2));
    System.out.println("First: " + names.getFirst());
    System.out.println("Last: " + names.getLast());

    // ✅ Set element at index
    names.set(2, "UpdatedName");
    System.out.println("After set(): " + names);

    // ✅ Remove elements
    names.remove(2); // by index
    names.remove("Alice"); // by value
    names.removeFirst(); // removes first
    names.removeLast(); // removes last
    System.out.println("After removals: " + names);

    // ✅ Check size and if empty
    System.out.println("Size: " + names.size());
    System.out.println("Is Empty? " + names.isEmpty());

    // ✅ Contains
    System.out.println("Contains Bob? " + names.contains("Bob"));

    // ✅ Peek (does not remove)
    System.out.println("Peek: " + names.peek());

    // ✅ Poll (retrieves and removes head)
    System.out.println("Poll: " + names.poll());

    // ✅ Push and Pop (like stack)
    names.push("First");
    System.out.println("After push: " + names);
    System.out.println("Pop: " + names.pop());

    // ✅ Iterating using for-each
    System.out.println("\nUsing for-each:");
    for (String name : names) {
      System.out.println(name);
    }

    // ✅ Iterating using Iterator
    System.out.println("\nUsing Iterator:");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // ✅ Clear the list
    names.clear();
    System.out.println("Cleared? " + names.isEmpty());
  }
}
