package Questions;

public class LLHasCycle 
{
    @SuppressWarnings("unused")
    private Node head;
    @SuppressWarnings("unused")
    private Node tail;
    @SuppressWarnings("unused")
    private int size;

    LLHasCycle() 
    {
        this.size = 0;
    }

    public class Node 
    {
        @SuppressWarnings("unused")
        private int value;
        private Node next;

        public Node() { }
        
        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
    
    static boolean hasCycle(Node head)
    {
        //Using two pointers method fast and slow
        //fast moves two nodes ahead and slow moves one node ahead
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) 
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                return true;
            }
        }
        return false;
    }

    static int cycleLength(Node head)
    {
        //Using two pointers method fast and slow
        //fast moves two nodes ahead and slow moves one node ahead
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) 
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                @SuppressWarnings("unused")
                int length = 0;
                Node temp = slow;
                do 
                {
                    temp = temp.next;
                    length++;
                }
                while(temp != slow);
            }
        }
        return 0;
    }


    @SuppressWarnings("null")
    static Node Middle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
