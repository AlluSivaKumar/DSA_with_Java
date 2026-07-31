package LeetCode;

import java.util.Arrays;

public class LeetCode1346 {
    public static void main(String[] args) 
    {
        int[] arr ={-20,8,-6,-14,0,-19,14,4};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) 
    {
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++)
        {
            int target = arr[i]*2;

            int start = 0;
            int end = arr.length-1;

            while (start <= end)
            {
                int mid = start + (end-start)/2;

                if(arr[mid] == target && mid != i)
                {
                    return true;
                }

                else if(arr[mid] < target)
                {
                    start = mid + 1;
                }

                else
                {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
