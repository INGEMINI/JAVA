public class CharArrayToString {

  public static void main(String[] args) {
    // method-1

    char[] charArray = { 'H', 'e', 'l', 'l', 'o' };

    // Convert char array to String
    String str = new String(charArray);

    // Output
    System.out.println("Converted String: " + str); // Output: Hello

    // method- 2
    char[] charArray2 = { 'W', 'o', 'r', 'l', 'd' };

    // Convert char array to String using valueOf()
    String str2 = String.valueOf(charArray2);

    System.out.println("Converted String: " + str2); // Output: World
  }

}
// new String(charArray)
// Creates a new String from char[]
// ✅ Best approach

// String.valueOf(charArray)
// Converts char[] to String
// ✅ Same as above, but internally calls new String(charArray)
