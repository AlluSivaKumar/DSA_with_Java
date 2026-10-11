package Questions;

import java.util.List;

/**
 * ReverseALinkedListFromCertainIndexToIndex
 */
public class ReverseALinkedListFromCertainIndexToIndex 
{
    class ListNode
    {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) {this.val = val;} 
        public ListNode(int val, ListNode next) {this.val = val; this.next = next;}      
    }   

    public static ListNode reverseBetween(ListNode head , int left , int right)
    {
        //IF GIVEN LEFT AND RIGHT INDEXS ARE SAME THEN NO NEED TO REVERSE THE LINKED LIST
        if(left ==  right)
        {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        //LOOP UNTIL THE REVERSE PART STARTS
        for(int i=0;i<left-1 && curr != null;i++)
        {
            prev = curr;
            curr = curr.next;
        }

        ListNode last = prev;
        ListNode newEnd = curr;

        //REVERSE THE LINKEDLIST
        ListNode next = curr.next;
        for(int i=0; i<right-left+1 && curr!= null;i++)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null)
            {
                next = next.next;
            }
        }

        if(last != null)
        {
            last.next = prev;
        }
        else
        {
            head = prev;
        }
        newEnd.next = curr;
        return head;
    }
}