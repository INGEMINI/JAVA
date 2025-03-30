Constructors in Inheritance (Java)
In Java, when a subclass object is created, the constructor of the parent class (superclass) is executed first, followed by the constructor of the subclass. This ensures that the base class is initialized before the derived class.

Key Concepts of Constructors in Inheritance
Implicit Constructor Call:

If a subclass constructor does not explicitly call the superclass constructor, Java automatically calls the default constructor of the superclass.
Explicit Constructor Call using super()

The super() keyword is used to call the parameterized constructor of the superclass.
Constructor Chaining

If there are multiple levels of inheritance, constructors are called in a chain from the base class to the most derived class.

Key Takeaways
✔ Super (super()) must be the first statement in a constructor
✔ If no constructor is explicitly called, Java automatically calls the no-argument constructor of the superclass
✔ Constructors are executed in the order of inheritance hierarchy (base to derived)

Why Do We Need super in Java If Implicit Inheritance Exists?

1️⃣ Calling a Parent Class Constructor (super())
2️⃣ Accessing Parent Class Methods (super.method())
3️⃣ Accessing Parent Class Variables (super.variable)

When Is super NOT Required?
✔ If a superclass has a no-argument constructor, Java will call it automatically.
✔ If there’s no method or variable name conflict, you don’t need super.

Conclusion: Why super Is Needed
🔹 It ensures we can call parent constructors explicitly.
🔹 It allows us to access overridden methods and hidden variables.
🔹 It helps in method overriding when we need both parent and child behavior.

1.  Constructor Execution Order in Multi-level Inheritance
    Constructors execute in top-to-bottom order (from base class to derived class).
