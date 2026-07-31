package LeetCode;

public class LeetCode3936 
{
    public static void main(String[] args) 
    {
        int[] arr = {0,1,0,3,12};
        System.out.println(minimumSwaps(arr));
    }

    public static int minimumSwaps(int[] nums) 
    {
        int swaps = 0;

        int left = 0;
        int right = nums.length-1;

        while(left < right)
        {
            while(nums[left] != 0 && left < right)
            {
                left++;
            }
            while(nums[right] == 0 && right > left)
            {
                right--;
            }

            while(nums[left] ==0 && nums[right] != 0 && left < right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
                swaps += 1;
            }
        }

        return swaps;
    }
}
