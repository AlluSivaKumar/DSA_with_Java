package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class LeetCode3731
{
    public static void main(String[] args)
    {
        int[] arr = {5,1};
        System.out.println(findMissingElements(arr));
    }
    

    public static List<Integer> findMissingElements(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        int max = nums[0],min = nums[0];
        set.add(nums[0]);

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }

            if(nums[i] < min)
            {
                min = nums[i];
            }

            set.add(nums[i]);
        }

        for(int start = min; start < max; start++)
        {
            if(!set.contains(start))
            {
                list.add(start);
            }
        }

        /* Arrays.sort(nums);
        int j = 0;
        for(int i=nums[0];i<nums[nums.length-1];i++)
        {
            if(nums[j] != nums[i])
            {
                list.add(nums[j]);
                j++;
            }
        } */

        return list;
    }
}