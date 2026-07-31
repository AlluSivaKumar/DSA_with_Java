package LeetCode;

/**
 * LeetCode1979
 */
public class LeetCode1979 {

    public static void main(String[] args) 
    {
        int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) 
    {
        int smalll = nums[0];
        int large = nums[0];

        for(int num : nums)
        {
            if(num < smalll)
            {
                smalll = num;
            }

            if(num > large)
            {
                large = num;
            }
        }

        return gcd(smalll, large);
    }

    public static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}