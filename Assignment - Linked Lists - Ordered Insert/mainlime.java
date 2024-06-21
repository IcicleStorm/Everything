public class mainlime {

    public static void main(String[] args){

        // Initailize new LinkedList
        LinkedList rocks = new LinkedList();

        // initalize number generator variables
        int t = 0;
        int a;

        // Generate nodes
        while(t < 10){
            a = (int)(Math.random() * 21) - 10;
            System.out.print(a + ", ");
            rocks.insert(a);
            t++;
        }
        // line to buffer data
        System.out.println();

        
        // Use print function to view nodes from least to greatest
        rocks.debugPrint();

    }
}