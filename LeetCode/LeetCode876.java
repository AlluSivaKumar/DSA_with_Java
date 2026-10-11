package LeetCode;

public class LeetCode876 
{
    class ListNode
    {
        int val;
        ListNode next;
        public ListNode(){}
        public ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!= null && fast.next != null) 
        {
            fast = fast.next.next;
            slow = slow.next;   
        }
        return slow;
    }

    
}
