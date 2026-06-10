package Questions;

public class Solution 
{
    public ListNode head;
    private ListNode tail;
    private int size;

    public Solution() {
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    class ListNode
    {
        int value;
        ListNode next;

        public ListNode(int value)
        {
            this.value = value;
        }

        public ListNode(int value,ListNode next)
        {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) 
    {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size++;
    }

    public void display() 
    {
        ListNode temp = head;
        while (temp != null) 
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void deleteDuplicates()
    {
        ListNode temp = head;
        while (temp != null && temp.next != null) 
        {
            if(temp.value == temp.next.value)
            {
                temp.next = temp.next.next;
                size--;
            }
            else
            {
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null)
        {
            return head;
        }

        ListNode temp = head;
        while (head.next != null) 
        {
            if(head.value == head.next.value)
            {
                head.next = head.next.next;
            }
            else
            {
                head = head.next;
            }
        }
        return temp;
    }

    public static void main(String[] args) 
    {
        Solution list = new Solution();

        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(4);                
        list.insertFirst(2);
        list.insertFirst(2);
        list.display();
        list.deleteDuplicates();
        list.display();

        

    }
}
