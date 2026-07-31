package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LeetCode3940
{
    public static void main(String[] args)
    {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        System.out.print(Arrays.toString(limitOccurrences(arr, k)));
    }

    public static int[] limitOccurrences(int[] nums, int k) 
    {
        List<Integer> list = new ArrayList<>();

        int counter = 1;

        list.add(nums[0]);

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
            {
                counter++;
            }
            else
            {
                counter = 1;
            }

            if(counter <= k)
            {
                list.add(nums[i]);
            }
        }

        int[] ans = new int[list.size()];

        for(int i=0;i<list.size();i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
}