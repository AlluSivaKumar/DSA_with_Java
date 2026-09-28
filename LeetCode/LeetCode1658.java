package LeetCode;

public class LeetCode1658 {
    public static void main(String[] args) 
    {
        LeetCode1658 obj = new LeetCode1658();
        int[] arr = {1,1,4,2,3};
        int k = 5;
        System.out.println(obj.minOperations(arr, k));
    }

    public int minOperations(int[] nums, int x) 
    {
        if(min(nums) > x)
        {
            return -1;
        }

        int[] prefixSum = new int[nums.length];

        int sum = 0;
        for(int i=0; i<nums.length;i++)
        {
            sum = sum + nums[i];
            prefixSum[i] = sum;
        }

        ///AUCUAL SOLUTION START LOGIC
        int i = 0;
        int j = nums.length-1;
        int sumBack = 0;

        while (i < j) 
        {
            if(prefixSum[i] == x)
            {
                return i;
            }
            else if(nums[j] == x)
            {
                return nums.length - j;
            }
            else if(prefixSum[i] + nums[j] == x)
            {
                return i + nums.length - j;
            }
            else if(prefixSum[i] > x)
            {
                j--;
            }
            else if(sumBack < x)
            {
                sumBack += nums[j];
                i++;
                j--;
            }
            i++;
            j--;
        }
        /// END

        return -1;
    }

    public int min(int[] arr)
    {
        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }
}
