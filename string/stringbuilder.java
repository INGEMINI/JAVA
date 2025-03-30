public class stringbuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    System.out.println("Original StringBuilder: " + sb);

    // Modifying StringBuilder (no new object created)
    sb.append(" World");
    System.out.println("Modified StringBuilder: " + sb);

    // Other operations
    sb.insert(5, " Java");
    System.out.println("After Inserting: " + sb);

    sb.replace(0, 5, "Hi");
    System.out.println("After Replacing: " + sb);

    sb.delete(2, 7);
    System.out.println("After Deleting: " + sb);

    sb.reverse();
    System.out.println("After Reversing: " + sb);
  }

}
