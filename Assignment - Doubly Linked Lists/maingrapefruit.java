public class maingrapefruit {
    public static void main(String[] args) {

        // Buffer Line
        System.out.println("buffer line");
        
        // Create new list

        LinkedList palindrome = new LinkedList();

        // Insert Nodes

        palindrome.insert(1);
        palindrome.insert(3);
        palindrome.insert(9);
        palindrome.insert(27);

        // Run print function

        palindrome.debugPrint();

    }
}