public class stringexpp {
  public static void main(String[] args) {
    String str = " Hello Java ";

    // 1. Basic String Methods
    System.out.println("Length: " + str.length()); // 13
    System.out.println("Character at index 1: " + str.charAt(1)); // 'H'
    System.out.println("Substring (1 to 6): " + str.substring(1, 6)); // "Hello"
    System.out.println("Index of 'Java': " + str.indexOf("Java")); // 7
    System.out.println("Last index of 'a': " + str.lastIndexOf("a")); // 10

    // 2. String Comparison
    String str2 = "hello java";
    System.out.println("Equals (case-sensitive): " + str.equals(str2)); // false
    System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(str2)); // true
    System.out.println("Compare To: " + str.compareTo(str2)); // Non-zero value
    System.out.println("Compare To Ignore Case: " + str.compareToIgnoreCase(str2)); // 0

    // 3. String Modification
    System.out.println("Uppercase: " + str.toUpperCase()); // " HELLO JAVA "
    System.out.println("Lowercase: " + str.toLowerCase()); // " hello java "
    System.out.println("Trimmed: " + str.trim()); // "Hello Java"
    System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World")); // " Hello World "
    System.out.println("ReplaceAll (remove spaces): " + str.replaceAll(" ", "")); // "HelloJava"

    // 4. String Splitting & Joining
    String[] words = str.trim().split(" ");
    System.out.println("Split into words:");
    for (String word : words) {
      System.out.println(word); // "Hello" "Java"
    }
    System.out.println("Joined String: " + String.join("-", words)); // "Hello-Java"

    // 5. String Checking
    System.out.println("Contains 'Java': " + str.contains("Java")); // true
    System.out.println("Starts with ' Hello': " + str.startsWith(" Hello")); // true
    System.out.println("Ends with ' ': " + str.endsWith(" ")); // true
    System.out.println("Is Empty: " + str.isEmpty()); // false

    // 6. Checking if the string is fully uppercase
    String str3 = "HELLO";
    boolean isUpper = str3.chars().allMatch(Character::isUpperCase);
    System.out.println("Is all uppercase: " + isUpper); // true
  }
}
