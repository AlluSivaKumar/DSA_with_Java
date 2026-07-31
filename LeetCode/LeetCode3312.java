package LeetCode;

import java.util.*;

public class LeetCode3312{

    public static void main(String[] args) 
    {
        int[] nums = {2,3,4};
        long[] queries = {0,1,1};
        System.out.println(Arrays.toString(gcdValues(nums, queries)));
    }

    public static int[] gcdValues(int[] nums, long[] queries) 
    {
        List<Integer> gcdPairs = new ArrayList<>();

        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                gcdPairs.add(gcd(nums[i], nums[j]));
            }
        }
        Collections.sort(gcdPairs);
        //System.out.println(gcdPairs);

        int[] ans = new int[queries.length];

        for(int i=0;i<queries.length;i++)
        {
            ans[i] = gcdPairs.get((int) queries[i]);
        }

        return ans;
    }

    public static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}