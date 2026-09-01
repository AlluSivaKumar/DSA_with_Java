package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode3069 
{
    public static void main(String[] args) 
    {
        int[] nums = {5,4,3,8};
        System.out.println(Arrays.toString(resultArray(nums)));
    }   


    public static int[] resultArray(int[] nums) 
    {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(nums[0]);
        list2.add(nums[1]);

        int i = 0;
        int j = 0;

        int k = 2;
        while(k < nums.length)
        {
            if(list1.get(i) > list2.get(j))
            {
                list1.add(nums[k]);
                i++;
            }
            else
            {
                list2.add(nums[k]);
                j++;
            }
            k++;
        }

        int n = list1.size() + list2.size();
        int[] ans = new int[n];
        int x = 0;
        for(int num : list1)
        {
            ans[x] = num;
            x++;
        }
        for(int num : list2)
        {
            ans[x] = num;
            x++;
        }
        return ans;
    }
}
