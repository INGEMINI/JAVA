String - Immutable Class(thread -safe)
String is immutable. Once a string object is created, it cannot be modified. Any operation on a String that modifies it will create a new string object.

StringBuilder - Mutable Class (Non-Thread Safe)
StringBuilder is a mutable sequence of characters. It allows modifications without creating new objects every time. It is not thread-safe, but it provides faster performance when modifications are frequent.

 StringBuffer - Mutable Class (Thread-Safe)
StringBuffer is similar to StringBuilder in functionality, but it is thread-safe. This means it can be used safely in multi-threaded environments. However, this thread-safety comes with a performance tradeoff, as synchronization introduces some overhead.


What is Thread Safety?
Thread safety means that a method or class can be used by multiple threads simultaneously without leading to unexpected behavior (such as data corruption or inconsistent results). It ensures that shared data remains correct when accessed by multiple threads at the same time.


Thread Safety in Java
In Java, thread safety is achieved using:

Synchronization (like in StringBuffer)
Immutable Objects (like String)
Atomic Classes (like AtomicInteger)


Why is String Thread-Safe?
String in Java is immutable, meaning once a String object is created, it cannot be changed. Even if multiple threads access a String, they cannot modify its content, ensuring thread safety without synchronization.


Why is StringBuffer Thread-Safe?
StringBuffer is mutable, meaning it can be changed after creation. To prevent data corruption, all its methods are synchronized, ensuring only one thread modifies it at a time