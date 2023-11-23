package CommonDataStructuresAndAlgorithms;

public class LinkedListExercise {
    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    static Node head = null; //it's the first element
    Node tail = null;//last element

    public void addNodeAtTheEnd(int val){
        Node newNode = new Node(val);
        if(head==null){
            //if there are no existing elements
            // in the list then head and tail is the same
            head = newNode;
            tail = newNode;
        }
        //here insert the first element
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
    }

    public void addNodeAtIndex(int val, int index){
        int count = 1;
        Node current = head;
        while(current != null && count != index-1)
        {
            current = current.next;
            count++;
        }
        Node newNode = new Node(val);
        Node temp= current.next;
        current.next =newNode;
        newNode.next = temp;
    }

    public void deleteNodeAtTheEnd(){

        Node current = head;
        while(current.next.next!= null){
            current = current.next;
        }
        current.next=null;
        tail = current;
    }

    public void deleteFirstNode(){
        head=head.next; //assign second node back to head, changed pointer
    }

    public void deleteNodeAtSpecificIndex(int val, int index){
        Node current = head;
        int count = 1;
        while (current!=null && count==index-1){
            current = current.next;
            count++;
        }
        current.next= current.next.next;

    }

    public void reverseLinkedList(){
        Node next = null;
        Node prev = null;
        Node curr = head;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        printLinkedList(prev);
    }

    public static void printLinkedList(Node headNode){
        Node current = headNode;
        while(current!=null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static void main(String[] args){
        LinkedListExercise l = new LinkedListExercise();
        l.addNodeAtTheEnd(10);
        l.addNodeAtTheEnd(20);
        l.addNodeAtTheEnd(30);
        l.addNodeAtTheEnd(40);
        System.out.println("Print original list");
        printLinkedList(head);

        System.out.println("Add node at give index");
        l.addNodeAtIndex(75,3);
        printLinkedList(head);

        System.out.println("Delete element at the end of the list");
        l.deleteNodeAtTheEnd();
        printLinkedList(head);

        System.out.println("Delete first element form the list");
        l.deleteFirstNode();
        printLinkedList(head);

        System.out.println("delete node at specific index(75,1)");
        l.deleteNodeAtSpecificIndex(75,1);
        printLinkedList(head);

        System.out.println("Existing list reversed");
        l.reverseLinkedList();

    }

}
