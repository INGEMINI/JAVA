A constructor in Java is a special type of method used to initialize objects. It is called when an instance of a class is created. A constructor has the same name as the class and does not have a return type (not even void).

Properties of Constructors:
Same Name as Class
No Return Type
Automatic Invocation
overloading
Default Constructor
Parameterized Constructor
Constructor Chaining
Super Constructor (super())

Types of Constructors
There are three types of constructors in Java:

1. Default Constructor (No-Argument Constructor)
   A constructor with no parameters that initializes default values.
2. Parameterized Constructor
   A constructor that takes parameters to initialize object properties.
3. Constructor Overloading
   Multiple constructors with different numbers or types of parameters.
4. Constructor Chaining (Using this())
   One constructor calls another constructor within the same class using this().
5. Calling Superclass Constructor (Using super())
   A subclass constructor calls the superclass constructor using super().
6. Private Constructor (Singleton Class)
   A private constructor is used when we want to restrict object creation from outside the class.

Final Points to Remember
If no constructor is defined, Java automatically provides a default constructor.
A constructor cannot be static, final, or abstract.
The this() keyword is used to call another constructor in the same class.
The super() keyword is used to call the superclass constructor.
A constructor cannot return a value.
A constructor cannot be inherited, but a subclass can call the superclass constructor using super().

1. Default Constructor – Is it Visible or Invisible?
   A default constructor is an invisible constructor that Java automatically provides if you do not define any constructor in your class.

💡 Key Points:

It is invisible in the code but exists in the background.
It has no parameters and assigns default values (e.g., 0 for numbers, null for objects).
As soon as you define a constructor yourself, Java does NOT provide the default constructor.

Constructor Chaining (this())
💡 What is Constructor Chaining?
Constructor chaining means one constructor calls another constructor in the same class using this() keyword.

Why use it?
To avoid duplicate code by making one constructor reuse another.
To initialize common values in a single place.

Super Constructor (super())
💡 What is super()?

super() is used in a subclass to call a constructor of its superclass.
This ensures that the parent class is initialized first before the subclass.
Why use super()?
When a child class extends a parent class, the parent class must be initialized first.
If the parent class has a parameterized constructor, we must use super(args) to pass values.

Private Constructor (Singleton Class)
💡 What is a Private Constructor?

A private constructor is used to restrict object creation from outside the class.
It is mainly used in Singleton Design Pattern, where only one object is allowed for a class.

in Java, the super() call must be the first statement inside the constructor of a child class. You cannot place it after other statements in the constructor.

Why?
super() is used to call the parent class constructor before executing any statements in the child class constructor.
The Java compiler enforces this because the parent class must be initialized before the child class.
