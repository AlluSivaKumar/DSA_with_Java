package LeetCode;

import java.util.Arrays;

class LeetCode2574
{
    public static void main(String[] args)
    {
        int[] arr = {10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(arr)));
    }

    public static int[] leftRightDifference(int[] nums) 
    {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];

        //LEFT ARRAY
        left[0] = 0;
        int sum = left[0];
        for(int i=1;i<n;i++)
        {
            left[i] = sum + nums[i-1];
            sum += nums[i-1];
       }

        //System.out.println(Arrays.toString(left));

        //RIGHT ARRAY
        right[n-1] = 0;
        int sum2 = right[n-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            right[i] = sum2 + nums[i+1];
            sum2 += nums[i+1];
        }

        //System.out.println(Arrays.toString(right));

        int diff[] = new int[n];
        for(int i=0;i<n;i++)
        {
            diff[i] = Math.abs(left[i]-right[i]);
        }

        return diff;
    }
}