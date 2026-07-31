public class CircularLinkedListImplementation 
{
    //CONSTRUCTOR
    public CircularLinkedListImplementation()
    {
        size = 0;
    }

    //NODE CLASS
    class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    //HEAD and TAIL DECLARATION
    Node head = null;
    Node tail = null;
    int size = 0;

    //INSERT AT FIRST 
    public void inserAtFirst(int value) 
    {
        Node node = new Node(value); 
        if(head == null) 
        { 
            head = node; 
            tail = node;
            tail.next = null; 
            size++;
            return; 
        } 
        node.next = head; 
        head = node; 
        tail.next = head;
        size++;
    }

    //To DISPLAY
    public void display()
    {
        if(head == null)
        {
            System.out.println("List is Empty.");
            return;
        }

        Node node = head;
        
        do
        {
            System.out.print(node.value + " -> ");
            node = node.next;
        }while(node != head);

        System.out.println("Head");
    }

    //DELETE A PARTICULAR VALUE
    public void delete(int value)
    {
        Node node = head;
        if(node == null)
        {
            return;
        }

        if(node.value == value)
        {
            head = head.next;
            tail.next = head;
            return;
        }

        do
        {
            Node n = node.next;
            if(n.value == value)
            {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while(node != head);
    }

    public static void main(String[] args) 
    {
        CircularLinkedListImplementation list = new CircularLinkedListImplementation();
        list.inserAtFirst(56);
        list.inserAtFirst(67);
        list.inserAtFirst(57);
        list.inserAtFirst(89);
        list.delete(67);
        list.display();
        
    }
}
