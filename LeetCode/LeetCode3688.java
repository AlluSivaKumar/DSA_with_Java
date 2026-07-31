package LeetCode;

/**
 * LeetCode3688
 */
public class LeetCode3688 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(evenNumberBitwiseORs(arr));
    }

    public static int evenNumberBitwiseORs(int[] nums) 
    {
        int ans = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] % 2 == 0)
            {
                ans = ans | nums[i];
            }
        }

        return ans;
    }
}