package Questions;

/**
 * ReorderList
 */
public class ReorderList {
    public class ListNode 
    {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void reorderList(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return;
        }

        ListNode middle = getMiddle(head);
        ListNode headSecond = middle.next;
        
        middle.next = null;

        headSecond = reverseList(headSecond);

        ListNode headFirst = head;

        while (headFirst != null && headSecond != null)
        {
            ListNode temp1 = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp1;

            temp2 = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp2;
        }

        /* if(headFirst != null)
        {
            headFirst.next = null;
        } */
    }

    public static ListNode getMiddle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode revListNode(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while (pres != null) 
        {
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null)
            {
                next = next.next;
            }
        }

        return prev;
    }
}