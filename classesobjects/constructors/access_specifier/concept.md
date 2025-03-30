Access Specifiers in Constructors (Public, Private, and Protected) in Java
In Java, constructors are special methods used to initialize objects. Like other class members (methods and variables), constructors can also have access specifiers (also called access modifiers). The access specifiers define the visibility and accessibility of the constructor within and outside the class.

Types of Access Specifiers in Constructors
Java provides four types of access specifiers that can be applied to constructors:

Public Constructor → Accessible everywhere.
Private Constructor → Accessible only within the same class.
Protected Constructor → Accessible within the same package and in subclasses.
Default (No Modifier) Constructor → Accessible within the same package only.

1. Public Constructor
A public constructor allows object creation from anywhere in the program. This is the most commonly used constructor.
When to use?
When the object needs to be created from any other class.
Useful for general object instantiation.
2. Private Constructor
A private constructor restricts object creation outside the class. It is mostly used in Singleton Design Pattern or Utility Classes.
When to use?
Singleton Pattern (Ensures only one instance of a class).
Utility Classes (e.g., Math class) where object creation is not needed.
3. Protected Constructor
A protected constructor allows object creation only within:

The same package.
Subclasses (even if they are in a different package).
When to use?
When you want to restrict object creation but still allow subclassing.
Useful in inheritance-based frameworks.
4. Default (No Modifier) Constructor
A default constructor (without any access modifier) allows object creation only within the same package.
When to use?
When you want to restrict object creation to the same package only.
Useful in package-level classes.

Key Takeaways
Public constructors allow unrestricted object creation.
Private constructors prevent object creation from outside (useful in Singleton Pattern).
Protected constructors allow object creation only in subclasses or the same package.
Default constructors (no modifier) allow access within the same package only.
