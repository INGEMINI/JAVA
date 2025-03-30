1. BufferedReader (Fast and Efficient)
How BufferedReader Works
BufferedReader is a high-performance way to read input, as it reads large chunks of data at once.
It is usually wrapped around InputStreamReader to read from standard input (System.in).
It reads input as a string and does not have built-in methods to parse integers, doubles, etc.
We must manually convert the input using Integer.parseInt(), Double.parseDouble(), etc.

Key Points About BufferedReader
✔️ Faster than Scanner (because it reads data in bulk).
✔️ Used for reading large inputs efficiently.
✔️ Reads input as a String; manual conversion is required for integers, doubles, etc.
❌ Cannot parse tokens easily like Scanner (e.g., splitting words from a line).


Problem: BufferedReader reads the entire line as a single string, making it difficult to separate numbers.
Solution: StringTokenizer splits the string based on spaces.
nextToken() fetches the next available token (word/number).

Each readLine() reads one full line.


IOException → Occurs when there’s an issue with input reading.
NumberFormatException → Happens if the user enters a non-numeric value for an integer or double.

some facts-->

readLine() takes everything until the newline character (\n).//basically read the full line

What is Try-With-Resources?
Java provides a feature called try-with-resources (introduced in Java 7).
It automatically closes the resource (BufferedReader) after the try block completes.
This avoids memory leaks and ensures the file/stream is properly closed.

🔹 Why Use Try-With-Resources?
✅ Automatic Cleanup → No need to write reader.close().
✅ Prevents Memory Leaks → Ensures the resource is released properly.
✅ Cleaner Code → No need for a finally block.

