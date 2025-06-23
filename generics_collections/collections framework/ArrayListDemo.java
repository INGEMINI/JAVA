import java.util.*;

public class ArrayListDemo {
  public static void main(String[] args) {
    // ✅ Creating an ArrayList
    ArrayList<Integer> numbers = new ArrayList<>();

    // ✅ Adding elements
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    // ✅ Adding at a specific index
    numbers.add(1, 15); // inserts 15 at index 1

    // ✅ Print ArrayList
    System.out.println("ArrayList: " + numbers);

    // ✅ Get element at specific index
    int value = numbers.get(2);
    System.out.println("Element at index 2: " + value);

    // ✅ Set/replace value at specific index
    numbers.set(2, 25); // replaces 20 with 25
    System.out.println("After set(): " + numbers);

    // ✅ Check if element exists
    System.out.println("Contains 30? " + numbers.contains(30));

    // ✅ Remove by index
    numbers.remove(1); // removes element at index 1
    System.out.println("After removing index 1: " + numbers);

    // ✅ Remove by object
    numbers.remove(Integer.valueOf(25));
    System.out.println("After removing value 25: " + numbers);

    // ✅ Size of the ArrayList
    System.out.println("Size: " + numbers.size());

    // ✅ Iterate using for-each loop
    System.out.println("\nFor-each loop:");
    for (int num : numbers) {
      System.out.println(num);
    }

    // ✅ Iterate using for loop
    System.out.println("\nUsing for loop:");
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println("Index " + i + ": " + numbers.get(i));
    }

    // ✅ Iterate using Iterator
    System.out.println("\nUsing Iterator:");
    Iterator<Integer> it = numbers.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // ✅ Sorting ArrayList
    numbers.add(50);
    numbers.add(5);
    Collections.sort(numbers);
    System.out.println("Sorted ArrayList: " + numbers);

    // ✅ Reverse ArrayList
    Collections.reverse(numbers);
    System.out.println("Reversed ArrayList: " + numbers);

    // ✅ Clear ArrayList
    numbers.clear();
    System.out.println("Is ArrayList empty? " + numbers.isEmpty());
  }
}
