package multithreading;

class MyThread extends Thread {

  public void run() {
    System.out.println("\n[INFO] Thread Started: " + Thread.currentThread().getName());

    // Demonstrate sleep()
    for (int i = 1; i <= 3; i++) {
      System.out.println(Thread.currentThread().getName() + " → Count: " + i);
      try {
        Thread.sleep(1000); // Sleep for 1 second
      } catch (InterruptedException e) {
        System.out.println(Thread.currentThread().getName() + " was interrupted!");
        return;
      }
    }

    // Demonstrate yield()
    if (Thread.currentThread().getName().equals("Worker-1")) {
      System.out.println(Thread.currentThread().getName() + " yielding CPU...");
      Thread.yield(); // Hint to let other threads run
    }

    System.out.println("[INFO] Thread Ending: " + Thread.currentThread().getName());
  }
}

public class ThreadDemoAllFeatures {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Main thread: " + Thread.currentThread().getName());

    // Create two threads
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();

    // Set custom names
    t1.setName("Worker-1");
    t2.setName("Worker-2");

    // Set priorities
    t1.setPriority(Thread.MAX_PRIORITY); // 10
    t2.setPriority(Thread.MIN_PRIORITY); // 1

    // Print names and priorities
    System.out.println(t1.getName() + " Priority: " + t1.getPriority());
    System.out.println(t2.getName() + " Priority: " + t2.getPriority());

    // Start threads
    t1.start();
    t2.start();

    // Check if thread is alive
    System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
    System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

    // Join: wait for t1 and t2 to finish
    t1.join();
    t2.join();

    // After join
    System.out.println("\nBack to Main thread.");
    System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
    System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

    // Testing interrupt on sleeping thread
    MyThread t3 = new MyThread();
    t3.setName("InterruptibleThread");
    t3.start();
    Thread.sleep(1500); // Let it run a bit
    t3.interrupt(); // Interrupt it

    // Wait for t3 to end
    t3.join();

    System.out.println("Main thread ending.");
  }
}
