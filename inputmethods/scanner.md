🔹 1. What is Scanner?
Scanner is a class in the java.util package that allows us to take user input easily. It can read different types of input like:

Integers (nextInt())
Floating-point numbers (nextFloat(), nextDouble())
Words (next())
Full lines (nextLine())
Boolean values (nextBoolean())
Other primitive types

🔹 2. Importing Scanner
Since Scanner is in the java.util package, we must import it before using it:

import java.util.Scanner;

🔹 3. Creating a Scanner Object
To use Scanner, we need to create an object of it:

Scanner sc = new Scanner(System.in);

the newline issue occurs with all numeric input methods of Scanner, including:

✅ nextInt()
✅ nextFloat()
✅ nextDouble()
✅ nextLong()
✅ nextShort()

📌 Why?

All of these methods read only the number and leave the newline (\n) character in the input buffer.
When nextLine() is called after them, it consumes that leftover \n instead of user input, making it seem like it skipped input.
