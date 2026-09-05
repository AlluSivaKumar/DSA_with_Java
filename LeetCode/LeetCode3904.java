package LeetCode;

import java.util.Arrays;

public class LeetCode3904 
{
    public static void main(String[] args) 
    {
        int[] arr = {5,0,1,4};
        int k = 3;
        System.out.println(firstStableIndex(arr, k));
    }
    

    public static int firstStableIndex(int[] nums, int k) 
    {
        int n = nums.length;

        int[] suffixMin = new int[n];

        suffixMin[n-1] = nums[n-1];

        for(int i=n-2;i>=0;i--)
        {
            suffixMin[i] = Math.min(nums[i], suffixMin[i+1]);
        }

        System.out.println(Arrays.toString(suffixMin));

        int prefixMax = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            prefixMax = Math.max(prefixMax, nums[i]);

            if(prefixMax - suffixMin[i] <= k)
            {
                return i;
            }
        }

        return -1;
    }
}
