package multithreading;

// Shared resource: Only one item can be present at a time
class Data {
  private int value;
  private boolean available = false;

  // Method to produce a value (add a cookie)
  public synchronized void produce(int val) throws InterruptedException {
    while (available) {
      wait(); // Wait if cookie already exists
    }
    value = val;
    available = true;
    System.out.println("Produced: " + val);
    notify(); // Notify consumer
  }

  // Method to consume a value (eat the cookie)
  public synchronized int consume() throws InterruptedException {
    while (!available) {
      wait(); // Wait if no cookie is available
    }
    System.out.println("Consumed: " + value);
    available = false;
    notify(); // Notify producer
    return value;
  }
}

// Producer class (runs on its own thread)
class Producer extends Thread {
  private Data data;

  public Producer(Data data) {
    this.data = data;
  }

  public void run() {
    int val = 1;
    try {
      while (val <= 10) {
        data.produce(val);
        val++;
        Thread.sleep(500); // Sleep after producing
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

// Consumer class (runs on its own thread)
class Consumer extends Thread {
  private Data data;

  public Consumer(Data data) {
    this.data = data;
  }

  public void run() {
    int count = 0;
    try {
      while (count < 10) {
        data.consume();
        count++;
        Thread.sleep(700); // Sleep after consuming
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

// Main class to start the producer and consumer
public class ProducerConsumerDemo {
  public static void main(String[] args) {
    Data data = new Data(); // Shared resource

    Producer producer = new Producer(data);
    Consumer consumer = new Consumer(data);

    producer.start(); // Start producer thread
    consumer.start(); // Start consumer thread
  }
}
