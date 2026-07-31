package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * LeetCode2032
 */
public class LeetCode2032 {

    public static void main(String[] args) 
    {
        int[] nums1 = {3,1};
        int[] nums2 = {2,3};
        int[] nums3 = {1,2};

        System.out.println(twoOutOfThree(nums1,nums2,nums3));
    }
    
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        //HashSet<Integer> set1 = new HashSet<>();
        //for(int i=0;i<nums1.length;i++)
        //{
        //    set1.add(nums1[i]);
        //}


        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            set2.add(nums2[i]);
        }
        HashSet<Integer> set3 = new HashSet<>();
        for(int i=0;i<nums3.length;i++)
        {
            set3.add(nums3[i]);
        }

        HashSet<Integer> set = new HashSet<>();

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length) 
        {
            if(set2.contains(nums1[i]))
            {
                set.add(nums1[i]);
            }
            i++;
        }

        while(j < nums3.length) 
        {
            if(set2.contains(nums3[j]))
            {
                set.add(nums3[j]);
            }
            j++;
        }

        while(k < nums1.length) 
        {
            if(set3.contains(nums1[k]))
            {
                set.add(nums1[k]);
            }
            k++;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int num : set)
        {
            list.add(num);
        }

        return list;
    }
}