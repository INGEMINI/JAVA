Wrapper classes convert primitive data types into objects.

List of Wrapper Classes
Primitive Type......Wrapper Class
byte... Byte
short... Short
int... Integer
long... Long
float... Float
double... Double
char... Character
boolean... Boolean

Why Do We Need Wrapper Classes If We Already Have Data Types?

1️⃣ Wrapper Classes Enable Collections (Like ArrayList)
Java Collections (ArrayList, HashMap, etc.) do not support primitives—only objects.
Wrapper classes allow us to store primitives in collections.

2️⃣ Wrapper Classes Provide Utility Methods
Primitives don’t have built-in methods, but wrapper classes do!

3️⃣ Enable Autoboxing & Unboxing (Auto Conversion)
Autoboxing: Converts primitive → object automatically.
Unboxing: Converts object → primitive automatically

4️⃣ Allow null Assignments (Unlike Primitives)
Primitives (int, double) cannot store null values.
Objects (Integer, Double) can store null, useful in some cases.

5️⃣ Useful in Multi-threading & Synchronization
Wrapper objects can be used in multi-threaded environments, while primitives cannot be synchronized directly.
