package LeetCode;

import java.util.Arrays;

public class LeetCode1470 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int j = 0;
        for(int i=0;i<nums.length;i+=2)
        {
            ans[i] = nums[j];
            j++;
        }
        for(int i=1;i<nums.length;i+=2)
        {
            ans[i] = nums[j];
            j++;
        }
        return ans;
    }
}
