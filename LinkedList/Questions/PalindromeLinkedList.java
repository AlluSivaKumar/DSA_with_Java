package Questions;

import java.util.List;

/**
 * PalindromeLinkedList
 */
public class PalindromeLinkedList {

    class ListNode
    {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) {this.val = val;} 
        public ListNode(int val, ListNode next) {this.val = val; this.next = next;}      
    }   

    public static boolean isPalindromeLinkedList(Node head)
    {
        ListNode middleNode = getMiddle(head);
        ListNode secondHead = reveseLinkedList(middleNode);
        ListNode reversedHead = secondHead;

        while (head != null && secondHead != null)
        {
            if(head.val != secondHead.val)
            {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        reveseLinkedList(reversedHead);

        return head == null || secondHead == null;
    }

    public static ListNode getMiddle(Node head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static ListNode reveseLinkedList(Node head)
    {
        if(head == null)
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