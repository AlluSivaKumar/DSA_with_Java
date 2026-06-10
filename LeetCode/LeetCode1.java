package LeetCode;

import java.util.Arrays;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    
    public static int[] twoSum(int[] nums, int target) 
    {
        Arrays.sort(nums);
        
        int start = 0;
        int end = nums.length-1;

        while (start < end) 
        {
            if(nums[start] + nums[end] > target)
            {
                end--;
            }
            else if(nums[start] + nums[end] < target)
            {
                start++;
            }
            else
            {
                return new int[] {start , end};
            }
        }

        return new int[] {-1,-1};
    }
}
