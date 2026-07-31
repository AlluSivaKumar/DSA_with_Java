package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LeetCode2215 {
    public static void main(String[] args) 
    {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0;i<2;i++)
        {
            list.add(new ArrayList<>());
        }

        int m = nums1.length;
        int n = nums2.length;

        HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<m;i++)
        {
            set1.add(nums1[i]);
        }

        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set2.add(nums2[i]);
        }

        for(int num : set1)
        {
            if(!set2.contains(num))
            {
                list.get(0).add(num);
            }
        }

        for(int num : set2)
        {
            if(!set1.contains(num))
            {
                list.get(1).add(num);
            }
        }

        return list;
    }
}
