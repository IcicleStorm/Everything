public class LinkedList {
  public class Node {
    int data;
    Node next;
    Node prev;

    public Node(int d) {
      super();
      this.data = d;
      this.next = null;
      this.prev = null;
    }
  }

  Node head;
  
  public LinkedList() {
    super();
    head = null;
  }
  
  
  // inserts a new node to the front of the linked list
  //
  public void insert(int d) {
    // first, we create the new node
    Node newNode = new Node(d);

    // now check if the has been started yet
    if (this.head == null) {
      // this is the first element in the list,
      // set the head node
      this.head = newNode;
    } else {
      // list already exists, so move the head to new node and link
      // the new node's next to the current head, also link the current head to 
      // the new node with the its prev so it can be linked in both directions. (this occurs in reverse order)
      this.head.prev = newNode;
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  //
  // traverse the linked list and output the data
  //
  public void debugPrint() {
    Node curNode = this.head;

    while (curNode.next != null) {
      System.out.println(curNode.data);
      curNode = curNode.next; 
    }

    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.prev;
    }

    System.out.println("Done");
  }
}