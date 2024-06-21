
// class is unfinished
public class Timer extends Thread {

    numOutput out;

    public void run() {
        while(true) {
            try{
            sleep(1000);
            } catch (Exception e) {
                System.out.println("Can't sleep");
            }
            System.out.println("IT WORKS");
        }
    }


}