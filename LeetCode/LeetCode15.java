package LeetCode;

import java.util.*;

public class LeetCode15 
{
    public static void main(String[] args) 
    {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) 
    {
        if(nums.length <= 2)
        {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++)
        {
            if(i > 0 && nums[i] == nums[i - 1]) 
            {
                continue;
            }

            int start = i+1;
            int end = nums.length-1;

            while (start < end) 
            {
                int sum = nums[i] + nums[start] + nums[end];
                if(sum > 0)
                {
                    end--;
                }
                else if(sum < 0)
                {
                    start++;
                }
                else
                {
                    List<Integer> list2 = new ArrayList<>();
                    list2.add(nums[i]);
                    list2.add(nums[start]);
                    list2.add(nums[end]);
                    /* if(!list.contains(list2))
                    {
                        list.add(list2);
                    } */
                    start++;
                    end--;

                    while(start < end && nums[start] == nums[start - 1]) start++;
                    while(start < end && nums[end] == nums[end + 1]) end--;
                }
                
            }
            
        }

        return list;
    }
}

/* for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    if(sum + nums[j] + nums[k] == 0)
                    {
                        List<Integer> subList = new ArrayList<>();
                        subList.add(nums[i]);
                        subList.add(nums[j]);
                        subList.add(nums[k]);

                        Collections.sort(subList);

                        if(!list.contains(subList))
                        {
                            list.add(subList);
                        }
                    }
                }
            } */