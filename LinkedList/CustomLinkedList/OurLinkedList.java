package CustomLinkedList;

public class OurLinkedList 
{
    //DECLARATIONS
    private Node head;
    private Node tail;
    private int size;

    //CONSTRUCTOR
    public OurLinkedList() 
    {
        this.size = 0;
    }

    //DEFAULT SIZE WILL BE TAKEN AS 0
    public int size()
    {
        return this.size;
    }

    //INSERT AT FIRST INDEX
    public void insertFirst(int value)
    {
        //CREATING A NODE 
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }

        //WE ADD ONE NODE SO WE INCREASING THE SIZE BY 1
        size += 1;
    }

    public void insertLast(int value)
    {
        if(tail == null)
        {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }


    //INSERTION AT PARTICULAR INDEX
    public void insert(int value,int index) {
        if(index == 0)
        {
            insertFirst(value);
            return;
        }
        if(index == size)
        {
            insertLast(value);
            return;
        }

        Node temp = head;

        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }

        //CREATING A NODE
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }

    //Code to return any node at a given index 
    public Node get(int index)
    {
        Node node = head;
        for(int i=0;i<index;i++)
        {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast() {
        if(size <= 1) 
        {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int value = secondLast.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public int delete(int index) {
        if(index == 0)
        {
            return deleteFirst();
        }
        if(index == size-1)
        {
            return deleteLast();
        }

        Node previous = get(index-1);
        int value = previous.next.value;
        previous.next = previous.next.next;
        return value;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) 
        {
            if(node.value == value)
            {
                return node;
            }
            else
            {
                node = node.next;
            }
        }
        return null;
    }

    public void insertRec(int value,int index)
    {
        head = insertRec(value,index,head);
    }

    private Node insertRec(int value,int index,Node node) {
        if(index == 0)
        {
            Node temp = new Node(value,node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index - 1, node.next);
        return node;
    }

    /* private Node insertRec(int value, int index, Node node) {
        if (index == 0) {
            size++;
            return new Node(value, node);
        }
        node.next = insertRec(value, index - 1, node.next);
        return node;
    } */

    private class Node 
    {
        private int value;
        private Node next;

        public Node(int value) 
        {
            this.value = value;
        }

        //this constructor works for the node value and next node
        public Node(int value, Node next) 
        {
            this.value = value;
            this.next = next;
        }
    }

    public void display()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }
}
