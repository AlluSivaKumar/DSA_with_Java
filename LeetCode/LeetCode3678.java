package LeetCode;

import java.util.HashSet;

public class LeetCode3678 {
    public static void main(String[] args) {
        int[] arr = {-34};
        System.out.println(smallestAbsent(arr));
    }

    public static int smallestAbsent(int[] nums) 
    {
        int avg = average(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        while(true) 
        {
            if(!set.contains(avg))
            {
                return avg;
            }
            else
            {
                avg++;
            }
        }
    }

    public static int average(int[] nums)
    {
        float sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
        }
        if(sum / nums.length < 0)
        {
            return 1;
        }
        if(sum % nums.length == 0)
        {
            return (int)((sum / nums.length) + 1);
        }
        return (int)Math.ceil(sum / nums.length);
    }
}
