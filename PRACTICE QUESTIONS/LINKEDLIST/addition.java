public class addition {
    public static class Node{
        int data;
        Node next;
        
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public static Node head;
public static Node tail;

public void addFirst(int data){
    // create a new node
    Node newNode = new Node(data);
    if(head==null){
        head = tail = newNode;
        return;
    }
    // newnode next = head
    newNode.next  = head; //link
    // head value new node
    head = newNode;

}
public void addLast(int data){
    //create a new node
    Node newNode = new Node(data);
    if(head==null){
      head = tail = newNode;
    }
    // linking previous tail to newnode
    tail.next = newNode;
    // tail will be now the newnode
    tail = newNode;
    
}
public void print(){
    if(head==null){
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+ " ");
        temp = temp.next;
    }
    System.out.println();
}
public static void main(String[] args) {
        addition ll = new addition();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
}
}