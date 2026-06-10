package LeetCode;

import java.util.*;

import java.util.List;

public class LeetCode118 {
    public static void main(String[] args)
    {
        int n = 5;
        System.out.print(generate(n));
    }

    public static List<List<Integer>> generate(int numRows) 
    {
        if(numRows <= 0)
        {
            return null;
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                List<Integer> list2 = new ArrayList<>();
                list2.add(1);

            }
        }


        return list;

    }
}
