Varargs (Variable Arguments) in Java allow you to pass multiple arguments to a method without specifying the exact number in advance.

🔥 Key Points:
✅ Use ... after the data type (e.g., int... numbers).
✅ Varargs work like an array inside the method.
✅ You can pass any number of arguments (including none).
✅ There should be only one varargs parameter in a method, and it must be the last parameter.

❌ Incorrect Usage:
void print(String... words, int num) { } // ❌ Error! Varargs must be last

🔥 Limitations of Varargs:
1. Memory Constraints
2. Performance Overhead
3. Varargs Must Be the Last Parameter
ou can only have one varargs parameter in a method, and it must be the last parameter.
4. Cannot Pass Two Varargs in One Method
5. Cannot Directly Use Primitive Types with Varargs in Some Cases

If you try int... inside generics, it won’t work because Java doesn’t allow primitives (int, double, etc.) in generics.


✅ Conclusion:
✔ Varargs are flexible but should be used wisely.
✔ For very large datasets, consider using explicit arrays instead.
✔ Be mindful of memory and performance when using varargs.
