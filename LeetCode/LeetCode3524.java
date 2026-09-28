package LeetCode;

import java.util.Arrays;

public class LeetCode3524 
{
    public static void main(String[] args) 
    {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(resultArray(nums, 3)));
    }

    public static long[] resultArray(int[] nums, int k) 
    {
        long[] ans = new long[k];

        for(int i=0;i<nums.length;i++)
        {
            long product = 1;

            for (int j = i; j < nums.length; j++)
            {
                product = (product * nums[j]) % k;

                ans[(int) product]++;
            }
        }        
        return ans;
    }

}  