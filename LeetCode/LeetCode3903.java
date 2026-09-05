package LeetCode;

import java.util.Arrays;

public class LeetCode3903 {
    public static void main(String[] args) {
        int[] nums = {5,0,1,4};
        int k = 3;
        System.out.println(firstStableIndex(nums, k));
    }

    public static int firstStableIndex(int[] nums, int k) 
    {
        int n = nums.length;

        int[] suffixMin = new int[n];

        suffixMin[n-1] = nums[n-1];

        for(int i=n-2;i>=0;i--)
        {
            suffixMin[i] = Math.min(nums[i], suffixMin[i+1]);
        }

        System.out.println(Arrays.toString(suffixMin));

        int prefixMax = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            prefixMax = Math.max(prefixMax, nums[i]);

            int instabilityScore = prefixMax - suffixMin[i];

            if(instabilityScore <= k)
            {
                return i;
            }
        }

        return -1;
    }
    /*    for(int i=0;i<nums.length;i++)
        {
            int max = max(nums, 0, i+1);

            int min = min(nums, i, nums.length);

            int stabilityScore = max - min;

            if(stabilityScore <= k)
            {
                return i;
            }
        }

        return -1;
        
    }

    public static int max(int[] arr, int start,int end)
    {
        int maxVal = Integer.MIN_VALUE;
        for(int i=start;i<end;i++)
        {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static int min(int[] arr, int start,int end)
    {
        int minVal = Integer.MAX_VALUE;

        for(int i=start;i<end;i++)
        {
            if(arr[i] < minVal)
            {
                minVal = arr[i];
            }
        }
        return minVal;
    } */
}



        // Stores maximum value from index 0 to i
        // int prefixMax = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {

        //     prefixMax = Math.max(prefixMax, nums[i]);

        //     int instabilityScore = prefixMax - suffixMin[i];

        //     if (instabilityScore <= k) {
        //         return i;
        //     }
        // }

        // return -1;


