A shallow copy creates a new reference to the same object, whereas a deep copy creates a completely new and independent copy of an object.

Shallow Copy (Only Reference is Copied)
A new array or object is created, but the inner elements (if they are objects) still point to the same memory locations as the original.
Changes to the original will reflect in the copy (because they share the same object references).

Deep Copy (New Objects are Created)
A completely new array or object is created, including copies of all nested objects.
Changes in the original will not affect the copy.

manual copy..
Manual copy means copying each element one by one using a loop or a method like System.arraycopy().
This creates a new array (manualCopy).
It copies values one by one.
For primitive types (like int, float), this works as a deep copy (because primitives store actual values).
For objects (like String[] or Student[]), this is still a shallow copy (because it copies references, not new objects).

see in shallow copy (no new memory is created and changes made in copy will affect the main one) but in deep copy( a new memory gets created and changes made in copy will not affect the main one )

Summary of Copy Methods
method.....type of copy....

1. a1 = a2 Shallow Copy
2. a1.clone() Deep Copy (for primitives), Shallow Copy (for objects)
3. System.arraycopy() Deep Copy
4. Arrays.copyOf(a, size) Deep Copy
5. Arrays.copyOfRange(a, start, end) deep copy
6. Manual Loop Copy Deep Copy (for primitives), Shallow Copy (for objects)
7. Streams (Java 8) Deep Copy
