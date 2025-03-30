public class stringpool {

  public static void main(String[] args) {
    String s1 = "Hello"; // Stored in String Pool
    String s2 = "Hello"; // Reuses the same reference

    System.out.println(s1 == s2); // true (Same reference)

    String s3 = new String("Hello"); // Creates a NEW object in Heap
    String s4 = "Hello"; // Uses String Pool

    System.out.println(s3 == s4); // false (Different memory locations)

  }

}
