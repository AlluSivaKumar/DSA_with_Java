package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * LeetCode3536
 */
public class LeetCode3536 {

    public static void main(String[] args) 
    {
        int num = 1234;
        System.out.println(maxProduct(num));
    }

    public static int maxProduct(int n) 
    {
        ArrayList<Integer> list = new ArrayList<>();

        while (n > 0)
        {
            int rem = n % 10;
            list.add(rem);
            n = n / 10;
        }

        Collections.sort(list);

        int last = list.get(list.size()-1) * list.get(list.size()-2);

        return last;
    }
}