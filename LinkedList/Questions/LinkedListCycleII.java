package Questions;

public class LinkedListCycleII 
{
    class ListNode 
    {
        int val;
        ListNode next;
        ListNode(int x) 
        {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) 
    {
        int cycleLength =  lengthOfCycle(head);

        if(cycleLength == 0)
        {
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        while (cycleLength > 0)
        {
            second = second.next;
            cycleLength--;
        }

        while (first != second)
        {
            first = first.next;
            second = second.next;
        }

        return first;

    }

    public int lengthOfCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                int length = 0;
                do
                {
                    slow = slow.next;
                    length++;
                } while(fast != slow);
                return length;
            }
        }
        return 0;
    }
}
