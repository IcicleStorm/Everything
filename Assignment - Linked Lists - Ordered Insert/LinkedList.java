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
 
  public LinkedList() {
    super();
    head = null;
  }
 
  //
  // inserts a new node to the front of the linked list
  //
  public void insert(int d) {
    // first, we create the new node
    Node newNode = new Node(d);
    Node checkNode = this.head;
    Node prevNode = this.head;
    int i = 0;




    // now check if the list has been started yet
    if (this.head == null) {
      // this is the first element in the list,
      // set the head node
      this.head = newNode;
    } else {
      // list already exists, so move the head to the larger number
      if(newNode.data <= checkNode.data) {
        newNode.next = this.head;
        this.head = newNode;
      } else {
        // traverse the list until the new node is small than the next node
        while (checkNode.data <= newNode.data) {
        // if the next node is null, insert the new node at the end of the list
          if (checkNode.next != null) {
            checkNode = checkNode.next;
            if (i == 1) {
              prevNode = prevNode.next;
            }
            i = 1;
          } else {
            break;
          }
         
        }
        // checks if the checkNode's data is higher than the new node's data
        if (checkNode.data > newNode.data) {
          // if the new data is lower, connect the nodes in between the node just above it and the node that was previously before it.
          prevNode.next = newNode;
          newNode.next = checkNode;
        } else {
          // If the newNode's data is higher then the checkNode's data, the new node has the highest data, so it'll be placed at the end.
          checkNode.next = newNode;
          newNode.next = null;
        }
       
      }
    }
  }


  int printNo = 0;


  //
  // traverse the linked list and output the data
  //
  public void debugPrint() {
    Node curNode = this.head;


    while (curNode != null) {
      System.out.println(curNode.data);
      curNode = curNode.next;
      printNo++;
    }


    System.out.println("Done");
  }
}

