package CustomLinkedList;

public class DoubleLinkedList 
{
    public Node head;
    public Node tail;
    //public Node prev;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

        /* public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        } */
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("End");

        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public Node getByIndex(int index) {
        Node temp = head;
        for(int i=0;i<index;i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if(head != null) {
            head.prev =  node;
        }
        head = node;
    }

    public void insertLast(int value) {
        Node node = new Node(value);

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }


    public void insert(int value, int index) {
        Node previous = getByIndex(index-1);
        if(previous == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(value);
        node.next = previous.next;
        previous.next = node;
        node.prev = previous;
        if(node.next != null) {
            node.next.prev = node;
        }
    }


    public static void main(String[] args) 
    {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(78);
        list.insertFirst(65);
        list.insertFirst(34);

        list.insertLast(75);
        list.insertLast(43);

        list.insert(9, 3);

        list.display();
    }
}
