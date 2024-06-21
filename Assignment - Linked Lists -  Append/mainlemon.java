public class mainlemon {
    
    public static void main(String[] args){

      // Instantiate new LinkedList
      LinkedList rocks = new LinkedList();

        // initalize number generator variables
        int t = 0;
        int a;
        int b;

        // Generate nodes
        while(t < 10){
          // There is a 50% chance to insert a node and a 50% chance to append a node.
          b = (int)(Math.random() * 2);
            if (b == 1){
              a = (int)(Math.random() * 10);
              // prints i for insert
              System.out.print(a + "i, ");
              rocks.insert(a);
            }

            if (b == 0){
              a = (int)(Math.random() * 10);
              // prints a for append
              System.out.print(a + "a, ");
              rocks.append(a);
            }
            t++;
          }
        // line to buffer data
        System.out.println();      


      // Print
      rocks.debugPrint();
    }


}