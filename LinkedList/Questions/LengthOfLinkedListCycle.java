package Questions;

public class LengthOfLinkedListCycle 
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
                int count = 0;
                do
                {
                    count++;
                    slow = slow.next;
                } while(slow != fast);

                return count;
            }
        }
        return 0;
    }
}
