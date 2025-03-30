🔹 Constructor Chaining in Java
Constructor Chaining refers to the process of calling one constructor from another within the same class or across different classes (i.e., parent and child). It ensures that all constructors in the chain execute in a specific order, avoiding redundant code.

🔹 Types of Constructor Chaining
1️⃣ Within the Same Class → Using this()
2️⃣ Between Parent and Child Classes → Using super()

1️⃣ Constructor Chaining Within the Same Class (this())
Used to call another constructor within the same class.
Helps avoid code duplication.
this() must be the first statement in a constructor.

2️⃣ Constructor Chaining Between Parent and Child Classes (super())
Used to call a parent class constructor from a child class.
Ensures that parent class constructors execute before child constructors.
super() must be the first statement in a child class constructor.

💡 Key Rules
✅ this() and super() must be the first statement inside a constructor.
✅ A constructor cannot call itself directly (infinite recursion).
✅ Without explicit super(), Java calls super() implicitly (default constructor).
