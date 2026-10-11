package LeetCode;

/*
 * LeetCode61
 */
public class LeetCode61 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null || head.next == null || k == 0) 
        {
            return head;
        }
        
        int size = 0;
        ListNode temp = head;
        

        while (temp != null)
        {
            size++;
            temp = temp.next;
        }

        int rotations = k % size;

        if(rotations == 0)
        {
            return head;
        }

        ListNode prev = null;
        ListNode pres = head;

        for(int i=0;i<size-rotations;i++)
        {
            prev = pres;
            pres = pres.next;
        }

        prev.next = null;

        ListNode tail = pres;

        while (tail.next != null) 
        {
            tail = tail.next;
        }

        /* while (head.next != null) 
        {
            ans.next = head;
            head = head.next;
        } */
       tail.next = head;

        return pres;
    }
}