package CustomLinkedList;

public class Main {
    public static void main(String[] args) {

        OurLinkedList list = new OurLinkedList();

        list.insertFirst(7);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertLast(90);
        list.insert(50, 3);
        //list.display();

        /* System.out.println();
        System.out.println(list.deleteFirst());
        list.display();

        System.out.println();
        System.out.println(list.deleteLast());
        list.display();

        System.out.println();
        System.out.println(list.delete(2));
        list.display();

        System.out.println();
        System.out.println(list.find(4));  */

        list.insertRec(56, 2);
        list.display();
        /* OurDoublyLinkedList list1 = new OurDoublyLinkedList();
        list1.insertFirst(45);
        list1.insertFirst(67);
        list1.insertFirst(78);
        list1.insertFirst(34);
        list1.insertLast(89);
        list1.insert(89, 46);
        list1.insert(67, 0);

        list1.display(); */

        /* OurCircularLinkedList list2 = new OurCircularLinkedList();
        list2.insertFirst(67);
        list2.insertFirst(63);
        list2.insertFirst(56);
        list2.delete(67);

        list2.display(); */
    }
}
