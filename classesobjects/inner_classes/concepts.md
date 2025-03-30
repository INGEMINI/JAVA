Java allows defining a class inside another class, known as nested classes.
Java has four types of nested classes:

1. Static nested class
2. Non-static inner class
3. Method-local inner class
4. Anonymous inner class

5. Static Nested Class
   Declared with static keyword inside an outer class.
   Does NOT require an instance of the outer class.
   Can only access static members of the outer class.

Key Points
No need for an Outer class instance.
Can only access static members of Outer.
Used when the nested class is logically related but does not need outer class instance

2. Non-Static Inner Class
   Also called Inner Class.
   Requires an instance of the outer class to be created.
   Can access both static and non-static members of the outer class.

Key Points
Needs an Outer class instance (outer.new Inner()).
Can access all members of Outer.
Used when inner class logically belongs to an instance of the outer class.

3. Method-Local Inner Class
   Defined inside a method of the outer class.
   Can access only final (or effectively final) variables of the enclosing method.
   Cannot have any access modifiers (like public, private).

Key Points
Cannot be used outside the method.
Can only access final (or effectively final) local variables.
Used when class is tightly bound to a specific method.

4. Anonymous Inner Class
   Does not have a name.
   Used to extend a class or implement an interface on the spot.
   Can only be used once.

Key Points
No need to create a named subclass.
Used when a class is needed only once.
Good for event handling (Java GUI, threads, etc.).

Summary Table
Type... Needs Outer Instance?... Access to Outer Class Members?... Use Case
Static Nested Class... ❌ No ...Only static members... Grouping logically related static classes
Non-Static Inner Class... ✅ Yes ...All members.... When the inner class is tightly related to an outer class instance
Method-Local Inner Class... ✅ Yes, inside method ...Final (or effectively final) variables... When class is needed inside a method
Anonymous Inner Class ...✅ Yes ...Can access all members ...When a class needs to be used only once

What is "Effectively Final" in Java?
In Java, a local variable is effectively final if its value does not change after initialization. It means you don't have to explicitly mark it as final, but you still cannot modify it after assignment.

