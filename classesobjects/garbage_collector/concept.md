Object Destructor in Java
In Java, destructors are not explicitly defined like in C++. Instead, Java has a method called finalize(), which was originally intended to act as a destructor. However, it is now deprecated in modern Java due to its unpredictable behavior.

What does a destructor do?
A destructor:

Is used to clean up resources before an object is destroyed.
Helps release memory, close files, or disconnect database connections.
In Java, the Garbage Collector (GC) handles memory management automatically.


Garbage Collection in Java
Java has automatic garbage collection, which means it automatically removes unused objects from memory to free up space.

Role of Destructor in Garbage Collection
Since Java does not have explicit destructors, the garbage collector (GC) is responsible for:

Identifying unreferenced objects (objects that are no longer reachable).
Releasing memory occupied by these objects.
Calling finalize() (if overridden) before destroying an object (but this is unreliable and discouraged).


gc() Method in Java
System.gc() is a method that suggests Java to run the garbage collector, but it does not guarantee immediate execution.

Key Points
Java does not have destructors like C++. Instead, garbage collection (GC) handles memory cleanup.
The finalize() method was used for cleanup but is deprecated.
System.gc() requests garbage collection but does not force it.
The Java garbage collector automatically manages memory, so explicit destruction of objects is not required.

🔹 When Does GC Remove an Object?
1. Reference is set to null
2. Reassigning a reference to a new object
3. Object goes out of scope (e.g., inside a method)
4. Island of Isolation (When objects reference each other but are not reachable)


🔹 finalize() Method (Deprecated)
Java had a finalize() method that ran before an object was destroyed, but it’s now deprecated because:

Unreliable – No guarantee of execution.
Performance Issues – Slows down GC.
Better Alternatives Exist – Like try-with-resources.
Example (Not Recommended 🚫):
class Demo {
    protected void finalize() {
        System.out.println("Object is being destroyed");
    }
}

🔹 Summary
✅ Java automatically removes unused objects (Garbage Collection).
✅ Objects become eligible for GC when they are no longer referenced.
✅ JVM has different garbage collectors (Serial, Parallel, G1, etc.).
✅ System.gc() only suggests GC, it doesn’t force it.
✅ finalize() was used for cleanup but is now deprecated.
