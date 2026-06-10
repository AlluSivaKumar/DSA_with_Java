package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode989 {
    public static void main(String[] args) 
    {
        int[] num = {1,2,0,0};
        System.out.println(addToArrayForm(num, 34));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) 
    {
        int number = 0;
        for(int i=0;i<num.length;i++)
        {
            number = number * 10 + num[i];
        }

        int sum = number + k;

        List<Integer> list = new ArrayList<>();
        while(sum > 0)
        {
            list.addFirst(sum%10);
            sum = sum/10;
        }

        return list;
    }
}
