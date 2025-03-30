Abstract Class in Java
An abstract class is a class that cannot be instantiated and is meant to be inherited by other classes. It serves as a blueprint for related classes, defining common behavior while leaving specific implementations to subclasses.

Key Features of Abstract Classes
Declared using the abstract keyword.
Can have both abstract (without body) and concrete (with body) methods.
Cannot be instantiated directly.
Must be inherited; a subclass must implement all abstract methods or be declared abstract.
Can have constructors for initializing common fields.
Supports single inheritance only (cannot extend multiple abstract classes).
Can extend another abstract class (multi-level abstraction).
Can implement interfaces.
Can have static methods and final methods (cannot be overridden).
Can have instance, static, and final variables like regular classes.

see we cant define abstract class object and interface objects directly as normal class objects in main function . it is not recommended to make their objects rather we can make objects of the classes which r using these interfaces and abstarct class.but if we needed it anyhow then these 2 have their way to do s but that r very complex .
