public class LinkedListImplementaion 
{

    public Node head;
    public Node tail;
    public int size;

    //Constructor
    public LinkedListImplementaion()
    {
        this.size = 0;
    }

    //Node Class
    public class Node
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

    //INSERT AT FIRST PLACE
    public void inserAtFirst(int value)
    {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size++;
    }

    //INSERT AT LAST
    public void insertAtLast(int value)
    {
        if(tail == null)
        {
            inserAtFirst(value);
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        tail.next = null;
        size++;
    }

    //INSERT USING RECURSION
    public void insertUsingRecursion(int value, int index)
    {
        head = insertUsingRecursion(value, index, head);
    }

    public Node insertUsingRecursion(int value,int index, Node node)
    {
        if(index == 0)
        {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        insertUsingRecursion(value, index--, node.next);
        return node;
    }

    //INSERT ELEMENT AT PARTICULAR INDEX
    public void insert(int index,int Value)
    {
        if(index == 0)
        {
            inserAtFirst(Value);
            return;
        }

        if(index == size)
        {
            insertAtLast(Value);
            return;
        }

        Node temp = head;
        for(int i=1;i<i;i++)
        {
            temp = temp.next;
        }
        Node node = new Node(Value , temp.next);
        temp.next = node;
        size++;
    }

    //DELETE AT FIRST
    public int deleteAtFirst()
    {
        int value = head.value;

        head = head.next;
        if(head == null)
        {
            tail = null; 
        }

        size--;

        return value;
    }

    //TO GET NODE AT PARTICULAR INDEX
    public Node get(int index)
    {
        Node temp = head;

        for(int i=0;i<index;i++)
        {
            temp = temp.next;
        }

        return temp;
    }

    //DELETE AT LAST INDEX
    public int deleteAtLast()
    {
        if(size <= 1)
        {
            deleteAtFirst();
        }
        Node secondLast = get(size-2);

        int value = tail.value;

        tail = secondLast;
        tail.next = null;
        size--;

        return value;
    }

    //DELETE AT PARTICULAR INDEX
    public int delete(int index)
    {
        if(index == 0)
        {
            deleteAtFirst();
        }

        if(index == size-1)
        {
            deleteAtLast();
        }

        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        size--;

        return value;
    }

    //FIND FIRST NODE TO A GIVEN VALUE
    public Node find(int value)
    {
        Node node = head;
        while (node != null)
        {
            if(node.value == value)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    //DISPLAY THE LIST
    public void display()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }


    public static void main(String[] args) {
        LinkedListImplementaion list = new LinkedListImplementaion();
        list.inserAtFirst(34);
        list.inserAtFirst(84);        
        list.inserAtFirst(27);

        list.insertAtLast(45);
        list.insertAtLast(23);
        list.insertAtLast(98);

        list.insert(26,3);
        list.insert(45,5);

        list.display();
        System.out.println(list.deleteAtFirst());
        System.out.println(list.deleteAtLast());
        System.out.println(list.delete(2));

        list.display();
    }
}
