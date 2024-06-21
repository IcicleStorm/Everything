import java.net.Socket;

public class DataReceiver extends Thread {
    // Use UDP (#29, 4:30) to Reciv text to server.
    private Socket connector;
    int i = 0;
    
    // Constructor
    public DataReceiver(Socket sock) {
        connector = sock;
    }

    public void run() {
        while(true) {
            // the thread sleeps for 2 seconds
            i++;
            try { 
                Thread.sleep(2000);
            } catch (Exception e) { 
                System.out.println("sleep error");
            }
            // print
            System.out.println(GUI.);
            
        }
    }
    

}

