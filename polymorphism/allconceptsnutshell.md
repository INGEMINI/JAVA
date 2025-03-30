Polymorphism means "one name, multiple forms." It allows a single interface (method or class) to be used for different types of objects.

🔍 All Concepts of Polymorphism in Java
Polymorphism can be classified as:

1️⃣ Compile-time (Static) Polymorphism
method overloading

2️⃣ Runtime (Dynamic) Polymorphism
dynamic method dispatch
method overriding

4️⃣ Constructor Overloading

5️⃣ Interface Polymorphism
Achieved through interfaces, where a single interface can have multiple implementations.

3.  Abstract Class Polymorphism

Achieved when a child class inherits and implements an abstract method.

Dynamic Method Dispatch (Runtime Polymorphism) in Java
Dynamic Method Dispatch (DMD) is a mechanism where the method to be executed is determined at runtime through method overriding and upcasting.

Key Concepts
🔹 Method Overriding

A subclass provides its own version of a method from the parent class.
The method signature remains the same.
The method call is resolved at runtime.
🔹 Upcasting (Parent Reference, Child Object)

A parent class reference is used to refer to a child class object.
Allows dynamic method dispatch by invoking overridden methods at runtime.
🔹 Runtime Decision

Java determines the method based on the actual object type, not the reference type.
