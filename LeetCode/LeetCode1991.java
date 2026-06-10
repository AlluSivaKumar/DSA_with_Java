package LeetCode;
//import java.util.*;
class LeetCode1991
{
    public static void main(String[] args) 
    {
        int[] nums = {4,0};
        System.out.println(findMiddleIndex(nums));
        //findMiddleIndex(nums);
    }

    public static int findMiddleIndex(int[] nums) 
    {
        if(nums.length == 1)
        {
            return 0;
        }

        //PREFIX SUM ARRAY
        int sum = 0;
        int[] prefixSum = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            prefixSum[i] = sum;
        }

        // Check index 0
        if (sum - prefixSum[0] == 0)
        {
            return 0;
        }


        int k = 1;
        while (k < prefixSum.length-1) 
        {
            int leftSum = prefixSum[k - 1];
            int rightSum = sum - prefixSum[k];
            if(leftSum == rightSum)
            {
                return k;
            }
            k++;
        }

        // Check last index
        if(prefixSum[nums.length-2] == 0)
        {
            return nums.length-1;
        }

        return -1;
    }
}