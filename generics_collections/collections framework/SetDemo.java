import java.util.*;

public class SetDemo {
  public static void main(String[] args) {
    // ✅ HashSet: Unordered, No duplicates
    Set<String> set = new HashSet<>();

    // ✅ Add elements
    set.add("Apple");
    set.add("Banana");
    set.add("Mango");
    set.add("Banana"); // Duplicate - won't be added
    set.add(null); // Allowed in HashSet

    // ✅ Print
    System.out.println("HashSet: " + set);

    // ✅ Remove element
    set.remove("Mango");

    // ✅ Size and check
    System.out.println("Size: " + set.size());
    System.out.println("Contains Apple? " + set.contains("Apple"));

    // ✅ Iterate
    System.out.println("Iterating:");
    for (String item : set) {
      System.out.println(item);
    }

    // ✅ Convert to List (optional)
    List<String> listFromSet = new ArrayList<>(set);
    System.out.println("Converted to List: " + listFromSet);

    // ✅ Clear the set
    set.clear();
    System.out.println("After clear: " + set);
  }
}
