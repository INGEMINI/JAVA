Definition of Interface Concept in Java (After Java 8)

An interface in Java is a blueprint of a class that defines a set of methods that a class must implement. Prior to Java 8, interfaces could only contain abstract methods (methods without a body).
However, after Java 8, interfaces were enhanced with new capabilities:

1. Abstract Methods – Methods that must be implemented by the implementing class. not defined in interface .
2. Default Methods – defined in interface ,can be override in classes. use keyword default
3. Static Methods – defined in interface ,cannot be override in classes. use keyword static.can be called without an object.
4. Private Methods (Java 9) – Methods that help avoid redundancy inside an interface by being used within default/static methods.

**Diamond problem**
for multiple inheritance we use interface.
in multiple inheritance diamond problem arises.

Java allows multiple inheritance only through interfaces. The diamond problem arises when two interfaces provide the same default method, and a class implements both.

Compile-time Error: If a class implements two interfaces with the same default method without overriding it, Java will throw an error.

Explicit Resolution: The class must override the method and explicitly specify which interface's method to call using super.
