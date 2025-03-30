A package in Java is a way to group related classes and interfaces together. It helps in organizing code, avoiding name conflicts, and improving maintainability.

Why Use Packages?
Encapsulation & Organization: Keeps related classes together.
Avoids Name Conflicts: Prevents issues when multiple developers use the same class names.
Access Control: Helps manage access modifiers like public, private, protected, and default.
Code Reusability: Allows easy reuse of existing classes.

Creating and Using Packages in Java

1. Creating a Package
   To create a package, use the package keyword at the beginning of a Java file.

mypackage/
├── MyClass.java
├── SubClass.java

2. Using a Package in Another Class
   To use a package in another Java file, we import it using import package_name.\*;

Access Modifiers and Packages
Modifier... Same Class... Same Package... Subclass (Different Package)... Other Packages
public ✅ ✅ ✅ ✅
protected ✅ ✅ ✅ ❌
Default ✅ ✅ ❌ ❌
private ✅ ❌ ❌ ❌

Sub-Packages in Java

1. Create a subpackage structure
   mypackage/
   ├── subpackage/
   ├── SubClass2.java

Conclusion
A package is a way to group related classes.
Use package package_name; at the top of a class.
Use import package_name.\*; to access it.
Compile using javac -d . filename.java.
Supports access control and sub-packages.
