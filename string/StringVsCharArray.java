public class StringVsCharArray {

  public static void main(String[] args) {
    // Using String (Immutable)
    String str = "Hello";
    str = "World"; // Creates a new String object

    // Using char array (Mutable)
    char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
    charArray[0] = 'M'; // Allowed!

    // Output
    System.out.println("String: " + str); // Prints: World
    String str1 = new String(charArray);
    System.out.println("Char Array: " + str1); // Prints: Mello
  }

}
