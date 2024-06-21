public class LinkedList {
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
  Node tail;
  
  public LinkedList() {
    super();
    head = null;
    tail = null;

  }
  
  //
  // inserts a new node to the front of the linked list
  //
  public void insert(int d) {
    // first, we create the new node
    Node newNode = new Node(d);

    // now check if the has been started yet
    if (this.head == null) {
      // this is the first element in the list,
      // set the head & tail nodes
      this.head = newNode;
      this.tail = newNode;
    } else {
      // list already exists, so move the head to new node and link
      // the new node's next to the current head
      newNode.next = this.head;
      this.head = newNode;
    }
  }

  public void append(int d) {
    Node newNode = new Node(d);
    
    if (this.head == null) {
      // this is the first element in the list,
      // set the head node
      this.head = newNode;
      this.tail = newNode;
     } else {
      // list already exists, so link the new node
      this.tail.next = newNode; 
      this.tail = newNode;
    }
  }
  int t = 0;

  //
  // traverse the linked list and output the data
  //
  public void debugPrint() {
    Node curNode = this.head;

    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.next;
      t++;
    }

    System.out.println("Numbers Printed: "+t);
  }
}