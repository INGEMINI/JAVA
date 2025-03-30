StringBuffer is mutable, meaning you can modify its content without creating new objects, unlike String. However, it does have a capacity limit, which determines how much space is allocated for the characters,but it expands dynamically automatically when needed.

How Capacity Works in StringBuffer
The initial capacity of a StringBuffer is 16 characters by default unless specified.
If you create a StringBuffer with a string, the initial capacity is 16 + length of the string.
When the content exceeds the current capacity, StringBuffer doubles its capacity (approximately oldCapacity \* 2 + 2).

we can also set a custom initial capacity using:

StringBuffer sb = new StringBuffer(50);
// Starts with capacity 50

You can check the current capacity using
sb.capacity()

when we pass a StringBuffer object to System.out.println(), it automatically calls toString() and prints the content.
