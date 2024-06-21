public class Main { 
  public static void main(String[] args) {   
    Util u = new Util();
    
    Runme1 r1 = new Runme1(u);
    Thread t1 = new Thread(r1);
    t1.start();

    Runme2 r2 = new Runme2(u);
    Thread t2 = new Thread(r2);
    t2.start();

    
  }
}