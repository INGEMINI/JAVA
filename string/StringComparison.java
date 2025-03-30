public class StringComparison {
  public static void main(String[] args) {
    // 1. String (Immutable)
    String str = "Hello";
    str = str + " World";
    System.out.println("String: " + str);

    // 2. StringBuilder (Mutable, Not Thread-safe)
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");
    System.out.println("StringBuilder: " + sb);

    // 3. StringBuffer (Mutable, Thread-safe)
    StringBuffer sbf = new StringBuffer("Hello");
    sbf.append(" World");
    System.out.println("StringBuffer: " + sbf);
  }
}
