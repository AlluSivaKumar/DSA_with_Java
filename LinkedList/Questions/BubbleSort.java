package Questions;

class BubbleSort 
{
    private  Node head;
    private  Node tail;
    private  int size = 0;

    public int size() 
    {
        return this.size;
    }

    class Node 
    {
        int value;
        Node next;

        public Node(int value) 
        {
            this.value = value;
        }
    }

    public Node get(int index)
    {
        Node node = head;
        for(int i=0;i<index;i++)
        {
            node = node.next;
        }
        return node;
    }

    public void insertAtFirst(int value)
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
    
    public void bubbleSort()
    {
        bubbleSort(size-1,0);
    }

    public void bubbleSort(int row,int col)
    {
        if(row == 0)
        {
            return;
        }

        if(col < row)
        {
            Node first = get(col);
            Node second = get(col+1);

            if(first.value > second.value)
            {
                if (first == head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail)
                {
                    Node prev = get(col-1);
                    prev.next =second;
                    tail = first;
                    second.next = tail;
                    first.next = null;
                }
                else
                {
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row,col+1);
        }
        else
        {
            bubbleSort(row-1,0);
        }
    }

    public void printList() 
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        BubbleSort list = new BubbleSort();

        list.insertAtFirst(5);
        list.insertAtFirst(3);
        list.insertAtFirst(8);
        list.insertAtFirst(1);
        list.insertAtFirst(4);

        System.out.println("Before sorting:");
        System.out.println(list);//Questions.BubbleSort@28a418fc
        list.printList();

        list.bubbleSort();

        System.out.println("After sorting:");
        list.printList();

    }
}