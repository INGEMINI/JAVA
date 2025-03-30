📌 What is String Pool Optimization in Java?
String Pool Optimization is a memory-saving technique used in Java where string literals are stored in a special memory area called the String Pool.
Instead of creating multiple copies of the same string, Java reuses existing ones to improve efficiency.

📌 How It Works
When a string literal ("Hello", "World", etc.) is created, Java checks if it already exists in the String Pool.
If it exists, Java reuses the existing reference instead of creating a new object.
If it doesn’t exist, a new object is created and stored in the pool.

📌 When Does Java Create a New String Object?
If you use new String(), Java does NOT use the String Pool and creates a new object in the heap.

Reason:

"Hello" in s4 is stored in the String Pool.
new String("Hello") in s3 creates a new separate object in the heap.

📌 Why String Pool Optimization is Useful?
✅ Saves Memory – Prevents duplicate string objects.
✅ Improves Performance – Reusing existing strings is faster than creating new ones.
✅ Used in Constants & String Literals – Ideal for values that don’t change frequently.

📌 When Should You Avoid It?
to be discussed..
