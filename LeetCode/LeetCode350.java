package LeetCode;

import java.util.*;

public class LeetCode350 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        System.out.println(Arrays.toString(intersect(arr1, arr2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) 
    {
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[nums2.length];

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(!visited[j])
                {
                    if(nums1[i] == nums2[j])
                    {
                        list.add(nums1[i]);
                        visited[j] = true;
                        break;
                    }
                }
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