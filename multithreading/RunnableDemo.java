package multithreading;

class MyRunnable implements Runnable {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println(Thread.currentThread().getName() + " → Count: " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(Thread.currentThread().getName() + " interrupted!");
        return;
      }
    }
    System.out.println(Thread.currentThread().getName() + " finished.");
  }
}

public class RunnableDemo {
  public static void main(String[] args) {
    MyRunnable runnableTask = new MyRunnable();

    Thread thread1 = new Thread(runnableTask, "Runnable-1");
    Thread thread2 = new Thread(runnableTask, "Runnable-2");

    thread1.start();
    thread2.start();
  }
}
