package T4_Array_ArrayList;

import java.util.ArrayList;

public class T3_ArrayList 
{
    public static void main(String[] args) 
    {
        //SYNTAX
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(67);
        list.add(12);
        list.addFirst(78);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(67);
        list2.add(89);
        list.addAll(list2);

        for(int i : list)
        {
            System.out.print(i + " ");
        }
    }   
}
