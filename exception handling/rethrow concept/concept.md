Re-throwing Exceptions
What is it?
Re-throwing means catching an exception in a catch block and then throwing it again to be handled further up the call stack.

Useful when you want to log or process the exception but still let higher-level code know about the problem.

Why use it?
To add additional info or cleanup before passing the exception on.

To not swallow exceptions silently but propagate them.

---

syntax

try {
// risky code
} catch (ExceptionType e) {
// Do something with exception (like logging)
throw e; // re-throw the same exception
}
