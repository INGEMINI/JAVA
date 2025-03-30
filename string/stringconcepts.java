// Concepts Covered in This Code:
// ✔ Immutable Nature of Strings
// ✔ String Pool Optimization
// ✔ String Concatenation (Direct and concat())
// ✔ String Length & Character Access
// ✔ String Comparison (equals(), ==, compareTo())
// ✔ Substring Extraction
// ✔ String Methods (toUpperCase(), toLowerCase(), trim(), replace(), contains())
// ✔ Splitting Strings
// ✔ Converting String to Char Array
// ✔ StringBuilder (Mutable Alternative)

public class stringconcepts {
  // strings are immutable in nature in java

  public static void main(String[] args) {
    // 1. STRING CREATION
    String str1 = "Hello"; // Created using string literal (stored in String Pool)
    String str2 = new String("Hello"); // Created using 'new' (stored in Heap)

    // 2. IMMUTABILITY DEMONSTRATION
    str1.concat(" World"); // Does NOT change str1 (because strings are immutable)
    System.out.println("After concat (Immutable): " + str1); // Output: Hello

    str1 = str1 + " World"; // Now, str1 points to a new object
    System.out.println("After reassignment: " + str1); // Output: Hello World

    // 3. STRING LENGTH AND CHARACTER ACCESS
    System.out.println("Length of str1: " + str1.length()); // Output: 11
    System.out.println("First character: " + str1.charAt(0)); // Output: H

    // 4. STRING COMPARISON
    String str3 = "hello";
    System.out.println("Equals (case-sensitive): " + str1.equals(str3)); // false
    System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3)); // will give false as result as 1 is hello world other is hello...if its like 1 is hello otehr is like HellO..then is will give true as equalsIgnoreCase() ignores capitalization and only checks content.
    
    System.out.println("== Comparison: " + (str1 == str3)); // false (different memory locations)

    // 5. STRING MANIPULATION METHODS
    String sentence = "  Java is powerful!  ";
    System.out.println("Uppercase: " + sentence.toUpperCase()); // JAVA IS POWERFUL!
    System.out.println("Lowercase: " + sentence.toLowerCase()); // java is powerful!
    System.out.println("Trimmed: " + sentence.trim()); // Removes spaces at start/end
    System.out.println("Replaced: " + sentence.replace("powerful", "amazing")); // Java is amazing!
    System.out.println("Contains 'Java': " + sentence.contains("Java")); // true

    // 6. STRING SUBSTRING
    String sub = str1.substring(6, 11); // Extracts "World"
    System.out.println("Substring (6-11): " + sub);

    // 7. STRING SPLITTING
    String words = "Java,Python,C++,Rust";
    String[] languages = words.split(","); // Splitting by comma
    System.out.println("Split Result:");
    for (String lang : languages) {
      System.out.println(lang);
    }

    // 8. CONVERTING STRING TO CHAR ARRAY
    char[] charArray = str1.toCharArray();
    System.out.println("Char Array:");
    for (char ch : charArray) {
      System.out.print(ch + " "); // H e l l o W o r l d
    }
    System.out.println();

    // 9. STRINGBUILDER (MUTABLE STRING)
    StringBuilder sb = new StringBuilder("Fast");
    sb.append(" & Efficient");
    System.out.println("StringBuilder Output: " + sb.toString()); // Fast & Efficient

    // 10. STRING POOL DEMONSTRATION
    String s1 = "Java"; // Stored in String Pool
    String s2 = "Java"; // Refers to same object in pool (No new object created)
    System.out.println("String Pool (s1 == s2): " + (s1 == s2)); // true

    String s3 = new String("Java"); // Created in Heap (not in pool)
    System.out.println("Heap vs Pool (s1 == s3): " + (s1 == s3)); // false
  }
}
