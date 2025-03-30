Class is a blueprint for creating objects.
Objects are instances of a class.
Methods define object behaviors.
Constructors initialize objects.
Encapsulation protects data inside a class.

Types of Methods in a Class
A class can have different types of methods:

Instance Method - Works on an object’s data.
Static Method - Belongs to the class, not objects


 in Java, a static method can be called using an object, but it is not recommended. Static methods belong to the class rather than any specific instance, so they should be called using the class name


Why is calling via an object not recommended?
It makes the code confusing because static methods do not belong to an instance.
The compiler shows a warning:
"Static method should be accessed in a static way"
It does not use any instance-specific data, breaking the OOP principles.
👉 Best Practice: Always call static methods using the class name (ClassName.methodName();).








  

