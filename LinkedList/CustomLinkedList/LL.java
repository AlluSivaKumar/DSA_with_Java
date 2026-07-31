package CustomLinkedList;
class LL
{
    private Node head;
    private Node tail;
    private int size;

    public LL()
    {
        this.size = 0;
    }

    public class Node
    {
        private int val;
        private Node next;

        public Node(int val)
        {
            this.val = val;
        }

        public Node(int val, Node next)
        {
            this.val = val;
            this.next = next;
        }
    }

    public void display()
    {
        Node temp = head;

        while (temp != null) 
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail ==  null)
        {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val)
    {
        if(tail == null)
        {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int val, int index)
    {
        if(index == 0)
        {
            insertFirst(val);
            return;
        }
        if(index == size)
        {
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);

        temp.next = node;

        size++;
    }

    public int deleteAtFirst()
    {
        int val = head.val;
        head = head.next;
        if(tail == null)
        {
            head = null;
        }
        size--;
        return val;
    }

    //ONE WAY
    /* public int deleteAtLast()
    {
        if(size <= 1)
        {
            deleteAtFirst();
        }
        Node temp = head;
        for(int i=0;i<size-2;i++)
        {
            temp = temp.next;
        }
        temp.next = null;
        int val = tail.val;
        tail = temp;
        size--;
        return val;
    } */


    public Node get(int index)
    {
        Node node = head;
        for(int i=0;i<index;i++)
        {
            node = node.next;
        }
        return node;
    }

    public int deleteAtLast()
    {
        if(size <= 1)
        {
            return deleteAtFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int deleteAt(int index)
    {
        if(index == 0)
        {
            return deleteAtFirst();
        }
        if(index == size)
        {
            return deleteAtLast();
        }

        Node previous = get(index-1);
        int val = previous.next.val;
        previous.next = previous.next.next;

        return val;
    }

    //Finding Node for Given Value
    public Node find(int val)
    {
        Node temp = head;
        while (temp != null)
        {
            if(temp.val == val)
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;//Node not found;a
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(34);
        list.insertFirst(45);
        list.insertFirst(42);

        list.insert(35, 2);
        list.insert(78, 3);

        list.insertLast(23);
        list.insertLast(29);
        list.insertLast(89);

        list.display();
        System.out.println();

        list.deleteAtFirst();
        list.deleteAtLast();
        list.deleteAt(4);
        list.display();
    }
}