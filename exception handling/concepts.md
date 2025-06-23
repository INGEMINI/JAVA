🔸 1. What is an Exception?
An exception is an event that disrupts the normal flow of the program's execution.
It occurs during runtime and can arise due to various reasons: invalid input, file not found, divide by zero, etc.

---

need?
Without exception handling, your program crashes.

## With exception handling, you can catch this error and show a user-friendly message instead of crashing.

🔸 2. Types of Exceptions
Java has two main types of exceptions:

✅ 1. Checked Exceptions
Known at compile-time.

You must handle them using try-catch or throws.

Examples: IOException, SQLException, FileNotFoundException.

✅ 2. Unchecked Exceptions
Known at runtime.

You may handle them, but it’s not mandatory.

## Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.

🔸 3. Errors vs Exceptions
Aspect... Errors... Exceptions
Type... Serious problems... Recoverable conditions
Can Handle... Usually not handled... Can be handled using try-catch
Example... OutOfMemoryError... IOException, ArithmeticException

---

Throwable
│
├── Error (JVM errors)
└── Exception
├── Checked Exception (e.g., IOException)
└── RuntimeException (e.g., ArithmeticException)

---

Keywords in Exception Handling
🔹 try
Block that might cause an exception.

🔹 catch
Block that handles the exception.

🔹 throw
Used to manually throw an exception.

🔹 throws
Used in method signature to declare exception.

🔹 finally
Executes code regardless of exception — used for clean-up

---

syntax

try {
// risky code
} catch (ExceptionType e) {
// handling code
} finally {
// clean-up code
}

---

🔸 Stack Unwinding
When an exception occurs, Java jumps from the current method to the calling method until it finds a catch block — this is stack unwinding.

🔸 finally vs catch
Use catch to handle errors.

## Use finally to clean up, like closing files or DB connections.

---

heirarchy

java.lang.Object
└── java.lang.Throwable
├── java.lang.Error
│ └── (JVM Errors like OutOfMemoryError, StackOverflowError, etc.)
└── java.lang.Exception
├── Checked Exceptions
└── RuntimeException (Unchecked Exceptions)

---

error types that java throws

| **Error Type**                | **Description**                                                        |
| ----------------------------- | ---------------------------------------------------------------------- |
| `OutOfMemoryError`            | JVM runs out of memory (heap/stack).                                   |
| `StackOverflowError`          | Deep or infinite recursion exhausts the call stack.                    |
| `VirtualMachineError`         | Base class for serious JVM problems.                                   |
| `InternalError`               | JVM internal issue (rare).                                             |
| `UnknownError`                | An unknown serious error.                                              |
| `NoClassDefFoundError`        | Class was present during compilation but **not found during runtime**. |
| `ExceptionInInitializerError` | Exception thrown during static initializer block.                      |
| `UnsatisfiedLinkError`        | Native library not found for native method.                            |
| `ClassFormatError`            | Bytecode of a class is malformed or corrupt.                           |
| `VerifyError`                 | JVM class verifier fails on loading a class.                           |
| `LinkageError`                | Class definition conflicts during runtime.                             |

---

Commonly Used Exceptions in Java

## Exception Class : When to Use

ArithmeticException : Divide by zero
NullPointerException : Using a null object
IllegalArgumentException : Invalid method parameter passed
ArrayIndexOutOfBoundsException : Array index is out of valid range
IOException : Input/Output operation failed (needs 'throws')
NumberFormatException : Invalid string to number conversion

---

all exceptions that java throws

1. checked exceptions

## Exception Type - Description

IOException - Input/output failures.
FileNotFoundException - File not found.
ClassNotFoundException - Class not found at runtime.
SQLException - Issues accessing database.
ParseException - Parsing error (like date format).
InterruptedException - Thread interrupted.
InstantiationException - Instantiating abstract/interface.
CloneNotSupportedException - Cloning without implementing Cloneable.
NoSuchMethodException - Method not found via reflection.
InvocationTargetException - Exception during reflective call.

2. unchecked exception(runtime)

## Exception Type - Description

ArithmeticException - Division by zero.
NullPointerException - Accessing method/field on null.
ArrayIndexOutOfBoundsException - Array index out of range.
StringIndexOutOfBoundsException - String index too large.
NumberFormatException - Invalid number conversion.
IllegalArgumentException - Invalid argument passed.
IllegalStateException - Invalid object state.
ClassCastException - Invalid object casting.
UnsupportedOperationException - Method not supported.
NegativeArraySizeException - Negative array size.

---

🧠 Tips to Remember:
Errors: Fatal issues → Do not catch or handle. JVM-related.

Checked Exceptions: File, DB, IO-related → Must be handled using try-catch or throws.

Unchecked Exceptions: Logical bugs like null, divide by 0, bad casting → Fix your code logic.
