public class ICSQueue {
  public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int d) {
      super();
      this.data = d;
      this.prev = null;
      this.next = null;
    }
  }

  Node tail;
  Node head;
  
  public ICSQueue() {
    super();
    tail = null;
    head = null;
  }
  
  //
  // inserts a new node to the front of the linked list
  //
  public void enqueue(int d) {
    // first, we create the new node
    Node newNode = new Node(d);

    // now check if the list has been started yet
    if (this.tail == null) {
      // this is the first element in the list,
      // set the tail & head nodes
      this.tail = newNode;
      this.head = newNode;
    } else {
      // list already exists, so move the tail to new node and link
      // the new node's prev to the current tail and link the tail's next to the new node.
      // this puts the newest node in the back of the queue
      this.tail.next = newNode;
      newNode.prev = this.tail;
      this.tail = newNode;
    }
  }

  public void dequeue() {
    // move head down the line then point the head's prev to null 
    // this removes the node at the front
    this.head = this.head.next;
    this.head.prev = null;
  }

  public void clear() {
    // reset the queue
    this.tail = null;
    this.head = null;
  }

  //
  // traverse the linked list and output the data
  //
  public void debugPrint() {
    Node curNode = this.head;

    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.next;
    }

    System.out.println("||||||||||||||||||");
  }
}