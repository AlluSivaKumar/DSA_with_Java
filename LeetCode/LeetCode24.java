package LeetCode;

//import LeetCode.LeetCode83.ListNode;

public class LeetCode24 
{
    public class ListNode 
    {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public static ListNode swapPairs(ListNode head) 
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;
        ListNode prev = null;

        head = second;

        while (first != null  && first.next != null) 
        {
            second = first.next;
            ListNode nextPair = second.next;

            second.next = first;
            first.next = nextPair;

            if(prev != null)
            {
                prev.next = second;
            }

            prev = first;
            first = nextPair;
        }

        return head;
        
    }

    public static void main(String[] args) {
        
    }
    
}
