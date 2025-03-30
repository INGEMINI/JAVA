🔹 Private Constructors and Inheritance in Java
In Java, constructors can have any access modifier, including private. However, a private constructor prevents inheritance because the subclass cannot access the private constructor of the parent class.

🔹 Why Does a Private Constructor Prevent Inheritance?
When a subclass is created, it must call one of the parent class constructors (either explicitly using super() or implicitly). If the parent class constructor is private, the child class cannot call it, which means the subclass cannot be instantiated.

Private Constructor Blocking Inheritance

🔹 Can a Private Constructor Be Used in an Inheritable Class?
Yes, if the parent class has another non-private constructor, the subclass can inherit from it.

💡 Conclusion
✔ Java allows private constructors, unlike C++, where constructors are usually public.
✔ A private constructor prevents inheritance because the subclass cannot access it.
✔ It is useful in singleton patterns, utility classes, and restricting subclass creation.
