package LeetCode;

/**
 * LeetCode1464
 */
public class LeetCode1464 
{
    public static void main(String[] args) {
        int[] nums = {1,5,4,5};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int prod = (nums[i] - 1) * (nums[j] - 1);
                if( prod > max)
                {
                    max = prod;
                }
            }
        }
        return max;
    }
}