package wrapperclasses;

public class WrapperClassDemo {
  public static void main(String[] args) {
    // 1️⃣ Primitive to Wrapper (Autoboxing)
    int num = 10;
    Integer objNum = num; // Autoboxing (int → Integer)
    System.out.println("Autoboxing: " + objNum);

    // 2️⃣ Wrapper to Primitive (Unboxing)
    // Integer wrapperInt = new Integer(20);Deprecated in Java 9+
    Integer wrapperInt = 20;
    int primitiveInt = wrapperInt; // Unboxing (Integer → int)
    System.out.println("Unboxing: " + primitiveInt);

    // 3️⃣ Using Wrapper Class Methods
    String str = "123";
    int parsedInt = Integer.parseInt(str); // Converts String to int
    double parsedDouble = Double.parseDouble("3.14"); // Converts String to double
    System.out.println("Parsed Integer: " + parsedInt);
    System.out.println("Parsed Double: " + parsedDouble);

    // Assigning null (Wrapper Only, Not Primitive)
    Integer nullableValue = null;
    System.out.println("Nullable Wrapper: " + nullableValue);

    // Using MAX_VALUE and MIN_VALUE Constants
    System.out.println("Integer Max: " + Integer.MAX_VALUE);
    System.out.println("Integer Min: " + Integer.MIN_VALUE);

    // Storing Wrapper Objects in Collections
    java.util.ArrayList<Double> list = new java.util.ArrayList<>();
    list.add(5.5); // double → Double (Autoboxing)
    list.add(10.1);
    System.out.println("ArrayList with Wrapper Class: " + list);

  }
}

// 🔹 Meaning of "Deprecated" in Java
// When something is deprecated, it means:
// ✅ It still works (for now).
// 🚨 But it is no longer recommended because a better way exists.
// ⚠️ It might be removed in future versions of Java.