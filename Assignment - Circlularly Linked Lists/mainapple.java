public class mainapple {
    public static void main(String[] args) {
        System.out.println("I ran out of citrus");
        System.out.println();

        // Create a linked list
        LinkedList rocks = new LinkedList();

        // Insert nodes
        rocks.insert(0);
        rocks.insert(1);
        rocks.insert(2);
        rocks.insert(3);
        rocks.insert(4);

        // Print values
        rocks.debugPrint();

    }
}