package DefaultLinkedLIst;

import java.util.LinkedList;

public class Main 
{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(89);
        list.add(90);
        list.add(45);
        list.add(78);

        list.addLast(567);
        list.addFirst(234);

        list.toString();
        System.out.println(list);

        
    }   
}
