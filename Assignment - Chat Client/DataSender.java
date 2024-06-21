import java.net.Socket;

public class DataSender extends Thread {
    // Use UDP (#29, 4:30) to send text to server.
    private Socket connector;
    int i = 0;
    String tempString;
    
    // Constructor
    public DataSender(Socket sock) {
        connector = sock;
        
    }

    public void run() {
        while(true) {
            // the thread sleeps for 1 second
            try { 
                Thread.sleep(1000);
            } catch (Exception e) { 
                System.out.println("sleep error");
            }
            // print
            tempString = GUI.returnOutput();
            System.out.println();
            // Check for output, take & send output, reset output and only send if output is blank
            i++;

        }
    }
    

}
