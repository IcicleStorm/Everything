public class ICSStack {
  public class Node {
    int data;
    Node next;

    public Node(int d) {
      super();
      this.data = d;
      this.next = null;
    }
  }

  Node head;
  
  public ICSStack() {
    super();
    head = null;
  }
  
  //
  // inserts a new node to the front of the linked list
  //
  public void push(int d) {
    // first, we create the new node
    Node newNode = new Node(d);

    // now check if the list has been started yet
    if (this.head == null) {
      // this is the first element in the list,
      // set the head node
      this.head = newNode;
    } else {
      // list already exists, so move the head to new node and link
      // the new node's next to the current head
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  public void pop() {
    // move the head down the list to remove the node on top
    this.head = this.head.next;
  }

  public void clear() {
    // reset the list to original state
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