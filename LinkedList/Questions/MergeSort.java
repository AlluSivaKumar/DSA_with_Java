package Questions;

public class MergeSort 
{
    class ListNode
    {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) {this.val = val;}
        public ListNode(int val, ListNode next) {this.val = val; this.next = next; }
    }

    @SuppressWarnings("null")
    public static ListNode merge(ListNode head1, ListNode head2)
    {
        if(head1 == null)
        {
            return head2;
        }

        if(head2 == null)
        {
            return head1;
        }

        ListNode dummyHead =  null;
        ListNode tail = dummyHead;

        while(head1 != null && head2 != null) 
        {
            if(head1.val < head2.val)
            {
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            }
            else
            {
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }

        while (head1 != null) 
        {
            tail.next = head1;
            tail = tail.next;
            head1 = head1.next;
        }

        while (head2 != null) 
        {
            tail.next = head2;
            tail = tail.next;
            head2 = head2.next;
        }

        return dummyHead.next;
    }

    public static ListNode sortList(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode mid = getMid(head);

        ListNode lefNode = sortList(head);
        ListNode rightNode = sortList(mid);

        return merge(lefNode, rightNode);
    }

    @SuppressWarnings("null")
    public static ListNode getMid(ListNode head)
    {
        ListNode midPrev = null;

        while (head != null || head.next != null) 
        {
            midPrev = /* (midPrev == null) ? head : */ midPrev.next;
            head = head.next.next;
        }

        ListNode mid = midPrev.next; // MAKE MID ELEMENT (MAKE AFTER MID PREVIOUS ELEMENT AS HEAD)
        midPrev.next = null; // BREAKING THE LINK BEFORE MID
        return mid;
    }


//     METHOD 2
//     public ListNode sortList(ListNode head) {

//         if(head==null || head.next==null) return head;
//         ListNode slow =head;
//         ListNode fast = head;
//         while(fast.next!=null && fast.next.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         ListNode head2=slow.next;
//         slow.next=null;
//         head=sortList(head);
//         head2=sortList(head2);
//         return merge(head,head2);        
//     }

//     public ListNode merge(ListNode head1, ListNode head2){
//         ListNode i =head1;
//         ListNode j = head2;
//         ListNode dummy=new ListNode(-1);
//         ListNode k = dummy;
//         while(i!= null && j!=null){
//     if(i.val<=j.val){
//         k.next = i;
//         i = i.next;
//     }
//     else{
//         k.next = j;
//         j = j.next;
//     }
//     k = k.next;
// }
// if(i==null) k.next = j;
// else k.next = i;
// return dummy.next;
//     }
}
