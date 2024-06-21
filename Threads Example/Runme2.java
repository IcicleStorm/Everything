public class Runme2 implements Runnable {
  int count;

  public Runme2(Util u) {
    this.count = u.count2;
  }

  public void run() {
    while (count <= 8) {
      System.out.println("Thread 2: " + this.count);
      this.count++;

      try {
        Thread.sleep(3500);
      } catch (Exception e) {
        System.out.println("Unable to sleep");
      }
    }
  }
}