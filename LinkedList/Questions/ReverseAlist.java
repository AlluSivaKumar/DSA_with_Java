package Questions;

/**
 * ReverseAlist
 */
public class ReverseAlist {
    public class ListNode {
        int value;
        ListNode next;
        public ListNode() {}
        public ListNode(int value) {this.value = value;}
        public ListNode(int value, ListNode next) {this.value = value; this.next = next;}
    }

    ListNode head;
    ListNode tail;

    public ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode node = reverse(head.next);
        head.next.next  = node;
        head.next = null;
        return  node;
    }
}