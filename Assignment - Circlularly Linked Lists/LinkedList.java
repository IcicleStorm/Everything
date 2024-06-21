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
  Node staticHead;
  
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

      // set another head that only ever points to the first node 
      this.staticHead = newNode;
      
      // this will point the first node to itself so it can be looped
      this.staticHead.next = newNode;
      this.head.prev = this.staticHead;
    } else {
      // list already exists, so link the new node to the first and last nodes
      this.head.prev = newNode;
      newNode.next = this.head;
      this.head = newNode;  
      newNode.next.prev = newNode;

      // point the firsts node's next to the newest node
      this.staticHead.next = newNode;
      // setting the new head's prev to the first node
      this.head.prev = this.staticHead;
    }
  }

  // traverse the linked list and output the data
  //
  public void debugPrint() {
    Node curNode = this.head;
    int loops = 0;
    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.next;
      if (curNode == this.staticHead.next) {
          if(loops == 8) {
            loops = 0;
            break;                
          }
        loops++;
      }
    }
    System.out.println("prev");
    curNode = this.staticHead;
    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.prev;
      if (curNode == this.staticHead) {
          if(loops == 8) {
            loops = 0;
            break;                
          }
        loops++;
      }
    }

    System.out.println("Done");
  }

}