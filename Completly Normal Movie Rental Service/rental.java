public class rental {
  public class Node {
    String data;
    Node next;
    

    public Node(String d) {
      super();
      this.data = d;
      this.next = null;
    }
  }

  Node head;
  String name;
  Node ownerNode = new Node("nobody, it is available to sign out.");
  
  public rental(String name) {
    super();
    this.name = name;
    head = ownerNode;
  }
  
  //
  // inserts a new node to the front of the linked list
  //
  public void push(String d) {
    // first, we create the new node
    Node newNode = new Node(d);
      // move the head to new node and link
      // the new node's next to the current head
      newNode.next = this.head;
      this.head = newNode;
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

  public String toString() {
    return this.name + " is currently signed out to " + this.head.data;
  }

  public void debugPrint() {
    Node curNode = this.head;

    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.next;
    }

    System.out.println("||||||||||||||||||");
  }
}