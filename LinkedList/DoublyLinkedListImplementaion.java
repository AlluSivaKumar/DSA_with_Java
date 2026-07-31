public class DoublyLinkedListImplementaion 
{
    //Constructor
    public DoublyLinkedListImplementaion()
    {

    }

    private Node head;

    //Node class
    class Node
    {
        int value;
        Node next;
        Node prev;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value,Node next,Node prev)
        {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    //INSERT AT FIRST
    public void inserAtFirst(int value)
    {
        Node node = new Node(value);

        if(head != null)
        {
            
            head.prev = node;
        }

        node.next = head;
        node.prev = null;
        head = node;
    }

    public void display()
    {
        Node node = head;
        Node last = null;

        while (node != null)
        {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");

        System.out.println();

        while (last != null) 
        {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }

    //INSERT AT LAST
    public void insertAtLast(int value)
    {
        Node node = new Node(value);
        node.next = null;

        if(head == null)
        {
            node.prev = null;
            head = node;
            return;
        }

        Node last = head;
        while (last.next != null)
        {
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public static void main(String[] args) 
    {
        DoublyLinkedListImplementaion list = new DoublyLinkedListImplementaion();
        list.inserAtFirst(34);
        list.inserAtFirst(12);
        list.inserAtFirst(14);

        list.display();
    }
}
