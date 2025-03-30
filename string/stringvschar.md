📌 Key Differences Explained

Feature..........

String (Immutable)
Can be modified? ❌ No, creates a new object
Memory Efficient? ✅ Yes (String Pool optimization)
Security (e.g., passwords)? ❌ Unsafe (remains in memory)
Example Modification str = "World"; creates a new object
Stored in String Pool? ✅ Yes, if declared as String str = "text";

char[] (Mutable)
Can be modified? Yes, elements can be changed
Memory Efficient? ❌ No, each char stored separately
Security (e.g., passwords)? ✅ Can be erased after use
Example charArray[0] = 'M'; directly modifies existing array
Stored in String Pool?❌ No, stored in heap
