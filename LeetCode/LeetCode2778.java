package LeetCode;

/**
 * LeetCode2778
 */
public class LeetCode2778 {

    public static int sumOfSquares(int[] nums) 
    {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++) {
            if(n % i == 0) {
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }
}