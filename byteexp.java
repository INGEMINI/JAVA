public class byteexp {
  public static void main(String[] args) {
    // 1️⃣ Byte Range (Minimum and Maximum)
    byte minByte = Byte.MIN_VALUE; // -128
    byte maxByte = Byte.MAX_VALUE; // 127
    System.out.println("Byte Range: " + minByte + " to " + maxByte);

    // 2️⃣ Default Value of Byte (only works in class scope, not inside main)
    Byte defaultByte = 0; // Java does not allow uninitialized local variables
    System.out.println("Default value of byte: " + defaultByte);

    // 3️⃣ Type Casting and Overflow
    byte a = 50;
    byte b = 80;
    byte sum = (byte) (a + b); // Needs explicit type casting (byte + byte = int)
    System.out.println("Sum of a and b (with overflow): " + sum);

    // 4️⃣ Byte Underflow and Overflow
    byte overflow = (byte) (maxByte + 1); // Wraps to -128
    byte underflow = (byte) (minByte - 1); // Wraps to 127
    System.out.println("Overflow Example (127 + 1): " + overflow);
    System.out.println("Underflow Example (-128 - 1): " + underflow);

    // 5️⃣ Storing Numeric Values and Type Conversion
    byte num = 65;
    char ch = (char) num; // Converting byte to char
    System.out.println("Byte stored as number: " + num);
    System.out.println("Byte converted to character: " + ch); // 'A'

    // 6️⃣ Implicit Type Promotion in Expressions
    byte x = 10;
    byte y = 20;
    int result = x * y; // Promoted to int automatically
    System.out.println("Result of byte multiplication (stored in int): " + result);

    // 7️⃣ Using Byte Wrapper Class
    Byte byteObj = 100; // Autoboxing
    System.out.println("Byte object value: " + byteObj);
    System.out.println("Byte to int conversion: " + byteObj.intValue());

    // 8️⃣ Byte Parsing from String
    String str = "25";
    byte parsedByte = Byte.parseByte(str); // Convert string to byte
    System.out.println("Parsed byte from string: " + parsedByte);
  }
}
