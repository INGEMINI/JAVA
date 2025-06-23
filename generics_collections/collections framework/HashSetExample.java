import java.util.*;

public class HashSetExample {
  public static void main(String[] args) {
    // ✅ Create HashSet
    HashSet<String> fruits = new HashSet<>();

    // ✅ Add elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Banana"); // duplicate, won't be added
    fruits.add(null); // only one null allowed

    // ✅ Print HashSet (order not guaranteed)
    System.out.println("Fruits HashSet: " + fruits);

    // ✅ Check if contains
    System.out.println("Contains Mango? " + fruits.contains("Mango"));

    // ✅ Remove element
    fruits.remove("Banana");
    System.out.println("After removing Banana: " + fruits);

    // ✅ Iterate HashSet
    System.out.println("Iterating using for-each loop:");
    for (String fruit : fruits) {
      System.out.println(fruit);
    }

    // ✅ Get size
    System.out.println("Size: " + fruits.size());

    // ✅ Convert HashSet to Array
    String[] arr = fruits.toArray(new String[0]);
    System.out.println("Array from HashSet: " + Arrays.toString(arr));

    // ✅ Clear HashSet
    fruits.clear();
    System.out.println("After clearing: " + fruits);
  }
}
