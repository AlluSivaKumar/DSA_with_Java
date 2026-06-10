package Questions;

public class DeleteDuplicates 
{
    private Node head;
    private Node tail;
    private int size;

    DeleteDuplicates() {
        this.size = 0;
    }

    public class Node  
    {
        private int value;
        private Node next;

        public Node() { }
        
        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value );
        node.next = head;
        head = node;
        size = size+1;

        if(head == null) {
            tail = null;
        }
    }

    public void deleteDuplicates() {
        if(head == null || head.next == null)
        {
            return;
        }
        Node node = head;
        while(node != null && node.next != null) {
            if(node.value == node.next.value){
                node.next = node.next.next;
                size = size-1;
            }
            else
            {
                node = node.next;
            }
        }
        if(tail != null) {
            tail.next = null;            
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) 
    {
        DeleteDuplicates list = new DeleteDuplicates();
        list.insertFirst(2);
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(8);
        list.display();
        list.deleteDuplicates();
        list.display();

    }
}
