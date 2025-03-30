public class stringbuffer {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Hello");
    System.out.println("Original StringBuffer: " + sb);

    // Modifying StringBuffer (no new object created)
    sb.append(" World");
    System.out.println("Modified StringBuffer: " + sb);

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
