
import java.util.*;

public class ListFunctionsExample {
  public static void main(String[] args) {
    // ✅ Create a List
    List<String> fruits = new ArrayList<>();

    // ✅ Add elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");

    // ✅ Add at specific index
    fruits.add(1, "Mango");

    // ✅ Print the list
    System.out.println("Fruits List: " + fruits);

    // ✅ Access elements
    System.out.println("Element at index 2: " + fruits.get(2));

    // ✅ Change element
    fruits.set(2, "Orange"); // Replaces "Banana" with "Orange"
    System.out.println("After set: " + fruits);

    // ✅ Remove element by index
    fruits.remove(3);
    System.out.println("After removing index 3: " + fruits);

    // ✅ Remove element by value
    fruits.remove("Apple");
    System.out.println("After removing 'Apple': " + fruits);

    // ✅ Check if contains
    System.out.println("Contains Mango? " + fruits.contains("Mango"));

    // ✅ Size of the list
    System.out.println("List size: " + fruits.size());

    // ✅ Iterate using for-each
    System.out.println("\nIterating using for-each:");
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    // ✅ Iterate using iterator
    System.out.println("\nIterating using Iterator:");
    Iterator<String> itr = fruits.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

    // ✅ Sorting the list
    Collections.sort(fruits);
    System.out.println("Sorted list: " + fruits);

    // ✅ Reverse the list
    Collections.reverse(fruits);
    System.out.println("Reversed list: " + fruits);

    // ✅ Clear the list
    fruits.clear();
    System.out.println("Is list empty after clear? " + fruits.isEmpty());
  }
}
