package LeetCode;

import java.util.Arrays;

public class LeetCode1480 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) 
    {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
