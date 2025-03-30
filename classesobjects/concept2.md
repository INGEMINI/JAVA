Why is main method always static in Java?
In Java, the main method is the entry point of any standalone application. The JVM (Java Virtual Machine) needs to call this method to start the execution of the program. The reason it's declared as static is:

1. JVM can call it without creating an object of the class.
2. It saves memory and avoids unnecessary object creation.
3. It maintains a clear program entry point.

What is a static method in Java?
A static method belongs to the class itself, not to any specific object. This means:

1. It can be called using the class name directly (without creating an object).
2. It cannot access non-static (instance) variables or methods directly.
3. Static methods can only call other static methods directly.

When we say "If no constructor is defined, how would the JVM know how to instantiate the class?", it means that if the main method were non-static, Java would need to create an object of the class before calling main.

What is String[] args in the main method?

1. string[] args is an array of strings that stores command-line arguments passed when running the program.
2. If you run the Java program from the command line, you can pass inputs, and they get stored in args.

Why is it always an array ([] with args)?

1. Java allows passing multiple arguments when running the program.
2. These arguments are stored in an array so they can be accessed using args[index].

Why is it always named args? Can we change it?
No, it's not mandatory to name it args. You can name it anything, but the type (String[]) must remain the same.

What if no arguments are passed?
If you try to access args[0] when no arguments are provided, you'll get an ArrayIndexOutOfBoundsException.

Can main have a different parameter type instead of String[]?
No, the JVM only recognizes main with String[] args.

Summary
✅ String[] args is used to store command-line arguments.
✅ It's an array ([]) because Java allows multiple arguments.
✅ args is not mandatory, but it's the convention.
✅ Always check args.length before accessing elements to avoid errors.
✅ The JVM only recognizes String[] args as the main method parameter.

What Are Command-Line Arguments?
Command-line arguments are inputs provided to a Java program when it runs from the terminal or command prompt. These arguments are passed to the main method as a String[] args array.

Key Takeaways

1. Command-line arguments are passed when running a Java program.
2. They are stored in String[] args.
3. You need to convert them if you want to use them as numbers.
4. Always check args.length before accessing elements.

Types of Arguments in Java

1. Method Arguments (Parameters) → Passed when calling a method
2. Command-Line Arguments → Passed when running a Java program

Key Takeaways
✅ Arguments are inputs given to a method or program.
✅ Command-line arguments are always String and stored in String[] args.
✅ Java automatically creates args[] when the program starts.
✅ We don’t declare args[], but Java fills it based on user input.

Does Java Always Ask for Arguments When Running a Program?
No, Java does not always ask for arguments.

How It Works:
If you provide arguments when running the program, Java stores them in args[].
If you don’t provide arguments, the args[] array remains empty (but it still exists).
Java does not stop execution or ask for input if no arguments are given—unless you explicitly write code to handle input using Scanner.

❌ Java does not always ask for arguments.
✅ If you don’t provide arguments, args[] remains empty.
✅ If you want Java to ask for input, you must use Scanner.


In Java, a single .java file can have only one public class because of how Java's compilation and file structure work. Let me break it down for you in detail:

1. Java's Compilation Rule
In Java, every public class must be stored in a file with the same name as the class.
If a .java file contained multiple public classes, the compiler wouldn't know which one to match with the filename.

What If You Want Multiple Classes in One File?
You CAN have multiple classes in a single file, but only ONE can be public.
The other classes should be without access modifiers (default access).

Final Summary
🔹 Java enforces only one public class per file to ensure clarity, maintainability, and proper file-to-class mapping.
🔹 Other classes in the same file should not be public, and Java will still compile them separately.
🔹 If you need multiple public classes, they must be in separate files with matching names