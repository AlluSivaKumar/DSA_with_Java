package LeetCode;

public class LeetCode3689 {
    public static void main(String[] args)
    {
        int[] nums = {1,3,2};
        System.out.println(maxTotalValue(nums, 2));
    }


    public static long maxTotalValue(int[] nums, int k) 
    {

        int max = nums[0];
        int min = nums[0];
        for(int num : nums)
        {
            if(num > max)
            {
                max = num;
            }
            if(num < min)
            {
                min = num;
            }
        }

        return (long)(max - min) * k;
        /* long sum = 0;
        for(int i=0; i <= nums.length-k; i++)
        {
            for(int j=i;j<i+k;j++)
            {
                //long max = maximum(nums,i,j);
                //long min = minimum(nums,i,j);
                //long diff = max - min;
                sum += maximum(nums,i,j) - minimum(nums,i,j);
            }
        }
        return sum; */
    }

    /* public static long maximum(int[] arr, int start, int end)
    {
        int max = arr[start];
        for(int i=start;i<=end;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    } */

    /* public static long minimum(int[] arr, int start, int end)
    {
        int min = arr[start];
        for(int i=start;i<=end;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    } */
}
