package CustomLinkedList;

public class OurDoublyLinkedList {
    private Node head;

    class Node 
    {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next,Node prev)
        {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) 
        {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");

        System.out.println("Printing list in reverse : ");
        while (last != null) 
        {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null)
        {
            head.prev = node; 
        }
        head = node;
    }

    public void insertLast(int value)
    {
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        while (last.next != null) 
        {
            last = last.next;
        }

        last.next = node;
        node.next= null;
        node.prev = last;
        last = node;
    }

    public Node find(int value) {
        Node node = head;
        while(node != null)
        {
            if(node.value == value)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int value)
    {
        Node previous = find(after);

        if(previous == null)
        {
            System.out.println("Does not exist ..");
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


}
