In Java, type conversion is the process of converting one data type into another. It is categorized into two types:

1. Implicit Type Conversion (Widening)
2. Explicit Type Conversion (Narrowing / Type Casting)

1️⃣ Implicit Type Conversion (Widening)
✅ Happens automatically when:

. The destination type is larger than the source type (no data loss).

. Converting from smaller to larger data types (e.g., int → long, float → double).
Java automatically does this without requiring explicit casting.

. Data Types in Order (Smallest → Largest)
byte → short → int → long → float → double

. char Can be implicitly converted to int, long, float, double (widening conversion).

. char Cannot be converted to byte or short without explicit casting.

for string...
No direct implicit conversion with numeric types.
Explicit conversion (parsing) is required to convert String to int, double, etc.

2️⃣ Explicit Type Conversion (Narrowing / Type Casting)
❌ Not automatic because:

The destination type is smaller than the source type (possible data loss).

Java requires explicit casting using (targetType) value.
