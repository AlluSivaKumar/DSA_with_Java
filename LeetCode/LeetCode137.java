package LeetCode;

import java.util.Arrays;

public class LeetCode137 {
    public static void main(String[] args) {
        int[] nums = {-2,-2,1,1,4,1,4,4,-4,-2};
        System.out.println(singleNumber(nums));
    }

    public  static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != nums[1])
        {
            return nums[0];
        }
        System.out.println(Arrays.toString(nums));

        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i-1] || nums[i] == nums[i+1])
            {
                continue;
            }
            else
            {
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
}
