public class Runme1 extends Thread {
  int count;
  Util util;

  public Runme1(Util u) {
    this.count = u.count1;
    this.util = u;
  }

  public void run() {
    while (count <= 10) {
      System.out.println("Thread 1: " + this.count);
      this.count++;

      //if (count == 3) {
      //  throw new RuntimeException();
      //}

      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println("Unable to sleep");
      }
    }
  }
}