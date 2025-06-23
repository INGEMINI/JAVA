class Counter {
  private int count = 0;

  public synchronized void increment() {
    count++;
  }

  public int getCount() {
    return count;
  }
}

class MyTask implements Runnable {
  Counter counter;

  MyTask(Counter counter) {
    this.counter = counter;
  }

  public void run() {
    for (int i = 0; i < 1000; i++) {
      counter.increment();
    }
  }
}

public class SyncExample {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    // Create tasks
    MyTask task1 = new MyTask(counter);
    MyTask task2 = new MyTask(counter);

    // Create threads
    Thread t1 = new Thread(task1);
    Thread t2 = new Thread(task2);

    // Start threads
    t1.start();
    t2.start();

    // Wait for both to finish
    t1.join();
    t2.join();

    // Show result
    System.out.println("Final count: " + counter.getCount());
  }
}
