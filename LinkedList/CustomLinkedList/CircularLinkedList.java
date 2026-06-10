package CustomLinkedList;

public class CircularLinkedList 
{
    Node head;
    Node tail;

    public CircularLinkedList() {
        //By Default
        this.head = null;
        this.tail = null;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node temp = head;

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        } while(temp != head);
        System.out.println("Head");
    }

    public void delete(int val) {
        Node node = head;
        if(node == null){
            return;
        }

        if(node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if(n.value == val) {
                node.next = n.next;
                break;
            }
        }while(node != head);
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(67);
        list.insert(45);
        list.insert(56);
        list.insert(34);
        list.delete(45);
        list.display();
    }
}
