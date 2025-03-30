public class charexp {
  public static void main(String[] args) {
    // 1️⃣ Storing a Character Directly
    char ch1 = 'A';
    System.out.println("Character stored: " + ch1);

    // 2️⃣ Storing ASCII Value (Implicit Conversion)
    char ch2 = 65; // 65 is ASCII for 'A'
    System.out.println("Character from ASCII 65: " + ch2);

    // 3️⃣ Unicode Character Storage
    char unicodeChar = '\u0905'; // Unicode for 'अ' (Hindi letter A)
    System.out.println("Unicode Character: " + unicodeChar);

    // 4️⃣ Range of char (Min and Max Values)
    System.out.println("Char Minimum Value: " + (int) Character.MIN_VALUE);
    System.out.println("Char Maximum Value: " + (int) Character.MAX_VALUE);

    // 5️⃣ char Arithmetic (Increment and Addition)
    char nextChar = (char) (ch1 + 1); // 'A' + 1 → 'B'
    System.out.println("Next character after 'A': " + nextChar);

    // 6️⃣ Type Casting (char to int and vice versa)
    int charAsInt = ch1; // Implicit conversion (A → 65)
    char intToChar = (char) (charAsInt + 1); // Explicit conversion
    System.out.println("Character 'A' as int: " + charAsInt);
    System.out.println("Integer 66 as char: " + intToChar); // 'B'

    // 7️⃣ Checking if a char is Digit, Letter, or Whitespace
    char testChar = '5';
    System.out.println("Is '5' a digit? " + Character.isDigit(testChar));
    System.out.println("Is 'A' a letter? " + Character.isLetter(ch1));
    System.out.println("Is space a whitespace? " + Character.isWhitespace(' '));

    // 8️⃣ Converting Case (Uppercase to Lowercase and Vice Versa)
    char lowerCase = Character.toLowerCase(ch1);
    char upperCase = Character.toUpperCase('b');
    System.out.println("'A' to lowercase: " + lowerCase);
    System.out.println("'b' to uppercase: " + upperCase);

    // 9️⃣ Char Wrapper Class Usage
    Character charObj = 'X'; // Autoboxing
    System.out.println("Character object: " + charObj);
    System.out.println("Character object as primitive: " + charObj.charValue());

    // 🔟 Checking if a char is Uppercase or Lowercase
    System.out.println("Is 'X' uppercase? " + Character.isUpperCase(charObj));
    System.out.println("Is 'x' lowercase? " + Character.isLowerCase('x'));
  }
}
