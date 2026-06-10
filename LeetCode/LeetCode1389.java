package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] indexes = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, indexes)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            list.add(index[i],nums[i]);
        }

        int[] ans = new int[nums.length];

        int i = 0;
        for(int val : list)
        {
            ans[i] = val;
            i++;
        }

        return ans;
    }
}
