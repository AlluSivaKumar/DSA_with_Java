package LeetCode;

public class LeetCode1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int i=0;i<nums.length;i++)
        {
            int digits = (int) Math.log10(nums[i]) + 1;
            /* while(nums[i] > 0)
            {
                digits++;
                nums[i] = nums[i]/10;
            } */

            if((digits & 1) == 0)
            {
                count++;
            }

        }

        return count;
    }
}
