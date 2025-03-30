public class StringToCharArray {

  public static void main(String[] args) {
    String text = "Java";
    char[] ca = text.toCharArray();
    // Convert String to char array

    System.out.println("Char Array: " + java.util.Arrays.toString(ca));
    System.out.println(text);
  }

}

// here java.util is a package
// java.util.Arrays is a utility class inside it

// Arrays.toString(array) → This is a static method inside Arrays that converts
// an array into a properly formatted String.
// Arrays.toString(array) converts the array into a readable format.

// Arrays.toString() does NOT fully convert a char[] to a String
// 🔹 It just formats the array in a readable way (like [J, a, v, a]).
// 🔹 It does NOT merge the characters into a single String like "Java".

// for char to string use new keyword as shown below
// new String(charArray) ......Fully converts char[] into a String....eg-"Java"
// (as in above case)