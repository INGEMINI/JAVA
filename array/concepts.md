Definition of an Array in Java
An array in Java is a fixed-size, ordered collection of elements of the same type, stored contiguously in memory. It allows fast access using an index but has a fixed length once created.

🔹 Key Properties of Arrays in Java
Fixed Size → The size is set at creation and cannot be changed.
Homogeneous Elements → All elements must be of the same data type.
Indexed Access → Elements are accessed using zero-based indexing (arr[0], arr[1], ...).
Stored in Heap → Arrays are stored in heap memory, even if declared inside a method.
Objects in Java → Arrays are objects, even when storing primitives. They inherit from Object class.
Default Values → If uninitialized, arrays get default values (0 for numbers, false for boolean, null for objects).
Direct & Indirect Copying → Can be copied using .clone(), System.arraycopy(), Arrays.copyOf(), or manual loops.
Supports Multi-Dimensional Arrays → Can have 1D, 2D, or multi-dimensional arrays.

Java has two types of data:
1️⃣ Primitive Data Types – Basic, predefined types (e.g., int, double).
2️⃣ Object (Reference) Data Types – Created using classes (e.g., String, Array, Custom Objects).

🔹 1. Primitive Data Types (Basic & Stored in Stack)
✔ Definition:
Primitive data types are the simplest types of data in Java. They store only values (not references).
✔ Stored in: Stack Memory
✔ Size: Fixed size, directly managed by JVM.
✔ Performance: Faster than objects (no extra overhead)

🔹 2. Object (Reference) Data Types (Complex & Stored in Heap)
✔ Definition:
Reference types store addresses (references) of objects instead of actual values.
✔ Stored in: Heap Memory (while the reference is stored in the stack).
✔ Size: Dynamic (depends on object size).
✔ Performance: Slower than primitives (extra memory and processing required).

Type......Example....... Structure
1D Array... int[] arr = {1, 2, 3};..... List of numbers
2D Array... int[][] arr = {{1, 2}, {3, 4}};..... Table (rows & columns)
3D Array... int[][][] arr = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};..... Stack of tables
