import java.util.*;

public class HashTableExample {
    public static void main(String[] args) 
    {
        //TO CREATE AN HASHMAP
        HashMap<Integer,String> map = new HashMap<>();

        //TO INSERT ELEMENTS
        map.put(101, "Siva");
        map.put(102, "Rakesh");
        map.put(103, "Murali");

        System.out.println(map);

        //TO SEARCH THE ELEMENTS
        System.out.println(map.get(101));
        System.out.println(map.get(103));
        
        //TO DELETE AN ELEMENT
        map.remove(103);

        System.out.println(map);
    }
}
