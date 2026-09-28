package LeetCode;

public class LeetCode3550 
{
    public static void main(String[] args) 
    {
        int[] nums = {1,3,2};
        System.out.println(smallestIndex(nums));
    }

    public static int smallestIndex(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            if(sumOfDigits(nums[i]) == i)
            {
                return i;
            }
        }
        return -1;
    }

    public static int sumOfDigits(int n)
    {
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
