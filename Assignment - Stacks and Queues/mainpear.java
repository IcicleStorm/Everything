public class mainpear {
    public static void main (String[] args) {
        System.out.println("It works. (Probably)");
        
        // initialize lists
        ICSStack rocks = new ICSStack();
        ICSQueue tunnel = new ICSQueue();

        // test scenarios for stack - First in, last out
        rocks.push(2);
        rocks.push(3);

        System.out.println("Initial test");
        rocks.debugPrint();

        rocks.pop();

        System.out.println("Remove the last one in (3)");
        rocks.debugPrint();

        rocks.push(5);
        rocks.push(4);
        rocks.push(1);
        rocks.push(3);

        System.out.println("Add new");
        rocks.debugPrint();

        rocks.pop();
        rocks.pop();

        System.out.println("Pop (3 and 1)");
        rocks.debugPrint();

        rocks.clear();

        System.out.println("This should be clear");
        rocks.debugPrint();

        rocks.push(8);

        System.out.println("Place 8");
        rocks.debugPrint();

        // test scenarios for queue - First in, first out

        tunnel.enqueue(12);
        tunnel.enqueue(13);

        System.out.println("Initial test 2");
        tunnel.debugPrint();

        tunnel.dequeue();

        System.out.println("remove the first one in (12)");
        tunnel.debugPrint();

        tunnel.enqueue(15);
        tunnel.enqueue(14);
        tunnel.enqueue(11);
        tunnel.enqueue(12);

        System.out.println("Add new");
        tunnel.debugPrint();

        tunnel.dequeue();
        tunnel.dequeue();

        System.out.println("dequeue (13 and 15)");
        tunnel.debugPrint();

        tunnel.clear();

        System.out.println("This should be clear");
        tunnel.debugPrint();

        tunnel.enqueue(18);

        System.out.println("Place 18");
        tunnel.debugPrint();
    }
}
