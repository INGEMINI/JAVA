Chained Exceptions (getCause())
What is it?
Chained exceptions allow you to link one exception to another, usually when you catch an exception and want to throw a new one but keep the original cause.

This helps preserve the original error details for debugging.

How is it done?
When creating a new exception, you can pass the original exception as the cause.

Later, you retrieve the original cause with .getCause().

Why use it?
To wrap low-level exceptions in higher-level ones.

Helps when your API wants to throw its own exception type but still expose the original error.

syntax

try {
// risky code
} catch (Exception e) {
throw new NewException("Higher level message", e); // e is cause
}
