package LeetCode;

import java.util.Arrays;

public class LeetCode1929 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
        }

        int j = 0;
        for(int i= nums.length; i<nums.length * 2;i++)
        {
            ans[i] = nums[j];
            j++;
        }

        return ans;
    }
}
