package LeetCode;

import java.util.Arrays;

class LeetCode1299
{
    public static void main(String[] args)
    {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }

    public static int[] replaceElements(int[] arr) 
    {
       int[] ans = new int[arr.length];

       for(int i=0;i<arr.length;i++)
       {
        ans[i] = maximum(Arrays.copyOfRange(arr,i+1,arr.length));
       }

       return ans;
    }

    public static int maximum(int[] arr)
    {
        int max = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] replaceElements2(int[] arr) 
    {
        int n = arr.length;
        int[] ans = new int[n];
        int max = -1;

        for(int i = n-1; i >= 0; i--)
        {
            ans[i] = max;
            if(max < arr[i])
                max = arr[i];
        }
        return ans;
    }
}