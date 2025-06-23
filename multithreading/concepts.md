🧵 What is a Thread? (In Easy Words)
🔸 Imagine this:
You’re using your phone. While:

A song is playing 🎵

You are scrolling Instagram 📱

A file is downloading in background 📥

All of these happen at the same time. That's multitasking.

👉 In programming, a Thread is like a small worker 🧑‍🔧 that handles one task independently.

✅ Example:
A Java program by default has one thread: the main thread.

If you want to do multiple tasks together (e.g., downloading + UI updates), you create extra threads.

proper defination

A thread in Java is the smallest unit of execution within a process. It is a lightweight sub-process that shares the same memory space and system resources with other threads of the same application but can execute independently and concurrently.

🔹 Key Characteristics of Threads:
All threads of the same process share:

Code section

Heap (shared memory)

File descriptors

But each thread has its own:

Program counter

Stack

Local variables

---

🧠 What is Multithreading?
Multithreading = Running multiple threads simultaneously in a single program.

🟢 Example in real-life:
A chef cooking 🍳 while also answering phone calls ☎️ and checking the oven 🔥.

## Each task can run independently, in parallel, by using threads.

🔄 Thread Lifecycle (Detailed)
A thread goes through five main stages:
[New] --> [Runnable] --> [Running] --> [Blocked/Waiting] --> [Terminated]

1. 🟡 New
   Thread is created using Thread t = new Thread(); but not started yet.

2. 🟠 Runnable
   You call start(), and thread is ready to run, but it may wait in a queue if CPU is busy.

3. 🟢 Running
   Thread is now actively executing its run() method.

4. 🔵 Blocked / Waiting / Sleeping
   Thread pauses because:

It’s waiting for another thread (join())

You paused it using sleep()

Waiting for a resource (I/O, file, etc.)

5.  🔴 Terminated
    Thread has finished execution. It dies.

         New
          |
        start()
          |

    Runnable
    |
    (CPU selects it)
    ↓
    Running
    / | \
    sleep wait blocked
    \ | /
    back to Runnable
    ↓
    Terminated

---

🛠️ Ways to Create a Thread
There are 2 standard ways:

🔹 1. By extending Thread class
🔹 2. By implementing Runnable interface

---

1.  ✅ 1. What is the Thread Class?
    The Thread class in Java belongs to the java.lang package and represents a single thread of execution in a program.

When you extend the Thread class, you create a new thread by overriding its run() method.
..
// 3. Important Methods in Thread Class (with Usage)

start() - Begins execution of a thread (calls run() internally)  
run() - Contains the logic that will be executed by the thread  
sleep(ms) - Pauses the thread for a specific time  
join() - Waits for the thread to die (complete)  
yield() - Current thread suggests CPU to let others run  
isAlive() - Returns true if thread is still running  
setName(String) - Sets a custom name for a thread  
getName() - Returns the thread’s name  
setPriority(int) - Sets the thread’s priority (1 to 10)  
getPriority() - Gets the thread's priority  
currentThread() - Static method – returns current executing thread  
interrupt() - Interrupts a sleeping or waiting thread  
isInterrupted() - Checks if the thread was interrupted

---

example->

1. sleep()
   public void run() {
   for(int i = 1; i <= 3; i++) {
   System.out.println("Thread: " + i);
   try {
   Thread.sleep(1000); // sleep for 1 sec
   } catch (InterruptedException e) {
   System.out.println("Interrupted");
   }
   }
   }
   2.join()-(One thread waits for another):

class MyThread extends Thread {
public void run() {
for(int i = 1; i <= 3; i++) {
System.out.println("Thread running: " + i);
}
}
}
public class Main {
public static void main(String[] args) throws InterruptedException {
MyThread t1 = new MyThread();
t1.start();
t1.join(); // Main waits till t1 completes
System.out.println("Main thread continues...");
}
}

3. setPriority() & getPriority()
   Thread priority values range from:

Thread.MIN_PRIORITY = 1

Thread.NORM_PRIORITY = 5 (Default)

Thread.MAX_PRIORITY = 10

t1.setPriority(Thread.MAX_PRIORITY);
System.out.println(t1.getPriority());

⚠️ Java does not guarantee that high-priority threads will run first (depends on OS thread scheduler).

4.  getName() and setName()

Thread t = new MyThread();
t.setName("MahiThread");
System.out.println(t.getName());

5. 🔂 yield()
   Thread.yield() tells the current thread to pause and let other threads execute. It doesn’t guarantee anything but gives a chance to other threads.

Thread.yield(); // Hint to CPU

6. interrupt() and isInterrupted()
   Used to stop a thread that's in sleep() or wait() state.

code-->
t1.interrupt(); // Sends interruption signal

if(Thread.interrupted()) {
System.out.println("Thread was interrupted!");
}

something new..
Advanced Usage: Anonymous Thread
code--
Thread t = new Thread() {
public void run() {
System.out.println("Anonymous thread running...");
}
};
t.start();

---

2. runnable

1️⃣ What is Runnable?
Runnable is a functional interface in Java (has only one method).

It represents a task that can be executed by a thread.

It has a single method:
public void run();

You implement Runnable to define the code that should run in a separate thread.

The thread itself is represented by the Thread class, but the task is represented by a Runnable.

2️⃣ Why use Runnable instead of extending Thread?
Java allows only one class to be extended (single inheritance).

If your class already extends another class, you cannot extend Thread again.

Using Runnable lets your class implement multiple interfaces while still defining thread tasks.

Separates task (Runnable) from thread management (Thread) — better design.

3️⃣ How to use Runnable with Thread?
You create a class that implements Runnable:

code--
class MyTask implements Runnable {
public void run() {
System.out.println("Task is running in thread: " + Thread.currentThread().getName());
}
}

Then you create a Thread passing an instance of your Runnable:

MyTask task = new MyTask();
Thread t = new Thread(task);
t.start();

..
// 5️⃣ Important points about Runnable interface

Runnable interface - Defines task by implementing run() method  
Thread(Runnable r) - Thread runs the Runnable’s run() method  
Same Runnable, multiple threads - You can share one Runnable object across threads  
Separation of concerns - Task vs Thread management are separated  
Use case - Preferred when you want to extend other classes

---

Anonymous Runnable classes:
Writing Runnable without naming the class explicitly.

code--
Thread t = new Thread(new Runnable() {
public void run() {
System.out.println("Anonymous Runnable running");
}
});
t.start();

---

Summary
Thread is about running the task.

Runnable is the task itself.

Runnable allows better design flexibility.

Use Runnable when your class extends another class or for better task separation.

---

Synchronization Simplified
Imagine this:
You and your friend want to use the same notebook to write notes.

If both write at the same time, the notes will get messy.

So, you decide: only one person writes at a time. The other waits until the notebook is free.

This is exactly what synchronization does for threads.

..

What happens in a program without synchronization?
Suppose two threads want to increase a number (say 5) by 1 at the same time:

Thread 1 reads the number (5).

Thread 2 reads the number (5).

Thread 1 adds 1 → 6.

Thread 2 adds 1 → 6.

Both write back 6.

The final result should have been 7, but it’s 6!

This is called a race condition.
../

How to fix? Use synchronization!
Synchronization ensures only one thread can update the number at a time.

---

Why join() is NOT the same as synchronization

What does join() do?
When you call t1.join(), the current thread (e.g., main thread) waits until thread t1 finishes.

It does NOT control how threads run simultaneously or access shared data.

It only pauses the thread calling join() until the target thread completes.

What does synchronization do?
It controls access to shared data/resources between multiple threads running at the same time.

Synchronization ensures only one thread at a time can execute critical sections of code to prevent conflicts or inconsistent data.

So:
Feature... Purpose
synchronization ....Controls access to shared data between threads running simultaneously to avoid conflicts
join()... Pauses the current thread until the target thread completes execution (used for coordination, not data safety)

---

🗣️ Inter-Thread Communication in Java
1️⃣ What is Inter-Thread Communication?
It’s a way for threads to exchange information and coordinate execution.

Often used when one thread needs to wait for another thread to do something before proceeding.

Example: Producer-Consumer problem, where one thread produces data and another consumes it.
..
2️⃣ How is it done in Java?
Java provides three important methods inside Object class for thread communication:

Method Description
wait()..Causes current thread to wait (pause) until notified
notify()..Wakes up one waiting thread
notifyAll()..Wakes up all waiting threads

Important:

These methods must be called inside a synchronized block/method.

The thread calling wait() releases the lock and waits.

The thread calling notify() or notifyAll() wakes waiting threads..

3️⃣ Basic flow of inter-thread communication:
Thread A enters a synchronized block.

Thread A checks a condition; if not met, it calls wait() → releases lock and waits.

Thread B enters synchronized block.

Thread B changes condition and calls notify() or notifyAll().

Thread A wakes up, reacquires lock, and continues execution.
