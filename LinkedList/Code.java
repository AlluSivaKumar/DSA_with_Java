import java.util.LinkedList;

public class Code 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(45);
        list.add(23);
        list.add(73);
        list.addFirst(48);
        list.addLast(12);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list.add(46);
        list2.add(34);
        list2.addAll(list);

        System.out.println(list2.get(6));

        System.out.println(list2);
    }
}
