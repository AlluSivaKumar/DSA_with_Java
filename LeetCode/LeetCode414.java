package LeetCode;

import java.util.Arrays;

public class LeetCode414 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3};
        System.out.println(thirdMax(arr));   
    }
    
    public static int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
        
        int max = nums[nums.length-1];
        int count = 1;

        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i] != nums[i+1])
            {
                count++;
            }
    
            if(count == 3)
            {
                return nums[i];
            }
        }
        return max;
    }
}
